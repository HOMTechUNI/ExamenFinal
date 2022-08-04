package Composite;

import java.util.ArrayList;

public class Store implements Box {
    ArrayList<Package> packages = new ArrayList<>();

    public void addToStore(Package packages1) {
        assert packages1 != null : "El objeto package no puede ser nulo";
        packages.add(packages1);
    }

    public void removeFromStore(Package packages1) {
        assert packages1 != null : "El objeto package no puede ser nulo";
        packages.remove(packages1);
    }

    @Override
    public ArrayList<Package> returnArrayList() {
        assert packages != null : "El ArrayList packages no puede ser nulo";
        assert packages.size() != 0 : "El tamaño del Arraylist packages no puede ser 0";
        return packages;
    }
}