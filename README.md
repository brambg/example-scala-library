## Scala 3 example library

How to use this library in your scala3 project:

```
lazy val exampleLibrary = RootProject(uri("https://github.com/brambg/example-scala-library.git"))
```

add
```
  .dependsOn(exampleLibrary)
```
to your project in `build.sbt`

```
libraryDependencies += "nl.scala.example" %% "example-scala-library" % "1.0.0"
```

https://medium.com/@supermanue/how-to-publish-a-scala-library-in-github-bfb0fa39c1e4

https://gist.github.com/davideicardi/89b6d0f816a2dc61ba1c3f5a75268a92

https://gist.github.com/KiyonoKara/f27227a28d0aa7a82bcdefedf00ee1f7
