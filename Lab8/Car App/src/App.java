public class App {
    public static void main(String[] args) throws Exception {
        CarData data = new CarData();
        data.addCar("Cybertruck", "LGD 121", "Tesla");
        data.addCar("R1T", "A12 548", "Rivian");
        data.addCar("Roadster", "CA 1212", "Tesla");
        data.addCar("Ioniq 5", "ALB 871", "Hyundai");

        CarRider yiLongMa = new CarRider("Yi Long Ma", 30, "085112345678");
        CarRider maoJedong = new CarRider("Mao Jedong", 82, "085109876543");
        CarRider mrSmith = new CarRider("Mr Smith", 30, "1234567");
        CarRider wilz = new CarRider("Wilz", 19, "085156274871");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.rent(yiLongMa, (Car)data.getCarList().get(0), 3);
        arsip.rent(maoJedong, (Car)data.getCarList().get(1), 7);
        arsip.rent(mrSmith, (Car)data.getCarList().get(2), 14);
        arsip.rent(wilz, (Car)data.getCarList().get(3), 10);
        arsip.rent(wilz, (Car)data.getCarList().get(3), 23);
        System.out.println();

        arsip.info();

    }
}
