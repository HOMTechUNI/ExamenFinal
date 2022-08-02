public class DesktopBuilder implements DeviceBuilder {
    private Desktop desktop;

    @Override
    public void setMotherboard(String motherboard) {
        this.desktop.motherboard = motherboard;
        System.out.println("Motherboard: " + motherboard);
    }

    @Override
    public void setCpu(String cpu) {
        this.desktop.cpu = cpu;
        System.out.println("CPU: " + cpu);
    }

    @Override
    public void setRam(String ram) {
        this.desktop.ram = ram;
        System.out.println("RAM: " + ram);
    }

    @Override
    public void setGpu(String gpu) {
        this.desktop.gpu = gpu;
        System.out.println("GPU: " + gpu);
    }

    public void setPsu(String psu) {
        this.desktop.psu = psu;
        System.out.println("PSU: " + psu);
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