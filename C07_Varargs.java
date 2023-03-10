package day26_DateTime_Varargs;

public class C07_Varargs {
    public static void main(String[] args) {
        //verilen iki sayiyi toplayıp yazdiran bir method olusturun.
        topla(3,6);//9
        topla(3,4,4); //12



    }
    public static void topla(int a,int b){
        System.out.println(a+b);
    }
    public static void topla(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
