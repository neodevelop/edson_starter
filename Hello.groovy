class Hello {
  String name

  String greet() { return "Hello " + this.name +  " !!!" }

  static void main(String[] args){
    Hello object = new Hello()
    object.setName("Edson")
    println(object.greet())
  }

}
