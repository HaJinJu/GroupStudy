function EvenNum1to20(){
    var ONE =1
    var TWENTY =20
    for(var i =ONE;i<=TWENTY;i++){
        if( i % 2 ===0){
            console.log("ForTest:" +i)
        }
    }
    return(
        <div className="EvenNum1to20">
            <p>
                2번 문제<br/>
                {2},{4},{6},{8},{10},{12},{14},{16},{18},{20}?<br/>
                
            </p>
        </div>
    )
}
export default EvenNum1to20