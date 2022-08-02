package Builder;

import Builder.DeviceBuilder;

public class Description implements DeviceBuilder {

    @Override
    public void setMotherboard(String motherboard) {
        System.out.println("Components.Motherboard: " + motherboard);
    }
    @Override
    public void setCpu(String cpu) {
        System.out.println("Components.CPU: " + cpu);
    }
    @Override
    public void setRam(String ram) {
        System.out.println("Components.RAM: " + ram);
    }
    @Override
    public void setGpu(String gpu) {
        System.out.println("Components.GPU: " + gpu);
    }
    public void setPsu(String psu) {
        System.out.println("Components.PSU: " + psu);
    }
}
