package Components;

public class PSU implements Component {
    String psuId;
    String namePSU;
    String type;
    Double price;

    public PSU(String psuId, String namePSU, String type, Double price) {
        assert psuId != null : "El string gpuID no puede ser nulo";
        assert namePSU != null : "El string no puede ser nulo";
        assert namePSU != "" : "El string no puede estar vacio";
        assert type != null : "El string type no puede ser nulo";
        assert price != null : "El precio no puede ser nulo";
        assert price > 0 : "El precio no puede ser 0 o menor que 0";
        this.psuId = psuId;
        this.namePSU = namePSU;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        assert namePSU != null : "El string no puede ser nulo";
        assert namePSU != "" : "El string no puede estar vacio";
        return namePSU;
    }
}