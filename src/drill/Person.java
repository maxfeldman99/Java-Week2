package drill;

public class Person {
    private String name;
    private long id;
    private int age;

    Person(String name, long id, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    Person() {
        this.name = "John doe";
    }

    Person(String name, long id) {
        this.name = name;
        this.id = id;
        this.age = 30;
    }
    public String getName(){
        return this.name;
    }
    public long getId(){
        return this.id;
    }
    public int age(){
        return this.age;
    }
    public void setName(String name){
        this.name = "John doe";

    }
    public void setId(long id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void addYear()
    {
     this.age++;
    }
    public boolean isBigger(Person other){
        if(other.age > this.age)
            return true;
        else return false;
    }
}
