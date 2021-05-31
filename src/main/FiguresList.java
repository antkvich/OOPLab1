package main;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public class FiguresList {

    public ArrayList<Figure> figures;

    public FiguresList() {
        figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public void drawFigures(GraphicsContext graphicsContext) {
        for (Figure figure : figures) {
            figure.draw(graphicsContext);
        }
    }
}
