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

    @Override
    public Motherboard getMotherboard() {
        return motherboard;
    }

    @Override
    public CPU getCpu() {
        return cpu;
    }

    @Override
    public RAM getRam() {
        return ram;
    }

    @Override
    public Storage getStorage() {
        return storage;
    }

    @Override
    public GPU getGpu() {
        return gpu;
    }

    @Override
    public ArrayList<String> allComponents() {
        ArrayList<String> allNameComponents = new ArrayList<>();
        allNameComponents.add(motherboard.getName());
        allNameComponents.add(cpu.getName());
        allNameComponents.add(ram.getName());
        allNameComponents.add(storage.getName());
        allNameComponents.add(gpu.getName());
        allNameComponents.add(psu.getName());
        return allNameComponents;
    }

    public PSU getPsu() {
        return psu;
    }
}
