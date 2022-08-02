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
    public void getDescription() {
        //aaaaaaaa
    }

    @Override
    public void getQuantityProducts() {
        System.out.println("Esta caja contiene "+devices.size()+" dispositivos");
    }

    @Override
    public void display(){
        //aaaaaaaaaaa
    }

}