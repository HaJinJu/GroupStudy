function EvenNum(){

    for(var i = 1; i<=20; i++){
        if(i % 2==0)
        console.log("짝수 출력 : " + i)
    }

    return (
        <div className="EvenNum">
            <p>

                EvenNum Works Fine!

            </p>

        </div>
    )

}

export default EvenNum