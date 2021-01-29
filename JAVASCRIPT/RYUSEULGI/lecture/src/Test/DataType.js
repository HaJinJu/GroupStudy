import React from 'react';

function Data() {
    
    const test1 = 7 + "test";
    const test2 = "7" + "test";
    const numTest = 3 + 7 +"Test";

    // 123 * 10^5
    const expNum = 123e5;
    // 123 * 10^-5
    const expNum2 = 123e-5;

    // .0인 경우 정수로 나타남
    const floatNum1 = 33.00;
    const intNum = 33;
    const floatNum =33.002;

    const strTest1 = "hello";
    const strTest2 = "seulgi";

    const num1 = 1, num2 = 1, num3 = 3;

    const boolean1 = ( num1 === num2 );
    const boolean2 = ( num1 === num3 );

    const testNum = 0;
    const testNum2 = "0";

    // 가ㅄ만 확인 ==
    const boolean3 = ( testNum == testNum2 );
    // 데이터 타입도 확인 ===
    const boolean4 = ( testNum === testNum2 );

    console.log("Data : " + test1);
    console.log("Data : " + test2);
    console.log("Data : " + numTest);
    console.log("ExNum : " + expNum);
    console.log("ExNum : " + expNum2);
    console.log("RealNum : " + floatNum1);
    console.log("RealNum : " + floatNum1.toFixed(2));
    console.log("RealNum : " + intNum);
    console.log("RealNum : " + floatNum);
    console.log("String : " + strTest1);
    console.log("String : " + strTest2);
    console.log("Boolean : " + boolean1);
    console.log("Boolean : " + boolean2);
    console.log("Boolean : " + boolean3);
    console.log("Boolean : " + boolean4);

    return (
        <div className = "out_test">
            <p>
                {test1},
                {test2},
                {numTest}<br/>
                {expNum}<br/>
                {expNum2}<br/>
                {floatNum1}<br/>
                {floatNum1.toFixed(2)}<br/>
                {intNum}<br />
                {floatNum}<br/>
                {strTest1}<br/>
                {strTest2}<br/>
                {boolean1.toString()}<br/>
                {boolean2.toString()}<br/>
                {boolean3.toString()}<br/>
                {boolean4.toString()}
            </p>
        </div>
    )
}

export default Data;
