import scala.annotation.tailrec

object CollatzConjecture {
  def steps(n: Int): Option[Int] = {
    @tailrec
    def iter(n: Int, counter: Int): Option[Int] = {
      if (n.equals(0) || n < 0) None
      else if (n.equals(1)) Some(counter)
      else if (n % 2 == 0) iter(n / 2, counter + 1)
      else iter(3 * n + 1, counter + 1)
    }
    iter(n, 0)
  }
}