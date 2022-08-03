import Components.*;
import Composite.Store;
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
    public  void  testGetNameCPU(){
        cpu=new CPU("1","nameCPU","type",100.0);//String cpuId, String nameCPU, String type, Double price
        Assert.assertEquals(cpu.getName(),"nameCPU");
    }
    @Test
    public  void  testGetNameGPU(){
        cpu=new CPU("1","nameCPU","type",100.0);//String cpuId, String nameCPU, String type, Double price
        Assert.assertEquals(cpu.getName(),"nameCPU");
    }
    @Test
    public  void  testGetNameMotherBoard(){
        cpu=new CPU("1","nameCPU","type",100.0);//String cpuId, String nameCPU, String type, Double price
        Assert.assertEquals(cpu.getName(),"nameCPU");
    }
    @Test
    public  void  testGetNamePSU(){
        cpu=new CPU("1","nameCPU","type",100.0);//String cpuId, String nameCPU, String type, Double price
        Assert.assertEquals(cpu.getName(),"nameCPU");
    }
    @Test
    public  void  testGetNameRAM(){
        cpu=new CPU("1","nameCPU","type",100.0);//String cpuId, String nameCPU, String type, Double price
        Assert.assertEquals(cpu.getName(),"nameCPU");
    }
    @Test
    public  void  testGetNameStorage(){
        storage=new Storage("1","nameCPU","memory","type",100.0);
        Assert.assertEquals(cpu.getName(),"nameCPU");
    }


}
