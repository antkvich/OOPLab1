package main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class Rectangle extends Square {

    private final double height;

    public Rectangle(Point topLeftPoint, Paint color, double width, double height) {
        super(topLeftPoint, color, width);
        this.height = height;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(color);
        graphicsContext.fillRect(startPoint.getX(), startPoint.getY(), width, height);
    }
}
