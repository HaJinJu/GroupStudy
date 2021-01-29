class Plastic {
}

class Powder {
}

class ThreeDPrinterObj {
    private Object material;

    public void setMaterial(Object material) {
        this.material = material;
    }

    public Object getMaterial() {
        return material;
    }
}

public class ObjectTest {
    public static void main(String[] args) {
        ThreeDPrinterObj printerO1 = new ThreeDPrinterObj();
        ThreeDPrinterObj printerO2 = new ThreeDPrinterObj();

        printerO1.setMaterial(new Powder());
        printerO2.setMaterial(new Plastic());

        // 타입 변환 필요 (Powder), (Plastic)
        Powder powder = (Powder)printerO1.getMaterial();
        Plastic plastic = (Plastic)printerO2.getMaterial();
    }
}