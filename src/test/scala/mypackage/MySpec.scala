package mypackage;

import org.mockito.{MockitoSugar,ArgumentMatchersSugar}
import org.scalatest.flatspec.AnyFlatSpec

case class ValueType[A](value: A) extends AnyVal

class MySpec extends AnyFlatSpec with ArgumentMatchersSugar with MockitoSugar {
  val s = mock[MyService]
  when(s.crash(any[ValueType[Int]])).thenReturn(3)
}

class MyService {
  def crash(x: ValueType[Int]): Int = 3
}
