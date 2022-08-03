import Builder.Desktop;
import Builder.Device;
import Builder.Laptop;
import Composite.Package;
import Composite.Store;

import java.util.ArrayList;


public class StoreIterator {

    ArrayList <Store> items = new ArrayList<>();

    public void addNewItems(Store box){
        items.add(box);
    }

    public void setStore(ArrayList<Store> store){
        items = store;
    }

    public ArrayList searchLaptop(ArrayList<String> search) {
        ArrayList<Laptop> result = new ArrayList<>();
        for (Store store : items) {
            ArrayList<Package> co = store.returnArrayList();
            for (Package packages : co) {
                ArrayList<Device> devices = packages.returnArrayList();
                for (Device computer : devices) {
                    if(computer.getClass()==Laptop.class) {
                        int cont = 0, find = 0;
                        for (int p = 0; p < search.size(); p++) {
                            if (search.get(p) != "Seleccione el componente") {
                                cont++;
                                if (computer.allComponents().get(p) == search.get(p)) find++;
                            }
                        }
                        if (cont == find&& find>0 && cont>0) result.add((Laptop) computer);
                    }
                }
            }
        }
        return result;
    }
    public ArrayList searchDesktop(ArrayList<String> search) {
        ArrayList<Desktop> result = new ArrayList<>();
        for (Store store : items) {
            ArrayList<Package> co = store.returnArrayList();
            for (Package packages : co) {
                ArrayList<Device> devices = packages.returnArrayList();
                for (Device computer : devices) {
                    if(computer.getClass()==Desktop.class) {
                        int cont = 0, find = 0;
                        for (int p = 0; p < search.size(); p++) {
                            if (search.get(p) != "Seleccione el componente") {
                                cont++;
                                if (computer.allComponents().get(p) == search.get(p)) find++;
                            }
                        }
                        if (cont == find&& find>0 && cont>0) result.add((Desktop) computer);
                    }
                }
            }
        }
        return result;
    }
    public ArrayList returnAllLaptops() {
        ArrayList<Laptop> result = new ArrayList<>();
        for (int i=0 ; i < items.size() ; i++) {
            int aux = items.get(i).returnArrayList().size();
            ArrayList<Package> packages = items.get(i).returnArrayList();
            for (int j=0 ; j < aux; j++) {
                int aux2 = packages.get(j).returnArrayList().size();
                ArrayList<Device> devices = packages.get(j).returnArrayList();
                for (int k=0 ; k < aux2; k++) {
                    if (devices.get(k).getClass() == Laptop.class){
                        result.add((Laptop) devices.get(k));
                    }
                }
            }
        }
        return result;
    }

    /*
    public ArrayList returnAllLaptops() {
        ArrayList<Laptop> result = new ArrayList<>();
        for (Store store : items) {
            ArrayList<Package> co = store.returnArrayList();
            for (Package packages : co) {
                ArrayList<Device> devices = packages.returnArrayList();
                for (Device computer : devices) {
                        if (computer.getClass() == Laptop.class){
                            result.add((Laptop) computer);
                        }
                    }
                }
            }
        System.out.println(result.size());
        return result;
    }
    */
    public ArrayList returnAllDesktops() {
        ArrayList<Desktop> result = new ArrayList<>();
        for (Store store : items) {
            ArrayList<Package> co = store.returnArrayList();
            for (Package packages : co) {
                ArrayList<Device> devices = packages.returnArrayList();
                for (Device computer : devices) {
                    if (computer.getClass() == Desktop.class){
                        result.add((Desktop) computer);
                    }
                }
            }
        }
        return result;
    }

}