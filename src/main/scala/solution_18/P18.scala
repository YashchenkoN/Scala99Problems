package solution_18

/**
  * P18 (**)
  * Extract a slice from a list.
  * Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
  * Example:
  * {{{
  * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g)
  * }}}
  *
  * @author Mykola Yashchenko
  */
object P18 {
  def slice[A](i: Int, k: Int, list: List[A]): List[A] = {
    def sliceR(count: Int, curList: List[A], result: List[A]): List[A] =
      (count, curList) match {
        case (_, Nil) => result.reverse
        case (c, h :: tail) if k <= c => result.reverse
        case (c, h :: tail) if i <= c => sliceR(c + 1, tail, h :: result)
        case (c, _ :: tail) => sliceR(c + 1, tail, result)
      }
    sliceR(0, list, Nil)
  }

  def sliceBuiltIn[A](i: Int, k: Int, list: List[A]): List[A] = list.slice(i, i + k)
}
