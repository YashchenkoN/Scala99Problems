package solution_10

import solution_9.P09._

import scala.collection.mutable.ListBuffer

/**
  * P10 (*)
  * Run-length encoding of a list.
  * Use the result of problem [[solution_9.P09]] to implement the so-called run-length
  * encoding data compression method. Consecutive duplicates of elements are encoded as
  * tuples (N, E) where N is the number of duplicates of the element E.
  * Example:
  * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)
  *
  * @author Mykola Yashchenko
  */
object P10 {
  def encode[A](list: List[A]): List[(Int, A)] = {
    val result = new ListBuffer[(Int, A)]
    for (l <- pack(list)) {
      result.append((l.size, l.head))
    }
    result.toList
  }

  def encodeBuiltIn[A](list: List[A]): List[(Int, A)] = pack(list) map(x => (x.size, x.head))
}
