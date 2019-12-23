object Hamming {
  def distance(strandOne: String, strandTwo: String): Option[Int] = {
    if (strandOne.length == strandTwo.length) {
      Option(strandOne.zip(strandTwo).count{
        case(x, y) => x != y
      })
    } else None
  }
}