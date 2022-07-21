public class Dog extends Animal {
    //state of an object (values)
    // private int weight = 0;

    //constructor (no type -- type is Dog)
    public Dog (String name, int weight) {
        super(name, weight);
    }

    //second constructor
    public Dog (String name) {
        super(name);
    }
    
    // //getter for name (returns the private value)
    // public String getName() {
    //     return name;
    // }

    // //getter for weight
    // public int getWeight() {
    //     return weight;
    // }
    
    // //setter (sets a private value)
    // public void setName(String name) {
    //     //name = name; both names ^ reference this name
    //     this.name = name;
    // }

    //behaviors (actions)
    public void bark() {
        System.out.println(this.getName() + ": woof"); //name: woof
    }
}
