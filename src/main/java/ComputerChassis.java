public class ComputerChassis implements DeviceBuilder{
    String motherboard;
    String cpu;
    String ram;
    String gpu;
    String psu;
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

    public void setPsu(String psu) {
        System.out.println("PSU: " + psu);
    }
}
