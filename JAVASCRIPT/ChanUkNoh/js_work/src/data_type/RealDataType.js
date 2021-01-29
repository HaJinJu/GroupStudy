function RealDataType() {
    let floatNum1 = 33.0;
    let intNum = 33;
    let floatNum2 = 37.1;
    let floatNum3 = 33.00;

    console.log("RealDataType: " + floatNum1);
    console.log("RealDataType: " + intNum);
    console.log("RealDataType: " + floatNum2);
    console.log("RealDataType: " + floatNum3);

    return (
        <div className={"DataTypeBasics"}>
            <p>
                {floatNum1}, {intNum}, {floatNum2}, {floatNum3}
            </p>
        </div>
    )
}

export default RealDataType