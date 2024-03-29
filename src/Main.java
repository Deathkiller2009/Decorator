import ru.deathkiller2009.DefaultCar;
import ru.deathkiller2009.CopCar;
import ru.deathkiller2009.RamCar;
import ru.deathkiller2009.SpeedCar;

public class Main {
    public static void main(String[] args) {
        DefaultCar defaultCar = new DefaultCar();
        System.out.println(defaultCar.drive());
        CopCar car = new CopCar(new DefaultCar());
        System.out.println(car.drive());
        CopCar copCar = new CopCar(new RamCar(new SpeedCar(new DefaultCar())));
        System.out.println(copCar.drive());
    }
}