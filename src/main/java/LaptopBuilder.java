public class LaptopBuilder implements DeviceBuilder{
    private Laptop laptop;
    @Override
    public void setMotherboard(String motherboard) {
        this.laptop.motherboard = motherboard;
        System.out.println("Motherboard: " + motherboard);
    }
    @Override
    public void setCpu(String cpu) {
        this.laptop.cpu = cpu;
        System.out.println("CPU: " + cpu);
    }
    @Override
    public void setRam(String ram) {
        this.laptop.ram = ram;
        System.out.println("RAM: " + ram);
    }
    @Override
    public void setGpu(String gpu) {
        this.laptop.gpu = gpu;
        System.out.println("GPU: " + gpu);
    }

    public Laptop returnLaptop() {
        return this.laptop;
    }
}