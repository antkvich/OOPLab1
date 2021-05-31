package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Main extends Application {

    private static FiguresList figures;

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        root.getChildren().add(canvas);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        figures.drawFigures(graphicsContext);

        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("MAIN");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        initializeList();
        launch();
    }

    private static void initializeList() {
        figures = new FiguresList();
        figures.add(new Circle(new Point(50, 100), Paint.valueOf("red"), 70));
        figures.add(new Square(new Point(285, 270), Paint.valueOf("red"), 100));
        figures.add(new Rectangle(new Point(205, 300), Paint.valueOf("red"), 30, 90));

        figures.add(new Oval(new Point(190, 90), Paint.valueOf("red"), 90, 20));
        figures.add(new Line(new Point(185, 170), new Point(250, 170)));

    }
}