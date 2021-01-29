function Random() {
    var arr = new Array();
    for (var i = 1; i <= 15; i++) {
        arr[i] = Math.random() * 15 + 1
        //    (Math.round(Math.random() * 15 + 1))
        //    (Math.floor(Math.random() * 15 + 1))
        //    (Math.ceil(Math.random() * 15 + 1))

        console.log('%d번 사원 = %d번', i, arr[i]);



    }


    return (
        <div className="Random">
            <p>

                Random Works Fine!

            </p>

        </div>
    )
}


export default Random