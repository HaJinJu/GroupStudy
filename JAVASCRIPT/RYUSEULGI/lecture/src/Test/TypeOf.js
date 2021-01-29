import React from 'react'

function TypeOf() {
    return (
        <div>
            <p>TypeOf</p>
            <p>
                {typeof ""},
                {typeof "test"},
                {typeof 0},
                {typeof 3.14},
                {typeof null},
                {typeof undefined},
                {typeof undef},
                {typeof true},
                {typeof {name: 'test', sound: 'good'}},
                {typeof [1,2,3,4]},
                {typeof function(){}}
            </p>
        </div>
    )
}

export default TypeOf;

// null vs undefined
// 객체인데 가ㅄ이 없음
// 찾을 수 없음