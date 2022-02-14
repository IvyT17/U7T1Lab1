import java.util.ArrayList;
public class UsedCarLot
{
    private ArrayList<Car> inventory;

    public UsedCarLot()
    {
        inventory = new ArrayList<Car> ();
    }

    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    public void addCar(Car newCar)
    {
        inventory.add(newCar);
    }

    public boolean swap(int firstCar, int secondCar)
    {
       if (firstCar < inventory.size() && secondCar < inventory.size() && firstCar >= 0 && secondCar >= 0)
       {
           Car car1 = inventory.get(firstCar);
           Car car2 = inventory.get(secondCar);
           inventory.set(firstCar, car2);
           inventory.set(secondCar, car1);
           return true;
       }
       else
       {
           return false;
       }
    }
}
