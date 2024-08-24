package Pattern;

public class CharacterPattern {
    public static void characterPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= i; j++) {

                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        characterPattern(6);
    }
}
