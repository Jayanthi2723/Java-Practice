import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTeam {
    @Test
    public void unitTest() {
        Team team = new Team("Lincoln High", "Girls Field Hockey", "Gators");
        assertEquals(team.getHighSchoolName(), "Lincoln High");
        assertEquals(team.getSport(), "Girls Field Hockey");
        assertEquals(team.getTeamName(), "Gators");
        assertEquals(team.MOTTO, "Sportsmanship!");
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("TestTeam");
    }
}
