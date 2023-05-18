import java.util.ArrayList;
public class RentArchive {
    private ArrayList<CarRent> rentData;

    public RentArchive(){
        this.rentData = new ArrayList<CarRent>();
    }

    public void rent(CarRider rider, Car car, int rentDur){
        if(car.isStatus()){
            this.rentData.add(new CarRent(rider, car, rentDur));
            car.setStatus(false);
            System.out.println("Mobil berhasil disewa");
        } else {
            System.out.println("Maaf, mobil sudah disewa");
        }
    }

    public void info(){
        System.out.println("--------------------------");
        System.out.println("   INFORMASI PELANGGAN");
        System.out.println("--------------------------");
        for(CarRent i : this.rentData){
            System.out.printf("Nama Peminjam\t: %s\nTipe mobil\t: %s\nMerk Mobil\t: %s\nNomor Polisi\t: %s\n", i.getRider().getName(), i.getCar().getCarType(), i.getCar().getMerk(), i.getCar().getPolNum());
            System.out.println("--------------------------");
        }
        System.out.println();
    }

}
