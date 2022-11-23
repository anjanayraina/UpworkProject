import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the height of the board : ");
        int x = s.nextInt();
        System.out.println("Please enter the width of the board : ");
        int y = s.nextInt();
        Game  game = new Game(x,y);
        game.runGame();
    }
}
