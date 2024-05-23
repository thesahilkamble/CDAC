const circle = require('./circle') 
const rectangle = require('./rectangle')
const triagnle = require('./triagnle')

console.log(circle.circleArea(5))
console.log(circle.circleCircumference(5))
console.log(circle.circleDiameter(5))

console.log(rectangle.rectArea(5, 10))
console.log(rectangle.rectPerimeter(5, 10))


console.log(triagnle.isEquilateral(5,10,15))
console.log(triagnle.isEquilateral(5,5,5))
console.log(triagnle.triPerimeter(10,10,10))