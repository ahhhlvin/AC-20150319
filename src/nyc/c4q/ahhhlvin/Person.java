package nyc.c4q.ahhhlvin;



// This is a 'constructor', if you want to create another person in the class you would call the constructor
public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        // refers to 'age' for Fred
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }


    public static void greet() {   // 'STATIC VOID' is GLOBAL, can be called by the data type, "Person"
        System.out.println("I am speaking for all Persons");
    }


    public static void main(String[] args) {

        int n = 0;
        Person fred = new Person("Fred", 10); // fred is a VARIABLE that has type 'Person' and the constructor, 'new Person("Fred")' creates a new INSTANCE, Fred, that will have its own attributes.

        fred.setAge(28);

        System.out.println(fred.getAge());

        Person bob = fred;                   // The two variables are referencing the SAME object
        bob.setName("John");
        System.out.println(fred.getName());  // this makes the instance 'bob' and 'fred' equal to each other


        Person.greet();


        //
        //
        //


        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);        // compares by 'object' REFERENCE
        System.out.println(s1.equals(s2));   // compares by VALUE (or what it contains)


    }

}







