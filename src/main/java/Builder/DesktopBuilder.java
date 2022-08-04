package Builder;

import Components.*;

public class DesktopBuilder implements DeviceBuilder {

    private final Desktop desktop = new Desktop();

    public void buildDesktop(Motherboard motherboard, CPU cpu, RAM ram, Storage storage, GPU gpu, PSU psu) {
        //método que aplica todos los métodos set de los componentes de la clase Desktop
        setMotherboard(motherboard);
        setCpu(cpu);
        setRam(ram);
        setStorage(storage);
        setGpu(gpu);
        setPsu(psu);
    }

    @Override//método usado para asignar una motherboard al constructor
    public void setMotherboard(Motherboard motherboard) {
        this.desktop.motherboard = motherboard;
    }

    @Override//método usado para asignar una CPU al DesktopBuilder
    public void setCpu(CPU cpu) {
        this.desktop.cpu = cpu;
    }

    @Override//método usado para asignar una memoria ram al DesktopBuilder
    public void setRam(RAM ram) {
        this.desktop.ram = ram;
    }

    @Override//método usado para asignar un almacenamiento al DesktopBuilder
    public void setStorage(Storage storage) {
        this.desktop.storage = storage;
    }

    @Override//método usado para asignar una GPU al DesktopBuilder
    public void setGpu(GPU gpu) {
        this.desktop.gpu = gpu;
    }

    //método usado para asignar una PSU al DesktopBuilder
    public void setPsu(PSU psu) {
        this.desktop.psu = psu;
    }

    //método usado para retornar un objeto de clase Desktop con todos los componentes que el DesktopBuilder tiene asignados
    public Desktop returnDesktop() {
        return this.desktop;
    }
}