package solution_5

import scala.collection.mutable.ListBuffer

/**
  * P05 (*)
  * Reverse a list.
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  *
  * @author Mykola Yashchenko
  */
object P05 {

  def reverse[A](list: List[A]): List[A] = reverseRecursive(new ListBuffer[A], list)

  private def reverseRecursive[A](newList: ListBuffer[A], source: List[A]): List[A] = {
    if (source.isEmpty) newList.toList
    else {
      newList += source.head
      reverseRecursive(newList, source.tail)
    }
  }

  def reverseBuiltIn[A](list: List[A]): List[A] = list.reverse
}
