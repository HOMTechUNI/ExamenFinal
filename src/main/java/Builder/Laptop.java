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
        assert motherboard != null : "El objeto motherboard no puede ser nulo";
        return motherboard;
    }

    @Override
    public CPU getCpu() {
        //Retorna el objeto cpu de Laptop
        assert cpu != null : "El objeto cpu no puede ser nulo";
        return cpu;
    }

    @Override
    public RAM getRam() {
        //Retorna el objeto ram de Laptop
        assert ram != null : "El objeto ram no puede ser nulo";
        return ram;
    }

    @Override
    public Storage getStorage() {
        //Retorna el objeto storage de Laptop
        assert storage != null : "El objeto storage no puede ser nulo";
        return storage;
    }

    @Override
    public GPU getGpu() {
        //Retorna el objeto gpu de Laptop
        assert gpu != null : "El objeto gpu no puede ser nulo";
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
        assert allNameComponents != null : "El array no puede ser nulo";
        return allNameComponents;
    }
}