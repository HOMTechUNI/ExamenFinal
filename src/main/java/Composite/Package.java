package Composite;

import Builder.Device;

import java.util.ArrayList;

public class Package implements Box {

    ArrayList<Device> devices = new ArrayList<>();

    public void addToPackage(Device product) {
        //Se añade el objeto de tipo device
        // al array devices
        devices.add(product);
    }

    public void removeFromPackage(Device product) {
        //Se elimina el objeto de tipo device
        // al array devices
        devices.remove(product);
    }

    @Override
    public ArrayList<Device> returnArrayList() {
        //Retorna el ArrayList de Device devices
        return devices;
    }

}