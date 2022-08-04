package Components;

public class GPU implements Component {
    String gpuId;
    String nameGPU;
    String memory;
    String type;
    Double price;

    public GPU() {
        this.gpuId = "";
        this.nameGPU = "";
        this.memory = "";
        this.type = "";
        this.price = 0.0;
    }

    public GPU(String gpuId, String nameGPU, String memory, String type, Double price) {
        assert gpuId != null : "El string gpuID no puede ser nulo";
        assert nameGPU != null : "El string no puede ser nulo";
        assert nameGPU != "" : "El string no puede estar vacio";
        assert type != null : "El string type no puede ser nulo";
        assert price != null : "El precio no puede ser nulo";
        assert price > 0 : "El precio no puede ser 0 o menor que 0";
        this.gpuId = gpuId;
        this.nameGPU = nameGPU;
        this.memory = memory;
        this.type = type;
        this.price = price;
    }

    @Override
    public String getName() {
        assert nameGPU != null : "El string no puede ser nulo";
        assert nameGPU != "" : "El string no puede estar vacio";
        return nameGPU;
    }
}