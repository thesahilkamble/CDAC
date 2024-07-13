let express = require('express')
let app = express()

let bodyParser = require('body-parser')
app.use(bodyParser.urlencoded({ extended: false }));

app.use(express.static(__dirname + '/'));


let books = [
    {bookid:101, bname:"Core Java", cat:"java", price:400},
    {bookid:102, bname:"Learning Javascript", cat:"js", price:450},
    {bookid:103, bname:"Java Essentials", cat:"java", price:300},
    {bookid:104, bname:"Learning HTML", cat:"web", price:200},
    {bookid:105, bname:"Javascript essentials", cat:"js", price:600},
    {bookid:106, bname:"Java for Beginners", cat:"java", price:400},
    {bookid:107, bname:"React programming", cat:"web", price:350},
    {bookid:108, bname:"Core Angular", cat:"web", price:250}
]

app.get("/", (req, res)=>{
    res.sendfile("index.html", {root:__dirname})
})

app.get("/search", (req, res)=>{
    let cat = req.query.cat
    let arr = []

    for(let book of books){
        if(book.cat == cat){
            arr.push(book)
        }
    }
    res.send(arr)
})

//http://localhost:3000/search/102
app.get("/search/:bookid", (req, res)=>{
    let bid = req.params.bookid

    for(let book of books){
        if(book.bookid == bid){
            res.send(book);
            break;
        }
    }
    res.send("Book not found")
})


app.post("/processlogin", (req, res)=>{
   let uname = req.body.uname
   let pass = req.body.pass

   if(uname == "admin" && pass=="admin123")
     res.sendfile("SelectCategory.html", {root:__dirname})
    else
      res.send(401, "Unauthorized User")
})

app.listen(3000, ()=>{
    console.log("server listining on http://localhost:3000")
})
