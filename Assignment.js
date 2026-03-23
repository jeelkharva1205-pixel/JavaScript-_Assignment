let massSuresh = 78
let heightSuresh = 1.69

let massRamesh =90
let heightRamesh =1.95

let sureshBMI = massSuresh / (heightSuresh ** 2)
let rameshBMI = massRamesh / (heightRamesh ** 2)

console.log("Suresh BMI:", sureshBMI)
console.log("Ramesh BMI:", rameshBMI)

let markHigherBMI = sureshBMI > rameshBMI;
console.log('suresh has highest BMI:' ,markHigherBMI)


//ASSIGNMENT 1 (Smart Discount Calender)//

function FinalAmount(Name,age,purchaseAmount)
{
    let discount= 0
    if(age<18)
    {
       discount =10 
    }
    else if (age>=60)
        {
       discount =20
    }
    
    if (purchaseAmount>5000)
    {
discount += 5
    }

const discountAmount = (purchaseAmount * discount )/100
const finalAmount =purchaseAmount - discountAmount
console.log(`Hi ${Name}! You received a total discount of ${discount}%. Final amount:${finalAmount} `)
}
FinalAmount('Jeel',22,5500)

//ASSIGNMENT 2 (LOGIN VALIDATION SYSTEM)//
let userName ='Suresh'
let passWord ='su12@05'

function validate(userName1,passWord2)
{
if(userName1===userName && passWord2 ===passWord)
{
    console.log('Login successful!')
    
}

else if(userName1!=userName && passWord2 != passWord)
{
    console.log("Both incorrect")
    
}

else 
{
    console.log("Incorrect password or username")
    
}

}
validate('Suresh','su12@05')

//Assignment 3 Number Analuzer Tool//
function number(num)
{
    if (num%2===0 & num >0 )
    {
console.log(`The number ${num} is positive and even. `)
    }
    else if(num%2===0 & num <0)
        {
console.log(`The number ${num} is negative and even. `)
        }
        else if( num%2 != 0 & num >0 )
       {
console.log(`The number ${num} is positive and odd. `)
       }
       else if(num%2 != 0 & num <0 )
        {
console.log(`The number ${num} is negative and odd. `)
       }
       else
         {
console.log(`The number ${num} is zero. `)
       }
}
 number(0)
 number(2)
 number (-5)

 // Assignment 4 Shopping Eligibility Checker //

 let isMember = true;
let cartValue = 1500;

if ((isMember && cartValue > 1000) || cartValue > 2000) {
    console.log("You are eligible for free delivery!")
} else {
    console.log("Standard delivery charges apply.")
}

//Assignment 5: Grade Evaluation System//

function result(marks)
{
if(marks<0 ||marks>100)
{
  console.log("Invalid marks entered.") 
}
else if(marks>=90)
{
console.log("Your grade is A.")
}
else if(marks>=75 && marks<= 89)
{
console.log("Your grade is B.")
}
else if(marks>=50 && marks <=74)
{
console.log("Your grade is C.")
}
else
     {
console.log("You are fail in exam.")
}
}
result(90)
result(25)
result(101)