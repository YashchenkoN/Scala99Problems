package solution_19

/**
  * P19 (**)
  * Rotate a list N places to the left.
  * Examples:
  * {{{
  * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  *
  * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  * }}}
  *
  * @author Mykola Yashchenko
  */
object P19 {
  def rotate[A](n: Int, list: List[A]): List[A] = {
    if (n == 0) list
    else if (n > 0) rotate(n - 1, list.tail ::: List(list.head))
    else rotate(n + 1, list.last :: list.init)
  }

  def main(args: Array[String]) {
    print(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
