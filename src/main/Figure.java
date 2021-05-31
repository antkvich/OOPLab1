package main;

import javafx.scene.canvas.GraphicsContext;

public abstract class Figure {

    Point startPoint;

    public Figure(Point startPoint) {
        this.startPoint = startPoint;
    }

    public abstract void draw(GraphicsContext graphicsContext);
}
