public class TennisGame {
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE = "Advantage ";
    public static final String WIN = "Win for ";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return handleEqualScores(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getWinner(player1Score, player2Score);
        } else {
            return getCurrentScore(player1Score, player2Score);
        }
    }

    private static String handleEqualScores(int player1Score) {
        switch (player1Score) {
            case 0:
                return LOVE + "-All";
            case 1:
                return FIFTEEN + "-All";
            case 2:
                return THIRTY + "-All";
            case 3:
                return FORTY + "-All";
            default:
                return DEUCE;
        }
    }

    private static String getCurrentScore(int player1Score, int player2Score) {
        return getScoreName(player1Score) + "-" + getScoreName(player2Score);
    }

    private static String getWinner(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) {
            return ADVANTAGE + "player1";
        } else if (scoreDifference == -1) {
            return ADVANTAGE + "player2";
        } else if (scoreDifference >= 2) {
            return WIN + "player1";
        } else {
            return WIN + "player2";
        }
    }

    private static String getScoreName(int score) {
        switch (score) {
            case 0:
                return LOVE;
            case 1:
                return FIFTEEN;
            case 2:
                return THIRTY;
            case 3:
                return FORTY;
            default:
                return "";
        }
    }
}
