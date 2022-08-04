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
        assert ramId != null : "El string gpuID no puede ser nulo";
        assert nameRAM != null : "El string no puede ser nulo";
        assert nameRAM != "" : "El string no puede estar vacio";
        assert type != null : "El string type no puede ser nulo";
        assert price != null : "El precio no puede ser nulo";
        assert price > 0 : "El precio no puede ser 0 o menor que 0";
        this.ramId = ramId;
        this.nameRAM = nameRAM;
        this.memory = memory;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        assert nameRAM != null : "El string no puede ser nulo";
        assert nameRAM != "" : "El string no puede estar vacio";
        return nameRAM;
    }
}