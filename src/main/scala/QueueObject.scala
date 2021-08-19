object QueueObject extends App{
  //def main(args: Array[String]): Unit = {
  val result1 = new DoubleQueue
  val result2 = new SquareQueue
  println(result1.enqueue(2))
  println(result1.enqueue(4))
  println(result1.enqueue(6))
  println(result1.enqueue(8))
  println(result1.getQueue)
  println(result2.enqueue(10))
  println(result2.enqueue(12))
  println(result2.enqueue(14))
  println(result2.enqueue(16))
  println(result2.getQueue)
  println(result2.dequeue(item = 4))
  println(result2.getQueue)
  println(result2.dequeue(item = 4))
  println(result2.getQueue)
}
