public class Stroberi extends Tanaman{

    Stroberi(int lamaHidup){
        super.setMasaHidup(60);
        super.setLamaHidup(lamaHidup);
        super.setBerbuah(150);
        super.setPerkembangan(0.35);
    }

    public String toString(){
        return super.toString("Stroberi");
    }

    @Override
    public void berkembang() {
        if(super.getProsesBerbuah() >= super.getBerbuah()){
            super.setBuah(super.getBuah() + 1);
            super.setProsesBerbuah(super.getProsesBerbuah() - super.getBerbuah());
        }
    }

    @Override
    public void treatment() {
        super.setPerkembangan(super.getPerkembangan()+0.05);
    }
    
}
