import Components.*;
import java.util.ArrayList;

public class Generator {
    ArrayList<Motherboard> motherboards = new ArrayList<>();
    ArrayList<CPU> cpus = new ArrayList<>();
    ArrayList<GPU> gpus = new ArrayList<>();
    ArrayList<Storage> storages = new ArrayList<>();
    ArrayList<PSU> psus = new ArrayList<>();
    ArrayList<RAM> rams = new ArrayList<>();

    public void addMotherboards() {
        //laptop
        motherboards.add(new Motherboard("MB1", "Apple MacBook Pro Motherboard", "laptop", 328.65));
        motherboards.add(new Motherboard("MB2", "LG Gram 17Z90N Motherboard", "laptop", 255.52));
        motherboards.add(new Motherboard("MB3", "Alienware AW15R3-7002SLV-PUS Motherboard", "laptop", 285.61));
        motherboards.add(new Motherboard("MB4", "Razer Blade Pro 17 Motherboard", "laptop", 393.57));
        motherboards.add(new Motherboard("MB5", "Asus ZenBook Flip S 13 Motherboard", "laptop", 221.28));
        //desktop
        motherboards.add(new Motherboard("MB6", "Gigabyte Z690 Aorus Pro", "desktop", 289.99));
        motherboards.add(new Motherboard("MB7", "MSI MEG Z690I Unify", "desktop", 399.99));
        motherboards.add(new Motherboard("MB8", "NZXT N7 B550", "desktop", 222.81));
        motherboards.add(new Motherboard("MB9", "MSI MAG B660M Mortar", "desktop", 159.99));
        motherboards.add(new Motherboard("MB10", "Asus ROG Strix B660-I", "desktop", 219.99));
    }

    public void addCPUs() {
        //laptop
        cpus.add(new CPU("CPU1", "Intel Core i7-12700H", "laptop", 1194.99));
        cpus.add(new CPU("CPU2", "Intel Core i9-12900H", "laptop", 1749.00));
        cpus.add(new CPU("CPU3", "AMD Ryzen 7 6800H", "laptop", 1759.00));
        cpus.add(new CPU("CPU4", "AMD Ryzen 9 5900HS", "laptop", 1389.00));
        cpus.add(new CPU("CPU5", "Intel Xeon W-10885M", "laptop", 2599.99));
        //desktop
        cpus.add(new CPU("CPU6", "Intel Core i9-12900KS", "desktop", 739.99));
        cpus.add(new CPU("CPU7", "Intel Core i7-12900K", "desktop", 599.00));
        cpus.add(new CPU("CPU8", "AMD Ryzen 9 5950X", "desktop", 799.00));
        cpus.add(new CPU("CPU9", "AMD Ryzen Threadripper 3960X", "desktop", 1399.00));
        cpus.add(new CPU("CPU10", "Intel Core i5-11600KF", "desktop", 237.99));
    }
}