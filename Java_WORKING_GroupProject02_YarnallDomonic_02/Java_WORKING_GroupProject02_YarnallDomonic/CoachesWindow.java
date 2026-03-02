import javax.swing.*;
import javax.swing.tree.*;
import java.util.*;

public class CoachesWindow {

    public CoachesWindow(List<TeamMember> team) {

        JFrame frame = new JFrame("Coaches");
        frame.setSize(500, 500);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Coaches");

        Map<String, DefaultMutableTreeNode> positionMap = new HashMap<>();

        for (TeamMember member : team) {

            if (member.getType().equals("Coach")) {

                String position = member.getPosition();

                if (!positionMap.containsKey(position)) {
                    DefaultMutableTreeNode positionNode =
                            new DefaultMutableTreeNode(position);
                    positionMap.put(position, positionNode);
                    root.add(positionNode);
                }

                DefaultMutableTreeNode coachNode =
                        new DefaultMutableTreeNode(
                                member.getName() + " (" + member.getRole() + ")"
                        );

                positionMap.get(position).add(coachNode);
            }
        }

        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
