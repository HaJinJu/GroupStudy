function DataTypeBasic(){
        //var은 뼌수 선언할 때 사용한다.
    var length = 7          //정수형도 var
    var lastName = "Gogosing"       //문자열도 var
    var x = {firstName: "Rust", lastName: "Golang"}  //묶음 혁식도 var

    // console.log()을 통해서
    //웹 페이지에서 개발자보기 f12를 누르고
    //console 메시지를 확인할 수 있다.
    //즉 브라우저용 디버깅에 유용하게 사용할 수 있다.
    console.log("DataType" + length)
    console.log("DataType" + lastName)
    console.log("DataType" + x.firstName)
    console.log("DataType" + x.lastName)


    //  div의 양자는 Division으로
    //  웹 사이트의 레이아웃(전체적인 틀)을 만들때 사용함

    //  p는 paragraph 태그로 하나의 문단을 만들때 사용

    //  div에 className이라는 것이 보이는데
    //  이 부분은 향후 css를 할 때 좀 더 자세하게 알아볼 것ㅅ임
   return (
        <div className="DataTypeBasic">
            <p>
                {length}, {lastName},{x.toString()}.
            </p>
        </div>
    )
}

export default DataTypeBasic