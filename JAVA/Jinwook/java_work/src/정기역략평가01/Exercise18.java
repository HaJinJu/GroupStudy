package 정기역략평가01;

public class Exercise18 {
    //자바 컴파일러와, 자바 인터프리터(JVM)에 대해 기술해보자!

    //자바 컴파일러
    // .java 파일(sourse code)을 javac(java compiler)가 바이트코드로 쓰여진 .class 파일(object code)로 변환시켜주는 역할이다
    // 고레벨 언어 -> 저레벨 언어(기계어)로 변환시켜주는 역할
    // 소스코드를 수집하고 재구성함
    // JVM을 위한 언어 변환.

    //JVM
    // 변환된 바이트 코드를 실행시키는 프로그램
    // 프로세스를 위한 준비 단계
    // 이름에서 알 수 있듯이 가상의 머신을 통해 변환된 언어를 실행하면서 어느 운영체제든 프로세스가 진행될 수 있도록 도와준다
    // 즉, 자바 컴파일러가 변환한 바이트 코드를 특정 환경의 운영체제에서 실행될 수 있도록 운영체제에 맞춰 기계어(native code)로 번역해준다.


    // JVM 실행 과정
    // Class loader와 Execution engine를 통해 변환된 클래스 파일로드하고 해석하여  Runtime data Areas 보낸다
    // Runtime Data Areas에는 Method/Heap/Stack/PC register/Native Method Stack이 있다
    // (Exercise 18 사진들 참조 요망)

}
