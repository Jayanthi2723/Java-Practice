// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SoccerGameScoreBoard {
    static int countTeams = 0;

    String sTeamName;
    int goalsInMatch;
    int goalsInExtraTime;
    int goalsInPenaltyShootOut;

    // Constructor chaining
    public SoccerGameScoreBoard(String sTeamName) {
        this(sTeamName, readGoals("regular time"), readGoals("extra time"), readGoals("penalty shootout"));
    }

    public SoccerGameScoreBoard(String sTeamName, int goalsInMatch, int goalsInExtraTime, int goalsInPenaltyShootOut) {
        this.sTeamName = sTeamName;
        this.goalsInMatch = goalsInMatch;
        this.goalsInExtraTime = goalsInExtraTime;
        this.goalsInPenaltyShootOut = goalsInPenaltyShootOut;
        countTeams++;  // Increment the static count of teams each time a team is created
    }

    private static int readGoals(String phase) {
        // This is a placeholder for reading goal input, return 0 in this simulation
        return 0;
    }

    @Override
    public String toString() {
        return "SoccerGameScoreBoard [sTeamName=" + sTeamName + ", goalsInMatch=" + goalsInMatch + ", goalsInExtraTime=" + goalsInExtraTime + ", goalsInPenaltyShootOut=" + goalsInPenaltyShootOut + "]";
    }
}

class SoccerGameResults {
    String sWinnerTeam;
    String sLoserTeam;
    boolean wonByGoalsInMatch;
    boolean wonByGoalsInExtraTime;
    boolean wonByGoalsInPenaltyShootOut;
    boolean drawByTie;
}

public class DisplaySoccerGameResults {
    public static void main(String[] args) {
        SoccerGameScoreBoard manchesterUnited = new SoccerGameScoreBoard("Manchester United", 3, 1, 5);
        SoccerGameScoreBoard liverpool = new SoccerGameScoreBoard("Liverpool", 3, 1, 4);

        SoccerGameResults results = grabGameResults(manchesterUnited, liverpool);
        displayResults(results);

        // Create more teams using constructor chaining
        SoccerGameScoreBoard chelsea = new SoccerGameScoreBoard("Chelsea");
        SoccerGameScoreBoard arsenal = new SoccerGameScoreBoard("Arsenal");

        SoccerGameResults results2 = grabGameResults(chelsea, arsenal);
        displayResults(results2);
    }

    public static SoccerGameResults grabGameResults(SoccerGameScoreBoard team1, SoccerGameScoreBoard team2) {
        SoccerGameResults results = new SoccerGameResults();

        int totalGoalsTeam1 = team1.goalsInMatch + team1.goalsInExtraTime + team1.goalsInPenaltyShootOut;
        int totalGoalsTeam2 = team2.goalsInMatch + team2.goalsInExtraTime + team2.goalsInPenaltyShootOut;

        if (totalGoalsTeam1 > totalGoalsTeam2) {
            results.sWinnerTeam = team1.sTeamName;
            results.sLoserTeam = team2.sTeamName;
            determinePhaseWon(team1, team2, results);
        } else if (totalGoalsTeam1 < totalGoalsTeam2) {
            results.sWinnerTeam = team2.sTeamName;
            results.sLoserTeam = team1.sTeamName;
            determinePhaseWon(team2, team1, results);
        } else {
            results.drawByTie = true;
            results.sWinnerTeam = team1.sTeamName;
            results.sLoserTeam = team2.sTeamName;
        }

        return results;
    }

    private static void determinePhaseWon(SoccerGameScoreBoard winner, SoccerGameScoreBoard loser, SoccerGameResults results) {
        if (winner.goalsInMatch != loser.goalsInMatch) {
            results.wonByGoalsInMatch = true;
        } else if (winner.goalsInExtraTime != loser.goalsInExtraTime) {
            results.wonByGoalsInExtraTime = true;
        } else {
            results.wonByGoalsInPenaltyShootOut = true;
        }
    }

    private static void displayResults(SoccerGameResults results) {
        if (results.wonByGoalsInMatch) {
            System.out.println(results.sWinnerTeam + " vs " + results.sLoserTeam + " and the winner is " + results.sWinnerTeam);
        } else if (results.wonByGoalsInExtraTime) {
            System.out.println(results.sWinnerTeam + " vs " + results.sLoserTeam + " and the winner is " + results.sWinnerTeam + " in Extra Time");
        } else if (results.wonByGoalsInPenaltyShootOut) {
            System.out.println(results.sWinnerTeam + " vs " + results.sLoserTeam + " and the winner is " + results.sWinnerTeam + " in Penalty Shootout");
        } else {
            System.out.println(results.sWinnerTeam + " vs " + results.sLoserTeam + " and the match ended in a tie");
        }
    }
}
