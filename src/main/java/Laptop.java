public class Laptop implements DeviceBuilder{
    String motherboard;
    String cpu;
    String ram;
    String gpu;
    @Override
    public void setMotherboard(String motherboard) {
        System.out.println("Motherboard: " + motherboard);
    }
    @Override
    public void setCpu(String cpu) {
        System.out.println("CPU: " + cpu);
    }
    @Override
    public void setRam(String ram) {
        System.out.println("RAM: " + ram);
    }
    @Override
    public void setGpu(String gpu) {
        System.out.println("GPU: " + gpu);
    }
}