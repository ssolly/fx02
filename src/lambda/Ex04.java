package lambda;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex04 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		AnchorPane anch = new AnchorPane();
		Label lb1 = new Label("Value");
		
		lb1.setFont(new Font(32));
		lb1.setRotate(48);
		lb1.setTranslateX(100);
		lb1.setTranslateY(70);
		
		EventHandler<MouseEvent> entered = new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent arg0) {
				lb1.setScaleX(1.5);	//사이즈 1.5배 키워줌(x축)
				lb1.setScaleY(1.5);	//사이즈 1.5배 키워줌(y축)
			}
		};
		
		//이벤트 설정 : 객체 직접 설정
		lb1.setOnMouseEntered(entered);	//마우스포인트가 글씨 위에 있을 때
		lb1.setOnMouseExited(new EventHandler<MouseEvent>() { //마우스포인트가 글씨 밖에 있을 때
			
			@Override
			public void handle(MouseEvent arg0) {
				lb1.setScaleX(1.0);	//사이즈 1.5배 키워줌(x축)
				lb1.setScaleY(1.0);	//사이즈 1.5배 키워줌(y축)
			}
		});		
		
		//이벤트 설정 : lambda식
		lb1.setOnMousePressed(e -> {
			lb1.setRotate(0);
		});
		
		anch.getChildren().addAll(lb1);
		anch.setPrefSize(300, 200);
		
		//Scene s = new Scene(anch); arg0.setScene(s);
		arg0.setScene(new Scene(anch));
		arg0.setTitle("lambda.Ex04");
		arg0.show();
		
	}
}
