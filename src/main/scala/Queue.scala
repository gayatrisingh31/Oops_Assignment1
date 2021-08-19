trait Queue {  var queue:List[Double] = List.empty
  var queue_start: Int = -1
  var queue_end: Int = -1

  def enqueue(item: Double): String =
  {
    if(queue_end == -1 && queue_start == -1)
    {
      queue_start = queue_start + 1
      queue_end = queue_end + 1
      queue = queue ::: List(item)
      "Enqueued"
    }
    else
    {
      queue_end = queue_end + 1
      queue = queue ::: List(item)
      "Enqueued"
    }
  }

  def dequeue(item: Int): String =
  {
    if(queue_start == -1 && queue_end == -1)
    {
      "Queue Underflow"
    }
    else if(queue_start == queue_end )
    {
      queue = queue.drop(item)
      queue_start = -1
      queue_end = -1
      "Dequeued"
    }
    else
    {
      queue = queue.drop(1)
      queue_start = queue_start + 1
      "Dequeued"
    }
  }
  def getQueue: List[Double] =
  {
    queue
  }
}

