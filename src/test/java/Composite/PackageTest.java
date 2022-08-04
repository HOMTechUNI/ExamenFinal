package Composite;

import Builder.*;
import Components.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PackageTest {

    Package package1;
    Desktop desktop;
    Laptop laptop;
    DesktopBuilder desktopBuilder=new DesktopBuilder();
    LaptopBuilder laptopBuilder=new LaptopBuilder();
    CPU cpu;
    GPU gpu;
    Motherboard motherboard;
    PSU psu;
    RAM ram;
    Storage storage;
    @Test
    public void returnArrayListTest(){//prueba del método returnArrayList de la clase Package

        package1=new Package();
        //creacion de pc
        cpu = new CPU("pcCPU", "nameCPU1", "type", 100.0);
        gpu = new GPU("pcGPU", "nameGPU1", "memory", "type", 100.0);
        motherboard = new Motherboard("pcMotherboard", "nameMotherboard1", "type", 100.0);
        psu = new PSU("pcPSU", "namePSU1", "type", 100.0);
        ram = new RAM("pcRAM", "nameRAM1", "memory", "type", 100.0);
        storage = new Storage("pcStorage", "nameStorage1", "memory", "type", 100.0);
        desktopBuilder.buildDesktop(motherboard, cpu, ram, storage, gpu, psu);
        desktop = desktopBuilder.returnDesktop();

        //creación de laptop
        cpu = new CPU("laptopCPU", "nameCPU2", "type", 100.0);
        gpu = new GPU("laptopGPU", "nameGPU2", "memory", "type", 100.0);
        motherboard = new Motherboard("laptopMotherboard", "nameMotherboard2", "type", 100.0);
        ram = new RAM("laptopRAMP", "nameRAM2", "memory", "type", 100.0);
        storage = new Storage("laptopStorage", "nameStorage2", "memory", "type", 100.0);
        laptopBuilder.buildLaptop(motherboard, cpu, ram, storage, gpu);
        laptop = laptopBuilder.returnLaptop();

        package1.addToPackage(desktop);
        package1.addToPackage(laptop);

        ArrayList <Device> devices=new ArrayList<>();
        devices.add(desktop);
        devices.add(laptop);

        Assert.assertEquals(devices,package1.returnArrayList());

    }
}
