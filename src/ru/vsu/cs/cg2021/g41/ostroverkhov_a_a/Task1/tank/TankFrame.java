package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.tank;

import ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.DrawableObject;

import java.awt.*;

public class TankFrame extends DrawableObject {

    private final Color c;

    public TankFrame(int x, int y, int width, int height, Color c) {
        super(x, y, width, height);
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(this.c);
        g.fillRect(x, y+height/3, width, height);
        /* g.setStroke(new BasicStroke(3));
        g.fillRect((int) (x/1.4), y, width, (int) (height/1.15));
        g.setColor(Color.DARK_GRAY);
        for (Wheel i: wheels) {
            i.draw(g, w, h);
        } */
    }
}
