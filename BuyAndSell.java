public class BuyAndSell {
    public static int buyAndSell(int stock[]) {
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int i=0; i<stock.length; i++){
            if(buyPrice<stock[i]){
                int todayProfit=stock[i]-buyPrice;
                maxProfit=Math.max(todayProfit, maxProfit);
            }else{
                buyPrice=stock[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
            int arr[]={7,1,5,3,6,4};
            System.out.println(buyAndSell(arr));
    }
}
