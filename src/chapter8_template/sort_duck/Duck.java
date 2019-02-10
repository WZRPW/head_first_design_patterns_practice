package chapter8_template.sort_duck;

public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weights " + weight;
    }

    @Override
    public int compareTo(Duck object) {
        Duck that = object;
        if (!(that instanceof Duck)) {
            throw new IllegalArgumentException("input object not a Duck");
        }
        return (this.weight == that.weight) ? 0 : ((this.weight > that.weight) ? 1 : -1);
    }
}
