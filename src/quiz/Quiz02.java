package quiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz02 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {

		HBox hbox = new HBox();
		
		Label search = new Label("Search",new ImageView("/img/search.png"));
		search.setTextFill(Color.web("#4374D9"));
		search.setFont(new Font(30));
		search.setOnMouseEntered(e -> {
			search.setScaleX(2.0);	
			search.setScaleY(2.0);	
		});
		search.setOnMouseExited(e -> {
			search.setScaleX(1.0);
			search.setScaleY(1.0);
		});
		
		Label values = new Label("values");
		values.setFont(new Font(50));
		values.setRotate(270);
		values.setTranslateY(60);
		values.setOnMouseEntered(e-> {
			values.setScaleX(2.0);
			values.setScaleY(2.0);
		});
		values.setOnMouseExited(e->{
			values.setScaleX(1.0);
			values.setScaleY(1.0);
		});
		
		Label wrap = new Label("A label that needs\nto be wrapped");
		wrap.setTranslateY(80);
		wrap.setOnMouseEntered(e-> {
			wrap.setScaleX(2.0);
			wrap.setScaleY(2.0);
		});
		wrap.setOnMouseExited(e-> {
			wrap.setScaleX(1.0);
			wrap.setScaleY(1.0);
		});
		
		hbox.getChildren().addAll(search,values,wrap);
		hbox.setPrefSize(500, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.setTitle("quiz.Quiz02");
		arg0.show();
		
	}
}

//선생님풀이
//package quiz;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//class EventTest {
//	public void setOnEnteded(Label lbl) {
//		lbl.setOnMouseEntered(e -> {
//			lbl.setScaleX(1.5);
//			lbl.setScaleY(1.5);
//		});
//	}
//
//	public void setOnExited(Label lbl) {
//		lbl.setOnMouseExited(e -> {
//			lbl.setScaleX(1);
//			lbl.setScaleY(1);
//		});
//	}
//}
//
//public class Quiz02 extends Application {
//	public static void main(String[] args) {
//		launch(args);
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		HBox hbox = new HBox(10);
//		Label imgLable = new Label("Search", new ImageView("/img/search.png"));
//		Label rotateLabel = new Label("values");
//		Label wrappedLabel = new Label("A label that needs to be wrapped");
//		HBox wrappedHbox = new HBox();
//		imgLable.setFont(new Font("Arial", 25));
//		imgLable.setTextFill(Color.web("#0076a3"));
//		rotateLabel.setFont(new Font("Arial", 35));
//		rotateLabel.setRotate(270);
//		rotateLabel.setTranslateY(60);
//		wrappedLabel.setWrapText(true);
//		wrappedHbox.setPadding(new Insets(40, 0, 0, 0));
//		wrappedHbox.setPrefSize(100, 100);
//		wrappedHbox.getChildren().add(wrappedLabel);
//
//		EventTest et = new EventTest();
//		et.setOnEnteded(imgLable);
//		et.setOnExited(imgLable);
//
//		et.setOnEnteded(rotateLabel);
//		et.setOnExited(rotateLabel);
//
//		et.setOnEnteded(wrappedLabel);
//		et.setOnExited(wrappedLabel);
//
//		hbox.getChildren().addAll(imgLable, rotateLabel, wrappedHbox);
//		primaryStage.setScene(new Scene(hbox, 400, 170));
//		primaryStage.show();
//	}
//}
