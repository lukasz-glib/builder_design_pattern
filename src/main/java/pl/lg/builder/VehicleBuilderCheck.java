package pl.lg.builder;

public class VehicleBuilderCheck {

    public static void main(String[] args) {
        //Klasycznie - poprzez konstruktor
        Vehicle classicVehicle = new Vehicle(1, "Mercedes", 4, 8, 250, "DW4444");

        //Korzystanie ze wzorca Builder:
        Vehicle vehicle = new Vehicle.Builder()
                .id(2)
                .airbags(4)
                .maxVelocity(250)
                .wheels(4)
                .model("Ascona")
                .numberPlate("DW5555")
                .build();

        System.out.println(vehicle.getId());
        System.out.println(vehicle.getAirbags());
        System.out.println(vehicle.getModel());
    }
}
