let express = require('express')
let app = express()

let users = [
    {name:"aaa", age:30},
    {name:"bbb", age:31},
    {name:"ccc", age:23},
    {name:"ddd", age:20}
]

//app.method(url, f1, f2, f3, f4)

app.get("/", (req, res, next)=>{
    console.log("in function-1")
    next()
}, (req, res, next)=>{
    console.log("in function-2")
    next()
}, (req, res, next)=>{
    console.log("in function-3")
    res.send("<h1>In middleware eg</h1>")
})






app.get("/names", (req, resp)=>{
    let names = ["aa", "bbb","ccc"]
    resp.send(names)
})

app.get("/user", (req, resp)=>{
    let user = {name:"Sunil", age:30}
    resp.send(user)
})

app.get("/users", (req, resp)=>{
    resp.send(users)
})





app.listen(3000, ()=>{
    console.log("server listining on http://localhost:3000")
})