package gr.ggeorgiadis.leaderboard;

import java.util.*;

public class Leaderboard {
    private final TreeMap<Integer, List<String>> leaderboard;
    private final Map<String, Integer> playerToScore;

    public Leaderboard() {
        this.leaderboard = new TreeMap<>(Collections.reverseOrder()); // Scores in descending order
        this.playerToScore = new HashMap<>();
    }

    public void addOrUpdatePlayer(String player, int newScore) {
        if (playerToScore.containsKey(player)) {
            int oldScore = playerToScore.get(player);
            List<String> playersWithOldScore = leaderboard.get(oldScore);
            playersWithOldScore.remove(player);
            if (playersWithOldScore.isEmpty()) {
                leaderboard.remove(oldScore);
            }
        }

        leaderboard.computeIfAbsent(newScore, k -> new ArrayList<>()).add(player);
        playerToScore.put(player, newScore);
    }

    public void displayLeaderboard() {
        System.out.println("🏆 Leaderboard:");
        for (Map.Entry<Integer, List<String>> entry: leaderboard.entrySet()) {
            int score = entry.getKey();
            for (String player : entry.getValue()) {
                System.out.println(player + " - " + score);
            }
        }
    }
}
