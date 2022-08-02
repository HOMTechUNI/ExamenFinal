import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDevice {
    ArrayList <Store>stores=new ArrayList<>();
    ArrayList <Box>boxes=new ArrayList<>();
    ArrayList <Device> devices=new ArrayList<>();

    Iterator <Store> iteratorStore=stores.iterator();
    Iterator <Box> iteratorBoxes=boxes.iterator();
    Iterator <Device> iteratorDev=devices.iterator();
}
