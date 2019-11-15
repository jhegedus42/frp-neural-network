import sodium.StreamSink
import sodium._

object Main extends App {
  println("Hello, World!")
  val s=new StreamSink[String]()
  s.listen(x=>println(x))
  s.send("g")
}



object Network{
  case class Signal(value:Double)

  trait ActivationFunction{
    def f(signals:Set[Signal], activation: Double) : Signal
  }

  case class Axon(signal:Stream[Signal],weight:Double=1)

  case class Neuron(streams:Set[Axon],activation:Double){
    lazy val cell=new Cell[Neuron](this)
//    def getOutputStream:Stream[Double] = cell.updates()
  }

}