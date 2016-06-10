package solution_12

import scala.collection.mutable.ListBuffer

/**
  * P12 (**)
  * Decode a run-length encoded list.
  * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
  * Example:
  * {{{
  * scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  * }}}
  * @author Mykola Yashchenko
  */
object P12 {
  def decode[A](list: List[(Int, A)]): List[A] = {
    val listBuffer = new ListBuffer[A]
    for (obj <- list) listBuffer ++= List.fill(obj._1)(obj._2)
    listBuffer.toList
  }
}
