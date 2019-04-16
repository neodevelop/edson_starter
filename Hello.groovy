class Hello {
  String name

  def greet() { "Hello $name !!!" }

  static main(args){
    def object = new Hello()
    object.setName("Edson")
    println object.greet()
  }

}
