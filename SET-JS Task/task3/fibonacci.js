const fib = []

const N = 10000;

fib[0] = 0;
fib[1] = 1;
fib[2] = 1;

console.log("HELLO")

for(i=3;i<=N;i++) 
    fib.push(fib[i-1] + fib[i-2]);

const getFibonacci = (n) => {
    return fib[n];
}

console.log(getFibonacci(0))
console.log(getFibonacci(5))
console.log(getFibonacci(10))
