class Hello {
  String name
  def greet() { "Hello $name !!!" }
}

def object = new Hello(name: "MakingDevs")
println object.greet()

person = new Person(name: "Edson", bornDate: new Date())
println person
