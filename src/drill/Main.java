package drill;

public class Main
{
    public static void main(String[] args)
    {
        Person eddie = new Person("eddie",666,24);
        Person shimon = new Person("shimon",1212);
        shimon.setAge(78);


        System.out.println("eddie age is " + eddie.age());
        System.out.println("shimon age is " + shimon.age());

        eddie.addYear();
        System.out.println("eddie age after change is" + eddie.age());
        System.out.println(eddie.isBigger(shimon));

    }
}
