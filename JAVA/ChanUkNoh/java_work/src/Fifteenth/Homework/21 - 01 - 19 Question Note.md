# 2021 / 01 / 19 15일차 Question Note

## CodeReview
### SocketClientTest.java
```java
Socket sock = new Socket(hostname, port);
```
내가 접속할 서버의 IP 주소를 첫 번째 인자로 보내고, 해당 IP 주소의 여러가지 서비스 중
내가 이용하고 싶은 서비스의 포트 번호를 두 번째 인자로 보내면 서버에 접속 요청을 할 수 있다.  

접속 요청이 accept 되면 서버 소켓이 sock 에 담긴다.
***
```java
Socket sock = new Socket(hostname, port);
OutputStream out = sock.getOutputStream();
```
(클라이언트 기준)
상대(서버)가 출력을 받을 수 있도록 설정하는 것. 상대가 요청을 보냈을 때 InputStream 으로 상대의 요청을 받고 BufferedReader 로 들어온 요청을 읽는다.  
Q: 위 코드는 나(클라이언트)의 출력을 상대의 OutputStream 에 저장하는 것인가요?
***
```java
out.write(str.getBytes());
```
상대의 OutputStream 에 나의 입력을 저장한다.
Q: 정보를 교환할 때는 Byte 형식으로 데이터를 쪼개서 보내는 건가요?  
Q: 여러 개의 입력은 어떻게 처리하나요? 실제로 write 된 데이터들을 System.out.print() 하면 이상한 것들이 출력됩니다.
***
```java
InputStream in = sock.getInputStream();
```
Q: 상대의 OutputStream (출력)을 저장하는 곳인가요?
***
```java
BufferedReader reader = new BufferedReader(new InputStreamReader(in));
```
InputStream 을 읽기 위해 거쳐야하는 객체.  
Buffer: 완충하다.  
요청이 바로 들어오기 전에 한번 완충해주는 역할을 하는듯?
***
```java
String time = reader.readLine();
```
상대가 보낸 입력을 반환하는 메서드
***
```java
catch (UnknownHostException e) {
    System.out.println("Server Not Found: " + e.getMessage());
    
}
```
서버측에서 에러가 나면 catch 문을 실행한다. getMessage() 는 에러 케이스를 알아서 처리 후 에러 메시지를 보여준다.  
```java
catch (IOException e) {
    System.out.println("I/O Error: " + e.getMessage());
}
```
입/출력에 관한 에러가 발생하면 아래 catch 문을 실행한다.  
I/O: Input/Output
***
***
### SocketServerTest.java
```java
int port = Integer.parseInt("33333");
```
Q: 굳이 문자열을 정수로 형변환 해서 저장한 이유가 무엇인가요? 네트워크에서 데이터 교환이 문자열로 이루어져서 그런 건가요?
***
```java
ServerSocket servSock = new ServerSocket(port);
```
서버 소켓. 그냥 Socket 과 ServerSocket 이 있다. 용도에 맞게 헷갈리지 말자!  
Q: 첫 번째 인자로 정수를 보내면 port 가 셋팅 되고 서버가 켜지는 원리가 맞나요?
***
```java
while(true) {
    Socket clntSock = servSock.accept();
    
    System.out.println(
    "[" + clntSock.getInetAddress() +
    "] client connected"
    );
    
    OutputStream out    = clntSock.getOutputStream();
    
    PrintWriter writer  = new PrintWriter(out, true);
    
    writer.println(new Date().toString());
    
    InputStream in      = clntSock.getInputStream();
    
    BufferedReader reader =
    new BufferedReader(new InputStreamReader(in));
    
    System.out.println("msg: " + reader.readLine());
}
```
Q: Client 와 Server 에서 각각 반복문을 도는 이유가 무엇인가요? try 안에 반복문이 있는 것과 반복문 안에 try 가 있는 것은 무슨 의미인가요?
***
```java
Socket sock = new Socket(hostname, port); // 클라이언트의 접속요청
Socket clntSock = servSock.accept(); // 서버의 접속 승인
```
클라이언트의 접속 요청이 있었다면 요청을 승인하는 메서드.   
승인 후 클라이언트의 소켓을 반환한다.
***
```java
PrintWriter writer  = new PrintWriter(out, true);
```
Q: OutputStream 의 writer 와 PrintWriter 의 writer.println() 은 어떤 차이가 있나요?  
Q: 두 번째 인자로 보내는 autoFlush 는 어떤 동작을 하나요?  
Q: 두 개 모두 reader.readLine() 을 통해 입력을 읽는데 readLine() 메서드는 어떻게 두 데이터를 구분하고 다루나요??
***
```java
writer.println(new Date().toString());
```
Date 객체의 toString 을 호출하면 현재 위치의 현재 시간을 반환한다.