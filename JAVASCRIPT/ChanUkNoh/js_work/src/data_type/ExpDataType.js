function ExpDataType() {
    let expNum1 = 123e5;
    let expNum2 = 123e-5;

    console.log("ExpDataType: " + expNum1);
    console.log("ExpDataType: " + expNum2);

    return (
        <div className={"DataTypeBasics"}>
            <p>
                {expNum1}, {expNum2}
            </p>
        </div>
    )
}

export default ExpDataType