
//1. Employee Salary Processor
let employees = [
    { name: "Jeel", salary: 30000 },
    { name: "Raj", salary: 50000 },
    { name: "Amit", salary: 80000 }
];

let result = employees
    .filter(function(emp) {
        return emp.salary > 40000;
    })
    .map(function(emp) {
        let newSalary = emp.salary * 1.1;

        let level = newSalary >= 70000 ? "Senior" : "Mid";

        return {
            ...emp,
            salary: newSalary,
            level: level
        };
    });

console.log(result);




