package Seventeenth;

class Electronics{
    private String manufacturer;
    private String powerOnOff;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getpowerOnOff() {
        return powerOnOff;
    }

    public Electronics(String manufacturer,String powerOnOff) {
        this.manufacturer = manufacturer;
        this.powerOnOff = powerOnOff;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "제조사='" + manufacturer + '\'' +
                ", 동작방식='" + powerOnOff + '\'' +
                '}';
    }
}
class SmartPhone extends Electronics{
    private String kakaoTalk;
    private String youTube;

    public SmartPhone(String manufacturer, String power,String kakaoTalk,String youTube) {
        super(manufacturer, power);
        this.kakaoTalk = kakaoTalk;
        this.youTube = youTube;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +"제조사 = "+super.getManufacturer()+
                "\n동작방식 = "+ super.getpowerOnOff()+
                "\nkakaoTalk='" + kakaoTalk + '\'' +
                "\nyouTube='" + youTube + '\'' +
                '}';
    }
}



public class Quiz6 {
    //6. 휴대폰은 전자제품임을 표현하는 코드를 작성해보자!
    public static void main(String[] args) {
        Electronics ele = new Electronics("Asus","on");
        System.out.println(ele);

        SmartPhone sp = new SmartPhone("apple","on","가능","가능");
        System.out.println(sp);
    }
}
