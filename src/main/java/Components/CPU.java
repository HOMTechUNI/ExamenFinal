package Components;


public class CPU implements Component {
    String cpuId;
    String nameCPU;
    String type;
    Double price;

    public CPU() {
        this.cpuId = "";
        this.nameCPU = "";
        this.type = "";
        this.price = 0.0;
    }

    public CPU(String cpuId, String nameCPU, String type, Double price) {
        this.cpuId = cpuId;
        this.nameCPU = nameCPU;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        return nameCPU;
    }
}