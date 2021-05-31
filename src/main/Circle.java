package main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class Circle extends Filled {

    double radius;

    public Circle(Point point, Paint color, double radius) {
        super(point, color);
        this.radius = radius;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(color);
        graphicsContext.fillOval(startPoint.getX(), startPoint.getY(), radius, radius);
    }
}
