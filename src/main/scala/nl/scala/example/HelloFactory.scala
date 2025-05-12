package nl.scala.example

object HelloFactory {
  def greet(name: String): Unit =
    println(s"Hello $name")

  def curse(name: String): Unit =
    println(s"Go take a long walk off a short pier, $name!")

  def question(name: String): Unit =
    println(s"How are you today, $name?")
}
