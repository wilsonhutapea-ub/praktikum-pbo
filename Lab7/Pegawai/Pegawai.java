class Pegawai{
    private String nama;
    private String noKTP;

    public Pegawai(){}
    public Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama(){
        return this.nama;
    }
    public String getNoKTP(){
        return this.noKTP;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNoKTP(String noKTP){
        this.noKTP = noKTP;
    }

    public void sayHello(){
        System.out.println("Hello, I am Pegawai.");
    }
    public void sayBye(){
        System.out.println("Bye!\n");
    }

    public String toString(){
        return String.format("Nama\t\t: %s\nNo KTP\t\t: %s\n",this.nama,this.noKTP);
    }
}