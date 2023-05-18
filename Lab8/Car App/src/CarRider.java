public class CarRider {
    private String name;
    private int age;
    private String phone;

    public CarRider(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setAge(int age) {
        this.age = age;
    }
    

}
