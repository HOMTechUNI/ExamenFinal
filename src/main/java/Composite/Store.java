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
    public void getDescription() {
        //aaaaaaaa
    }

    @Override
    public void getQuantityProducts() {
        System.out.println("Este Container contiene " + packages.size() + " cajas");
    }

    @Override
    public void display() {
        //aaaaaaaaaaa
    }
}