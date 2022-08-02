import Composite.Store;
import java.util.ArrayList;
import Builder.Device;
import Composite.Package;

public class StoreIterator {

    ArrayList <Store> items = new ArrayList<>();

    public void addNewItems(Store box){
        items.add(box);
    }

    public ArrayList search(String string) {
        ArrayList<Device> result = new ArrayList<Device>();
        for (Store store : items) {
            ArrayList<Package> co = store.returnArrayList();
            for (Package packages : co) {
                ArrayList<Device> devices = packages.returnArrayList();
                for (Device computer : devices) {
                    if (computer.allComponents().contains(string)) {
                        result.add(computer);
                    }
                }
            }
        }
        return result;
    }

}