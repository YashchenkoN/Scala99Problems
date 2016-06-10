package solution_16

/**
  * P16 (**)
  * Drop every Nth element from a list.
  * Example:
  * {{{
  * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  * }}}
  *
  * @author Mykola Yashchenko
  */
object P16 {
  def drop[A](n: Int, list: List[A]): List[A] = {
    list.zipWithIndex.filter(v => (v._2 + 1) % n != 0).map(_._1)
  }
}
