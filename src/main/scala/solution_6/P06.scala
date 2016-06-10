package solution_6

/**
  * P06 (*)
  * Find out whether a list is a palindrome.
  * Example:
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  *
  * @author Mykola Yashchenko
  */
object P06 {
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
