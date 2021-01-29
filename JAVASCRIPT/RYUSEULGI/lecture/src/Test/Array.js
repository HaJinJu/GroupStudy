import React from 'react'

function Array() {

    const cats = ["고양이", "야옹이", "야옹"];

    console.log("array: " + cats);

    return (
        <div>
            <p>
                {cats[0]},
                {cats[1]},
                {cats[2]}
            </p>
        </div>
    )
}

export default Array;
