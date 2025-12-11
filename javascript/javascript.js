// var names = ["hark","hari","shark"];
// console.log(names+"\n");
// for (var i= 0;i<names.length; i++)
// {
//     console.log("hello " + names[i]);
// }



// names[99]="harrrr";
// for (var i= 0;i<names.length; i++)
// {
//     if(names[i]==undefined)
//     {
//         names[i]= "please entered entered";
//     }
//     console.log("hello " + names[i]);
// }
// var name1 = ["hark","hari","shark"];
// name1.greeting = "hi!";
// // var name1 = ["hark","hari","shark"];
// for (var namee in name1)
// {
//   console.log("hello " + name1[namee]);
// }

// function makemultiplier (multiplier)
// {
//   if (multiplier === undefined) // undefined,NaN-'Not a Number' is an predefined functions.
//   {
//     var multiplier=2;
//   }
//   return (
//     function (x) {
//       return multiplier * x;
//     }
//   );
// }
// var doluble_all = makemultiplier();
// console.log(doluble_all(23));

// //Imediately Invoked function Expressio
// // IIFE
// (function (){
//   console.log("Hello hark");
// })();
// (function (names){
//   console.log("Hello! " + names);
// })("hark");