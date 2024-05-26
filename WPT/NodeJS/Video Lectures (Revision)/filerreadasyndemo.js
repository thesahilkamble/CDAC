var fs = require("fs")

fs.readFile("text.txt","utf-8", function(err, data) {
  if (err) throw err;
  console.log(data.toString());
});

data = fs.readFileSync("./text.txt");
console.log("Sync read"+data);
console.log("Program ends here")