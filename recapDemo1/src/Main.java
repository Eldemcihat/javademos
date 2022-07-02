public class Main {
    public static void main(String[] args) {
        int sayi1 = 4;
        int sayi2 = -69;
        int sayi3 = -31;
        int enBuyuk=0;

        if(sayi1>sayi2)
            enBuyuk= sayi1;
        if(sayi2>sayi1)
            enBuyuk = sayi2;
        if(sayi3>enBuyuk)
            enBuyuk = sayi3;
        System.out.println(enBuyuk);
    }
}