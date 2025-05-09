package nl.scala.example

object HelloFactory {
  def greet(name: String): Unit =
    println(s"Hello $name")

  def curse(name: String): Unit =
    println(s"Go take a long walk off a short pier, $name!")
}
