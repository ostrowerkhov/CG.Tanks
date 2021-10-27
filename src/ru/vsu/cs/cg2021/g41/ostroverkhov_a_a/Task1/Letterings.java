package ru.vsu.cs.cg2021.g41.ostroverkhov_a_a.Task1;

import java.awt.*;

public class Letterings extends DrawableObject {

    private String lettering;
    private Color colorOfText;

    public Letterings(int x, int y, int width, int height, Color colorOfText, String lettering) {
        super(x, y, width, height);
        this.colorOfText = colorOfText;
        this.lettering = lettering;
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        Font font = new Font("Arial", Font.BOLD, 26);
        g.setFont(font);
        g.setColor(colorOfText);
        g.drawString(lettering, x, y);
    }
}
