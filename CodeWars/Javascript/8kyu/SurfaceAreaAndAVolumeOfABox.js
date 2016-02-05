function getSize(width, height, depth) {
    var arr = new Array(2);
    arr[0] = 2 * (height * width) + 2 * (height * depth) + 2 * (width * depth)
    arr[1] = width * height * depth;
    return arr;
}


/*Description:
    Write a
function that returns the total surface area and volume of a box as an array: [area, volume].*/


const getSize = (w, h, d) => [(w * h + w * d + d * h) * 2, w * h * d]
