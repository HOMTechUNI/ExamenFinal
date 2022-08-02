package Builder;

import Components.*;

public class LaptopBuilder implements DeviceBuilder {
    private Laptop laptop;

    public void buildLaptop(Motherboard motherboard, CPU cpu, RAM ram, Storage storage, GPU gpu){
        setMotherboard(motherboard);
        setCpu(cpu);
        setRam(ram);
        setStorage(storage);
        setGpu(gpu);
    }

    @Override
    public void setMotherboard(Motherboard motherboard) {
        this.laptop.motherboard = motherboard;
    }
    @Override
    public void setCpu(CPU cpu) {
        this.laptop.cpu = cpu;
    }
    @Override
    public void setRam(RAM ram) {
        this.laptop.ram = ram;
    }

    @Override
    public void setStorage(Storage storage) {
        this.laptop.storage = storage;
    }

    @Override
    public void setGpu(GPU gpu) {
        this.laptop.gpu = gpu;
    }

    public Laptop returnLaptop() {
        return this.laptop;
    }
}