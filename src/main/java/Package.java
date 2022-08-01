import java.util.ArrayList;

public class Package implements Box{

    ArrayList<DeviceBuilder> devices = new ArrayList<>();

    public void addToPackage(DeviceBuilder product) {
        devices.add(product);
    }

    public void removeFromPackage(DeviceBuilder product) {
        devices.remove(product);
    }

    @Override
    public void getDescription() {
        //aaaaaaaa
    }

    @Override
    public void getQuantityProducts() {
        System.out.println("Esta caja contiene "+devices.size()+" dispositivos");
    }

    @Override
    public void display(){
        //aaaaaaaaaaa
    }

}