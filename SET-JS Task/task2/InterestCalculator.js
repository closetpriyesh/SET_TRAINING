import {Calculator} from "./Calculator.js"

export class InterestCalculator {
    constructor() {
       this.calc = new Calculator();
    }

    calculateSimpleInterest = (principal, time, interestRate) => {

        console.log("salary: " + this.calc.multiply(this.calc.multiply(principal, time), interestRate))
        return this.calc.divide(this.calc.multiply(this.calc.multiply(principal, time), interestRate), 100);
    }

    calculateCompoundInterest = (principal, time, interestRate) => {
        return this.calc.subtract(this.calc.multiply(principal, this.calc.exp(1+interestRate, time)), principal)
    }
    
    calculateInterest = (salary, months) => {
        const time = this.calc.divide(months, 12)

        var interestReceived = 0
        if(months < 12) {
            interestReceived = this.calculateSimpleInterest(salary, time, 6)
            console.log("simple interest received: " + interestReceived)
        } else {
            interestReceived =  this.calculateCompoundInterest(salary, time, 5.5)
            console.log("compount interest received: " + interestReceived)
        }
        return interestReceived
    }
}