/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-11-11
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    public Car(String carNumber) {
        this.carNumber = carNumber;
    }

    private String carNumber;

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
