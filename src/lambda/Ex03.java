package lambda;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex03 extends Application {

	static int i=0;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {

		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		Label lb1 = new Label("A label that needs to be wrapped");
		
		/* 
		//글씨 위치 고정하기 위해 Pane에 한번 더 담아줌
		FlowPane fp = new FlowPane();
		fp.getChildren().add(lb1);
		fp.setPrefSize(100, 100);
		*/
		
		hbox.getChildren().add(lb1);
		hbox.setPrefSize(100, 100);
		
		lb1.setWrapText(true);		//틀 안에 글씨가 채워지는 설정
		lb1.setFont(new Font(20));	//폰트 크기 설정
		lb1.setRotate(60);			//폰트 각도(돌리기) 설정
		lb1.setTranslateY(80);		//각도를 돌린 후 글씨가 짤릴 때 y축(세로)을 길게 내려준다
		
		//이벤트
		lb1.setOnMouseClicked(e-> {	//e:람다식(lambda)
			lb1.setRotate(0);
			lb1.setTranslateY(0);
		});
		
		
		 //두번클릭시 : 람다식 사용
		 	lb1.setOnMouseClicked(e-> {
			if(i==0) {
				lb1.setRotate(0);
				lb1.setTranslateY(0);
			} else {
				lb1.setRotate(180);
				lb1.setTranslateY(100);
				i=0;
			}
		});
		
		 	
		 	
		
		arg0.setScene(new Scene(hbox));
		arg0.setTitle("label.Ex03");
		arg0.show();
		
	}
}
