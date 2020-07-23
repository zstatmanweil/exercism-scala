import HighScores.personalBest

object HighScores {

  def latest(scores: List[Int]): Int = scores.last

  def personalBest(scores: List[Int]): Int = {
    def loop(acc: Int, scores: List[Int]): Int = {
      if (scores.isEmpty) acc
      else {
        val max = if (acc > scores.head) acc else scores.head

        loop(max, scores.tail)
      }
    }
    loop(0, scores)
  }

  def personalTop(scores: List[Int]): List[Int] = scores.sortBy(x => -x).take(3)

  def report(scores: List[Int]): String = {
    val latestScore: Int = latest(scores)
    val highScore: Int = personalBest(scores)
    val firstPart: String = s"Your latest score was $latestScore."
    val secondPart: String = if (latestScore == personalBest(scores)) {
      "That's your personal best!"
    } else {
      val diff: Int = highScore - latestScore
      s"That's $diff short of your personal best!"
    }
    s"$firstPart $secondPart"
  }

}