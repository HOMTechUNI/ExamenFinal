public class GPU implements Component {
    String IDGPU;
    String nameGPU;
    String memory;
    String type;
    Double price;

    public GPU(String IDGPU, String nameGPU, String memory, String type, Double price) {
        this.IDGPU = IDGPU;
        this.nameGPU = nameGPU;
        this.memory = memory;
        this.type = type;
        this.price = price;
    }

    @Override
    public void getName() {
        System.out.println("GPU name: " + nameGPU);
    }
}
