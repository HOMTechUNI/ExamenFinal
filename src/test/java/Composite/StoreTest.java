package Composite;

import Builder.Desktop;
import Builder.DesktopBuilder;
import Builder.Laptop;
import Builder.LaptopBuilder;
import Components.*;
import org.junit.Assert;
import org.junit.Test;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.SortedMap;

public class StoreTest {
    Package package1=new Package();
    Package package2=new Package();
    DesktopBuilder desktopBuilder=new DesktopBuilder();
    LaptopBuilder laptopBuilder=new LaptopBuilder();
    Store store=new Store();
    CPU cpu;
    GPU gpu;
    Motherboard motherboard;
    PSU psu;
    RAM ram;
    Storage storage;
    @Test
    public void returnArrayListTest(){//prueba del método returnArrayList de la clase Store
        Desktop desktop1;
        Desktop desktop2;
        Laptop laptop1;
        Laptop laptop2;
        //Dispositivos para paquete 1
        //creacion de pc 1
        cpu = new CPU("pcCPU1", "nameCPU1", "type", 100.0);
        gpu = new GPU("pcGPU1", "nameGPU1", "memory", "type", 100.0);
        motherboard = new Motherboard("pcMotherboard1", "nameMotherboard1", "type", 100.0);
        psu = new PSU("pcPSU1", "namePSU1", "type", 100.0);
        ram = new RAM("pcRAM1", "nameRAM1", "memory", "type", 100.0);
        storage = new Storage("pcStorage1", "nameStorage1", "memory", "type", 100.0);
        desktopBuilder.buildDesktop(motherboard, cpu, ram, storage, gpu, psu);
        desktop1 = desktopBuilder.returnDesktop();

        //creación de laptop 1
        cpu = new CPU("laptopCPU1", "nameCPU2", "type", 100.0);
        gpu = new GPU("laptopGPU1", "nameGPU2", "memory", "type", 100.0);
        motherboard = new Motherboard("laptopMotherboard1", "nameMotherboard2", "type", 100.0);
        ram = new RAM("laptopRAMP1", "nameRAM2", "memory", "type", 100.0);
        storage = new Storage("laptopStorage1", "nameStorage2", "memory", "type", 100.0);
        laptopBuilder.buildLaptop(motherboard, cpu, ram, storage, gpu);
        laptop1 = laptopBuilder.returnLaptop();

        package1.addToPackage(desktop1);
        package1.addToPackage(laptop1);

        //Dispositivos para paquete 2
        //creacion de pc 2
        cpu = new CPU("pcCPU2", "nameCPU1", "type", 100.0);
        gpu = new GPU("pcGPU2", "nameGPU1", "memory", "type", 100.0);
        motherboard = new Motherboard("pcMotherboard2", "nameMotherboard1", "type", 100.0);
        psu = new PSU("pcPSU2", "namePSU1", "type", 100.0);
        ram = new RAM("pcRAM2", "nameRAM1", "memory", "type", 100.0);
        storage = new Storage("pcStorage", "nameStorage1", "memory", "type", 100.0);
        desktopBuilder.buildDesktop(motherboard, cpu, ram, storage, gpu, psu);
        desktop2 = desktopBuilder.returnDesktop();

        //creación de laptop 2
        cpu = new CPU("laptopCPU2", "nameCPU2", "type", 100.0);
        gpu = new GPU("laptopGPU2", "nameGPU2", "memory", "type", 100.0);
        motherboard = new Motherboard("laptopMotherboard2", "nameMotherboard2", "type", 100.0);
        ram = new RAM("laptopRAMP2", "nameRAM22", "memory", "type", 100.0);
        storage = new Storage("laptopStorage2", "nameStorage2", "memory", "type", 100.0);
        laptopBuilder.buildLaptop(motherboard, cpu, ram, storage, gpu);
        laptop2 = laptopBuilder.returnLaptop();

        package2.addToPackage(desktop2);
        package2.addToPackage(laptop2);

        //añadir los paquetes a la tienda
        store.addToStore(package1);
        store.addToStore(package2);

        ArrayList<Package>packages=new ArrayList<>();
        packages.add(package1);
        packages.add(package2);

        Assert.assertEquals(packages,store.returnArrayList());
    }
}
