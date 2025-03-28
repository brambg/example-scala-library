package nl.scala.example


import org.scalatest.funsuite.*

class HelloFactoryTestSuite extends AnyFunSuite {

  test("hello-world") {
    HelloFactory.greet("world")
    assert(true)
  }

}