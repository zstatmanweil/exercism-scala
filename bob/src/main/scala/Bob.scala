object Bob {
  def response(statement: String): String = {
    val s = statement.trim
    s match {
      case "" => "Fine. Be that way!"
      case x if (isShouting(s) & isQuestion(s)) => "Calm down, I know what I'm doing!"
      case x if (isQuestion(s)) => "Sure."
      case x if (isShouting(s)) => "Whoa, chill out!"
      case _ => "Whatever."
    }
  }

  def containsNoLetters(s: String): Boolean = {
    val letters = (('a' to 'z') ++ ('A' to 'Z')).toVector
    s.filter(letters.contains(_)).length == 0
  }

  def isShouting(s: String): Boolean = {
    s.equals(s.toUpperCase()) & !containsNoLetters(s)
  }

  def isQuestion(s: String): Boolean = {
    s.last == '?'
  }
}

