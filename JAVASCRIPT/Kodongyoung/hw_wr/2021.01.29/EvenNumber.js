function EvenNumber() {
   for(var num = 0; num < 20; num++){
      if(num % 2 == 0)
      console.log(num);
   }
   return (
           <div className = "EvenNumber">
              <p>
                  {num}<br/>
               </p>
            </div>
       )

}

export default EvenNumber