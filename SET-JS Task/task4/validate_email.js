const validateEmail = (email) => {
    if(/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/.test(email))
        return "Validation successfull"
    else return "Validation failed"
}

console.log(validateEmail("asdjflkjasldfj@"))
console.log(validateEmail("asdjflkjasldfj@gmail.com"))