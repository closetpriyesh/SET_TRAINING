// let number = parseInt(prompt("Enter any number"))

// let desiredValue = 101;

// for(i=1;number*i<=desiredValue;i++)
//     console.log(number*i)

let n = parseInt(prompt("Enter any number"))

for(i=2;i<=n;i++) {
    let flag = 1
    for(j=2;j*j<=i;j++) {
        if(Math.floor(i/j)*j==i) {
            flag = 0
            break
        }
    }
    if(flag == 1)
        console.log(i)
}
