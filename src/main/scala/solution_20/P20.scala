package solution_20

/**
  * P20 (*)
  * Remove the Kth element from a list.
  * Return the list and the removed element in a Tuple. Elements are numbered from 0.
  * Example:
  * {{{
  * scala> removeAt(1, List('a, 'b, 'c, 'd))
  * res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  * }}}
  *
  * @author Mykola Yashchenko
  * */
object P20 {
  def removeAt[A](n: Int, list: List[A]): (List[A], A) =
    if (n < 0 || n > list.size - 1) throw new NoSuchElementException
    else (list.take(n) ::: list.drop(n + 1), list(n))
}
