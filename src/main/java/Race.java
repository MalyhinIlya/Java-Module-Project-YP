public class Race {

    private String liderName = "";
    private int distance;

    public void checkLider(Car car) {
        if (car.speed * 24 > distance) {
            liderName = car.name;
            distance = car.speed * 24;
        }
    }

    public void printLiderName() {
        System.out.println("Самая быстрая машина: " + liderName);
    }
}
