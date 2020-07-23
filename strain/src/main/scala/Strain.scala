object Strain {
  def keep[T](l: Seq[T], p: T => Boolean): Seq[T] = {
    for (i <- l if p(i)) yield i
  }

  def discard[T](l: Seq[T], p: T => Boolean): Seq[T] = {
    for (i <- l if !p(i)) yield i
  }

}