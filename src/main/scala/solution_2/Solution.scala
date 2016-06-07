package solution_2

/**
  * @author Mykola Yashchenko
  */
object Solution {
  def penultimate[A](list: List[A]): A = {
    require(list.size > 1)
    if (list.size == 2) list.head
    else penultimate(list.tail)
  }

  def penultimateBuiltIn[A](list: List[A]): A = {
    require(list.size > 1)
    list.init.last
  }
}
