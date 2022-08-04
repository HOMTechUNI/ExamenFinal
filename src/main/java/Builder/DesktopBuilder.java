package Builder;

import Components.*;

public class DesktopBuilder implements DeviceBuilder {

    private final Desktop desktop = new Desktop();

    public void buildDesktop(Motherboard motherboard, CPU cpu, RAM ram, Storage storage, GPU gpu, PSU psu) {
        //método que aplica todos los métodos set de los componentes de la clase Desktop
        assert motherboard != null : "El objeto motherboard no puede ser nulo";
        assert cpu != null : "El objeto cpu no puede ser nulo";
        assert ram != null : "El objeto ram no puede ser nulo";
        assert storage != null : "El objeto storage no puede ser nulo";
        assert gpu != null : "El objeto gpu no puede ser nulo";
        assert psu != null : "El objeto psu no puede ser nulo";
        setMotherboard(motherboard);
        setCpu(cpu);
        setRam(ram);
        setStorage(storage);
        setGpu(gpu);
        setPsu(psu);
    }

    @Override//método usado para asignar una motherboard al constructor
    public void setMotherboard(Motherboard motherboard) {
        assert motherboard != null : "El objeto motherboard no puede ser nulo";
        this.desktop.motherboard = motherboard;
    }

    @Override//método usado para asignar una CPU al DesktopBuilder
    public void setCpu(CPU cpu) {
        assert cpu != null : "El objeto cpu no puede ser nulo";
        this.desktop.cpu = cpu;
    }

    @Override//método usado para asignar una memoria ram al DesktopBuilder
    public void setRam(RAM ram) {
        assert ram != null : "El objeto ram no puede ser nulo";
        this.desktop.ram = ram;
    }

    @Override//método usado para asignar un almacenamiento al DesktopBuilder
    public void setStorage(Storage storage) {
        assert storage != null : "El objeto storage no puede ser nulo";
        this.desktop.storage = storage;
    }

    @Override//método usado para asignar una GPU al DesktopBuilder
    public void setGpu(GPU gpu) {
        assert gpu != null : "El objeto gpu no puede ser nulo";
        this.desktop.gpu = gpu;
    }

    //método usado para asignar una PSU al DesktopBuilder
    public void setPsu(PSU psu) {
        assert psu != null : "El objeto psu no puede ser nulo";
        this.desktop.psu = psu;
    }

    //método usado para retornar un objeto de clase Desktop con todos los componentes que el DesktopBuilder tiene asignados
    public Desktop returnDesktop() {
        assert this.desktop != null : "El objeto desktop no puede ser nulo";
        return this.desktop;
    }
}