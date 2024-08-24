package Pattern;

public class InvertedStar {
    public static void invertedStar(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void invertedStar2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
       invertedStar(4);
       invertedStar2(4);
    }
}
