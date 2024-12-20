package ParkingLot.repositories;

import ParkingLot.models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private final Map<Integer , Gate> gates = new TreeMap<>();

    public GateRepository() {
//        create certain demo gates and save it in the Map
    }

    public Optional<Gate> findGateById(int id) {
        Gate gate = gates.getOrDefault(id, null);
        return Optional.ofNullable(gate);
    }
}

// Google Interview (L4) : DFS + Lazy Update + cycle detection

// first checked if the data is present in the HM using containsKey
// if the data was present : he retrieved that using get

// O(1)

// DSA skills : Strong hire
// Language : Reject  : He was not good with Map interface


// You might not find a gate with the give ID
// A better way is to return an optional instead of null object
// if we are getting optional in return , that means possibility of null is there

// mock db => Map -> TreeMap
