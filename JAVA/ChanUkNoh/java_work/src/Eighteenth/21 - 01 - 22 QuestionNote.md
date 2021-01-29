# 2021 / 01 / 22 18일차 Question Note

## CodeReview
***
### MainClient.java
```java
String ip = "192.168.0.7";
int port = 7777;

ClientSocketManager csm = new ClientSocketManager(ip, port);
```
접속하고자 하는 IP주소와 포트번호를 ClientSocketManager에게 보내면서 호출한다.   

### ClientSocketManager.java
```java
public class ClientSocketManager extends SocketManager {
    private Socket clntSock;

    public ClientSocketManager(String hostIp, int portNum)
            throws IOException {

        super();
        clntSock = new Socket(hostIp, portNum);
    }

    public Socket getClntSock() {
        return clntSock;
    }
}
```
IP주소와 포트번호를 받아 서버의 접속요청을 보내고 접속 요청이 accept되면 클라이언트 소켓을 만든다.   
ClientSocketManager는 더 큰 범위의 SocketManager로부터 상속받고 있다.

### MainServer.java
```java
ServerSocketManager ssm = new ServerSocketManager(7777, MAX);
```
ServerSocketManager에 포트번호와 서버 최대 접속인원을 보내 호출한다.
### ServerSocketManager.java
```java
public class ServerSocketManager extends SocketManager {
    private ServerSocket servSock;
    private Socket[] clntSockArr;
    
    private int maxClnt;

    public ServerSocketManager(int portNum, int max)
            throws IOException {

        super(max);

        System.out.printf("%d 명이 접속해야 게임을 시작할 수 있습니다.\n", max);

        servSock = new ServerSocket(portNum);

        clntCnt = 0;
        maxClnt = max;

        clntSockArr = new Socket[max];
    }
}
```
받아온 포트번호로 서버 소켓을 만든다.   
접속을 허용할 소켓을 배열로 만든다. (여러개의 클라이언트 소켓을 관리하기 위해 배열로 만든다.)   
이때 배열의 길이는 접속 허용 최대인원으로 만든다.   
ServerSocketManager는 더 큰 범위의 SocketManager로부터 상속 받고 있다.

### MainClient.java
```java
System.out.println("접속 요청 완료!");
System.out.println("가위는 1, 바위는 2, 보는 3");

csm.send(csm.getClntSock());

System.out.println("전송 완료!");

csm.close(csm.getClntSock());
```
접속 요청이 완료되면 위 코드들이 실행된다.  
서버에게 데이터를 보내는 send 메서드를 호출해 가위바위보 정보를 보낸다.   
전송이 완료되면 연결을 끊는다. (스레드가 없어 데드락 상태가 되는 것을 방지하기 위함)
### SocketManager.java
```java
public void close(Socket sock) throws IOException {
    sock.close();
}
```
소켓의 연결을 끊는 메서드이다.

```java
private final int ZERO = 0;
private final int ONE = 1;

private OutputStream[] out;
private InputStream[] in;

public SocketManager() {
    scan = new Scanner(System.in);

    in = new InputStream[ONE];
    out = new OutputStream[ONE];
}

public SocketManager(int num) {
    out = new OutputStream[num];
    in = new InputStream[num];

    arrRockScissorPaper = new String[num];
}
```
소켓 매니저는 클라이언트 소켓과 서버 소켓의 소켓으로서의 도구들을 관리하는 클래스이다.   
클라이언트와 서버는 소켓매니저를 따로사용 해야하기 때문에 생성자를 두 가지를 만든다.   
개인인 클라이언트는 상대할 소켓이 서버 하나이기 때문에 입/출력 배열의 값들 중 한 가지만 사용한다.   
여러 클라이언트를 상대해야 하는 서버는 상대해야할 소켓이 여러개이기 때문에 입/출력을 배열로 관리한다.   
접속한 클라이언트의 숫자를 매개변수로 받아 입/출력 배열의 길이로 설정해준다.   
서버는 입력을 출력할 필요는 없기 때문에 Scanner가 없다.   
클라이언트는 가위바위보 데이터를 처리할 필요 없기 때문에 arrRockScissorsPaper 배열이 없다.

```java
public void send(Socket sock) throws IOException {
    System.out.print("숫자를 입력하세요: ");
    String str = scan.nextLine();

    out[ZERO] = sock.getOutputStream();
    out[ZERO].write(str.getBytes());
}
```
클라이언트 전용 send 메서드이다.   
상대해야할 소켓이 서버 하나이기 때문에 매개변수로 받는 소켓은 배열이 아닌 단일 값이다.   
그렇기 때문에 출력 배열의 여러 값 중 값하나에 출력할 데이터를 담는다.   
가위바위보 데이터를 입력으로 받아 서버에게 보낸다.

### MainServer.java

```java
int cnt = 0;

while (cnt != ssm.getMaxClnt()) {
    ssm.waitForClientRequest();

    ssm.recv(ssm.getClntSockArr(), ssm.getMaxClnt());

    cnt++;
}

System.out.println("다음을 진행합니다.");
```
반복문을 통해 클라이언트의 접속 요청을 accept하고 클라이언트로부터 받은 가위바위보 정보를 받는다.   
반복 횟수는 접속 인원수로 설정한다.

### ServerSocketManager.java
```java
private int clntCnt;

public void waitForClientRequest() throws IOException {
    System.out.println("사용자 접속을 대기합니다.");

    clntSockArr[clntCnt] = servSock.accept();

    System.out.println(
            "[" + clntSockArr[clntCnt++].getInetAddress() +
                    "] client connected"
    );
}
```
클라이언트의 접속을 기다리는 메서드이다.   
접속을 요청하는 클라이언트를 순서대로 클라이언트 소켓 배열에 넣는다.

```java
private final int MAGICNUM = 3;

public void recv(Socket[] sock, int num) throws IOException {

    int tmp;

    System.out.println("recvCnt = " + recvCnt);

    in[recvCnt] = sock[recvCnt].getInputStream();

    reader = new BufferedReader(new InputStreamReader(in[recvCnt]));

    tmp = Integer.parseInt(reader.readLine());

    if(tmp == MAGICNUM) {
        arrRockScissorPaper[recvCnt] = Integer.toString(tmp + ONE);
    } else {
        arrRockScissorPaper[recvCnt] = Integer.toString(tmp);
    }

    System.out.println("msg: " + arrRockScissorPaper[recvCnt++]);
}
```
서버 전용 리시브 메서드이다.   
서버는 상대해야 할 소켓이 여러개 이기 때문에 매개변수로 소켓 배열을 받는다.   
입력 배열에 클라이언트 각각의 입력을 받는다.   
이때 가위바위보 알고리즘을 위해 받아온 값 3(보)의 정보를 2의 제곱수로 만들기 위해 1을 더한다.   
나머지 값은 그대로 받아온다.

### MainServer.java

```java
if (ssm.canWeGetWinner(ssm.getMaxClnt())) {
    System.out.println("승패가 결정되었습니다.");
} else {
    System.out.println("무승부: 게임을 다시 시작합니다.");
}

cnt = 0;

ssm.setClntCnt(0);
```
승붚를 판정하는 메서드 canWeGetWinner()를 호출하고 결과 메시지를 띄운다.   
아직은 스레드를 모른다. 결과 전달을 위해 클라이언트의 접속을 끊고 다시연결해야 하므로   
사용하던 cnt, ClnetCnt를 0으로 셋팅한다.

### SocketManager.java
```java
public boolean canWeGetWinner(int num) {
    int bitOROfAllInputString = ZERO;

    for(int i = ZERO; i < num; i++) {
        bitOROfAllInputString |=
                Integer.parseInt(arrRockScissorPaper[i]);
    }

    if(bitOROfAllInputString == 7) {
        return false;
    } else if(bitOROfAllInputString == 1) {
        return false;
    } else if(bitOROfAllInputString == 2) {
        return false;
    } else if(bitOROfAllInputString == 4) {
        return false;
    }

    return true;
}
```
가위바위보가 비기는 경우와 승부가 나는 경우로 나누는 케이스이다.(누가 이겼는지는 판정하지 못함 추후에 결과를 전달 할 뿐)   
가위바위보가 비기는 경우: 모두 서로다른 것을 내거나 모두 같은 것을 내는 경우   
가위바위보가 승부가 나는 경우: 가위 바위 보 중 두 가지 종류만 나온 경우   
클라이언트로 받은 가위바위보 정보를 모두 비트OR 연산한다.   
모두 값이 다른 경우 7이 나온다. 모든 값이 같은 경우 그 값에 해당하는 숫자가 나온다. 이 경우엔 false를 반환한다.  
이 경우가 아니라면 모두 승부가 나기 때문에 true를 반환한다.   

### MainClient.java
```java
scan.nextLine();

csm = new ClientSocketManager(ip, port);

csm.recv(csm.getClntSock());
```
아무 글자나 입력해 다시 서버 접속을 시도한다.   
서버로부터 결과를 받는 메서드 recv()를 호출해 결과를 받는다.

### SocketManager.java
```java
public void recv(Socket sock) throws IOException {
    in[ZERO] = sock.getInputStream();

    reader = new BufferedReader(new InputStreamReader(in[ZERO]));

    System.out.println(reader.readLine());
}
```
클라이언트 전용 recv() 메서드이다.

### MainServer.java
```java
while (cnt != getMaxClnt()) {
    System.out.println("사용자들에게 결과를 전달합니다.");
    ssm.waitForClientRequest();

    ssm.send(ssm.getClntSockArr(), ssm.getMaxClnt());

    cnt++;
}

System.out.println("모든 사용자에게 입력 결과 전달 완료!");
```
반복문을 돌며 클라이언트의 접속을 accept하고 클라이언트에게 결과를 보낸다.

### SocketManager.java

```java
public void send(Socket[] sock, int num) throws IOException {
    out[sendCnt] = sock[sendCnt].getOutputStream();

    writer = new PrintWriter(out[sendCnt++], true);

    String str = convertNumber2RSP();

    writer.println(str);
}
```
서버 전용 send() 메서드이다.   
숫자로 계산한 가위바위보 데이터를 1 1-> "가위", 2 -> "바위", 3(4) -> "보" 로 바꿔주는   
메서드 convertNumber2RSP()를 호출한다.

```java
public String convertNumber2RSP() {
    String res = "";
    int len = arrRockScissorPaper.length;

    for(int i = ZERO; i < len; i++) {
        res += (i + 1) + "번 사용자: ";

        if (arrRockScissorPaper[i].equals("1")) {
            res += "가위";
        } else if (arrRockScissorPaper[i].equals("2")) {
            res += "바위";
        } else {
            res += "보";
        }

        if(i == len - ONE) {
            res += "";
        } else {
            res += ", ";
        }
    }

    return res;
}
```
숫자로 계산한 가위바위보 데이터를 1 -> "가위", 2 -> "바위", 3(4) -> "보" 로 바꿔주는 메서드이다.