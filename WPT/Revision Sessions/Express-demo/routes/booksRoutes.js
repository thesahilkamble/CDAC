const express = require("express");
const router = express.Router();

router.get("/", (req, res)=>{
    res.send("<h1>Welcome to routes</h1>")
})

router.get("/getBook/:bid", (req, res)=>{
    res.send("<h1>Details of Book with Id : " + req.params.bid + "</h1>")
})

router.get("/getBooks", (req, res)=>{
    res.send("<h1>List of all books</h1>")
})

module.exports = router