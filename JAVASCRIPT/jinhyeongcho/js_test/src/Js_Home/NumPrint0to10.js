function NumPrint0to10(){
    var ONE =1
    var TEN =10
        for(var i =ONE;i<=TEN;i++){
        console.log("ForTest:" +i)
        }

    return(
        <div className="NumPrint0to10">
            <p>
                1번 문제<br/>
                {1},{2},{3},{4},{5},{6},{7},{8},{9},{10}?<br/>
                    순서대로 출력을 어찌하지???<br/>
            </p>
        </div>
    )
}
export default NumPrint0to10