case class DNA(strand: String) {
  var counter = Map('A' -> 0, 'C' -> 0, 'G' -> 0, 'T' -> 0)
  val letters = counter.keys.toList

  def nucleotideCounts: Either[String, Map[Char, Int]] = {
    if (!strand.forall(letters.contains(_))) Left("Invalid nucleotide")
    else {
      strand.map(char => counter += (char -> (counter(char) + 1)))
      Right(counter)
    }
  }

}