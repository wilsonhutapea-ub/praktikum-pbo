public class Tomat extends Tanaman{

    Tomat(int lamaHidup){
        super.setMasaHidup(100);
        super.setLamaHidup(lamaHidup);
        super.setBerbuah(100);
        super.setPerkembangan(0.25);
    }

    public String toString(){
        return super.toString("Tomat");
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
