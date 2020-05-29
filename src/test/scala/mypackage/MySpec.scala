package mypackage;

import org.mockito.MockitoSugar
import org.scalatest.FlatSpec

case class ValueType[A](value: A) extends AnyVal

class MySpec extends FlatSpec with MockitoSugar {
  val s = mock[MyService]
}

class MyService {
  def crash(x: ValueType[Int]): Unit = {}
}
