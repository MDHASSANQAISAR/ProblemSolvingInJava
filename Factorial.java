public class Factorial {
    public static int fact(int num){
        int fact=1;
        if(num==1 || num==0){
            return 1;
        }
       
        for(int i=1; i<=num; i++){
               fact=fact*i; 
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(fact(1));
        System.out.println(fact(0));
        System.out.println(fact(6));
    }
}
