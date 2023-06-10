public class Persik extends Tanaman{

    Persik(int lamaHidup){
        super.setMasaHidup(180);
        super.setLamaHidup(lamaHidup);
        super.setBerbuah(250);
        super.setPerkembangan(0.15);
    }

    public String toString(){
        return super.toString("Persik");
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
        super.setPerkembangan(super.getPerkembangan()+0.025);
    }
    
}
