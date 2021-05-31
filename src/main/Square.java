package main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class Square extends Filled {
    final double width;

    public Square(Point point, Paint color, double width) {
        super(point, color);
        this.width = width;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(color);
        graphicsContext.fillRect(startPoint.getX(), startPoint.getY(), width, width);
    }
}
