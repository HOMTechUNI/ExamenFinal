package Builder;

import Builder.Desktop;
import Builder.DeviceBuilder;

public class DesktopBuilder implements DeviceBuilder {
    private Desktop desktop;

    @Override
    public void setMotherboard(String motherboard) {
        this.desktop.motherboard = motherboard;
        System.out.println("Components.Motherboard: " + motherboard);
    }

    @Override
    public void setCpu(String cpu) {
        this.desktop.cpu = cpu;
        System.out.println("Components.CPU: " + cpu);
    }

    @Override
    public void setRam(String ram) {
        this.desktop.ram = ram;
        System.out.println("Components.RAM: " + ram);
    }

    @Override
    public void setGpu(String gpu) {
        this.desktop.gpu = gpu;
        System.out.println("Components.GPU: " + gpu);
    }

    public void setPsu(String psu) {
        this.desktop.psu = psu;
        System.out.println("Components.PSU: " + psu);
    }

    public Desktop returnDesktop() {
        return this.desktop;
    }
    public void buildDesktop(String motherboard, String cpu, String ram, String gpu, String psu){
        setMotherboard(motherboard);
        setCpu(cpu);
        setRam(ram);
        setGpu(gpu);
        setPsu(psu);
    }
}