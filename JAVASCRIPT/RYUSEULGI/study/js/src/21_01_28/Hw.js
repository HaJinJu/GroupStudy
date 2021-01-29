import React from 'react'

function Hw() {
    const one = 1;
    const two = 2;
    const ten = 10;

    for(let i = one; i <= ten; i++){
        console.log(i);
    }

    for(let j = one; j <= (ten * two); j++){
        if(j % two === 0){
            console.log(j);
        }
    }

    const member = [];
    const arrayNum = 15;

    function dup(){
        for(let i = 0; i <= arrayNum; i++){
            member[i] = Math.floor((Math.random() * arrayNum)) + one;
        }
    }

    function noRepeat(){
        for(let i = one; i <= arrayNum; i++){
            const randomNum = Math.floor((Math.random() * arrayNum)) + one;

            if(member.indexOf(randomNum) === -one){
                member.push(randomNum);
            }
            else{
                i--; 
            }
        }
    }

    function printMember(){
        for(let i = one; i <= arrayNum ; i++){
            console.log(`${i}번째 사원 ${member[i - 1]}`);
        }
    }

    dup();
    printMember();
    noRepeat();
    printMember();
    
    return (
        <div></div>
    )
}
export default Hw
