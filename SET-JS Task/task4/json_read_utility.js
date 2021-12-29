import fs from 'fs';

var users = []

var passwords = []

fs.readFile('task4/data.json', 'utf8', function (err, data) {
    console.log("read file called")
    if (err) throw err;
    console.log("Reading content: " + data);
    const dataObject = JSON.parse(data);

    for (var data of dataObject.testData) {
        users.push(data.username)
        passwords.push(data.password)
    }
    console.log(users)
    console.log(passwords)
});
