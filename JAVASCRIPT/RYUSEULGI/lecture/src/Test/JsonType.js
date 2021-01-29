import React from 'react'

function JsonType() {
    
    const person = {
        name : 'Seulgi',
        major : 'Media Contents',
        age : 26
    }

    console.log(person);

    return (
        <div>
            {person.name},
            {person.major},
            {person.age}
        </div>
    )
}

export default JsonType;
