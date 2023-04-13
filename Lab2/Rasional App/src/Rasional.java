public class Rasional {
    private int pembilang, penyebut;
    
    public Rasional() {
        pembilang=0;
        penyebut=0;
    }
    
    public Rasional(int pbl, int pyb) {
        pembilang=pbl;
        penyebut=pyb;
    }
    
    //oprator >
    public boolean moreThan (Rasional z) {
        return (pembilang * z.penyebut > penyebut * z.pembilang);
    }
    
    //operator <
    public boolean lessThan(Rasional z) {
        return (pembilang * z.penyebut < penyebut * z.pembilang);
    }
    
    //operator <=
    public boolean lessThanOrEqualTo(Rasional z) {
        return (pembilang * z.penyebut <= penyebut * z.pembilang);
    }
    
    //operator >=
    public boolean moreThanOrEqualTo(Rasional z) {
        return (pembilang * z.penyebut >= penyebut * z.pembilang);
    }
    

    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional() {
        return (penyebut!= 0);
    }
    
    //menyederhanakan bilangan rasional
    public void sederhana() {
        int temp, a, b;
        if (penyebut ==0) {
            return;
        }
        a = (pembilang<penyebut) ? penyebut:pembilang;
        b = (pembilang<penyebut) ? pembilang:penyebut;
        
        // ubah jadi for
        for(; b != 0;){
            temp= a % b;
            a = b;
            b = temp;
        }
        
        pembilang /=a;
        penyebut /=a;

        // while (b != 0) {
        //     temp= a % b;
        //     a = b;
        //     b = temp;
        // }
    }
    
    public double cast() {
        return (penyebut==0.0) ? 0.0 : (double)pembilang / (double)penyebut;
    }
    
        
    //operator Unary- ---> A = -A
    public void negasi() {
        pembilang = - pembilang;
    }
        
    //operator unary += \
    public void unaryPlus(Rasional z) {
        pembilang = pembilang * z.penyebut + penyebut * z.pembilang; 
        penyebut *= z.penyebut;
    }
    
    public void unaryMinus(Rasional z) {
        pembilang = pembilang * z.penyebut - penyebut * z.pembilang; 
        penyebut *= z.penyebut;
    }

    public void unaryMultiply(Rasional z){
        pembilang = pembilang * z.pembilang;
        penyebut = penyebut * z.penyebut;
    }

    public void unaryDivide(Rasional z){
        pembilang = pembilang * z.penyebut;
        penyebut = penyebut * z.pembilang;
    }
    
    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}