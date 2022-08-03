package Components;

import Builder.Desktop;
import Builder.DesktopBuilder;
import Builder.Laptop;
import Builder.LaptopBuilder;
import Composite.Package;
import Composite.Store;

import java.util.ArrayList;
import java.util.Random;

public class Generator {
    ArrayList<Motherboard> motherboards = new ArrayList<>();
    ArrayList<CPU> cpus = new ArrayList<>();
    ArrayList<GPU> gpus = new ArrayList<>();
    ArrayList<Storage> storages = new ArrayList<>();
    ArrayList<PSU> psus = new ArrayList<>();
    ArrayList<RAM> rams = new ArrayList<>();

    public Generator() {
        addMotherboards();
        addCPUs();
        addGPUs();
        addPSUs();
        addRAMs();
        addStorages();
    }

    public int getRandomNumberUsingNextInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

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

    public void addGPUs() {
        //laptop
        gpus.add(new GPU("GPU1", "NVIDIA GeForce RTX 3080 Ti Laptop GPU", "12GB", "laptop", 457.99));
        gpus.add(new GPU("GPU2", "NVIDIA GeForce GTX 1080 SLI", "12GB", "laptop", 352.99));
        gpus.add(new GPU("GPU3", "Apple M1 8-Core", "8GB", "laptop", 2130.00));
        gpus.add(new GPU("GPU4", "NVIDIA GeForce RTX 2080", "8GB", "laptop", 2003.99));
        gpus.add(new GPU("GPU5", "AMD Radeon RX 6800S", "6GB", "laptop", 698.99));
        //desktop
        gpus.add(new GPU("GPU6", "Radeon RX 6950 XT", "12GB", "desktop", 799.99));
        gpus.add(new GPU("GPU7", "GeForce RTX 3090 Ti", "24GB", "desktop", 2269.99));
        gpus.add(new GPU("GPU8", "NVIDIA Titan RTX", "8GB", "desktop", 3398.99));
        gpus.add(new GPU("GPU9", "GeForce GTX 1650", "8GB", "desktop", 209.99));
        gpus.add(new GPU("GPU10", "Radeon RX 6900 XT OC", "6GB", "desktop", 1019.99));
    }

    public void addStorages() {
        //laptop
        storages.add(new Storage("STR1", "Samsung 970 Evo Plus NVMe", "1TB", "laptop", 105.99));
        storages.add(new Storage("STR2", "HP EX950", "2TB", "laptop", 190.99));
        storages.add(new Storage("STR3", "Adata XPG SX8200 Pro", "1TB", "laptop", 59.99));
        storages.add(new Storage("STR4", "Crucial P1 3D", "2TB", "laptop", 100.99));
        storages.add(new Storage("STR5", "Gigabyte Aorus", "1TB", "laptop", 188.00));
        //desktop
        storages.add(new Storage("STR6", "Samsung 870 EVO", "512GB", "desktop", 100.00));
        storages.add(new Storage("STR7", "Crucial MX300", "275GB", "desktop", 74.99));
        storages.add(new Storage("STR8", "HyperX Fury", "120GB", "desktop", 98.99));
        storages.add(new Storage("STR9", "OCZ ARC 100", "1TB", "desktop", 153.00));
        storages.add(new Storage("STR10", "Samsung 960", "2TB", "desktop", 265.99));
    }

    public void addPSUs() {
        //laptop
        psus.add(new PSU("PSU1", "Corsair CX450", "laptop", 59.99));
        psus.add(new PSU("PSU2", "Corsair CX550F", "laptop", 62.10));
        psus.add(new PSU("PSU3", "XPG Core Reactor", "laptop", 120.00));
        psus.add(new PSU("PSU4", "Cooler Master V750 Gold V2", "laptop", 159.99));
        psus.add(new PSU("PSU5", "be quiet! Dark Power Pro 12", "laptop", 415.34));
        //desktop
        psus.add(new PSU("PSU6", "Corsair SF750", "desktop", 169.99));
        psus.add(new PSU("PSU7", "SilverStone SX1000 SFX-L", "desktop", 323.80));
        psus.add(new PSU("PSU8", "EVGA SuperNOVA 1600 T2", "desktop", 399.99));
        psus.add(new PSU("PSU9", "Corsair AX1600i", "desktop", 359.99));
        psus.add(new PSU("PSU10", "EVGA SuperNOVA 1000 T2", "desktop", 229.99));
    }

    public void addRAMs() {
        //laptop
        rams.add(new RAM("RAM1", "G.Skill Trident Z5 RGB", "laptop", "64GB", 341.99));
        rams.add(new RAM("RAM2", "Samsung DDR5-4800", "laptop", "32GB", 170.99));
        rams.add(new RAM("RAM3", "TeamGroup T-Force Xtreem", "laptop", "32GB", 149.99));
        rams.add(new RAM("RAM4", "Patriot Viper Steel", "laptop", "64GB", 109.99));
        rams.add(new RAM("RAM5", "Corsair Vengeance RGB Pro", "laptop", "128GB", 206.21));
        //desktop
        rams.add(new RAM("RAM6", "Corsair Vengeance LPX", "desktop", "8GB", 59.99));
        rams.add(new RAM("RAM7", "Lexar Thor", "desktop", "2x8GB", 56.99));
        rams.add(new RAM("RAM8", "Kingston FURY Renegade", "desktop", "32GB", 459.99));
        rams.add(new RAM("RAM9", "Teamgroup T-Force Vulcan Z", "desktop", "64GB", 69.99));
        rams.add(new RAM("RAM10", "G.Skill Ripjaws Serie V", "desktop", "128GB", 96.99));
    }

    public Laptop createLaptop() {
        int random0 = getRandomNumberUsingNextInt(0, 4);
        int random1 = getRandomNumberUsingNextInt(0, 4);
        int random2 = getRandomNumberUsingNextInt(0, 4);
        int random3 = getRandomNumberUsingNextInt(0, 4);
        int random4 = getRandomNumberUsingNextInt(0, 4);
        LaptopBuilder laptopComputer = new LaptopBuilder();
        laptopComputer.buildLaptop(motherboards.get(random0), cpus.get(random1), rams.get(random2), storages.get(random3), gpus.get(random4));
        return laptopComputer.returnLaptop();
    }

    public Desktop createDesktop() {
        int random0 = getRandomNumberUsingNextInt(5, 9);
        int random1 = getRandomNumberUsingNextInt(5, 9);
        int random2 = getRandomNumberUsingNextInt(5, 9);
        int random3 = getRandomNumberUsingNextInt(5, 9);
        int random4 = getRandomNumberUsingNextInt(5, 9);
        int random5 = getRandomNumberUsingNextInt(5, 9);
        DesktopBuilder desktop = new DesktopBuilder();
        desktop.buildDesktop(motherboards.get(random0), cpus.get(random1), rams.get(random2), storages.get(random3), gpus.get(random4), psus.get(random5));
        return desktop.returnDesktop();
    }

    public ArrayList<Store> genStoresPackagesDevices(int stores, int packages, int devices) {
        Generator gen = new Generator();
        ArrayList<Store> storesList = new ArrayList<>();
        for (int i = 0; i < stores; i++) {
            Store store = new Store();
            for (int j = 0; j < packages; j++) {
                Package package1 = new Package();
                for (int k = 0; k < devices; k++) {
                    Laptop laptop1 = gen.createLaptop();
                    package1.addToPackage(laptop1);
                    Desktop desktop1 = gen.createDesktop();
                    package1.addToPackage(desktop1);
                }
                store.addToContainer(package1);
            }
            storesList.add(store);
        }
        return storesList;
    }
}
