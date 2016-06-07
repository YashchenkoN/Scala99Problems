package solution_6

/**
  * @author Mykola Yashchenko
  */
object Solution {
  def isPalindrome[A](list: List[A]): Boolean = {
    if (list.isEmpty) true
    else {
      if (list.head == list.last) {
        if (list.size > 2) isPalindrome(list.tail.init)
        else (list.size == 2 && list.head == list.last) || list.size == 1
      } else false
    }
  }

  def isPalindromeBuiltIn[A](list: List[A]): Boolean = list == list.reverse
}
