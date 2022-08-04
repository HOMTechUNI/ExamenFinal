package Composite;

import Builder.Device;

import java.util.ArrayList;

public class Package implements Box {

    ArrayList<Device> devices = new ArrayList<>();

    public void addToPackage(Device product) {
        //Se añade el objeto de tipo device
        // al array devices
        assert product != null : "El objeto device no puede ser nulo";
        devices.add(product);
    }

    public void removeFromPackage(Device product) {
        //Se elimina el objeto de tipo device
        // al array devices
        assert product != null : "El objeto device no puede ser nulo";
        devices.remove(product);
    }

    @Override
    public ArrayList<Device> returnArrayList() {
        //Retorna el ArrayList de Device devices
        assert devices != null : "El ArrayList device no puede ser nulo";
        assert devices.size() != 0 : "El tamaño del Arraylist device no puede ser 0";
        return devices;
    }

}