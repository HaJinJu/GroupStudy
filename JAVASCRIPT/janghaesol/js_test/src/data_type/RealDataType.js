function RealDataType() {
    var floatNum = 33.0
    var intNum = 33
    var floatNum2 = 37.1
    var floatNum3 = 33.00

    console.log("RealDataType" + floatNum)
    console.log("RealDataType" + intNum)
    console.log("RealDataType" + floatNum2)
    console.log("RealDataType" + floatNum3)

    return (
        <div className="DataTypeBasic">
            <p>
                {floatNum}, {intNum},{floatNum2},{floatNum3}
            </p>
        </div>
    )
    
}

export default RealDataType