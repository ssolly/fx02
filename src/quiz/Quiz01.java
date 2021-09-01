package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		BorderPane bp = new BorderPane();
		
		FlowPane topPane = new FlowPane();
		Label topHome = new Label("홈");
		Label topSo = new Label("사회");
		Label topFi = new Label("경제");
		Label topIn = new Label("국제");
		Label topCu = new Label("문화");
		
		topPane.getChildren().addAll(topHome,topSo,topFi,topIn,topCu);
		topPane.setAlignment(Pos.CENTER_RIGHT);
		topPane.setHgap(30);
		topPane.setPadding(new Insets(10,30,10,0));
		topPane.setPrefSize(700, 50);
		
		FlowPane leftPane = new FlowPane(Orientation.VERTICAL);
		Label leftCa = new Label("카테고리");
		Label leftPc = new Label("노트북/pc");
		Label leftCar = new Label("자동차용품");
		Label leftMo = new Label("휴대폰");
		Label leftFi = new Label("캠핑/낚시");
		
		leftPane.getChildren().addAll(leftCa,leftPc,leftCar,leftMo,leftFi);
		leftPane.setAlignment(Pos.TOP_CENTER);
		leftPane.setVgap(7);
		leftPane.setPadding(new Insets(15));
		leftPane.setPrefSize(100, 500);
		
		GridPane centerPane = new GridPane();
		Label centerID = new Label("ID");
		Label centerPW = new Label("PW");
		TextField centerTxID = new TextField();
		PasswordField centerPfPW = new PasswordField();
		RadioButton centerRbF = new RadioButton("여");
		RadioButton centerRbM = new RadioButton("남");
		CheckBox centerCbGame = new CheckBox("게임");
		CheckBox centerCbStudy = new CheckBox("공부");
		Label centerStr = new Label("하고 싶은 말");
		TextArea centerArea = new TextArea();
		
		centerPane.add(centerID, 0, 0);
		centerPane.add(centerTxID, 1, 0);
		centerPane.add(centerPW, 0, 1);
		centerPane.add(centerPfPW, 1, 1);
		centerPane.add(centerRbF, 0, 2);
		centerRbF.setSelected(true);
		centerPane.add(centerRbM,1,2);
		centerPane.add(centerCbGame, 0, 3);
		centerPane.add(centerCbStudy, 1, 3);
		centerPane.add(centerStr, 0, 4,2,1);
		centerPane.add(centerArea, 0, 5,2,1);
		centerArea.setPrefSize(280, 100);
		centerPane.setPadding(new Insets(40,15,60,10));	//상우하좌
		centerPane.setPrefSize(300, 500);
		centerPane.setVgap(7);
		
		GridPane rightPane = new GridPane();
		TextField rightID = new TextField();
		PasswordField rightPW = new PasswordField();
		Button rightLogin = new Button("로그인");
		
		rightPane.add(rightID, 0, 0);
		rightPane.add(rightPW, 0, 1);
		rightPane.add(rightLogin, 1, 0,1,2);
		rightPane.setVgap(3);
		rightPane.setPadding(new Insets(40,15,50,15));
		rightPane.setPrefSize(300, 500);
		
		bp.setTop(topPane);
		bp.setLeft(leftPane);
		bp.setCenter(centerPane);
		bp.setRight(rightPane);
		
		arg0.setScene(new Scene(bp));
		arg0.setTitle("fx02.quiz.Quiz01");
		arg0.show();
		
	}
	
	//선생님버전
	/*
	@Override
	public void start(Stage primaryStage) { 
		BorderPane borderPane = new BorderPane();
				
		HBox hboxTop = new HBox(20); //중간 라인의 패딩 20
		hboxTop.setPadding(new Insets(10,10,10,280));

		ArrayList<Label> lb = new ArrayList<>();
		lb.add(new Label("홈"));
		lb.add(new Label("사회"));
		lb.add(new Label("경제"));
		lb.add(new Label("국제"));
		lb.add(new Label("문화"));
		hboxTop.getChildren().addAll(lb);
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(20));
		TextField tf01 = new TextField();
		tf01.setPrefSize(100, 20);
		TextField tf02 = new TextField();
		tf02.setPrefSize(100, 20);
		Button bt03 = new Button("로그인");
		bt03.setPrefSize(60, 50);
		FlowPane flowBt03 = new FlowPane(bt03);
		flowBt03.setMaxSize(0, 0);
		flowBt03.setAlignment(Pos.CENTER);
		grid.getChildren().addAll(tf01,tf02);
		grid.setConstraints(tf01,0,0);//아이디
		grid.setConstraints(tf02,0,1);//비밀번호
		grid.add(flowBt03, 1,0,1,2);//로그인
		
		VBox vboxLeft = new VBox(10); 
		vboxLeft.setPadding(new Insets(10,10,10,10));
		
		ArrayList<Label> lb01 = new ArrayList<>();
		lb01.add(new Label("카테고리"));
		lb01.add(new Label("노트북/pc"));
		lb01.add(new Label("자동차용품"));
		lb01.add(new Label("휴대폰"));
		lb01.add(new Label("캐핑/낚시"));
		
		vboxLeft.getChildren().addAll(lb01);
		
		VBox vboxCenter = new VBox(10);
		vboxCenter.setMaxSize(500, 220);
		
		ArrayList<FlowPane> flowList = new ArrayList<>();
		
		flowList.add(new FlowPane(new Label("ID  "),new TextField()));
		flowList.add(new FlowPane(new Label("PW "),new TextField()));
		
		RadioButton rb1 = new RadioButton("여\t");
		RadioButton rb2 = new RadioButton("남");
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		rb1.setSelected(true);

		flowList.add(new FlowPane(rb1,rb2));

		CheckBox chk1 = new CheckBox("게임\t");
		CheckBox chk2 = new CheckBox("공부");

		flowList.add(new FlowPane(chk1,chk2));
		flowList.add(new FlowPane(new Label("하고 싶은 말")));
		TextArea ta = new TextArea();
		ta.setPrefSize(200, 50);
		flowList.add( new FlowPane(ta));

		vboxCenter.getChildren().addAll(flowList);
		
		
		borderPane.setTop(hboxTop);
		borderPane.setCenter(vboxCenter);
		borderPane.setLeft(vboxLeft);
		borderPane.setRight(grid);
		
		primaryStage.setTitle("Quiz3");
		primaryStage.setScene(new Scene(borderPane,500,300)); //배경 크기 설정
		primaryStage.show();
	}
	*/
	
}
