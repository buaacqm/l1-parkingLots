import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-17
 * Time: 下午2:51
 * To change this template use File | Settings | File Templates.
 */
public class ParkingWorker {
    protected ArrayList<ParkingLot> lots=new ArrayList<ParkingLot>();

    public boolean addLot(ParkingLot lot){
        if(lots.contains(lot))return false;
        lots.add(lot);
        return true;
    }

    public ParkingProof park(Car car,ParkingLot lot){
        if(!lots.contains(lot))return null;
        return lot.getParkCar().park(car);
    }

    public int getTotalParkNumber(){
        int total=0;
        for(ParkingLot lot:lots)total+=lot.getParkCar().getTotalParkNumber();
        return total;
    }

    public int getAvailableParkNumber(){
        int available=0;
        for(ParkingLot lot:lots)available+=lot.getParkCar().getAvailableParkNumber();
        return available;
    }
}
