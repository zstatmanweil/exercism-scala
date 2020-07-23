object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    (1 until limit)
      .toList
      .filter(num => factors.exists(num % _ == 0))
      .sum

  }
}

