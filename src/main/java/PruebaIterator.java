import java.util.ArrayList;

public class PruebaIterator {

    ArrayList <Container> items = new ArrayList<>();

    public void addNewItems(Container box){
        items.add(box);
    }
/*
    public ArrayList search(Components component,String string) {
        ArrayList<Device> result = new ArrayList<Device>();
        for (Container bo : items) {
            ArrayList<Composite.Package> co = bo.returnArrayList();
            for (Composite.Package pa : co) {
                ArrayList<Device> de = (ArrayList<Device>) pa.returnArrayList();
                for (Device computer : de) {
                    //Switch
                    if (computer.allComponents == component.getClass()) {
                        if (component.getName() == string) {
                            result.add(computer);
                        }
                    }
                }
            }
        }
        return result;
    }
*/
}