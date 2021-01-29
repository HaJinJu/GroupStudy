/*
        < Question 6 >
휴대폰은 전자제품임을 표현하는 코드를 작성해보자!
*/


package Question6;

public class MobilePhone extends Electronics {
    private String phoneNum;        // 전화번호

    public MobilePhone (String phoneNum) {
        super(true);
        this.phoneNum = phoneNum;
    }
}