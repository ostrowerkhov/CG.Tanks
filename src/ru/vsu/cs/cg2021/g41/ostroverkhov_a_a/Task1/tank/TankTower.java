package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.tank;

import ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.DrawableObject;
import ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.Letterings;

import java.awt.*;

public class TankTower extends DrawableObject {
    private final Color c;
    private Letterings letterings;

    public TankTower(int x, int y, int width, int height, Color c, Color colorOfText, String lettering) {
        super(x, y, width, height);
        this.c = c;
        letterings = new Letterings(x + 30, y, width, height, colorOfText, lettering);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(this.c);
        g.fillRect((int) (x * 2.33 - 1.3 * x), (int) (y * 0.89), (int) (width / 1.5), (int) (height / 1.5));
        g.fillRect((int) (x / 4 * 3.87 + 200), (int) (y * 0.9), width / 2, height / 5);
        g.setColor(Color.BLACK);
        letterings.draw(g, w, h);
    }
}
