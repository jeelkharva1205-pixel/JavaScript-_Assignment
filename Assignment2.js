let students = [
    { name: "Jeel", marks: [80, 75, 90] },
    { name: "Raj", marks: [50, 55, 60] },
    { name: "Amit", marks: [30, 40, 35] }
]
let result = students.map(function(student) {

   
    let total = student.marks.reduce((num,rest) => num+rest,0) ;

    let avg = total / student.marks.length;

    let grade = avg >= 75 ? "Distinction" :
                avg >= 50 ? "Pass" : "Fail";

return{
    ...student,
 average: avg ,
  result: grade

       
       
}
});

console.log(result);


//question2//
function cartAnalyzer(...items) {
    let totalAmount = items.reduce((sum, item) => {
        return sum + (item.price * item.quantity);
    }, 0);

    let totalQuantity = items.reduce((sum, item) => {
        return sum + item.quantity;
    }, 0);

    return {
        totalAmount: totalAmount,
        totalQuantity: totalQuantity
    };
}



let Bill = cartAnalyzer(
    { name: "Pen", price: 10, quantity: 2 },
   // { name: "Book", price: 50, quantity: 1 },
    //{ name: "Pencil", price: 5, quantity: 3 }
);

console.log(Bill);

//Question 3//


function updateProfile(user, newCity, profession) {

    return {
        ...user,              
        city: newCity,        
        profession: profession 
    };
}

let user = {
    name: "Jiya",
    age: 20,
    city: "Surat"
};

// function call
let updatedUser = updateProfile(user, "Ahmedabad", "Engineer");

console.log("Original:", user)
console.log("Updated:", updatedUser)


//Question 4//

let products = [
    { name: "Laptop", price: 50000 },
    { name: "Mouse", price: 500 },
    { name: "Phone", price: 20000 },
    { name: "Keyboard", price: 800 }
];

let price = products
    .filter(function(product) {
        return product.price > 1000;   
    })
    .map(function(product) {
        return {
            ...product,
            discountedPrice: product.price * 0.9 
        };
    });

console.log(price);

//quetion 5//
let numbers = [1, 2, 3, 4, 5, 6, 7, 8];

let evenNumbers = numbers.filter(num => num % 2 === 0);


let oddNumbers = numbers.filter(num => num % 2 !== 0);


let evenSum = evenNumbers.reduce((sum, num) => sum + num, 0);


let oddSum = oddNumbers.reduce((sum, num) => sum + num, 0);

console.log("Even:", evenNumbers);
console.log("Odd:", oddNumbers);
console.log("Even Sum:", evenSum);
console.log("Odd Sum:", oddSum);