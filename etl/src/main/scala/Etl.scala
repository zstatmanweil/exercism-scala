import scala.collection.immutable.ListMap

object Etl {
  type oldMapping = Map[Int, Seq[String]]
  type newMapping = Map[String, Int]

  def transform(input: oldMapping): newMapping = {

    var newSystem: newMapping = Map()

    input.foreach {
      case (value, letters) => letters.foreach(l => newSystem += (l.toLowerCase -> value))
    }

    newSystem
  }
}