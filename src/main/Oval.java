package main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class Oval extends Circle {

    double radius2;

    public Oval(Point point, Paint color, double radius, double radius2) {
        super(point, color, radius);
        this.radius2 = radius2;
    }


    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(color);
        graphicsContext.fillOval(startPoint.getX(), startPoint.getY(), radius, radius2);
    }

}
