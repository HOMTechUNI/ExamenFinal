package Builder;

public class LaptopBuilder implements DeviceBuilder {
    private Laptop laptop;

    public void buildLaptop(String motherboard, String cpu, String ram, String gpu){
        setMotherboard(motherboard);
        setCpu(cpu);
        setRam(ram);
        setGpu(gpu);
    }

    @Override
    public void setMotherboard(String motherboard) {
        this.laptop.motherboard = motherboard;
        System.out.println("Components.Motherboard: " + motherboard);
    }
    @Override
    public void setCpu(String cpu) {
        this.laptop.cpu = cpu;
        System.out.println("Components.CPU: " + cpu);
    }
    @Override
    public void setRam(String ram) {
        this.laptop.ram = ram;
        System.out.println("Components.RAM: " + ram);
    }
    @Override
    public void setGpu(String gpu) {
        this.laptop.gpu = gpu;
        System.out.println("Components.GPU: " + gpu);
    }

    public Laptop returnLaptop() {
        return this.laptop;
    }
}