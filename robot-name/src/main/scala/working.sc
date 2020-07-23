import util.Random.nextInt

val letters = 2
val digits = 3

println((0 until letters).map(_ => '!'))

println((0 until letters).map(_ => (nextInt(26) + 'A').toChar).mkString)

println((0 until digits).map(_ => nextInt(10)).mkString)

var robotNames: Set[String] = Set()

robotNames += "123"
print(robotNames)