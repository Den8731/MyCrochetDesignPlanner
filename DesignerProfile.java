package com.cherish.mycrochetdesignplanner;

import javax.swing.*;
import java.awt.*;

public class DesignerProfile extends JFrame {



        private CardLayout cardLayout;
        private JPanel mainPanel;

        public DesignerProfile() {
            setTitle("Stitch Studio - Crochet Planner");
            setSize(1100, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            // Main layout
            setLayout(new BorderLayout());

            // Sidebar
            JPanel sidebar = new JPanel();
            sidebar.setPreferredSize(new Dimension(220, 700));
            sidebar.setLayout(new GridLayout(8, 1, 5, 5));

            // Main workspace
            cardLayout = new CardLayout();
            mainPanel = new JPanel(cardLayout);

            // Navigation buttons
            String[] pages = {
                    "Dashboard",
                    "Projects",
                    "Pattern Editor",
                    "Tasks",
                    "Yarn Inventory",
                    "Stitch Library",
                    "Inspiration",
                    "Calendar"
            };

            for (String page : pages) {
                JButton button = new JButton(page);
                sidebar.add(button);

                // Add page to workspace
                JPanel panel = new JPanel(new BorderLayout());
                panel.add(
                        new JLabel(page, SwingConstants.CENTER),
                        BorderLayout.CENTER
                );

                mainPanel.add(panel, page);

                button.addActionListener(e ->
                        cardLayout.show(mainPanel, page)
                );
            }

            add(sidebar, BorderLayout.WEST);
            add(mainPanel, BorderLayout.CENTER);

            // Start at Dashboard
            cardLayout.show(mainPanel, "Dashboard");
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                new DesignerProfile().setVisible(true);
            });
        }

}
