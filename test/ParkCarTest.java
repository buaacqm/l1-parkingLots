import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-11-11
 * Time: 下午3:04
 * To change this template use File | Settings | File Templates.
 */
public class ParkCarTest {

    private ParkCar parkCar=null;

    private void InitData(int carAdded){
        parkCar=new ParkCar(500);
        for(int i=0;i<carAdded;i++){
            Car c=new Car(String.valueOf(i));
            parkCar.park(c);
        }
    }

    @Test
    public void should_park_a_car_when_has_lot(){
        InitData(0);
        Car c=new Car("A");
        ParkingProof p =parkCar.park(c);
        Assert.assertTrue(p!=null);
    }

    @Test
    public void should_not_park_a_car_when_has_no_lot(){
        InitData(500);
        Car c=new Car("A");
        ParkingProof p =parkCar.park(c);
        Assert.assertTrue(p==null);
    }

    @Test
    public void should_get_same_car_with_right_proof(){
        InitData(0);
        Car c=new Car("A");
        ParkingProof p =parkCar.park(c);
        Car temp=parkCar.getCar(p);
        Assert.assertTrue(c==temp);
    }

    @Test
    public void should_not_get_same_car_with_wrong_proof(){
        InitData(0);
        Car c=new Car("A");
        ParkingProof p =parkCar.park(c);
        ParkingProof p2=new ParkingProof();
        Car temp=parkCar.getCar(p2);
        Assert.assertTrue(c != temp);
    }
}