public class BinarayToDecimal {

    public static int binarayToDecimal(int binaryNum){
        int dn=binaryNum;
        int pow=0;
        int decimalNum=0;
             while (binaryNum>0) {
                int lastDigit=binaryNum%10;    //  to find last digit
                
                 decimalNum=decimalNum+(int)(lastDigit*Math.pow(2, pow));
                 binaryNum=binaryNum/10;   
                pow++;                                                
             }

             System.out.println("decimal of "+dn +" = "+ decimalNum);



             return decimalNum;
    }
    public static void main(String[] args) {
        System.out.println(binarayToDecimal(1000));
    }
}
