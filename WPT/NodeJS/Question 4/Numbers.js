printNumbers = (num1, num2) => {
  for (num1; num1 <= num2; num1++) {
    if (num1 % 15 === 0) {
      console.log(`${num1} fizzbuzz`);
    } else if (num1 % 3 === 0) {
      console.log(`${num1} fizz`);
    } else if (num1 % 5 === 0) {
      console.log(`${num1} buzz`);
    } else {
      console.log(num1);
    }
  }
};

module.exports = { printNumbers };
