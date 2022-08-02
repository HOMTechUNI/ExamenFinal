package Components;

public class Storage implements Component {
    String storageId;
    String nameStorage;
    String memory;
    String type;
    Double price;

    public Storage() {
        this.storageId = "";
        this.nameStorage = "";
        this.memory = "";
        this.type = "";
        this.price = 0.0;
    }

    public Storage(String storageId, String nameStorage, String memory, String type, Double price) {
        this.storageId = storageId;
        this.nameStorage = nameStorage;
        this.memory = memory;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        return nameStorage;
    }
}