package Composite;

import java.util.ArrayList;

public class Store implements Box {
    ArrayList<Package> packages = new ArrayList<>();

    public void addToContainer(Package packages1) {
        packages.add(packages1);
    }

    public void removefromContainer(Package packages1) {
        packages.remove(packages1);
    }

    @Override
    public ArrayList<Package> returnArrayList() {
        return packages;
    }
}