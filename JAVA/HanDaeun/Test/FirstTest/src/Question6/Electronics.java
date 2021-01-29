package Question6;

public class Electronics {
    private String brandName;           // 제조 기업 이름
    private String brandCountry;        // 제조 기업 국가
    private int powerConsumption;       // 소비 전력
    private boolean haveBattery;        // 배터리 사용 여부
    private int batteryCapacity;        // 배터리 용량

    public Electronics(boolean haveBattery) {
        this.haveBattery = haveBattery;
    }
}