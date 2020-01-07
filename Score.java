import java.io.DataInputStream;

public class Score {
    static void add(DataInputStream dis) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private static int wins;
    private static int losses;

    public Score(int awins, int alosses) {
        wins = awins;
        losses = alosses;
    }
    public static int getWins() {
        wins += 1;
        return wins;
    }
    public static int getLosses() {
        return losses;
    }
    public static int getWinss() {
        return wins;
    }
    public static int getLossess() {
        losses += 1;
        return losses;
    }
    public static void setWins(int a) {
        wins = a;
    }
    public static void setLosses(int a) {
        losses = a;
    }
    @Override
    public  String toString() {
        return "" + wins + losses;
    }
}
