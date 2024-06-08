import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestGame {
    @Test
    public void unitTest() {
        Team team1 = new Team("Roosevelt High", "Girls Basketball", "Dolphins");
        Team team2 = new Team("Hoover High", "Girls Basketball", "Tigers");
        Game game = new Game(team1, team2, "7 PM");
        Team t1 = game.getTeam1();
        Team t2 = game.getTeam2();
        assertEquals(game.getTime(), "7 PM");
        assertEquals(t1.getHighSchoolName(), "Roosevelt High");
        assertEquals(t1.getSport(), "Girls Basketball");
        assertEquals(t1.getTeamName(), "Dolphins");
        assertEquals(t2.getHighSchoolName(), "Hoover High");
        assertEquals(t2.getSport(), "Girls Basketball");
        assertEquals(t2.getTeamName(), "Tigers");
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("TestGame");
    }
}
