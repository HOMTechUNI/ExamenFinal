package BuilderTests;

import Builder.Laptop;
import Builder.LaptopBuilder;
import Components.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LaptopTest {

    LaptopBuilder laptopBuilder = new LaptopBuilder();
    Laptop laptop;

    @Test
    public void allComponentsTest() {
        Motherboard motherboard = new Motherboard("MB1", "nameMotherboard1", "type", 100.0);
        CPU cpu = new CPU("CPU1", "nameCPU1", "type", 100.0);
        RAM ram = new RAM("RAM1", "nameRAM1", "Memory", "type", 100.0);
        Storage storage = new Storage("STR1", "nameStorage1", "memory", "type", 100.0);
        GPU gpu = new GPU("GPU1", "nameGPU1", "Memory", "type", 100.0);
        laptopBuilder.buildLaptop(motherboard, cpu, ram, storage, gpu);
        laptop = laptopBuilder.returnLaptop();
        ArrayList<String> allNameComponents = new ArrayList<>();
        allNameComponents.add(laptop.getMotherboard().getName());
        allNameComponents.add(laptop.getCpu().getName());
        allNameComponents.add(laptop.getRam().getName());
        allNameComponents.add(laptop.getStorage().getName());
        allNameComponents.add(laptop.getGpu().getName());
        Assert.assertEquals(allNameComponents, laptop.allComponents());
    }
}
