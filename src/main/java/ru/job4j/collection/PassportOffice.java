package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {

    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            return true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        for (String key : citizens.keySet()) {
            if (passport.equals(key)) {
                return citizens.get(key);
            }
        }
        return null;
    }
}
