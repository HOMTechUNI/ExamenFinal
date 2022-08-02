package Components;

public class Motherboard implements Component{
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
        this.motherboardId = motherboardId;
        this.nameMotherboard = nameMotherboard;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        return nameMotherboard;
    }
}