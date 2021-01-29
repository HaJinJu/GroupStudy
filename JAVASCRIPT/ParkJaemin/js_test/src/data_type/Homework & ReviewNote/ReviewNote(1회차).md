## 2021-01-28 Review Note

### var 

- 정수형, 문자열, 묶음 형식 등 구애 받지 않고 자유롭게 변수 선언
- 다만, 코드가 많아 진다면 어떻게 사용되는지 파악이 힘들며 값이 바뀔 경우도 있다.
- 이를 보완하기 위해 추가 된 변수 선언 방식이 let과 const다.

### console.log()

- 브라우저에서 F12 누르고 콘솔을 눌러
- 콘솔 메시지를 확인 ㅡ> 브라우저용 디버깅에 유용하게 활용 가능

### div

- Divison의 약자로 웹 사이트의 레이아웃을 만들때 사용
- p는 paragraph 태그로 하나의 문단을 만들때 사용

### 숫자 + 문자

* 숫자 + 문자열 ㅡ> 숫자를 강제로 문자열로 바꿈

* 숫자 + 숫자 ㅡ> 숫자로 계산 ㅡ> 숫자 + 문자열 ㅡ> 문자열로 출력(숫자를 문자열로 바꿔서)

### 10의 n 승

var expNum1 = 123e5 ㅡ> 123*10^5 // var expNum2 = 123e-5 ㅡ> 123*10^-5 (10 n)

### '==' 와 '==='

'==' ㅡ> 데이터만 확인(값을 비교 / value와 value를 비교)

'===' ㅡ> 데이터와 해당 데이터 타입을 함께 확인(value와 data type을 비교)

```js
//예시
if ("10" == 10) {
    console.log(true); // true ㅡ> "10"과 10이 값이 같아서
} else {
    console.log(false);
}
if ("10" === 10) {
    console.log(true);
} else {
    console.log(false); // false ㅡ> "10"은 String, 10은 number라서
}
```

### Const

* =()=> -> 동적으로 알아서 할당하라 뜻 ㅡ> function ConstTest(){ 와 동일
* 덮어쓰기가 불가능 하여 객체 보호 가능(변수 재선언, 변수 재 할당 불가능)
* 자바에선 익명 객체 생성 방식과 동일

```js
  const name = 'bathingape'
console.log(name) // bathingape

const name = 'javascript'
console.log(name)
// Uncaught SyntaxError: Identifier 'name' has already been declared

name = 'react'
console.log(name)
//Uncaught TypeError: Assignment to constant variable. // 변수 재선언, 재할당 모두 불가 예시 
```

### let
- 변수가 재 선언이 되지 않는다. 그러나 재 할당은 가능하다.
```js
 let name = 'bathingape'
console.log(name) // bathingape

let name = 'javascript'
console.log(name)
// Uncaught SyntaxError: Identifier 'name' has already been declared // 재 선언 예시

// --------------------------------------------------------------------------
let name = 'bathingape'
console.log(name) // bathingape

let name = 'javascript'
console.log(name)
// Uncaught SyntaxError: Identifier 'name' has already been declared

name = 'react'
console.log(name) //react // 재 할당 가능 예시

```

### 호이스팅(hoisting)
- var 이나 function 선언은 실행 시 자바스크립트 코드의 가장 최 상단으로 올라간다.
  다시 말해 변수는 코드의 중간에 선언하더라도 맨 앞에 선언한 것과 같아지며 이를 호이스팅이라 한다.


- 예상치 못한 호이스팅으로 인한 에러를 피하기 위해 변수 선언 및 초기화는 최상단에 해야함.


- 코드의 가독성과 유지보수를 위해 호이스팅은 일어나지 않게 한다.


- var을 사용하는 대신 let / const를 사용한다.


- var - function scope(호이스팅O), 
  let/const- block scope(호이스팅X)
 
 
  - var - 중복 선언 가능 
 
 
  - let/const- 중복선언 불가(에러발생)
  

 - 함수/변수를 최상단에 선언하여 호이스팅으로 인한 스코프 꼬임이 발생하지 않도록 한다.

1)호이스팅 대상
- var로 선언된 변수/함수만 최상단으로 올라가며 할당은 올려지지 않는다. 즉, undefined상태로 올려진다.
- let / const, 함수표현식에선 호이스팅이 발생하지 않는다.

```js

// 변수 호이스팅 예제 코드

var a =3;
console.log(a); // 값 : 3

a=3;
console.log(a);
var a;  // 값 : 3

console.log(a); 
var a = 3; // undefined

// 변수 a가 선언되기 전에 호출되었으므로 오류가 발생할 것같지만 undefined로 출력

// 함수 호이스팅 예제 코드

// 함수 선언문 - 호이스팅O (오류 안남, 콘솔로그 'myFunc' 출력됨)
function test() {
    myFunc();
    function myFunc() { 
     console.log('myFunc');
    }
}   
 
// 함수 표현식 - 호이스팅X (오류 발생 Uncaught TypeError: myFunc is not a function)  
// myFunc은 undefined로 지정됨.  
function test() {  
  myFunc();  
  var myFunc() = function() {  
  }  
}
```

2)호이스팅 순서
동일 이름의 함수/변수가 있을 땐 '변수 선언 ㅡ> 함수 선언 ㅡ> 변수 할당' 순으로 진행된다.

```js
function test() {  
  function hello() {  
  };  
  var hello = 'hello';  
  console.log(typeof hello);  
}
// 호이스팅이 되면 아래 코드처럼 동작한다.

function test() {  
  var hello;   // 변수 선언
  function hello() {   // 함수 선언
  };  
  hello = 'hello';   // 변수 할당
  console.log(typeof hello); // 'string' 출력  
}

// 중간에 변수 할당이 안일어 났다면

function test() {  
  var hello;  
  function hello() {  
  };  
  // hello = 'hello';  
  console.log(typeof hello); // 'function' 출력  
}
```

### 스코프(Scope)

1)전역 스코프
- 전역 스코프는 변수가 함수 바깥이나 {} 바깥에서 선언되었다면, 전역스코프

2)지역 스코프
- 코드에서 특정 부분에서만 사용이 가능한 변수
- 자바스크립트에선 함수 스코프와 지역스코프

3)함수 스코프 
- 함수 내부에서 변수 선언 시 그 변수는 선언한 함수 내부에서만 사용이 가능

4)블록 스코프
- 중괄호 {} 내부에서 const 또는 let 변수를 선언 시 그 변수들은 블록 내부에서만 사용 가능


