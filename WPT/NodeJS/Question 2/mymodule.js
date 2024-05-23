
factorial = (num) => {
    var fact = 1;
    for(var i = 1 ; i <= num ; i++){
        fact = fact * i;
    }
    return fact;

}

myprime = (num) => {
    if(num === 1){
        return `${num} is not a prime number`;
    }else{
        for(var i = 2 ; i < num; i++){
            if(num % i === 0){
                return `${num} is not a prime number`;
            }
                return `${num} is a prime number`;
        }
    }
}

printable = (num) => {
    for(var i = 1 ; i <= 10 ; i++){
        console.log(num + ' * ' + i + ' = ' + num * i);
    }
}

module.exports = {factorial,myprime,printable};
