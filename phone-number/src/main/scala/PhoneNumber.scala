object PhoneNumber {
  val validDigits: List[Char] = ('0' to '9').toList

  def clean(number: String): Option[String] = {
    val onlyDigits: String = number.filter(validDigits.contains(_))

    if (!(validateAreaCode(onlyDigits) && validateExchangeCode((onlyDigits)) && validateLength(onlyDigits)))
      None
    else if (onlyDigits.head == '1' && onlyDigits.length == 11)
      Some(onlyDigits.tail)
    else
      Some(onlyDigits)

  }

  def validateExchangeCode(digits: String): Boolean = {
    !"01".contains(digits.apply(3))
  }

  def validateAreaCode(digits: String): Boolean ={
    !(digits.head == '0' || (digits.head == '1' && digits.length != 11))
  }

  def validateLength(digits: String): Boolean = {
    (digits.head == '1' && digits.length == 11) || digits.length == 10
  }

}