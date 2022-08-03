package Builder;

import Components.*;

public class DesktopBuilder implements DeviceBuilder {
    private Desktop desktop = new Desktop();

    public void buildDesktop(Motherboard motherboard, CPU cpu, RAM ram, Storage storage, GPU gpu, PSU psu){
        setMotherboard(motherboard);
        setCpu(cpu);
        setRam(ram);
        setStorage(storage);
        setGpu(gpu);
        setPsu(psu);
    }

    @Override
    public void setMotherboard(Motherboard motherboard) {
        this.desktop.motherboard = motherboard;
    }

    @Override
    public void setCpu(CPU cpu) {
        this.desktop.cpu = cpu;
    }

    @Override
    public void setRam(RAM ram) {
        this.desktop.ram = ram;
    }

    @Override
    public void setStorage(Storage storage) {
        this.desktop.storage = storage;
    }

    @Override
    public void setGpu(GPU gpu) {
        this.desktop.gpu = gpu;
    }

    public void setPsu(PSU psu) {
        this.desktop.psu = psu;
    }

    public Desktop returnDesktop() {
        return this.desktop;
    }
}