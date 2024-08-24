public class DecimalToBinary {

    public static int decimalToBinary(int decimalNum){
        int binaryNum=0;
        int pow=0;
        while (decimalNum>0) {
            int lastDigit=decimalNum%2;
            binaryNum=binaryNum+(int)(lastDigit*Math.pow(10, pow));
            decimalNum=decimalNum/2;
            pow++;
        }
        return binaryNum;
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(11));
        System.out.println(decimalToBinary(7));
    }
    
}
