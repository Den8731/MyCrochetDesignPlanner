package com.cherish.mycrochetdesignplanner;

import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DesignerProfile().setVisible(true);
        });
    }
}