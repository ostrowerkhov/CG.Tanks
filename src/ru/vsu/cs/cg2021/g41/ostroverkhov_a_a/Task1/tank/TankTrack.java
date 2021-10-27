package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.tank;

import ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.DrawableObject;

import java.awt.*;
import java.util.ArrayList;

public class TankTrack extends DrawableObject {

    private final ArrayList<Wheel> wheels = new ArrayList<>();

    public TankTrack(int x, int y, int width, int height) {
        super(x, y, width, height);
        for (int i = 0; i < 4; i++) {
            this.wheels.add(new Wheel(x + i * 80, (int) (y + height * 1.15), width / 6, (int) (height / 3)));
        }
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(Color.DARK_GRAY);
        for (Wheel i : wheels) {
            i.draw(g, w, h);
        }
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.drawLine(x+25, (int)(y+height*1.15), x-35+width, (int)(y+height*1.15));
        g.drawArc(x,(int)(y+height*1.15), width/6, height/3, 90, 180);
        g.drawLine(x+25, (int)(y+height*1.485), x-35+width, (int)(y+height*1.485));
        g.drawArc(x-60+width,(int)(y+height*1.15), width/6, height/3, 270, 180);


    }
}

/* g.drawOval(x - 20, (int) (y + height * 1.07), width + 30, (int) (height / 2.14)); */
