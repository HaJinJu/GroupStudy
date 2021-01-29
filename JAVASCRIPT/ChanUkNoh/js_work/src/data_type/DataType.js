function DataType() {
    let test1 = 7 + "Test";
    let test2 = "7" + "test";
    let numTest = 3 + 7 + "Test";

    console.log("DataType: " + test1);
    console.log("DataType: " + test2);
    console.log("DataType: " + numTest);

    return (
        <div className={"DataTypeBasics"}>
            <p>
                {test1}, {test2}, {numTest}.
            </p>
        </div>
    )
}

export default DataType;