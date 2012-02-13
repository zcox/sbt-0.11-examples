import org.specs2.mutable._

class HelloWorldSpec extends Specification {
  "The HelloWorld" should {
    "use the right message" in {
      HelloWorld.message must_== "Hello, World!"
    }
  }
}
