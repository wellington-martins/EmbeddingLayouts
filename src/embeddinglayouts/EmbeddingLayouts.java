package embeddinglayouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EmbeddingLayouts extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("WBM Corporation");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(50, 20, 20,20));
        grid.setVgap(8);
        grid.setHgap(10);
        
        Label nameLabel = new Label("Username : ");
        GridPane.setConstraints(nameLabel, 0, 0);
        
        TextField nameInput = new TextField("Wellington");
        GridPane.setConstraints(nameInput, 1, 0);
        
        Label passLabel = new Label("Password :");
        GridPane.setConstraints(passLabel, 0, 1);
        
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);
        
        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);
        
        
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
        
        Scene scene = new Scene(grid, 300, 300 );
        primaryStage.setScene(scene);
        
       
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
