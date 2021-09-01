package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex02 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {

		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		Label lb1 = new Label("search.png",new ImageView("/img/search.png"));
		
		Label lb2 = new Label();
		lb2.setText("search");
		lb2.setTextFill(Color.web("#C72F7A"));
		lb2.setGraphic(new ImageView("/img/search.png"));
		
		hbox.getChildren().addAll(lb1,lb2);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.setTitle("label.Ex02");
		arg0.show();
		
	}
}
