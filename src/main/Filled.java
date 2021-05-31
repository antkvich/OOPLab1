package main;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class Filled extends Figure {

    Paint color;

    public Filled(Point point, Paint color) {
        super(point);
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
    }
}