public class Cat extends Animal {
    // public abstract class Animal {
    //     private String name;
    //     public Animal (String name1) {
    //         this.name = name1;//sets the animals name (this.name) to the given name (name1)
    //     }
    
    //     public String getName() {
    //         return name;
    //     }
    // }
    

    public Cat (String name) {
        super(name);
    }

    public Cat (String name, int weight) {
        super(name, weight);
    }
}
