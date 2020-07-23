object Etl {
  type OldMapping = Map[Int, Seq[String]]
  type NewMapping = Map[String, Int]

  def transform(input: OldMapping): NewMapping = {
    input.flatMap(x => x._2.map(_.toLowerCase -> x._1))
  }
}