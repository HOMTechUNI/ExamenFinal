public class Desktop implements Device{
    String motherboard;
    String cpu;
    String ram;
    String gpu;
    String psu;

    public Desktop() {
        this.motherboard = "";
        this.cpu = "";
        this.ram = "";
        this.gpu = "";
        this.psu = "";
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

    public String getPsu() {
        return psu;
    }
}
