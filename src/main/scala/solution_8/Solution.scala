package solution_8

import scala.collection.mutable.ListBuffer

/**
  * @author Mykola Yashchenko
  */
object Solution {

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
