val num = 213
val exp = num.toString.length.toFloat

val n = num.toString.map(x => scala.math.pow(x.asDigit, exp)).sum