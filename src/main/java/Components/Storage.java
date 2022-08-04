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
        assert storageId != null : "El string gpuID no puede ser nulo";
        assert nameStorage != null : "El string no puede ser nulo";
        assert nameStorage != "" : "El string no puede estar vacio";
        assert type != null : "El string type no puede ser nulo";
        assert price != null : "El precio no puede ser nulo";
        assert price > 0 : "El precio no puede ser 0 o menor que 0";
        this.storageId = storageId;
        this.nameStorage = nameStorage;
        this.memory = memory;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        assert nameStorage != null : "El string no puede ser nulo";
        assert nameStorage != "" : "El string no puede estar vacio";
        return nameStorage;
    }
}