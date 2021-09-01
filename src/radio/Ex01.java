package radio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox(10);	//세로박스
		RadioButton rd1 = new RadioButton("rb1");
		RadioButton rd2 = new RadioButton("rb2");
		
		hbox.getChildren().addAll(rd1,rd2);
		hbox.setPrefSize(300,200);
		hbox.setPadding(new Insets(20));
		hbox.setStyle("-fx-backgroud-color:pink;");
		hbox.setMargin(rd2, new Insets(50,0,0,50));	//rd2기준으로 밖으로 마진(공간)을 준다
		
		//한개만 선택되게 만들기 위해 group생성
		ToggleGroup tg = new ToggleGroup();
		rd1.setToggleGroup(tg);
		rd2.setToggleGroup(tg);
		
		rd1.setText("20대");
		rd2.setText("30대");
		rd1.setSelected(true);
		
		arg0.setScene(new Scene(hbox));
		arg0.setTitle("radiobutton");
		arg0.show();
	}
}
