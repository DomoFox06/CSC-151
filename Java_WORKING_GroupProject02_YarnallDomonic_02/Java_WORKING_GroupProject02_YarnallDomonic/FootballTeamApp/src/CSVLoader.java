import java.io.*;
import java.util.*;

public class CSVLoader {

    public static List<TeamMember> loadTeam(String fileName) {
        List<TeamMember> team = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            br.readLine(); // skip header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0].trim();
                String position = data[1].trim();
                String number = data[2].trim();

                // Since this file only contains players:
                team.add(new TeamMember("Player", name, position, number, ""));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return team;
    }
}