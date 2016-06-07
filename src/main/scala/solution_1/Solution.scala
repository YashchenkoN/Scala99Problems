package solution_1

/**
  * @author Mykola Yashchenko
  */
object Solution {
  def last[A](list: List[A]): A = {
    require(list.nonEmpty)
    if (list.size == 1) list.head
    else last(list.tail)
  }

  def lastBuiltIn[A](list: List[A]): A = list.last
}
