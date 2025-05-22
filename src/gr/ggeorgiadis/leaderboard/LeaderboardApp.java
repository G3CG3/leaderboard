package gr.ggeorgiadis.leaderboard;

public class LeaderboardApp {
    public static void main(String[] args) {
        Leaderboard lb = new Leaderboard();

        lb.addOrUpdatePlayer("Alice", 50);
        lb.addOrUpdatePlayer("Bob", 75);
        lb.addOrUpdatePlayer("Charlie", 60);
        lb.addOrUpdatePlayer("Alice", 80); // Updates Alice's score
        lb.addOrUpdatePlayer("Dave", 75);  // Tie score with Bob

        lb.displayLeaderboard();
    }
}
