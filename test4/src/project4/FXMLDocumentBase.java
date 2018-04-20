package project4;

import javafx.scene.effect.Reflection;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class FXMLDocumentBase extends Pane {

    protected final Text text;
    protected final Reflection reflection;
    protected final Text text0;

    public FXMLDocumentBase() {

        text = new Text();
        reflection = new Reflection();
        text0 = new Text();

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(77.0);
        text.setLayoutY(282.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Java's RACE");
        text.setFont(new Font("System Bold", 76.0));

        reflection.setFraction(0.68);
        reflection.setTopOpacity(0.24);
        text.setEffect(reflection);

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(227.0);
        text0.setLayoutY(555.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("A COP 2805c Prodution.");

        getChildren().add(text);
        getChildren().add(text0);

    }
}
