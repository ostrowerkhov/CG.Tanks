package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1;

import java.awt.*;

import ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1.tank.Tank;

public class World {
    private Sky sky;
    private Rock rock;
    private Ground ground;
    private Sun sun;
    private Projectile projectile;
    private Tank tank1;
    private Tank tank2;

    public World() {
        sky = new Sky(0, 0, 1920, 1080);
        ground = new Ground(0, 672, 1920, 200);
        sun = new Sun(1500, 0, 80, 80, 20, 55, 13, Color.orange);
        rock = new Rock(410, 423, 250, 250);
        tank1 = new Tank(70, 450, 300, 150, new Color(0, 98, 0), Color.RED, "За Родину!");
        tank2 = new Tank(900, 450, 300, 150, Color.gray, Color.DARK_GRAY, "Guten Morgen!");
        projectile = new Projectile(600, 405, 30, 20);

    }

    public void paint(Graphics2D gr) {
        sky.draw(gr, 1920, 1080);
        sun.draw(gr, 80, 80);
        ground.draw(gr, 1920, 200);
        rock.draw(gr, 250, 250);
        tank1.draw(gr, 300, 150);
        tank2.draw(gr, 450, 150);
        projectile.draw(gr, 30, 20);
    }
}
