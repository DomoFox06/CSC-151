import javax.swing.*;
import java.util.List;

public class CoachesWindow {

    public CoachesWindow(List<TeamMember> team) {

        JFrame frame = new JFrame("Coaches");
        frame.setSize(500, 500);

        DefaultListModel<String> model = new DefaultListModel<>();

        for (TeamMember member : team) {
            if (member.getType().equals("Coach")) {
                model.addElement(member.toString());
            }
        }

        JList<String> list = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(list);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}