class DoubleQueue extends Queue
{
  override def enqueue(item: Double): String =
  {
    if(queue_end == -1 && queue_start == -1)
    {
      queue_start = queue_start + 1
      queue_end = queue_end + 1
      val ItemDouble = 2 * item
      queue = queue ::: List(ItemDouble)
      "Enqueued"
    }
    else
    {
      queue_end = queue_end + 1
      val ItemDouble = 2 * item
      queue = queue ::: List(ItemDouble)
      "Enqueued"
    }
  }
}
class SquareQueue extends Queue
{
  override def enqueue(item: Double): String =
  {
    if(queue_end == -1 && queue_start == -1)
    {
      queue_start = queue_start + 1
      queue_end = queue_end + 1
      val ItemSquare = item * item
      queue = queue ::: List(ItemSquare)
      "Enqueued"
    }
    else
    {
      queue_end = queue_end + 1
      val ItemSquare = item * item
      queue = queue ::: List(ItemSquare)
      "Enqueued"
    }
  }
}
