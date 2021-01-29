function StringDataType() {
    let strTest1 = "It's OK";
    let strTest2 = "I can 'use' this";
    let strTest3 = 'I can do "this" too';

    console.log("StringDataType: " + strTest1);
    console.log("StringDataType: " + strTest2);
    console.log("StringDataType: " + strTest3);

    return (
        <div className={"StringDataType"}>
            <p>
                {strTest1}<br/>
                {strTest2}<br/>
                {strTest3}<br/>
            </p>
        </div>
    )
}

export default StringDataType