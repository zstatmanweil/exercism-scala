case class Triangle(side1: Double, side2: Double, side3: Double) {
  val sidesList = List(side1, side2, side3)
  def triangle: Boolean =  if (sidesList.contains(0) || (side1 + side2) < side3 || (side2 + side3) < side1) false else true
  def equilateral: Boolean =  if (sidesList.toSet.size.equals(1) && (this).triangle) true else false
  def isosceles: Boolean = if (sidesList.toSet.size <= 2 && (this).triangle) true else false
  def scalene: Boolean = if (sidesList.toSet.size.equals(3) && (this).triangle) true else false

}