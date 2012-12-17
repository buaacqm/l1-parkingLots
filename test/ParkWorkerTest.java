import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-17
 * Time: 下午2:52
 * To change this template use File | Settings | File Templates.
 */
public class ParkWorkerTest {

    @Test
    public void manager_should_add_parkingBoy(){
        ParkingManager manager=new ParkingManager();
        ParkingBoy boy=new ParkingBoy();
        Assert.assertTrue(manager.addBoy(boy));
    }

    @Test
    public void manager_should_add_lot_to_boy(){
        ParkingManager manager=new ParkingManager();
        ParkingBoy boy=new ParkingBoy();
        ParkingLot lot=new ParkingLot();
        manager.addBoy(boy);
        Assert.assertTrue(manager.addBoyLot(boy,lot));
    }

    @Test
    public void worker_should_park_car_when_not_full(){
        ParkingWorker w=new ParkingWorker();
        ParkingLot lot=new ParkingLot(1,50);
        Car car=new Car("A");
        w.addLot(lot);
        Assert.assertTrue(w.park(car,lot)!=null);
    }

    @Test
    public void should_get_right_lot_car_number(){
        ParkingManager manager=new ParkingManager();
        ParkingLot lot1=new ParkingLot(1,50);
        ParkingLot lot2=new ParkingLot(2,50);
        Car car1=new Car("A");
        Car car2=new Car("B");
        manager.addLot(lot1);
        manager.addLot(lot2);
        manager.park(car1,lot1);
        manager.park(car2,lot1);
        Assert.assertEquals(50,lot1.getParkCar().getTotalParkNumber());
        Assert.assertEquals(48,lot1.getParkCar().getAvailableParkNumber());
    }

    @Test
    public void should_get_right_manager_car_number(){
        ParkingManager manager=new ParkingManager();
        ParkingLot lot1=new ParkingLot(1,50);
        ParkingLot lot2=new ParkingLot(2,50);
        Car car1=new Car("A");
        Car car2=new Car("B");
        manager.addLot(lot1);
        manager.addLot(lot2);
        manager.park(car1,lot1);
        manager.park(car2,lot1);
        Assert.assertEquals(100,manager.getTotalParkNumber());
        Assert.assertEquals(98,manager.getAvailableParkNumber());
    }

    @Test
    public void should_get_right_boy_car_number(){
        ParkingManager manager=new ParkingManager();
        ParkingBoy boy=new ParkingBoy();
        ParkingLot lot1=new ParkingLot(1,50);
        ParkingLot lot2=new ParkingLot(2,50);
        Car car1=new Car("A");
        Car car2=new Car("B");
        manager.addBoy(boy);
        manager.addBoyLot(boy,lot1);
        manager.addBoyLot(boy,lot2);
        boy.park(car1,lot1);
        boy.park(car2,lot1);
        Assert.assertEquals(100,boy.getTotalParkNumber());
        Assert.assertEquals(98,boy.getAvailableParkNumber());
    }
}
