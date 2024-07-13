let express = require('express')
let app = express()
let bookroutes = require('./routes/booksRoutes')

app.use("/book", bookroutes)

app.listen(3000, ()=>{
    console.log("server listining on http://localhost:3000")
})
