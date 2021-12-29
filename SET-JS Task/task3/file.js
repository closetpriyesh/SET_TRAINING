import fs from 'fs';

const data = "write something"

fs.writeFile('out.txt', data, (err) => {
    if(err) throw err;

    fs.appendFile("out.txt", " appending to file", (err) => {
        if (err) {
          console.log(err);
        }
        else {
          console.log("File Contents of file after append:",
            fs.readFileSync("out.txt", "utf8"));
        }
    });
})



// fs.readFile('out.txt', 'utf8', function(err, data){
//     console.log("read file called")
//     if(err) throw err;
//     console.log("Reading content: "+ data);
// });
