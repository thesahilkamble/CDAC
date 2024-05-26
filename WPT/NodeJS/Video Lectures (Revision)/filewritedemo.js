var fs=require("fs");

fs.writeFileSync("text.txt", "Hello Earth!!, Welcome to FS Module")
console.log(fs.readFileSync("text.txt").toString());