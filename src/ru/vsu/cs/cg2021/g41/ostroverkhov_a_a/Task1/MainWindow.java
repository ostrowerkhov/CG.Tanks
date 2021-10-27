package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel dp;

    public MainWindow() throws HeadlessException {
        dp = new DrawPanel();
        add(dp);
    }
}
