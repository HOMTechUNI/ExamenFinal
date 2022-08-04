package Builder;

import Components.*;

import java.util.ArrayList;

public class Desktop implements Device {
    Motherboard motherboard;
    CPU cpu;
    RAM ram;
    Storage storage;
    GPU gpu;
    PSU psu;

    public Desktop() {
        this.motherboard = new Motherboard();
        this.cpu = new CPU();
        this.ram = new RAM();
        this.storage = new Storage();
        this.gpu = new GPU();
    }

    @Override//método para retornar el objeto Motherboard que se tiene asignado
    public Motherboard getMotherboard() {
        assert motherboard != null : "El objeto motherboard no puede ser nulo";
        return motherboard;
    }

    @Override//método para retornar el objeto CPU que se tiene asignado
    public CPU getCpu() {
        assert cpu != null : "El objeto cpu no puede ser nulo";
        return cpu;
    }

    @Override//método para retornar el objeto RAM que se tiene asignado
    public RAM getRam() {
        assert ram != null : "El objeto ram no puede ser nulo";
        return ram;
    }

    @Override//método para retornar el objeto Storage que se tiene asignado
    public Storage getStorage() {
        assert storage != null : "El objeto storage no puede ser nulo";
        return storage;
    }

    @Override//método para retornar el objeto GPU que se tiene asignado
    public GPU getGpu() {
        assert gpu != null : "El objeto gpu no puede ser nulo";
        return gpu;
    }

    @Override//método para retornar el objeto Motherboard que se tiene asignado
    public ArrayList<String> allComponents() {
        ArrayList<String> allNameComponents = new ArrayList<>();
        allNameComponents.add(motherboard.getName());
        allNameComponents.add(cpu.getName());
        allNameComponents.add(ram.getName());
        allNameComponents.add(storage.getName());
        allNameComponents.add(gpu.getName());
        allNameComponents.add(psu.getName());
        assert allNameComponents != null : "El array no puede ser nulo";
        return allNameComponents;
    }

    //método para retornar el objeto PSU que se tiene asignado
    public PSU getPsu() {
        assert psu != null : "El objeto psu no puede ser nulo";
        return psu;
    }
}
