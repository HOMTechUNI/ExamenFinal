package Composite;

import Builder.Device;

import java.util.ArrayList;

public class Package implements Box {

    ArrayList<Device> devices = new ArrayList<>();

    public void addToPackage(Device product) {
        devices.add(product);
    }

    public void removeFromPackage(Device product) {
        devices.remove(product);
    }

    @Override
    public ArrayList<Device> returnArrayList() {
        return devices;
    }

}