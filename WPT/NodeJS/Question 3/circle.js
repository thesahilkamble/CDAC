circleArea = (radius) => {
    return (Math.PI * radius * radius).toFixed(2);
}

circleCircumference = (radius) => {
    return (2 * Math.PI * radius).toFixed(2);
}

circleDiameter = (radius) => {
    return 2 * radius;
}

module.exports = {circleArea,circleCircumference,circleDiameter}