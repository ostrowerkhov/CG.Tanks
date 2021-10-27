package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1;

import java.awt.*;

public class Ground extends DrawableObject {

    public Ground(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.green);
        g.fillRect(x,y,this.width,this.height);
    }

}
