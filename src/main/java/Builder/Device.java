package Builder;

import Components.*;

import java.util.ArrayList;

public interface Device {
    Motherboard getMotherboard();

    CPU getCpu();

    RAM getRam();

    Storage getStorage();

    GPU getGpu();

    ArrayList<String> allComponents();
}