/*var a=5;
a=a+1;
let b=6;
var c="het";

//console.log(a+b+4);
//console.log(typeof a,typeof b,typeof c);
{
    var a=66;  //let vapray
    console.log(a);
}
console.log(a); //66 j ave because var! che jo let! hoy to 6 avat
 // null is primitive data type and object
 // object

 let o={
     "name":"het",
     "job code":100000
 }
 console.log(o);             

 o.salary="2 crores";  // add karava mate
 console.log(o);*/
let greeting="Hello world!";
console.log(greeting);
console.log(greeting.length);
console.log(greeting.toUpperCase());
console.log(greeting.indexOf("w"));
console.log(greeting.replace("world","het"));
// object
let person={
  name:"het",
  age:19,
  hobbies:["reading","music"],

  sayhello: function(){
  return "hello my name is " + this.name;
  },
};
console.log(person.name);
console.log(person.hobbies[0]);
console.log(person.sayhello());