package Components;

import Components.Component;

public class RAM implements Component {
    String IDRAM;
    String nameRAM;
    String memory;
    String type;
    Double price;

    public RAM(String IDRAM, String nameRAM, String memory, String type, Double price) {
        this.IDRAM = IDRAM;
        this.nameRAM = nameRAM;
        this.memory = memory;
        this.type = type;
        this.price = price;
    }

    @Override
    public void getName() {
        System.out.println("Components.RAM name: " + nameRAM);
    }
}
