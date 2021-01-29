function DataTypeBasics() {
    let length = 7;
    let lastName = "Gogosing";
    let x = {firstName: "Rust", lastName: "Golang"};

    console.log("DataTypeBasics: " + length);
    console.log("DataTypeBasics: " + lastName);
    console.log("DataTypeBasics: " + x.firstName);
    console.log("DataTypeBasics: " + x.lastName);

    return (
        <div className={"DataTypeBasics"}>
            <p>
                {length}, {lastName}, {x.toString()}.
            </p>
        </div>
    )
}

export default DataTypeBasics