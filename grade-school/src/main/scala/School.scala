import scala.collection.immutable.ListMap

class School {
  type DB = Map[Int, Seq[String]]

  private var roster: DB = Map()

  def add(name: String, g: Int) = {
    val updatedGrade = grade(g) :+ name
    roster += (g -> updatedGrade)
  }

  def db: DB = roster

  def grade(g: Int): Seq[String] =
    roster.getOrElse(g, List())

  def sorted: DB =
    roster.toSeq.sortBy { case (k, _) => k }.toMap.mapValues(v => v.sorted)

}
