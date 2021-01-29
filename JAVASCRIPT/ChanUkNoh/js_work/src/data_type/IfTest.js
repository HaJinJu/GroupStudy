function IfTest() {
    let num1 = 3;
    let num2 = 10;

    if (num1 !== 10) {
        console.log("IfTest: num1 !== " + num2);
    } else if (num2 !== 10) {
        console.log("IfTest: num2 !== " + num2);
    } else {
        console.log("IfTest: works fine!");
    }

    return (
        <div className={"DataTypeBasics"}>
            <p>
                IfTest Works Fine!
            </p>
        </div>
    )
}

export default IfTest