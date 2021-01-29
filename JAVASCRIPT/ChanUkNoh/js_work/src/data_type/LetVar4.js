function LetVar4() {
    let letNum = 33;

    console.log("let test: " + letNum)

    // var letNum = "뭐야?"; 오류 코드

    console.log("let test: " + letNum)

    return (
        <div className={"LetVar4"}>
            <p>
                let {letNum}<br/>
            </p>
        </div>
    )
}

export default LetVar4