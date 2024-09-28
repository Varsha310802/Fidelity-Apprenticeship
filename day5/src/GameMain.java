import java.util.Scanner;
public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a game: ");
        String gamename = sc.next();
        System.out.println("Enter the maximum number of players: ");
        int n1 = sc.nextInt();
        Game game1 = new Game(gamename, n1);
        System.out.println("Enter a game that has time limit: ");
        String gamename2 = sc.next();
        System.out.println("Enter the maximum number of players: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the time limit in minutes");
        int timelimit = sc.nextInt();
        System.out.println(game1.toString());
        GameWithTimeLimit timedgame= new GameWithTimeLimit(gamename2, n2, timelimit);
        System.out.println(timedgame.toString());
    }
}
