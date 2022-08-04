package ComponentsTest;

import Components.*;
import org.junit.Assert;
import org.junit.Test;

public class ComponentsTest {
    CPU cpu;
    GPU gpu;
    Motherboard motherboard;
    PSU psu;
    RAM ram;
    Storage storage;

    @Test
    public  void  getNameCPUTest(){//pureba del método getName de la clase CPU
        cpu=new CPU("1","nameCPU","type",100.0);
        Assert.assertEquals(cpu.getName(),"nameCPU");
    }
    @Test
    public  void  getNameGPUTest(){//pureba del método getName de la clase GPU
        gpu=new GPU("1","nameGPU","Memory","type",100.0);
        Assert.assertEquals(gpu.getName(),"nameGPU");
    }
    @Test
    public  void  getNameMotherboardTest(){//pureba del método getName de la clase Motherboard
        motherboard=new Motherboard("1","nameMotherboard","type",100.0);
        Assert.assertEquals(motherboard.getName(),"nameMotherboard");
    }
    @Test
    public  void  getNamePSUTest(){//pureba del método getName de la clase PSU
        psu=new PSU("1","namePSU","type",100.0);
        Assert.assertEquals(psu.getName(),"namePSU");
    }
    @Test
    public  void  getNameRAMTest(){//pureba del método getName de la clase RAM
        ram=new RAM("1","nameRAM","Memory","type",100.0);
        Assert.assertEquals(ram.getName(),"nameRAM");
    }
    @Test
    public  void  getNameStorageTest(){//pureba del método getName de la clase Storage
        storage=new Storage("1","nameStorage","memory","type",100.0);
        Assert.assertEquals(storage.getName(),"nameStorage");
    }
}
