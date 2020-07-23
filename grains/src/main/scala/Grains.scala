object Grains {
  def square(num: Int): Option[BigInt] = {
    if (num < 1 || num > 64) None
    else Some(BigInt(2).pow(num-1))
  }

  def total: BigInt = (1 to 64).map(square(_).get).sum
}