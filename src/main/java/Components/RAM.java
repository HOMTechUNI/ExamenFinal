package Components;

public class RAM implements Component {
    String ramId;
    String nameRAM;
    String memory;
    String type;
    Double price;

    public RAM() {
        this.ramId = "";
        this.nameRAM = "";
        this.memory = "";
        this.type = "";
        this.price = 0.0;
    }

    public RAM(String ramId, String nameRAM, String memory, String type, Double price) {
        this.ramId = ramId;
        this.nameRAM = nameRAM;
        this.memory = memory;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        return nameRAM;
    }
}