# QUESTION NOTE (210120)

**ServerSocketManager.java**

Q : 소켓에는 접속한 클라이언트에 대한 모든 정보가 저장되는 건가요 ? 아니면 이후 지속적인 실시간 연결 개념이라고 봐야 하나요 ?  
Q : for 문 내부에서 배열 인덱스에 clntCnt 대신 i를 쓰면 안 되나요 ?
```java
public void waitForClientRequest() throws IOException {
    System.out.println("사용자 접속을 대기합니다.");

    // 접속 가능하도록 지정한 클라이언트 수만큼 반복하며
    // 클라이언트의 접속 요청을 대기(accept())하다가
    // 요청이 들어오면 승인하여 배열에 저장
    for (int i = 0; i < maxClnt; i++) {
        clntSockArr[clntCnt++] = servSock.accept();
    }
}
```
