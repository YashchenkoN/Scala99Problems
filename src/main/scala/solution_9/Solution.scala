package solution_9

/**
  * @author Mykola Yashchenko
  */
object Solution {
  def pack[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) List(Nil)
    else {
      val (packed, next) = list.span(_ == list.head)
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
}
