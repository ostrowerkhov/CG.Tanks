package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.tank;

import ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.DrawableObject;

import java.awt.*;

public class Tank extends DrawableObject {
    private TankTower tankTower;
    private TankFrame tankFrame;
    private TankTrack tankTrack;
    private String lettering;

    public Tank(int x, int y, int width, int height, Color c, Color colorOfText, String lettering) {
        super(x, y, width, height);
        this.lettering = lettering;

        tankTower = new TankTower(this.x, this.y, this.width, this.height, c, colorOfText, this.lettering);
        tankFrame = new TankFrame(this.x, this.y, this.width, this.height, c);
        tankTrack = new TankTrack(this.x, this.y, this.width, this.height);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        tankTower.draw(g, w, h);
        tankFrame.draw(g, w, h);
        tankTrack.draw(g, w, h);

    }
}
