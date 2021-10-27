package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1;

import java.awt.*;



public class Projectile extends DrawableObject {
    public Projectile(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.darkGray);
        g.fillRect(x, y, width, height);
        g.setStroke(new BasicStroke(1));
        g.drawLine(x-30, y+16, x, y+16);
        g.drawLine(x-100, y+11, x, y+11);
        g.drawLine(x-30, y+6, x, y+6);

    }
}
