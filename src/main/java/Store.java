import java.util.ArrayList;

public class Store implements Box{
        ArrayList<Box> boxes = new ArrayList<>();

        public void addToCompound(Box box) {
            boxes.add(box);
        }

        public void removeFromCompound(Box box) {
            boxes.remove(box);
        }

        @Override
        public void getDescription() {
            //aaaa
        }

        @Override
        public void getQuantityProducts() {
            System.out.println("Esta caja contiene "+boxes.size()+" dispositivos");
        }

        @Override
        public void display(){
            //aaaaaaaaaaa
        }

}
