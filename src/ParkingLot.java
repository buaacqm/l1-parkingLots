/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-17
 * Time: 下午3:04
 * To change this template use File | Settings | File Templates.
 */
public class ParkingLot {
    private int levelNumber=-1;
    private ParkCar parkCar=null;

    public ParkingLot(){
       parkCar=new ParkCar(100);
    }

    public ParkingLot(int levelNumber,int maxCarNum){
        this.setLevelNumber(levelNumber);
        parkCar=new ParkCar(maxCarNum);
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public ParkCar getParkCar() {
        return parkCar;
    }
}
