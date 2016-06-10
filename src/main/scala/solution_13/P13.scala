package solution_13

/**
  * P13 (**)
  * Run-length encoding of a list (direct solution).
  * Implement the so-called run-length encoding data compression method directly.
  * I.e. don't use other methods you've written (like [[solution_9.P09]]'s pack); do all the work directly.
  * Example:
  * {{{
  * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  * }}}
  *
  * @author Mykola Yashchenko
  */
object P13 {
  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    if (list.isEmpty) Nil
    else {
      val (packed, next) = list.span(_ == list.head)
      (packed.size, packed.head) :: encodeDirect(next)
    }
  }
}
