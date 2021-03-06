package checkbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		VBox vbox = new VBox(10);	//세로배열, 안쪽 사이 거리
		//체크박스는 다중 선택시 사용多
		CheckBox chk1 = new CheckBox("chk1");
		CheckBox chk2 = new CheckBox("chk2");
		
		chk1.setSelected(true);		//체크된 상태로 세팅
		
		chk1.setText("자바");			//내용 변경
		chk2.setText("파이썬");
		
		vbox.getChildren().addAll(chk1,chk2);
		
		arg0.setScene(new Scene(vbox,300,200));
		arg0.setTitle("checkbox");
		arg0.show();
		
	}
}
