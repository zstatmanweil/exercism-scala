case class Clock(m: Int) {
  def +(that: Clock) = Clock(m + that.m)
  def -(that: Clock) = Clock(m - that.m)
}

object Clock {
  def apply(hours: Int, minutes: Int): Clock = Clock(hours * 60 + minutes)

  def apply(minutes: Int): Clock = {
//    calculate how many minutes past midnight (60 * 24 minutes in a day)
    val minPastMidnight = minutes % (60 * 24)
//    If the minutes are negative then subtract that from the days total minutes (60 * 24)
    val finalMinutes = if (minPastMidnight >= 0) minPastMidnight else 60* 24 + minPastMidnight
    new Clock(finalMinutes)
  }
}