class Hello {
  String name

  def greet() { "Hello $name !!!" }

  static def main(args){
    def object = new Hello()
    object.setName("Edson")
    println(object.greet())
  }

}
