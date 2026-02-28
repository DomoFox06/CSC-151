import javax.swing.*;
import javax.swing.tree.*;
import java.util.*;

public class PlayersWindow {

    public PlayersWindow(List<TeamMember> team) {

        JFrame frame = new JFrame("Players");
        frame.setSize(500, 500);

        // Root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Players");

        // Map to group players by position
        Map<String, DefaultMutableTreeNode> positionMap = new HashMap<>();

        for (TeamMember member : team) {

            if (member.getType().equals("Player")) {

                String position = member.getPosition();

                // If position doesn't exist yet, create a node
                if (!positionMap.containsKey(position)) {
                    DefaultMutableTreeNode positionNode =
                            new DefaultMutableTreeNode(position);

                    positionMap.put(position, positionNode);
                    root.add(positionNode);
                }

                // Add player under correct position
                DefaultMutableTreeNode playerNode =
                        new DefaultMutableTreeNode(member.getName()
                                + " (#" + member.getNumber() + ")");

                positionMap.get(position).add(playerNode);
            }
        }

        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}