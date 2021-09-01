package textfield;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox(10);
		TextField tf = new TextField();			//입력창 : 문자 보임
		PasswordField pf = new PasswordField();	//입력창 : 문자 보이지 않음
		ComboBox<String> cb = new ComboBox<String>();	
		TextArea ta = new TextArea();			//여러줄 입력창
		DatePicker dp = new DatePicker();
		
		tf.setText("test");
		pf.setText("abcd1234");
		cb.getItems().addAll("공부","운동","휴식");
		cb.setValue("공부");
		ta.setPrefSize(100, 200);
		
		hbox.setPadding(new Insets(15));
		hbox.getChildren().addAll(tf,pf,cb,ta,dp);
		hbox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hbox));
		arg0.setTitle("textfield");
		arg0.show();
	}
}
