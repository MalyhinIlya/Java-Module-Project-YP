import java.util.ArrayList;
import java.util.List;

public class Race {

    private String liderName = "";
    private int distance;

    public void checkLider(Car car) {
        if (car.getSpeed() * 24 > distance) {
            liderName = car.getName();
            distance = car.getSpeed() * 24;
        }
    }

    public void printLiderName() {
        System.out.println("Самая быстрая машина: " + liderName);
    }
}
