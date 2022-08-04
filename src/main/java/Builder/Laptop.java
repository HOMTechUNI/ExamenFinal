package Builder;

import Components.*;

import java.util.ArrayList;

public class Laptop implements Device {
    Motherboard motherboard;
    CPU cpu;
    RAM ram;
    Storage storage;
    GPU gpu;

    public Laptop() {
        //Contructor que asigna cada objeto de tipo componente a Laptop
        this.motherboard = new Motherboard();
        this.cpu = new CPU();
        this.ram = new RAM();
        this.storage = new Storage();
        this.gpu = new GPU();
    }

    @Override
    public Motherboard getMotherboard() {
        //Retorna el objeto motherboard de Laptop
        return motherboard;
    }

    @Override
    public CPU getCpu() {
        //Retorna el objeto cpu de Laptop
        return cpu;
    }

    @Override
    public RAM getRam() {
        //Retorna el objeto ram de Laptop
        return ram;
    }

    @Override
    public Storage getStorage() {
        //Retorna el objeto storage de Laptop
        return storage;
    }

    @Override
    public GPU getGpu() {
        //Retorna el objeto gpu de Laptop
        return gpu;
    }

    @Override
    public ArrayList<String> allComponents() {
        //Retorna un arraylist que contiene los nombres
        // de todos los componentes que se encuentran en Laptop
        ArrayList<String> allNameComponents = new ArrayList<>();
        allNameComponents.add(motherboard.getName());
        allNameComponents.add(cpu.getName());
        allNameComponents.add(ram.getName());
        allNameComponents.add(storage.getName());
        allNameComponents.add(gpu.getName());
        return allNameComponents;
    }
}