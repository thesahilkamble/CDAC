
// Using function keyword

function addition(num1, num2) {
    return num1 + num2;
}

function subtraction(num1, num2) {
    return num1 - num2;
}

// Using (Fat Arrow) => 

multiplication = (num1, num2) => {
    return num1 * num2;
}

division = (num1, num2) => {
    return num1 / num2;
}

square = (num1) => {
    return num1 * num1;
}

sumation = (...num) => {

// Using for loop

    // var sum = 0;
    // for(var i = 0 ; i < num.length ; i++){
    //     sum = sum + num[i];
    // }
    // return sum;

// Using reduce funtion

    return num.reduce((num1,num2) => {
        return num1 + num2;
    })

}

module.exports = {addition,subtraction,multiplication,division,square,sumation}