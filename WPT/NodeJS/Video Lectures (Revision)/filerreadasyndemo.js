var fs = require("fs")

fs.readFile("text.txt","utf-8", function(err, data) {
  if (err) throw err;
  console.log(data.toString());
});

data = fs.readFileSync("./text.txt");
console.log("Sync read"+data);
console.log("Program ends here")

fs.stat("text.txt", function(err,status){
    if(err){
        console.log("error "+err.code+"----->" + err.message);
    }
    else{
        console.log(status);
                console.log(status.isFile());
                console.log(status.isDirectory());

    }

})