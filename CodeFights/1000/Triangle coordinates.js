const TriangleCoordinates=n=>(A=n[0],B=n[1],C=n[2],r=(A[0]*(B[1]-C[1])+B[0]*(C[1]-A[1])+C[0]*(A[1]-B[1]))/2., r>0?r:-r)

/*You are given 3 points on the Cartesian plane that form a triangle. Find the area of this triangle.

Example

TriangleCoordinates([[2, 7], [12, 7], [6, 17]]) = 50
TriangleCoordinates([[-182, -152], [-192, -141], [-164, -138]]) = 169
TriangleCoordinates([[0, 0], [3, 0], [2, 8]]) = 12
[input] array.array.integer n

A matrix of three elements, where each element is an array of two elements, the x and the y coordinates respectively. -300 < n[i][j] < 300.

[output] float

The area of the triangle.*/
