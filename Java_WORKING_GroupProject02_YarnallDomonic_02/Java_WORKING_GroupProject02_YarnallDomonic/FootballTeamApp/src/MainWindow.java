import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class MainWindow {

    public MainWindow(List<TeamMember> team) {

        JFrame frame = new JFrame("Football Team Manager");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1));

        JButton playersBtn = new JButton("Players");
        JButton coachesBtn = new JButton("Coaches");
        JButton staffBtn = new JButton("Staff");

        playersBtn.addActionListener(e -> new PlayersWindow(team));
        coachesBtn.addActionListener(e -> new CoachesWindow(team));
        staffBtn.addActionListener(e -> new StaffWindow(team));

        frame.add(playersBtn);
        frame.add(coachesBtn);
        frame.add(staffBtn);

        frame.setVisible(true);
    }
}