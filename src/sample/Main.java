package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1;
    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
        //调用kotlin方法
        new sample.example();
        window = primaryStage;
        //画布局
        TextField textField1=new TextField();
        TextField textField2=new TextField();
        Label label1 = new Label("结果");
        Button button1 = new Button("相加");
        //button的点击事件
        button1.setOnAction(event ->
                {
                    int tf1=Integer.parseInt(textField1.getText().trim());
                    int tf2=Integer.parseInt(textField2.getText().trim());
                    int add = KotKt.add(tf1, tf2);
                    label1.setText(String.valueOf(add));
                }
                );
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(textField1,textField2,label1,button1);
        scene1 = new Scene(layout1,200,200); //200x200 pixel
        window.setScene(scene1);
        window.setTitle("This is a title");
        window.show();
    }


    public static void main(String[] args) {
        launch(args);

    }
}
