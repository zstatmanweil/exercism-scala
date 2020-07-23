val test = "AEIOULNRST"

Seq(test).flatMap(_.toLowerCase)

val sumScores: Seq[(String, Int)] = Seq(
  ("AEIOULNRST", 1),
  ("DG", 2),
  ("BCMP", 3),
  ("FHVWY", 4),
  ("K", 5),
  ("JX", 8),
  ("QZ", 10)
)

def expand(letters: String, score: Int): Seq[(Char, Int)] = {
  def toTuple(l: Char, score: Int): (Char, Int) = (l, score)

  val rearranged: Seq[(Char, Int)] = Seq(letters).flatMap(_.toLowerCase).map(toTuple(_, score))

  rearranged
}


val letterScores: Map[Char, Int] = sumScores.flatMap({case (letters,n) => expand(letters, n)}).toMap

