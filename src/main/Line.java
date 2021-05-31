package main;

import javafx.scene.canvas.GraphicsContext;

public class Line extends Figure {

    Point point2;

    public Line(Point point, Point point2) {
        super(point);
        this.point2 = point2;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeLine(startPoint.getX(), startPoint.getY(), point2.getX(), point2.getY());
    }
}