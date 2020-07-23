object BinarySearch {
  def find(input: List[Int], value: Int): Option[Int] = {
    def iter(startIdx: Int, endIdx: Int): Option[Int] = {
      val midPointIdx: Int = startIdx + ((endIdx - startIdx) / 2)
      val midPoint = input.apply(midPointIdx)

      if (startIdx > endIdx || value > input(endIdx) || value < input(startIdx)) None
      else if (value == midPoint) Some(midPointIdx)
      else if (value < midPoint) iter(startIdx, midPointIdx - 1)
      else iter(midPointIdx + 1, endIdx)
      }

    if (input.isEmpty) None
    else iter(0, input.length-1)
  }
}