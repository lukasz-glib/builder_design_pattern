package pl.lg.builder;

public class Vehicle {

    private Integer id;
    private String model;
    private Integer wheels;
    private Integer airbags;
    private Integer maxVelocity;
    private String numberPlate;

    //klasa wewnętrzna publiczna (musi być dostępna dla innych obiektów)
    public static class Builder {
        private Integer id = null;
        private String model = null;
        private Integer wheels = null;
        private Integer airbags = null;
        private Integer maxVelocity = null;
        private String numberPlate = null;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder wheels(Integer wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder airbags(Integer airbags) {
            this.airbags = airbags;
            return this;
        }

        public Builder maxVelocity(Integer maxVelocity) {
            this.maxVelocity = maxVelocity;
            return this;
        }

        public Builder numberPlate(String numberPlate) {
            this.numberPlate = numberPlate;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    private Vehicle(Builder builder) {
        this.id = builder.id;
        this.airbags = builder.airbags;
        this.model = builder.model;
        this.maxVelocity = builder.maxVelocity;
        this.numberPlate = builder.numberPlate;
        this.wheels = builder.wheels;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Integer getWheels() {
        return wheels;
    }

    public Integer getAirbags() {
        return airbags;
    }

    public Integer getMaxVelocity() {
        return maxVelocity;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    /* UWAGA: poniższy konstruktor ustawiający pola klasy Vehicle - tylko dla porównania z Builder-em !!!
       We wzorcu go nie ma, nie ma też setterów - pola ustawiasz poprzez buildera - patrz VehicleBuilderCheck
     */
    public Vehicle(Integer id, String model, Integer wheels, Integer airbags, Integer maxVelocity, String numberPlate) {
        this.id = id;
        this.model = model;
        this.wheels = wheels;
        this.airbags = airbags;
        this.maxVelocity = maxVelocity;
        this.numberPlate = numberPlate;
    }
}
