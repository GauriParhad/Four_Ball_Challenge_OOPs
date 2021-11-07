package com.tw.fourball;

public class Ball {
    private final float y;
    private final int speed;
    private float x;
    private PApplet PApplet;

    public Ball(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void move() {
        x += speed;
    }

    public void draw(PApplet pApplet) {
        this.PApplet = pApplet;
        pApplet.ellipse(x, y, 10, 10);
    }
}
