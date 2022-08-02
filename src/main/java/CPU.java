public class CPU implements Component {
    String IDCPU;
    String nameCPU;
    String type;
    Double price;

    public CPU(String IDCPU, String nameCPU, String type, Double price) {
        this.IDCPU = IDCPU;
        this.nameCPU = nameCPU;
        this.type = type;
        this.price = price;
    }

    @Override
    public void getName() {
        System.out.println("CPU name: " + nameCPU);
    }
}
