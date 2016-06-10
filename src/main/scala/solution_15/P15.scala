package solution_15

/**
  * P15 (**)
  * Duplicate the elements of a list a given number of times.
  * Example:
  * {{{
  * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  * }}}
  *
  * @author Mykola Yashchenko
  */
object P15 {
  def duplicateN[A](n: Int, list: List[A]): List[A] =
    list.flatMap(e => List.fill(n)(e))
}
