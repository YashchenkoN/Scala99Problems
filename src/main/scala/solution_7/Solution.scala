package solution_7

/**
  * @author Mykola Yashchenko
  */
object Solution {
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case list: List[_] => flatten(list)
    case e => List(e)
  }
}
