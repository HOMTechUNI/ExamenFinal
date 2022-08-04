package Builder;

import Components.*;

public class LaptopBuilder implements DeviceBuilder {
    private final Laptop laptop = new Laptop();

    public void buildLaptop(Motherboard motherboard, CPU cpu, RAM ram, Storage storage, GPU gpu) {
        setMotherboard(motherboard);
        setCpu(cpu);
        setRam(ram);
        setStorage(storage);
        setGpu(gpu);
    }

    @Override
    public void setMotherboard(Motherboard motherboard) {
        //Con el método setMotherboard(...) se asigna el
        // objeto motherboard que se encuentra como
        // argumento a la motherboard del objeto Laptop.
        this.laptop.motherboard = motherboard;
    }

    @Override
    public void setCpu(CPU cpu) {
        //Con el método setCPU(...) se asigna el objeto cpu
        // que se encuentra como argumento a la motherboard
        // del objeto Laptop.
        this.laptop.cpu = cpu;
    }

    @Override
    public void setRam(RAM ram) {
        //Con el método setRAM(...) se asigna el objeto ram
        // que se encuentra como argumento a la motherboard
        // del objeto Laptop.
        this.laptop.ram = ram;
    }

    @Override
    public void setStorage(Storage storage) {
        //Con el método setStorage(...) se asigna el objeto
        // storage que se encuentra como argumento a la
        // motherboard del objeto Laptop.
        this.laptop.storage = storage;
    }

    @Override
    public void setGpu(GPU gpu) {
        //Con el método setGPU(...) se asigna el objeto
        // gpu que se encuentra como argumento a la
        // motherboard del objeto Laptop.
        this.laptop.gpu = gpu;
    }

    public Laptop returnLaptop() {
        //Con el método returnLaptop(...)
        // se obtiene el objeto laptop
        // que se ha generado.
        return this.laptop;
    }
}