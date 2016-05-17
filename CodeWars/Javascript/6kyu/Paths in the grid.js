const numberOfRoutes=(m, n)=>(fac(m+n) / (fac(n)*fac(m)))
const fac=n=>(n===1? 1 : n*fac(n-1))


/*Description:

Paths in the Grid

You have a grid with m rows and n columns.
Return number of ways that you can start from point A to reach point B.
you are only allowed to move right and up.

alt text

In the picture, there are 10 pathes from A to B.*/
