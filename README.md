# Leaderboard

A simple Java console application demonstrating the use of `TreeMap` for an auto-sorted leaderboard.

## Overview

This project implements a `Leaderboard` class that keeps track of players and their scores. It uses a `TreeMap` to automatically sort scores in descending order and supports:

- Adding new players with scores
- Updating existing player scores efficiently
- Handling multiple players with the same score
- Displaying the leaderboard in sorted order

The `LeaderboardApp` class contains the `main` method demonstrating these features.

## How to Run

1. Compile the project in your IDE (e.g., IntelliJ, Eclipse)
2. Run the LeaderboardApp class
3. Observe the console output displaying the sorted leaderboard.

## Sample Output
>🏆 Leaderboard: <br>
>Alice - 80 <br>
>Bob - 75 <br>
>Dave - 75 <br>
>Charlie - 60

## Concepts Demonstrated
- TreeMap with custom ordering

- Managing collections of players per score

- Efficient update and lookup using auxiliary map

- Iterating with entrySet() and Java Streams


## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to enhance this leaderboard by adding features like persistence, user input, or ranking display!
