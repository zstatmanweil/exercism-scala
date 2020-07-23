object ScrabbleScore {
  val sumScores: Seq[(String, Int)] = Seq(
    ("AEIOULNRST", 1),
    ("DG", 2),
    ("BCMP", 3),
    ("FHVWY", 4),
    ("K", 5),
    ("JX", 8),
    ("QZ", 10)
  )

  val letterScores: Map[Char, Int] = sumScores
    .flatMap(
      { case (letters, n) => Seq(letters).flatMap(_.toLowerCase).map(l => (l, n)) }
    ).toMap

  def score(word: String): Int = {

    word.toLowerCase.foldLeft(0)((a, b) => a + letterScores.getOrElse(b, 0))
  }

}


