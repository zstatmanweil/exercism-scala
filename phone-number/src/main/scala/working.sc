val digits: List[Char] = ('0' to '9').toList


println()

val num = "(543) 238-1901"

val dig = num.filter(digits.contains(_))

dig.apply(3)



