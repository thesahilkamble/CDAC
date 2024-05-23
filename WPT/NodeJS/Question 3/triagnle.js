

isEquilateral = (side1, side2, side3) => {
    if (side1 === side2 && side2 === side3) {
        return true;
    }
    return false;
}
triPerimeter = (side1, side2, side3) => {
    return side1 + side2 + side3;
}
module.exports = {isEquilateral, triPerimeter}