 def f(arr:List[Int]):List[Int] = arr.zipWithIndex filter {e => e._2 % 2 != 0} map {_._1}
