import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner tb = new Scanner(System.in);

        int[] heltal = new int[4];

        System.out.println("Vad är det 1sta talet: ");
        int a = tb.nextInt();
        System.out.println("Vad är det 2sta talet: ");
        int b = tb.nextInt();
        System.out.println("Vad är det 3sta talet: ");
        int c = tb.nextInt();
        System.out.println("Vad är det 4sta talet: ");
        int d = tb.nextInt();

        heltal[0] = a;
        System.out.println(heltal[0]);
        heltal[1] = b;
        System.out.println(heltal[1]);
        heltal[2] = c;
        System.out.println(heltal[2]);
        heltal[3] = d;
        System.out.println(heltal[3]);
        
    }
}

