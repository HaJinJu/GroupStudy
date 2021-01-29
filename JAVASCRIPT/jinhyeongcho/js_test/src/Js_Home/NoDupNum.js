function NoDupNum(){

    for (var i = 0; i < 15; i++) {
        let noduplicate;
        noduplicate[i] = 0;

        var cnt
        for (i = 1; ; ) {
            let randNum = (Math.random() * 15) + 1;
            if (noduplicate[randNum - 1] != 0)
                continue;
            cnt++;
            noduplicate[randNum - 1] = 1;
            console.log(i+"번 직원 ="+randNum);
            if (cnt == 15) {
                break;
            }

        }
    }

    return(
        <div className="NumPrint0to10">
            <p>
                4번 문제<br/>
                자바같이 [i]를 넣고싶은데 맘처럼 안되는구나...<br/>

            </p>
        </div>
    )
}
export default NoDupNum
