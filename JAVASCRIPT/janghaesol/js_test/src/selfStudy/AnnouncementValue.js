function TestSymbolTest() {
    let 마나물약 = Symbol(liquid)//key
    let 생명수 = Symbol(liquid)//key
    
    if(마나물약 === SQUARE){
        console.log("마나물약 === 생명수")
    } else {
        console.log("마나물약 !=== 생명수")
    }

    let 현철중검 = Symbol("sword")//key
    let 도깨비방망이 = Symbol("sword")//key
    
    if(현철중검 === 도깨비방망이){
        console.log("현철중검 === 도깨비방망이")
    }else{
        console.log("현철중검 !=== 도깨비방망이")
    }

    // Symbol을 사용하고 toString()을 사용하면 Symbol 정보가 출력된다.
    const TEST = Symbol("TEST")

    console.log("TestSymbolTest : " + TEST.toString())
    console.log("TestSymbolTest : " + MATRIX.toString())

    return(
        <div className = "TestSymbolTest">
            <p>
                Symbol(liquid) {마나물약}<br/>
                Symbol(liquid) {생명수}<br/>
                현철중검() {현철중검}<br/>
                도깨비방망이() {도깨비방망이}<br/>
            </p>
        </div>
    )
}
export default TestSymbolTest