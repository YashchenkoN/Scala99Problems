package solution_8

import scala.collection.mutable.ListBuffer

/**
  * P08 (**)
  * Eliminate consecutive duplicates of list elements.
  * If a list contains repeated elements they should be replaced with a single copy of the element.
  * The order of the elements should not be changed.
  * Example:
  * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  *
  * @author Mykola Yashchenko
  */
object P08 {

  def compress[A](list: List[A]): List[A] = {
    if (list.isEmpty) Nil
    val buffer = new ListBuffer[A]
    for (element <- list) {
      if (!buffer.contains(element)) buffer += element
    }
    buffer.toList
  }

  def compressBuiltIn[A](list: List[A]): List[A] = list.distinct
}
