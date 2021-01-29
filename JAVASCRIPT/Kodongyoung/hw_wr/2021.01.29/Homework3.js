



function Homework3(){

var employee = [ 'people1','people2','people3','people4','people5','people6',
'people7','people8','people9','people10','people11','people12',
'people13','people14','people15']


for(var i = 0; i< employee.length; i++){
    var randNum = Math.floor(Math.random() * 20) +1







    console.log(employee[i] + "[사원번호] : " + randNum)

      }









 return (
         <div className ="Homework3">
                <p>
                homework3
                       </p>
                 </div>
              )


}

export default Homework3
