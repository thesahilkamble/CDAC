const fs = require("fs");

fs.readFile("mydata.txt", function (err, data) {
 
  wordCount(err,data);
  
});

fs.readFile("myfile.data", function (err, data) {
 
  wordCount(err,data);
  
});


wordCount = (err,data) =>
{
   if (err) {
      console.log(err.message);
    } else {
      var str = (data.toString());
      let count = 0;
      let ans  = str.trim().split(/\s+/)
      console.log(ans.length);
    }
}