import java.util.List;

public class Main {

    public static void main(String[] args) {

       List<TeamMember> team = CSVLoader.loadTeam("FootballTeamApp/team.csv");

        new MainWindow(team);
    }
}