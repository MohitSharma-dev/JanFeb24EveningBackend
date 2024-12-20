package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {
    public Optional<Vehicle> findVehicleByNumber(String number) {
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle) {
//        vehicle object will be updated with the id
        return vehicle;
    }
}
//Complete this : HW