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
    public  void  getNameCPUTest(){
        cpu=new CPU("1","nameCPU","type",100.0);
        Assert.assertEquals(cpu.getName(),"nameCPU");
    }
    @Test
    public  void  getNameGPUTest(){
        gpu=new GPU("1","nameGPU","Memory","type",100.0);
        Assert.assertEquals(gpu.getName(),"nameGPU");
    }
    @Test
    public  void  getNameMotherBoardTest(){
        motherboard=new Motherboard("1","nameMotherboard","type",100.0);
        Assert.assertEquals(motherboard.getName(),"nameMotherboard");
    }
    @Test
    public  void  getNamePSUTest(){
        psu=new PSU("1","namePSU","type",100.0);
        Assert.assertEquals(psu.getName(),"namePSU");
    }
    @Test
    public  void  getNameRAMTest(){
        ram=new RAM("1","nameRAM","Memory","type",100.0);
        Assert.assertEquals(ram.getName(),"nameRAM");
    }
    @Test
    public  void  getNameStorageTest(){
        storage=new Storage("1","nameStorage","memory","type",100.0);
        Assert.assertEquals(storage.getName(),"nameStorage");
    }
}
