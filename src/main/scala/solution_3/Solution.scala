package solution_3

/**
  * @author Mykola Yashchenko
  */
object Solution {
  def nth[A](n: Int, list: List[A]): A = {
    require(list.size > n)
    list(n)
  }
}
