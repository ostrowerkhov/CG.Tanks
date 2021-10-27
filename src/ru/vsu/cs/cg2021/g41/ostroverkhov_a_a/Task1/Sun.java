package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1;

import java.awt.*;

public class Sun extends DrawableObject {

    private int rInner, rOuter, n;
    private Color c;

    public Sun(int x, int y, int width, int height, int rInner, int rOuter, int n, Color c) {
        super(x, y, width, height);
        this.rInner = rInner;
        this.rOuter = rOuter;
        this.n = n;
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        Color oldC = g.getColor();
        g.setColor(c);

        g.fillOval(x - rInner, y - rInner, rInner * 2, rInner * 2);
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double a = da * i;
            double x1 = x + rInner * Math.cos(a);
            double y1 = y + rInner * Math.sin(a);
            double x2 = x + rOuter * Math.cos(a);
            double y2 = y + rOuter * Math.sin(a);
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        }

        g.setColor(oldC);
    }
}
