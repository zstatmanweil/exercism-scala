case class WordCount(sentence: String) {
  type Counter = Map[String, Int]

  private val punctuation = ":!&@$%^&."

  private def removeQuotes(word: String): String = {
    word.stripPrefix("'").stripPrefix("\"").stripSuffix("'").stripSuffix("\"")
  }

  val countWords: Counter = sentence
    .toLowerCase()
    .trim() // remove extra spaces at the end
    .filter(!punctuation.contains(_)) // filter out punctuation
    .split(("[\\s,]+")) // splits on new lines, spaces and commas
    .map(removeQuotes)
    .groupBy(identity)
    .mapValues(_.length)

}
