class Car{
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;

    public Car(){}
    public Car(String carType, String polNum, String merk, boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }
    
    public String getCarType() {
        return this.carType;
    }
    public String getPolNum(){
        return this.polNum;
    }
    public String getMerk(){
        return this.merk;
    }
    public boolean isStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public String toString(){
        return String.format("Car Type: %s\nPolice Number: %s\nMerk: %s\nStatus: %b\n", this.getCarType(), this.getPolNum(), this.getMerk(), this.isStatus());
    }
    
}