package GeneratorTest;

import Builder.Device;
import Components.Generator;
import Composite.Package;
import Composite.Store;
import org.junit.*;

import java.util.ArrayList;

public class GeneratorTest {
    int expectedStores = 3;

    int expectedPackages = 10;

    int expectedDevices = 10;

    Generator generator = new Generator();
    ArrayList<Store> stores = generator.genStoresPackagesDevices(expectedStores,expectedPackages,expectedDevices);

    ArrayList<Package> packages = stores.get(0).returnArrayList();

    ArrayList<Device> devices = packages.get(0).returnArrayList();

    @Test
    public void numStoresTest(){
        //Se compara el valor esperado con el numero de tiendas creadas
        int numStore = stores.size();
        Assert.assertEquals(expectedStores,numStore);
    }

    @Test
    public void numPackagesTest(){
        //Se compara el valor esperado con el numero de paquetes
        // creados por cada tienda
        int numPackages = packages.size();
        Assert.assertEquals(expectedPackages,numPackages);
    }

    @Test
    public void numDevicesTest(){
        //Se compara el valor esperado con el numero de dispositivos
        // creados por cada paquete
        int numDevices = devices.size();
        Assert.assertEquals(expectedDevices*2,numDevices);
    }

}
