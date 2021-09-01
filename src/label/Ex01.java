package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		Label lb1 = new Label("lb1 test");
		lb1.setPrefSize(200, 30);
		lb1.setStyle("-fx-background-color:#FFEF85");
		lb1.setAlignment(Pos.CENTER_RIGHT);
		
		hbox.getChildren().addAll(lb1);
		hbox.setPrefSize(300, 200);
		hbox.setStyle("-fx-background-color:#B3E148");
		
		arg0.setScene(new Scene(hbox));
		arg0.setTitle("label.Ex01");
		arg0.show();
		
	}
}
