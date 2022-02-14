import java.util.ArrayList;
public class CatRunner
{
    public static void main (String[] args)
    {
        ArrayList<Cat> cats = new ArrayList<Cat> ();
        Cat cat1 = new Cat("Cooky");
        Cat cat2 = new Cat("Suga");
        Cat cat3 = new Cat("Yoongles");
        Cat cat4 = new Cat("Toby");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.set(2, cat4);
        cat2.setName("Suga Meow");
        cats.add(new Cat("Sam"));
        System.out.println(cats);
    }
}
