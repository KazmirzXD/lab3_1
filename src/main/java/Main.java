
public class Main {
    public static void main(String[] args) {
        int szer = 7;
        int wys = 5;
        for (int i = 0; i < wys; i++) {
            for (int j = 0; j < szer; j++) {
                if (i == 0 || i == wys - 1 || j == 0 || j == szer - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}