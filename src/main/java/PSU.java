public class PSU implements Component {
    String IDPSU;
    String namePSU;
    String type;
    Double price;

    public PSU(String IDPSU, String namePSU, String type, Double price) {
        this.IDPSU = IDPSU;
        this.namePSU = namePSU;
        this.type = type;
        this.price = price;
    }

    @Override
    public void getName() {
        System.out.println("PSU name: " + namePSU);
    }
}
