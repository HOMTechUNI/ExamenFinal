package Components;

public class GPU implements Component {
    String gpuId;
    String nameGPU;
    String memory;
    String type;
    Double price;

    public GPU() {
        this.gpuId = "";
        this.nameGPU = "";
        this.memory = "";
        this.type = "";
        this.price = 0.0;
    }

    public GPU(String gpuId, String nameGPU, String memory, String type, Double price) {
        this.gpuId = gpuId;
        this.nameGPU = nameGPU;
        this.memory = memory;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        return nameGPU;
    }
}