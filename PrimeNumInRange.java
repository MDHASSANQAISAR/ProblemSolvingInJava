public class PrimeNumInRange {


    public static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        for(int i=2; i<number; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

     
    public static void primeNumInRange(int startiingNum, int endingNum){
        for(int i=startiingNum; i<=endingNum; i++){
              if(isPrime(i)){
                System.out.print(i+" ");
              }
        }
    }
    public static void main(String[] args) {
        primeNumInRange(20, 100);
    }
}
