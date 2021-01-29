import React from 'react'

function IfTest() {

    const num1 = 3, num2 = 5;

    if(num1 !== num2){
        console.log("다르다")
    } else if(num1 === num2){
        console.log("같다")
    } else{
        console.log("오류")
    }

    return (
        <div>
            <p>if문 작동</p>
        </div>
    )
}

export default IfTest;
