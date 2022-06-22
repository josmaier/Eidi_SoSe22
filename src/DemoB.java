public class DemoB {
    int x = 0;
    public static void methode(int x){
       System.out.println(x);
    }
    public static void methode2(){
        methode(1);
    }
    public static void main(String[] args){
        methode2();
    }
}