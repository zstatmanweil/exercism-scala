object FlattenArray {
  def flatten[A](s: List[A]): List[A] = {
    s match {
      case Nil => Nil
      case (head: List[A]) :: tail => flatten(head) ++ flatten(tail)
      case (head: A) :: tail => head +: flatten(tail)
      case null :: tail => flatten(tail)
    }
  }
}