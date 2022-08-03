package BuilderTests;

import Builder.Laptop;
import Builder.LaptopBuilder;
import Components.*;
import org.junit.Assert;
import org.junit.Test;

public class LaptopBuilderTest {
    LaptopBuilder laptopBuilder = new LaptopBuilder();
    Laptop laptop;
    CPU cpu;
    GPU gpu;
    Motherboard motherboard;
    RAM ram;
    Storage storage;

    @Test
    public void setCpuTest() {
        cpu = new CPU("1", "nameCPU", "type", 100.0);
        laptopBuilder.setCpu(cpu);
        laptop = laptopBuilder.returnLaptop();
        Assert.assertEquals(laptop.getCpu(), cpu);
    }

    @Test
    public void setGPUTest() {
        gpu = new GPU("1", "nameGPU", "Memory", "type", 100.0);
        laptopBuilder.setGpu(gpu);
        laptop = laptopBuilder.returnLaptop();
        Assert.assertEquals(laptop.getGpu(), gpu);
    }

    @Test
    public void setMotherboardTest() {
        motherboard = new Motherboard("1", "nameMotherboard", "type", 100.0);
        laptopBuilder.setMotherboard(motherboard);
        laptop = laptopBuilder.returnLaptop();
        Assert.assertEquals(laptop.getMotherboard(), motherboard);
    }

    @Test
    public void setRamtest() {
        ram = new RAM("1", "nameRAM", "Memory", "type", 100.0);
        laptopBuilder.setRam(ram);
        laptop = laptopBuilder.returnLaptop();
        Assert.assertEquals(laptop.getRam(), ram);
    }

    @Test
    public void setStorageTest() {
        storage = new Storage("1", "nameStorage", "memory", "type", 100.0);
        laptopBuilder.setStorage(storage);
        laptop = laptopBuilder.returnLaptop();
        Assert.assertEquals(laptop.getStorage(), storage);
    }

    @Test
    public void buildLaptopTest() {
        cpu = new CPU("2", "nameCPU1", "type", 100.0);
        gpu = new GPU("3", "nameGPU1", "Memory", "type", 100.0);
        motherboard = new Motherboard("4", "nameMotherboard1", "type", 100.0);
        ram = new RAM("6", "nameRAM1", "Memory", "type", 100.0);
        storage = new Storage("7", "nameStorage1", "memory", "type", 100.0);
        laptopBuilder.buildLaptop(motherboard, cpu, ram, storage, gpu);
        laptop = laptopBuilder.returnLaptop();
        Assert.assertEquals(laptop.getCpu(), cpu);
        Assert.assertEquals(laptop.getGpu(), gpu);
        Assert.assertEquals(laptop.getMotherboard(), motherboard);
        Assert.assertEquals(laptop.getRam(), ram);
        Assert.assertEquals(laptop.getStorage(), storage);
    }
}
