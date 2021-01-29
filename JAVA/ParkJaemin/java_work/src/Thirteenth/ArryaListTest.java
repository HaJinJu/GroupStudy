package Thirteenth;

import java.util.ArrayList;

public class ArryaListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // 기본길이(용량, capacity)가 string인(또는 Integer 정수) ArrayList를 생성
        // <> ㅡ> 타입 변수 자리 : int, String 등
        // 순서가 있는 데이터 집합, 데이터 중복을 허용, 저장순서
        // 데이터의 저장공간으로 배열을 사용한다(배열기반)
        // ArrayList에는 객체만 저장가능, 원래는 list.add(new String("MILK"));로 작성해야지만
        // autoboxing에 의해 컴파일러가 기본형에서 참조형으로 자동 변환
        list.add("MILK");
        list.add("BRAED");
        list.add("BUTTER");
        // 기존 목록, Object배열

        list.add(1 ,"APPLE");
        list.add(2,"GRAPE");

        // 추가 목록 몇번째에 위치할지 index(저장위치) 및 요소(타입에 따라 다름)
        // - void add(int index, Object element)


        for(int i = 0; i <list.size(); i++){ // size값 위 list.add값 확인 = 5
            System.out.println(list.get(i));

            // 추가 목록 포함한걸 for문으로 list.get(i)값 출력
        }

        System.out.println("***********************");
        list.remove(3);
        //인덱스가 3인 곳에 저장된 요소를 삭제

        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

// Question(ArrayList) 연습 문제
// 20명이 승차할 수 있는 열차가 있다.
// 이 열차에 50명이 예매를 하려고 한다.
// 50명 중 누가 예매에 성공했는지 출력해보자
// 랜덤 사용해야한다.
// 사용자는 0~49까지 순차적으로 예매를 하는 형식 아니며
// 랜덤한 숫자로 0~49까지 중 선별되어 예매를 할 수 있게 되어 있는 시스
//