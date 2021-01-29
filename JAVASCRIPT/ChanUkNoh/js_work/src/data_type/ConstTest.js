const ConstTest = () => {
    const itemArr = [
        {
            name: "GPU",
            price: 3000000,
            quantity: 1,
        },
        {
            name: "CPU",
            price: 600000,
            quantity: 1,
        },
        {
            name: "M ASIC",
            price: 12000000,
            quantity: 50,
        }
    ]

    return (
        <div className="ConstTest">
            {itemArr[0].name}, {itemArr[0].price}, {itemArr[0].quantity}<br/>
            {itemArr[1].name}, {itemArr[1].price}, {itemArr[1].quantity}<br/>
            {itemArr[2].name}, {itemArr[2].price}, {itemArr[2].quantity}<br/>
        </div>
    )
}

export default ConstTest