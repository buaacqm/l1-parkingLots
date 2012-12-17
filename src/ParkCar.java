import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-11-11
 * Time: 下午3:03
 * To change this template use File | Settings | File Templates.
 */
public class ParkCar {

    private HashMap<ParkingProof,Car> cars=new HashMap<ParkingProof, Car>();
    private int totalNum=500;

    public ParkCar(int totalNum){
        this.totalNum = totalNum;
    }
    public ParkingProof park(Car car){
        if(getAvailableParkNumber() ==0)return null;
        ParkingProof p=new ParkingProof();
        cars.put(p,car);
        return p;
    }

    public Car getCar(ParkingProof p){
       if(!cars.containsKey(p))return null;
        return cars.get(p);
    }

    public int getAvailableParkNumber(){
        return totalNum -cars.size();
    }

    public int getTotalParkNumber() {
        return totalNum;
    }
}
