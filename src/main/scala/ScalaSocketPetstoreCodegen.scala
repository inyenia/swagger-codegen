import com.wordnik.swagger.codegen.BasicGenerator

import com.wordnik.swagger.core._

object ScalaSocketPetstoreCodegen extends ScalaCodegen {
  def main(args: Array[String]) = generateClient(args)

  override def packageName = "com.wordnik.petstore"
    
  // where to write generated code
  override def destinationDir = "samples/scala-socket/src/main/scala"

  // package for models
  override def modelPackage = Some("com.wordnik.petstore.model")

  // package for api classes
  override def apiPackage = Some("com.wordnik.petstore.api")

  // supporting classes
  override def supportingFiles = List(
    ("apiInvoker-socket.mustache", "samples/scala-socket/src/main/scala/com/wordnik/client", "ApiInvoker.scala"),
    ("pom-socket.mustache", "samples/scala-socket", "pom.xml")
  )
}