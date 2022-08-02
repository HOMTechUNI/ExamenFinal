package Builder;

public class Laptop implements Device {
    String motherboard;
    String cpu;
    String ram;
    String gpu;

    public Laptop() {
        this.motherboard = "";
        this.cpu = "";
        this.ram = "";
        this.gpu = "";
    }

    @Override
    public String getMotherboard() {
        return motherboard;
    }

    @Override
    public String getCpu() {
        return cpu;
    }

    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public String getGpu() {
        return gpu;
    }
}
