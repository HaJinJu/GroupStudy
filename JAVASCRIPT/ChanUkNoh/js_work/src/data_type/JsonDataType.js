function JsonDataType() {
    let person = {
        name: "Chanuk",
        major: "Eng",
        minor: "null",
        numOfRepo: 200
    }

    console.log("JsonDataType: " + person);

    return (
        <div className={"JsonDataType"}>
            <p>
                {person.name}, {person.major},<br/>
                {person.minor}, {person.numOfRepo}
            </p>
        </div>
    )
}

export default JsonDataType