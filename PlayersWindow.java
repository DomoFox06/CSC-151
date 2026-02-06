package GroupProject_01;

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;

public class PlayersWindow {

    public PlayersWindow() {

        JFrame frame = new JFrame("Players");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Team");

        // Positions
        DefaultMutableTreeNode quarterbacks = new DefaultMutableTreeNode("Quarterbacks");
        DefaultMutableTreeNode linebackers = new DefaultMutableTreeNode("Linebackers");
        DefaultMutableTreeNode tackle = new DefaultMutableTreeNode("Tackle");
        DefaultMutableTreeNode DefensiveEnd = new DefaultMutableTreeNode("Defensive End");
        DefaultMutableTreeNode DefensiveTackle = new DefaultMutableTreeNode("Defensive Tackle");
        DefaultMutableTreeNode Kicker = new DefaultMutableTreeNode("Kicker");
        DefaultMutableTreeNode Safety = new DefaultMutableTreeNode("Safety");
        DefaultMutableTreeNode Center = new DefaultMutableTreeNode("Center");
        DefaultMutableTreeNode FullBack = new DefaultMutableTreeNode("Full Back");
        DefaultMutableTreeNode NoseBack = new DefaultMutableTreeNode("Nose Back");


        // Players
        DefaultMutableTreeNode JalenMilroe = new DefaultMutableTreeNode("Jalen Milroe");
        DefaultMutableTreeNode BoyeMafe = new DefaultMutableTreeNode("Boye Mafe");
        DefaultMutableTreeNode UchennaNwosu = new DefaultMutableTreeNode("Uchenna Nwosu");
        DefaultMutableTreeNode PatrickOConnell = new DefaultMutableTreeNode("Patrick O'Connell");
        DefaultMutableTreeNode ConnorOToole = new DefaultMutableTreeNode("Connor O'Toole");
        DefaultMutableTreeNode AbrahamLucas = new DefaultMutableTreeNode("Abraham Lucas");
        DefaultMutableTreeNode RylieMills = new DefaultMutableTreeNode("Rylie Mills");
        DefaultMutableTreeNode MikeMorris = new DefaultMutableTreeNode("Mike Morris");
        DefaultMutableTreeNode ByronMurphyII = new DefaultMutableTreeNode("Byron Murphy II");
        DefaultMutableTreeNode JasonMyers = new DefaultMutableTreeNode("Jason Myers");
        DefaultMutableTreeNode TyOkada = new DefaultMutableTreeNode("Ty Okada");
        DefaultMutableTreeNode OluOluwatimi = new DefaultMutableTreeNode("Olu Oluwatimi");
        DefaultMutableTreeNode RobbieOuzts = new DefaultMutableTreeNode("Robbie Ouzts");
        DefaultMutableTreeNode BrandonPili = new DefaultMutableTreeNode("Brandon Pili");


        // Build tree
        quarterbacks.add(JalenMilroe);
        linebackers.add(BoyeMafe);
        linebackers.add(UchennaNwosu);
        linebackers.add(PatrickOConnell);
        linebackers.add(ConnorOToole);
        tackle.add(AbrahamLucas);
        DefensiveEnd.add(RylieMills);
        DefensiveEnd.add(MikeMorris);
        DefensiveTackle.add(ByronMurphyII);
        Kicker.add(JasonMyers);
        Safety.add(TyOkada);
        Center.add(OluOluwatimi);
        FullBack.add(RobbieOuzts);
        NoseBack.add(BrandonPili);

        root.add(quarterbacks);
        root.add(linebackers);
        root.add(tackle);
        root.add(DefensiveEnd);
        root.add(DefensiveTackle);
        root.add(Kicker);
        root.add(Safety);
        root.add(Center);
        root.add(FullBack);
        root.add(NoseBack);

        JTree tree = new JTree(root);

        // Click listener
        tree.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode selectedNode =
                (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

            if (selectedNode == null) return;

            String selected = selectedNode.toString();

            if (selected.equals("Jalen Milroe")) {
                new JalenMilroe();
            }
            else if (selected.equals("Boye Mafe")) {
                new BoyeMafe();
            }
            else if (selected.equals("Uchenna Nwosu")) {
                new UchennaNwosu();
            }
            else if (selected.equals("Patrick O'Connell")) {
                new PatrickOConnell();
            }
             else if (selected.equals("Connor O'Toole")) {
                new ConnorOToole();
            }
            else if (selected.equals("Abraham Lucas")) {
                new AbrahamLucas();
            }
            else if (selected.equals("Rylie Mills")) {
                new RylieMills();
            }
            else if (selected.equals("Mike Morris")) {
                new MikeMorris();
            }
            else if (selected.equals("Byron Murphy II")) {
                new ByronMurphyII();
            }
            else if (selected.equals("Jason Myers")) {
                new JasonMyers();
            }
            else if (selected.equals("Ty Okada")) {
                new TyOkada();
            }
            else if (selected.equals("Olu Oluwatimi")) {
                new OluOluwatimi();
            }
            else if (selected.equals("Robbie Ouzts")) {
                new RobbieOuzts();
            }
            else if (selected.equals("Brandon Pili")) {
                new BrandonPili();
            }
        });

        frame.add(new JScrollPane(tree));
        frame.setVisible(true);
    }
}
