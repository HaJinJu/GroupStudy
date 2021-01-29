import React from 'react'

// state관리할 때 상태가ㅄ을 동적으로 할당할때 필요
// function보다는 const로 화살표 함수 쓴느게 대세
const ConstLet = () => {
    let num = 777;
    const constNum = 33;
    var varnum = 4000;
    
    var varnum = 222; // <--var의 문제점 계속 덮어씌어짐, 중복된 변수 사용해도 오류 발생 x
    // 가능 num = "ㅋㅋ";
    // 불가능 let num = "ㅋㅋ";
    // Hoisting let 선언과 할당 분리 되어 있음
    // 불가능 constNum = 333;
    // 불가능 const constNum = 333;
    
    const itemArr = [
        {
            name : 'Tom',
            score : 60
        },
        {
            name : 'Kate',
            score : 70
        },
        {
            name : 'Bob',
            score : 80
        }
    ];

    const LINE = Symbol();
    const SQUARE = Symbol();

    if(LINE === SQUARE){
        console.log("LINE === SQUARE")
    } else{
        console.log("LINE !== SQUARE")
    }

    const VECTOR = Symbol("Tensor");
    const MATRIX = Symbol("Tensor");
    
    if(VECTOR === MATRIX){
        console.log("VECTOR === MATRIX")
    } else{
        console.log("VECTOR !== MATRIX")
    }

    const TEST = Symbol('Test');

    console.log(num);
    console.log(constNum);
    console.log(varnum);
    console.log(itemArr);
    console.log(TEST.toString());
    console.log(MATRIX.toString());

    return (
        <div>
            <p>
                let {num},
                const {constNum},
                var {varnum}<br/>
                const Array {itemArr[0].name}, {itemArr[0].score}
                {itemArr[1].name}, {itemArr[1].score}
                {itemArr[2].name}, {itemArr[2].score}
                Symbol() {LINE},
                Symbol() {SQUARE},
                Symbol() {VECTOR},
                Symbol() {MATRIX}
            </p>
        </div>
    )
}

export default ConstLet

// 변수 선언의 차이점
// var 같은 변수를 또 다시 선언해도 오류 발생 X 
// 간편하지만 사용하는데 단점이 있어서 생겨난게 
// const, let 이 2개는 var을 보완하기 위해 es6문법에서 새로 생겨난 개념
// const 변수 재할당 불가
// let 변수 재할당 가능

