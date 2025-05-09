package nl.scala.example


import org.scalatest.funsuite.*

class HelloFactoryTestSuite extends AnyFunSuite {

  test("greet") {
    HelloFactory.greet("world")
    assert(true)
  }
  test("curse") {
    HelloFactory.curse("Donald")
    assert(true)
  }

}