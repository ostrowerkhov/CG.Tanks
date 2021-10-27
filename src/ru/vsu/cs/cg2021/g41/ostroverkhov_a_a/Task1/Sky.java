package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1;

import java.awt.*;

public class Sky extends DrawableObject {

    public Sky(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.CYAN);
        g.fillRect(x,y,this.width,this.height);
    }
}
