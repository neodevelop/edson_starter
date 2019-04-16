public class Hello {
  String name

  public String greet() { return "Hello " + this.name +  " !!!" }

  public static void main(String[] args){
    Hello object = new Hello()
    object.setName("Edson")
    println(object.greet())
  }

}
