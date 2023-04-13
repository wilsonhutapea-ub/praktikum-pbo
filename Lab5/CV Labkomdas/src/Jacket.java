public class Jacket {
    String material;
    final int price;
    Jacket(String material, int price){
        this.material = material;
        this.price = price;
    }

    int checkDiscount(int orderCount){
        int promoPrice = 0;
        switch(material){
            case "A":{
                if(orderCount > 100){
                promoPrice = 95000;
                }
            }
            case "B":{
                if(orderCount > 100){
                    promoPrice = 120000;
                }
            }
            case "C":{
                if(orderCount > 100){
                    promoPrice = 160000;
                }
            }
        }
        return promoPrice;
    }
}
