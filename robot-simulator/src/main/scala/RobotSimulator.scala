object Bearing {
  val North = 0
  val East = 90
  val South = 180
  val West = 270
}

case class Robot(bearing: Int, coordinates: (Int, Int)) {
  val b: Int = bearing
  val c: (Int, Int) = coordinates

  def turnLeft: Robot = {
    val newBearing: Int = if (b == 0) 270 else b - 90
    Robot(newBearing, coordinates)
  }

  def turnRight: Robot = {
    Robot((b + 90) % 360, coordinates)
  }

  def advance: Robot = {
    val newCoordinates: (Int, Int) = b match {
      case 0 => c + (0, 1)
      case 90 => c + (1, 0)
      case 180 => c + (0, -1)
      case 270 => c + (-1, 0)
    }
    Robot(b, newCoordinates)
  }

  def simulate(directions: String): Robot = {
    // "this" is initial value, robot is accumulator value and l is current char in directions
    directions.foldLeft(this)((robot, l) => l match {
      case 'A' => robot.advance
      case 'R' => robot.turnRight
      case 'L' => robot.turnLeft
      case _ => robot
    })
  }

  // From scala documentation on implicit classes: "This keyword makes the class’s primary constructor available for
  // implicit conversions when the class is in scope."
  // This class wraps an tuple and provides a new method + to add two tuples together.
  implicit class TuppleAdd(t: (Int, Int)) {
    def +(p: (Int, Int)): (Int, Int) = (p._1 + t._1, p._2 + t._2)
  }

}

