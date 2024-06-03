const buttons = document.querySelector('#button')
const userInput = document.querySelector('#radius')
const area = document.querySelector('#area')
const circumference = document.querySelector('#circumference')

buttons.addEventListener('click', function (e) {
    e.preventDefault();
    const radius = parseInt(userInput.value);
    validateRadius(radius)
})

function validateRadius(radius) {
    if (radius === '' || isNaN(radius) || radius <= 0) {
        area.innerHTML = 'Enter valid radius'
    }
    else {
        calculateArea(radius)
        calculateCircumference(radius)
    }

}
function calculateArea(radius){
    area.innerHTML =` Area: ${(Math.PI * radius * radius).toFixed(2)}`;
}
function calculateCircumference(radius){
    circumference.innerHTML = `Circumference: ${(2 * Math.PI * radius).toFixed(2)}`;
}

