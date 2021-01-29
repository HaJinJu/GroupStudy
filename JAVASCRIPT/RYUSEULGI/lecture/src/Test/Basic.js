import React from 'react'

function Basic() {
    const length = 7;
    const lastName = "seulgi";
    const x = {firstName : "RYU", lastName : "kiki"};

    console.log("Basic : " + length);
    console.log("Basic : " + lastName);
    console.log("Basic : " + x.firstName);
    console.log("Basic : " + x.lastName);

    return (
        <div className="info">
            <p>{length},{lastName},{x.toString()}</p>
        </div>
    )
}

export default Basic;