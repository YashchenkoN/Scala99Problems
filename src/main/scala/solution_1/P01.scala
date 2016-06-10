package solution_1

/**
  * P01 (*)
  * Find the last element of a list.
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  *
  * @author Mykola Yashchenko
  */
object P01 {
  def last[A](list: List[A]): A = {
    require(list.nonEmpty)
    if (list.size == 1) list.head
    else last(list.tail)
  }

  def lastBuiltIn[A](list: List[A]): A = list.last
}
