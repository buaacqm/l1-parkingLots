import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-11-11
 * Time: 下午3:03
 * To change this template use File | Settings | File Templates.
 */
public class ParkCar {

    private ArrayList<Car> cars=new ArrayList<Car>(500);

    public boolean park(String carNumber){
        if(getAvailableParkNumber() ==0)return false;
        cars.add(new Car(carNumber));
        return true;
    }

    public boolean getCar(String carNumber){
        for(Car c:cars) {
                if(c.getCarNumber().equals( carNumber)){
                cars.remove(c);
                return true;
            }
        }
        return false;
    }

    public int getAvailableParkNumber(){
        return 500-cars.size();
    }
}
