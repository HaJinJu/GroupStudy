function TypeOf() {

return (
    <div className={"TypeOf"}>
        <p>
            TypeOf Works Fine!
        </p>
        <p>
            {typeof ""}, {typeof "test"},<br/>
            {typeof 0}, {typeof 3.14},<br/>
            {typeof undefined}, {typeof null}<br/>
            {typeof {name: "test,", major: 'EE'}}, {typeof [1, 2, 3, 4]},<br/>
            {typeof undeffasd}, {typeof function test(){}}<br/>
            {typeof true}
        </p>
    </div>
)
}

export default TypeOf