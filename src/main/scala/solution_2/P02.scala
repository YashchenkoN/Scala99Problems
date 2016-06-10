package solution_2

/**
  * P02 (*)
  * Find the last but one element of a list.
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  *
  * @author Mykola Yashchenko
  */
object P02 {
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
