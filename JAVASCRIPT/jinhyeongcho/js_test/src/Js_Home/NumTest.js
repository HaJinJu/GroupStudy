function NumTest(){

    //console.log("ran값" + ran)

    for(var i = 0; i<15; i++){
        var ran = Math.floor(Math.random() * 10)
        console.log("사원"+i+"값"+ran)

    }


    return(
        <div className="NumPrint0to10">
            <p>
                3번 문제<br/>
                리턴이 없으면 홈페이지에 나오지 않는구나...<br/>

            </p>
        </div>
    )

}
export default NumTest