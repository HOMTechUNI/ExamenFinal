package BuilderTests;

import Builder.Desktop;
import Builder.DesktopBuilder;
import Components.*;
import org.junit.Assert;
import org.junit.Test;

public class DesktopBuilderTest {
    DesktopBuilder desktopBuilder = new DesktopBuilder();
    Desktop desktop;
    CPU cpu;
    GPU gpu;
    Motherboard motherboard;
    PSU psu;
    RAM ram;
    Storage storage;

    @Test
    public void setCPUTest() {//prueba del método setCPU de la clase DesktopBuilder
        cpu = new CPU("1", "nameCPU", "type", 100.0);
        desktopBuilder.setCpu(cpu);
        desktop = desktopBuilder.returnDesktop();
        Assert.assertEquals(desktop.getCpu(), cpu);
    }

    @Test
    public void setGPUTest() {//prueba del método setGPU de la clase DesktopBuilder
        gpu = new GPU("1", "nameGPU", "Memory", "type", 100.0);
        desktopBuilder.setGpu(gpu);
        desktop = desktopBuilder.returnDesktop();
        Assert.assertEquals(desktop.getGpu(), gpu);
    }

    @Test
    public void setMotherboardTest() {//prueba del método setMotherboard de la clase DesktopBuilder
        motherboard = new Motherboard("1", "nameMotherboard", "type", 100.0);
        desktopBuilder.setMotherboard(motherboard);
        desktop = desktopBuilder.returnDesktop();
        Assert.assertEquals(desktop.getMotherboard(), motherboard);
    }

    @Test
    public void setPSUTest() {//prueba del método setPSU de la clase DesktopBuilder
        psu = new PSU("1", "namePSU", "type", 100.0);
        desktopBuilder.setPsu(psu);
        desktop = desktopBuilder.returnDesktop();
        Assert.assertEquals(desktop.getPsu(), psu);
    }

    @Test
    public void setRAMtest() {//prueba del método setRAM de la clase DesktopBuilder
        ram = new RAM("1", "nameRAM", "Memory", "type", 100.0);
        desktopBuilder.setRam(ram);
        desktop = desktopBuilder.returnDesktop();
        Assert.assertEquals(desktop.getRam(), ram);
    }

    @Test
    public void setStorageTest() {//prueba del método setStorage de la clase DesktopBuilder
        storage = new Storage("1", "nameStorage", "memory", "type", 100.0);
        desktopBuilder.setStorage(storage);
        desktop = desktopBuilder.returnDesktop();
        Assert.assertEquals(desktop.getStorage(), storage);
    }

    @Test
    public void buildDesktopTest() {//prueba del método buildDesktop de la clase DesktopBuilder
        cpu = new CPU("2", "nameCPU1", "type", 100.0);
        gpu = new GPU("3", "nameGPU1", "Memory", "type", 100.0);
        motherboard = new Motherboard("4", "nameMotherboard1", "type", 100.0);
        psu = new PSU("5", "namePSU1", "type", 100.0);
        ram = new RAM("6", "nameRAM1", "Memory", "type", 100.0);
        storage = new Storage("7", "nameStorage1", "memory", "type", 100.0);
        desktopBuilder.buildDesktop(motherboard, cpu, ram, storage, gpu, psu);
        desktop = desktopBuilder.returnDesktop();
        Assert.assertEquals(desktop.getCpu(), cpu);
        Assert.assertEquals(desktop.getGpu(), gpu);
        Assert.assertEquals(desktop.getMotherboard(), motherboard);
        Assert.assertEquals(desktop.getPsu(), psu);
        Assert.assertEquals(desktop.getRam(), ram);
        Assert.assertEquals(desktop.getStorage(), storage);
    }

}
