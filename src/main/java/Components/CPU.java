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
        assert cpuId != null : "El string cpuID no puede ser nulo";
        assert nameCPU != null : "El string no puede ser nulo";
        assert nameCPU != "" : "El string no puede estar vacio";
        assert type != null : "El string type no puede ser nulo";
        assert price != null : "El precio no puede ser nulo";
        assert price > 0 : "El precio no puede ser 0 o menor que 0";
        this.cpuId = cpuId;
        this.nameCPU = nameCPU;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        assert nameCPU != null : "El string no puede ser nulo";
        assert nameCPU != "" : "El string no puede estar vacio";
        return nameCPU;
    }
}