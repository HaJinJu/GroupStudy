function Homework2() {

    for (let i = 1; i < 21; i++) {
        if (i % 2 == 0) {
            console.log("짝수: " + i)
        }
    }

    return (
        <div className={"Homework1"}>
            <p>
                Homework2 Finish!
            </p>
        </div>
    )
}

export default Homework2