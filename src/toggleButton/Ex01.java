package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {

		HBox hbox = new HBox(10);
		ToggleButton toggleBtn = new ToggleButton("Toggle Button"); //눌린모양
		
		hbox.getChildren().addAll(toggleBtn);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.setTitle("togglebutton ex01");
		arg0.show();
		
	}
}
