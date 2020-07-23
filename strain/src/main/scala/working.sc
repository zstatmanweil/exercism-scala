val t = List(1, 2, 3)
val a = for (i <- t) yield i+2

val b = t.map(x => if (x == 1) x+2 )

a == b
