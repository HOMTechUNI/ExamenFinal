package Builder;

import Components.*;

public interface DeviceBuilder {
    void setMotherboard(Motherboard motherboard);

    void setCpu(CPU cpu);

    void setRam(RAM ram);

    void setStorage(Storage storage);

    void setGpu(GPU gpu);
}