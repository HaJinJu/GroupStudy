function TypeOf(){

    // undefined는 객체 자체가 없음
    // null은 객체는 있지만 값이 없음
    return(
        <div className="TypeOf">
            <p>
                TypeOf Works Fine!
            </p>
            <p>
                {typeof ""}, {typeof "test"}, {typeof 0}, {typeof 3.14},<br/>
                {typeof true}, {typeof undef}, {typeof undefined}, {typeof null}, <br/>
                {typeof {name:'test',major: 'EE'}},{typeof [1,2,3,4]}<br/>
                {typeof function test(){}}<br/>
            </p>
        </div>
    )
}
export default TypeOf