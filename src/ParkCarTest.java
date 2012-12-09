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
    parkCar=new ParkCar();
    for(int i=0;i<carAdded;i++){
         parkCar.park(String.valueOf(i));
    }
    }

    @Test
    public void should_park_a_car_when_has_pos(){
         InitData(0);
        boolean f = parkCar.park("A");
        int n = parkCar.getAvailableParkNumber();
        Assert.assertEquals(499,n);
    }

    @Test
    public void should_not_park_a_car_when_has_no_pos(){
        InitData(500);
        boolean f = parkCar.park("test");
        Assert.assertEquals(false,f);
    }

    @Test
    public void should_not_get_car_when_empty(){
         InitData(0);
        boolean f = parkCar.getCar("test");
        Assert.assertEquals(false,f);
    }

    @Test
    public void should_get_car_when_not_empty(){
        InitData(1);
        boolean f = parkCar.getCar("0");
        Assert.assertEquals(true,f);
    }

    @Test
    public void should_not_get_car_when_get_again(){
        InitData(1);
        Assert.assertEquals(true,parkCar.getCar("0"));
        Assert.assertEquals(false,parkCar.getCar("0"));
    }

    @Test
    public void should_has_right_park_numbers(){
        InitData(200);
        Assert.assertEquals(300,parkCar.getAvailableParkNumber());
    }

    @Test
    public void should_get_the_car_with_carNumber(){
        InitData(0);
        Assert.assertEquals(true,parkCar.park("test"));
        Assert.assertEquals(true,parkCar.getCar("test"));
    }
}
