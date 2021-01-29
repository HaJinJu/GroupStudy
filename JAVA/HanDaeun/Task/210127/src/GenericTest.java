// 여러 데이터 타입 필요한 곳에 동일한 문자 하나 사용
class ThreeDPrinterGen<T> {
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        // 실제 데이터 타입 명시
        ThreeDPrinterGen<Powder> printerG1 = new ThreeDPrinterGen<>();
        ThreeDPrinterGen<Plastic> printerG2 = new ThreeDPrinterGen<>();

        printerG1.setMaterial(new Powder());
        printerG2.setMaterial(new Plastic());

        // 타입 변환 필요없음 (Powder), (Plastic) X
        Powder powder = printerG1.getMaterial();
        Plastic plastic = printerG2.getMaterial();
    }
}