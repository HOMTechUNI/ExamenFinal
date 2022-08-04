package Components;

public class Motherboard implements Component {
    String motherboardId;
    String nameMotherboard;
    String type;
    Double price;

    public Motherboard() {
        this.motherboardId = "";
        this.nameMotherboard = "";
        this.type = "";
        this.price = 0.0;
    }

    public Motherboard(String motherboardId, String nameMotherboard, String type, Double price) {
        assert motherboardId != null : "El string motherboardID no puede ser nulo";
        assert nameMotherboard != null : "El string nameMotherboard no puede ser nulo";
        assert type != null : "El string type no puede ser nulo";
        assert price != null : "El precio no puede ser nulo";
        assert price > 0 : "El precio no puede ser 0 o menor que 0";
        this.motherboardId = motherboardId;
        this.nameMotherboard = nameMotherboard;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        assert motherboardId != null : "El string motherboardID no puede ser nulo";
        return nameMotherboard;
    }
}