import {InterestCalculator} from './InterestCalculator.js'
import { employees } from './employee.js';

const calc = new InterestCalculator();

const months = 12

const salaryToBePaid = []

for(var employee of employees) {
    salaryToBePaid.push(employee.salary + calc.calculateInterest(employee.salary, months))
}

console.log(salaryToBePaid)
