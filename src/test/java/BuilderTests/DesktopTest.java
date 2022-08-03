package BuilderTests;

import Builder.Desktop;
import Builder.DesktopBuilder;
import Components.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class DesktopTest {

    DesktopBuilder desktopBuilder = new DesktopBuilder();
    Desktop desktop;

    @Test
    public void allComponentsTest() {
        Motherboard motherboard = new Motherboard("MB1", "nameMotherboard1", "type", 100.0);
        CPU cpu = new CPU("CPU1", "nameCPU1", "type", 100.0);
        RAM ram = new RAM("RAM1", "nameRAM1", "Memory", "type", 100.0);
        Storage storage = new Storage("STR1", "nameStorage1", "memory", "type", 100.0);
        GPU gpu = new GPU("GPU1", "nameGPU1", "Memory", "type", 100.0);
        PSU psu = new PSU("PSU1", "namePSU1", "type", 100.0);
        desktopBuilder.buildDesktop(motherboard, cpu, ram, storage, gpu, psu);
        desktop = desktopBuilder.returnDesktop();
        ArrayList<String> allNameComponents = new ArrayList<>();
        allNameComponents.add(desktop.getMotherboard().getName());
        allNameComponents.add(desktop.getCpu().getName());
        allNameComponents.add(desktop.getRam().getName());
        allNameComponents.add(desktop.getStorage().getName());
        allNameComponents.add(desktop.getGpu().getName());
        allNameComponents.add(desktop.getPsu().getName());
        Assert.assertEquals(allNameComponents, desktop.allComponents());
    }
}
