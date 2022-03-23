//functions
function add(a,b){
	return a+b;
}
console.log(add(2,3))

//Arrays
var b=["test1", "test2","test3"]
for(var i=0;i<b.length;i++)
	console.log(b[i])
	
var c= new Array();
c[0]= "Hello"
c[1]= "World";
for(var i=0;i<c.length;i++)
console.log(c[i])

//String
var str= "Gaurav Singh" //string literal
console.log(str.charAt(2))//char at
str = str.concat(" is good boy");//concatenate
console.log(str)
console.log(str.indexOf("g")) //index of
 //substring -- Ending length not exclusive so returns from 3 to upto 9 from to length
console.log(str.substr(3, 10)) //rav Singh 
//slice-- Ending is not inclued- starts from 3 to 9 - index from and to starting from 0
console.log(str.slice(3, 10))  //rav Sin
console.log(str.toUpperCase())
console.log(str.trim())

var c1 = new String("Gaurav Singh") //new method 