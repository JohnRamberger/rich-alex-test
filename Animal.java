//abstract - cannot be instantiated (cannot go Animal a = new Animal("name"))
public abstract class Animal {
    private String name;
    private int weight;

    //super references this v
    public Animal (String name1) {
        this.name = name1;//sets the animals name (this.name) to the given name (name1)
    }

    public Animal (String name1, int weight1) {
        this.name = name1;
        this.weight = weight1;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    //overriding the default toString() method
    public String toString() {
        //concatenation -- connecting/joining 2 strings/values
        // "a" + "b" = "ab"
        // "name" + "weight" = "nameweight"
        // "name: name, weight: weight"
        return "name: " + name + ", weight: " + weight;
    }
}
