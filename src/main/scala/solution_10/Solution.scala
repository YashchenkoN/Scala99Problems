package solution_10

import solution_9.Solution._

import scala.collection.mutable.ListBuffer

/**
  * @author Mykola Yashchenko
  */
object Solution {
  def encode[A](list: List[A]): List[(Int, A)] = {
    val result = new ListBuffer[(Int, A)]
    for (l <- pack(list)) {
      result.append((l.size, l.head))
    }
    result.toList
  }

  def encodeBuiltIn[A](list: List[A]): List[(Int, A)] = pack(list) map(x => (x.size, x.head))
}
