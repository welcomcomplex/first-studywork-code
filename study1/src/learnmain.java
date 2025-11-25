import java.util.Random;

public class learnmain {
    public static void main(String[] args) {
        int[] temp = new int[16];
        int s = 0;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i + 1;
        }
        Random r = new Random();
        for (int i = 0; i < temp.length; i++) {
            int randomIndex = r.nextInt(temp.length);
            s = temp[i];
            temp[i] = temp[randomIndex];
            temp[randomIndex] = s;
        }
        int[][] brr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                brr[i][j] = temp[i * 4 + j];
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
