object ArmstrongNumbers {

  def isArmstrongNumber(num: Int): Boolean = {
    val exp = num
      .toString
      .length
    val sum = num
      .toString
      .split("")
      .map(x => scala.math.pow(x.toInt, exp))
      .sum

    sum == num
  }

}