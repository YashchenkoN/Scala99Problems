package solution_17

/**
  * P17 (*)
  * Split a list into two parts.
  * The length of the first part is given. Use a Tuple for your result.
  * Example:
  * {{{
  * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * }}}
  *
  * @author Mykola Yashchenko
  */
object P17 {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    if (n <= 0) (Nil, list)
    else {
      val result: (List[A], List[A]) = split(n - 1, list.tail)
      (list.head :: result._1, result._2)
    }
  }

  def splitFunctional[A](n: Int, ls: List[A]): (List[A], List[A]) =
    (ls.take(n), ls.drop(n))
}
