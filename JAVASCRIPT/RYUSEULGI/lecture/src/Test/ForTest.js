import React from 'react'

function ForTest() {

    for(let i = 0; i < 3; i++){
        console.log(i);
    }
    
    return (
        <div>
            <p>for문 작동</p>
        </div>
    )
}

export default ForTest
