package Builder;

import Components.*;

public class LaptopBuilder implements DeviceBuilder {
    private final Laptop laptop = new Laptop();

    public void buildLaptop(Motherboard motherboard, CPU cpu, RAM ram, Storage storage, GPU gpu) {
        assert motherboard != null : "El objeto motherboard no puede ser nulo";
        assert cpu != null : "El objeto cpu no puede ser nulo";
        assert ram != null : "El objeto ram no puede ser nulo";
        assert storage != null : "El objeto storage no puede ser nulo";
        assert gpu != null : "El objeto gpu no puede ser nulo";
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
        assert motherboard != null : "El objeto motherboard no puede ser nulo";
        this.laptop.motherboard = motherboard;
    }

    @Override
    public void setCpu(CPU cpu) {
        //Con el método setCPU(...) se asigna el objeto cpu
        // que se encuentra como argumento a la motherboard
        // del objeto Laptop.
        assert cpu != null : "El objeto cpu no puede ser nulo";
        this.laptop.cpu = cpu;
    }

    @Override
    public void setRam(RAM ram) {
        //Con el método setRAM(...) se asigna el objeto ram
        // que se encuentra como argumento a la motherboard
        // del objeto Laptop.
        assert ram != null : "El objeto ram no puede ser nulo";
        this.laptop.ram = ram;
    }

    @Override
    public void setStorage(Storage storage) {
        //Con el método setStorage(...) se asigna el objeto
        // storage que se encuentra como argumento a la
        // motherboard del objeto Laptop.
        assert storage != null : "El objeto storage no puede ser nulo";
        this.laptop.storage = storage;
    }

    @Override
    public void setGpu(GPU gpu) {
        //Con el método setGPU(...) se asigna el objeto
        // gpu que se encuentra como argumento a la
        // motherboard del objeto Laptop.
        assert gpu != null : "El objeto gpu no puede ser nulo";
        this.laptop.gpu = gpu;
    }

    public Laptop returnLaptop() {
        //Con el método returnLaptop(...)
        // se obtiene el objeto laptop
        // que se ha generado.
        assert this.laptop != null : "El objeto Laptop no puede ser nulo";
        return this.laptop;
    }
}