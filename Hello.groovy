class Hello {
  String name

  String greet() { "Hello $name !!!" }

  static void main(String[] args){
    Hello object = new Hello()
    object.setName("Edson")
    println(object.greet())
  }

}
