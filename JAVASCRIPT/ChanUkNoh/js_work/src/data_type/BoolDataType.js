function BoolDataType() {
    let num1 = 3;
    let num2 = 3;
    let num3 = 7;

    let boolRes1 = (num1 === num2);
    let boolRes2 = (num1 === num3);

    console.log("BoolDataType: " + boolRes1);
    console.log("BoolDataType: " + boolRes2);

    let testNum = 0;
    let testStr = "0";

    let boolRes3 = (testNum == testStr);
    let boolRes4 = (testNum === testStr);

    console.log("BoolDataType: " + boolRes3);
    console.log("BoolDataType: " + boolRes4);

    return (
        <div className={"BoolDataType"}>
            <p>
                {boolRes1.toString()}, {boolRes2.toString()}<br/>
                {boolRes3.toString()}, {boolRes4.toString()}
            </p>
        </div>
    )
}

export default BoolDataType