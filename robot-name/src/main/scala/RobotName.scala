import scala.annotation.tailrec
import util.Random.nextInt

object Robot {
  var robotNames: Set[String] = Set[String]()

  def getName(letters: Int, digits: Int): String = {
    var tempName: String =
      (0 until letters).map(_ => (nextInt(26) + 'A').toChar).mkString +
        (0 until digits).map(_ => nextInt(10)).mkString

    if (Robot.robotNames.contains(tempName)) {
      getName(letters, digits)
    }
    else {
      Robot.robotNames += tempName
      tempName
    }
  }
}

class Robot {
  var name: String = Robot.getName(2, 3)

  def reset() = {
    name = Robot.getName(2, 3)
  }

}