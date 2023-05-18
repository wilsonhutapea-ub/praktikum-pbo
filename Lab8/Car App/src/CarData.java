import java.util.ArrayList;

public class CarData {
    private ArrayList<Car> carList = new ArrayList<Car>();

    public void addCar(String carType, String polNum, String merk){
        this.carList.add(new Car(carType, polNum, merk, true));
    }
    
    public void listOfCar(){
        System.out.println("--------------------------");
        System.out.println("       DAFTAR MOBIL");
        System.out.println("--------------------------");
        for(Car i : this.carList){
            System.out.printf("Merk mobil\t: %s\nTipe Mobil\t: %s\nNomor Polisi\t: %s\n", i.getMerk(), i.getCarType(), i.getPolNum());
            System.out.println("--------------------------");
        }
        System.out.println();
    }

    public ArrayList<Car> getCarList(){
        return this.carList;
    }
}
