object HelloWorld {
    def main(args: Array[String]) {
        for(_ <- 0 until readInt) {
            val Array(a,h,theta) = readLine.split(" ").map(_.toInt)
            if(Math.atan((h*1.0/a))<=(theta*3.141593)/180)
              println((Math.ceil(((h * h) / (2.0 * Math.tan((theta * 3.141593) / 180.0))) / a)).toInt)
            else {
              val hx = a * math.tan((theta*3.1416)/180)
              println((Math.ceil(h-hx/2)).toInt)
            }

        }
    }
}

/*Sid is a very naughty, plump and food-loving boy. Today, his mother has made the special snack SEV. She fills this SEV up to a height ‘H’ cm in a transparent cubical closed box of edge ‘a’ cm (Fig 1) . When Sid asks mother for the SEV, she gives him a little and tells him: ”Only this much for today.”

However Sid is not satisfied.

He waits for his mother to go out shopping and sneaks into the kitchen. He knows that his mother will scold him if she discovers that he has eaten the SEV without her permission. However, he just can't resist the temptation. He suddenly gets an idea : “If I eat the SEV up to a height ‘h’ from bottom (ie. 'h' height of SEV will be left in the box after he's done eating Fig.2), and then reorganize the SEV (as shown in (Fig.3)), Mom won’t realize that I have eaten the SEV (as Mom sees the SEV only from FRONT VIEW)!“. Unfortunately for Sid , the SEV can stay stable only up to at a maximum sloping angle of THETA_MAX degrees (acute angle) with respect to the ground (horizontal). Help Sid by telling him the maximum amount of SEV he can eat by telling him the appropriate height ‘h’ from bottom up to which he can eat the SEV.

Input:

First line consisting of t, the number of test cases. Each test case comprising of a single line containing space separated integers a, H and THETA_MAX.

Output:

A single line for every test case, consisting of the value of the smallest integer greater than or equal h.

Constraints:

1<=t<=100000

20 <= a <= 100,

0 < H <= a,

0<= THETA_MAX ( in degrees ) < 90.*/
