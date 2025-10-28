
public class PersonCopy {
    String name;
    int age;

    public PersonCopy() { this("", 0); }
    public PersonCopy(String name, int age) { this.name = name; this.age = age; }
    public PersonCopy(PersonCopy other) { this(other.name, other.age); }

    public String toString() { return name + " " + age; }
}
