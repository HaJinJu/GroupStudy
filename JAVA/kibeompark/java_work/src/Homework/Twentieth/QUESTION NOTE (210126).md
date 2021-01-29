# QUESTION NOTE (210126)

**Q :** 스레드를 쓰나 안 쓰나 어차피 계산하는 양은 같은데 스레드를 썼을 때 속도가 빨라지는 이유가 정확히 무엇인가요 ?  
이해가 되는 것 같다가도 다시 헷갈리고 그래서 질문합니다 ,, 아직 스레드 이후 내용에 대한 개념 이해가 부족한 것 같습니다.

**Q :**
```java
System.out.println(count); // count 값 확인 위함
count++; // 스레드 한 번 실행될 때마다 

@Override
public void run() {
    1번 
    for (int i = localStart; i <= localEnd; i++) {
        localSum += i * (0.0001 * i);
    }
    2번
    totalSum += localSum;
    3번
    System.out.printf(
            "threadId = %d, localStart = %6d, localEnd = %7d, " +
        "localSum = %f, totalSum = %f\n",
        threadId, localStart, localEnd, localSum, totalSum
    );
    4번
}
```
문제 3번을 풀던 중 5번째 스레드까지 실행되었을 때 totalSum 값을 출력하여 확인하려고  
count를 static 변수로 선언하고 맨 위에 있는 두 줄(sout(count), count++)을 run() 메서드 안에 넣었는데  
메서드 내 1 ~ 4번 각 위치마다 count 값의 출력 결과가 달라지고(ex. 1 2 3 1 1 / 1 2 2 1 1 / 1 2 3 4 1 / 6 6 6 6 6 / ... ),   
두 줄의 위아래가 바뀌면 또 count 값 출력이 달라집니다.   

그리고 ItemEnhanceThreadTest.java 에서
```java
public static class Item {
    private static int cnt = 0;
    private int num = ++cnt;
    ...
    System.out.println(num + "번 아이템 강화 종료 !");
}
```
static 변수로 cnt를 선언하고 변수 num으로 옮겨넣은 후에 증감 연산자를 사용해서 번호의 증가를 표현하셨길래
혹시나 해서 출력문에 num 대신 cnt를 넣어 봤더니 출력 결과가 다르게 나왔습니다. (6 7 8 9 10 11 / 7 8 9 10 11)  

그래서 다시 문제로 돌아가 count 그대로 사용하지 않고 run() 메서드 안에 int num = ++count; 를 넣고 num을 출력해 보니 순서는 뒤죽박죽 이지만 1부터 5까지 이상 없이 하나씩 잘 출력되었습니다.

스레드 내에서는 static 변수와 증감 연산자를 온전히 사용할 수 없는 건가요 ?