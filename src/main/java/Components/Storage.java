package Components;

import Components.Component;

public class Storage implements Component {
    String IDStorage;
    String nameStorage;
    String memory;
    String type;
    Double price;

    public Storage(String IDStorage, String nameStorage, String memory, String type, Double price) {
        this.IDStorage = IDStorage;
        this.nameStorage = nameStorage;
        this.memory = memory;
        this.type = type;
        this.price = price;
    }

    @Override
    public void getName() {
        System.out.println("Components.Storage name: " + nameStorage);
    }
}
