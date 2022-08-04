package Components;

public class PSU implements Component {
    String psuId;
    String namePSU;
    String type;
    Double price;

    public PSU(String psuId, String namePSU, String type, Double price) {
        this.psuId = psuId;
        this.namePSU = namePSU;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        return namePSU;
    }
}