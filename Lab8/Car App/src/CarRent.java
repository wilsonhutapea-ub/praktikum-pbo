public class CarRent {
    private CarRider rider;
    private Car car;
    private int rentDur;

    public CarRent(CarRider rider, Car car, int rentDur){
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }

    public CarRider getRider(){
        return this.rider;
    }
    public Car getCar(){
        return this.car;
    }
    public int getRentDur(){
        return this.rentDur;
    }
}
