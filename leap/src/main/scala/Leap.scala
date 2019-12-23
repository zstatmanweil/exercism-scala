object Leap {
  def leapYear(year: Int): Boolean = {
    def divisible(num: Int, divisor: Int): Boolean =
      num % divisor == 0

    divisible(year, 400) || (divisible(year, 4) && !divisible(year, 100))
  }
}


