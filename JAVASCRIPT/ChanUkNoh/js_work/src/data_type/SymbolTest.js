function SymbolTest() {
    const LINE = Symbol();
    const SQUARE = Symbol();

    if (LINE === SQUARE) {
        console.log("LINE === SQUARE")
    } else {
        console.log("LINE !== SQUARE")
    }

    const VECTOR = Symbol("Tensor")
    const MATRIX = Symbol("Tensor")

    if (VECTOR === MATRIX) {
        console.log("VECTOR === MATRIX")
    } else {
        console.log("VECTOR !== MATRIX")
    }

    const TEST = Symbol("TEST");

    console.log("SymbolTest: " + TEST.toString())
    console.log("SymbolTest: " + MATRIX.toString())

    return (
        <div className="SymbolTest">
            <p>
                Symbol() {LINE}<br/>
                Symbol() {SQUARE}<br/>
                VECTOR {VECTOR}<br/>
                MATRIX {MATRIX}<br/>
            </p>
        </div>
    )
}

export default SymbolTest