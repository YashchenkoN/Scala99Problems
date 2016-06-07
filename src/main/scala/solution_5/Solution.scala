package solution_5

import scala.collection.mutable.ListBuffer

/**
  * @author Mykola Yashchenko
  */
object Solution {

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
