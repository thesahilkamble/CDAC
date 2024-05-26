function f1 () {
    console.log('f1')
}  
  
function f2 () {
    console.log('f2')
}

function f3 () {
    console.log('f3')
}

function f4 () {
    console.log('f4')
}

// sync way of calling 

// f1()
// f2()
// f3() 
// f4()

// async way of calling

f1()
f2()
setTimeout(f3, 1000)
f4()