public class Hello {
  private String name
  public void setName(String name){ this.name = name }
  public String getName(){ return this.name }

  public String greet() { return "Hello " + this.name +  " !!!" }

  public static void main(String[] args){
    Hello object = new Hello()
    object.setName("Edson")
    System.out.println(object.greet())
  }

}
