package hw_2021_01_21;

class ElectronicDevice {

    boolean power;
    int volume;

    public void volumeUp() {
        ++volume;
    }
    public void volumeDown() {
        --volume;
    }
}

class Cellphone extends ElectronicDevice {

    public void Call(String number_010_0000_0000) {

        String number = number_010_0000_0000;
        if(power) {
            System.out.printf("전화 거는중...\n%s\n", number);
        }
    }
}

public class Test_06 {
    public static void main(String[] args) {
        System.out.println(
                "휴대폰은 전자제품임을 표현하는 코드를 작성해보자!\n");

        Cellphone galaxyS21 = new Cellphone();
        galaxyS21.power = true;
        galaxyS21.Call("010-1224-3542");

        galaxyS21.volume = 20;
        galaxyS21.volumeUp();
        galaxyS21.volumeUp();
        galaxyS21.volumeDown();
        System.out.println("소리 조절중..\n"+ galaxyS21.volume);
    }
}
