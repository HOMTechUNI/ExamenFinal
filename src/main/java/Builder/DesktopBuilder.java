package Builder;

import Components.*;

public class DesktopBuilder implements DeviceBuilder {
    private Desktop desktop;

    public void buildDesktop(Motherboard motherboard, CPU cpu, RAM ram, Storage storage, GPU gpu){
        setMotherboard(motherboard);
        setCpu(cpu);
        setRam(ram);
        setStorage(storage);
        setGpu(gpu);
    }

    @Override
    public void setMotherboard(Motherboard motherboard) {
        this.desktop.motherboard = motherboard;
        System.out.println("Components.Motherboard: " + motherboard);
    }

    @Override
    public void setCpu(CPU cpu) {
        this.desktop.cpu = cpu;
        System.out.println("Components.CPU: " + cpu);
    }

    @Override
    public void setRam(RAM ram) {
        this.desktop.ram = ram;
        System.out.println("Components.RAM: " + ram);
    }

    @Override
    public void setStorage(Storage storage) {
        this.desktop.storage = storage;
        System.out.println("Components.Storage: " + storage);
    }

    @Override
    public void setGpu(GPU gpu) {
        this.desktop.gpu = gpu;
        System.out.println("Components.GPU: " + gpu);
    }

    public void setPsu(PSU psu) {
        this.desktop.psu = psu;
        System.out.println("Components.PSU: " + psu);
    }

    public Desktop returnDesktop() {
        return this.desktop;
    }
}