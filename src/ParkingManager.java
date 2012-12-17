import java.util.ArrayList;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-17
 * Time: 下午2:51
 * To change this template use File | Settings | File Templates.
 */
public class ParkingManager extends ParkingWorker  {
    private ArrayList<ParkingBoy> boys=new ArrayList<ParkingBoy>();

    public boolean addBoy(ParkingBoy boy){
        if(boys.contains(boy))return false;
        boys.add(boy);
        return true;
    }

    public boolean addBoyLot(ParkingBoy boy,ParkingLot lot){
        if(!boys.contains(boy))return false;
        return boy.addLot(lot);
    }
}
