package com.example.movidle;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;


import static com.example.movidle.Movie.*;
public class MovieApplication extends javafx.application.Application {
    int sayac = 0;

    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();

        TextField text = new TextField();
        Button btn = new Button("Guess");

        HBox root1 = new HBox(text, btn);
        root1.setAlignment(Pos.TOP_CENTER);
        root1.setSpacing(15);

        Read();

        Random obj = new Random();
        int rand = obj.keepRandom();

        String Name = movieNameList.get(rand).toString();
        String Year = movieYearList.get(rand).toString();
        String Genre = movieGenreList.get(rand).toString();
        String Origin = movieOriginList.get(rand).toString();
        String Director = movieDirectorList.get(rand).toString();
        String Star = movieStarList.get(rand).toString();

        btn.setOnAction((e) -> {

            HBox root2 = new HBox();
            boolean control = false;
            String movie = text.getText();
            int temp = 0;

            for (int i = 1; i < movieNameList.size(); i++) {
                if (movie.equals(movieNameList.get(i))) {
                    control = true;
                    temp = i;
                    break;
                }
            }

            if (control == true) {


                while (sayac < 6) {
                    text.setText("");
                    if (Name.equals(movieNameList.get(temp))) {
                        Label lbl1 = new Label();
                        lbl1.setText(movieNameList.get(temp).toString());
                        lbl1.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl1.setMinSize(60, 60);
                        lbl1.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl1);

                        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                        alert1.setHeaderText("CONGRATULATIONS");
                        alert1.setContentText("You Win");
                        alert1.showAndWait();
                    } else {
                        Label lbl1 = new Label();
                        lbl1.setText(movieNameList.get(temp).toString());
                        lbl1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl1.setMinSize(60, 60);
                        lbl1.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl1);
                    }

                    if (Year.equals(movieYearList.get(temp))) {
                        Label lbl2 = new Label();
                        lbl2.setText(movieYearList.get(temp).toString());
                        lbl2.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl2.setMinSize(60, 60);
                        lbl2.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl2);
                    } else {
                        Label lbl2 = new Label();
                        lbl2.setText(movieYearList.get(temp).toString());
                        lbl2.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl2.setMinSize(60, 60);
                        lbl2.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl2);
                    }
                    if (Genre.equals(movieGenreList.get(temp))) {
                        Label lbl3 = new Label();
                        lbl3.setText(movieGenreList.get(temp).toString());
                        lbl3.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl3.setMinSize(60, 60);
                        lbl3.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl3);
                    } else {
                        Label lbl3 = new Label();
                        lbl3.setText(movieGenreList.get(temp).toString());
                        lbl3.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl3.setMinSize(60, 60);
                        lbl3.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl3);
                    }
                    if (Origin.equals(movieOriginList.get(temp))) {
                        Label lbl4 = new Label();
                        lbl4.setText(movieOriginList.get(temp).toString());
                        lbl4.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl4.setMinSize(60, 60);
                        lbl4.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl4);
                    } else {
                        Label lbl4 = new Label();
                        lbl4.setText(movieOriginList.get(temp).toString());
                        lbl4.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl4.setMinSize(60, 60);
                        lbl4.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl4);
                    }
                    if (Director.equals(movieDirectorList.get(temp))) {
                        Label lbl5 = new Label();
                        lbl5.setText(movieDirectorList.get(temp).toString());
                        lbl5.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl5.setMinSize(60, 60);
                        lbl5.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl5);
                    } else {
                        Label lbl5 = new Label();
                        lbl5.setText(movieDirectorList.get(temp).toString());
                        lbl5.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl5.setMinSize(60, 60);
                        lbl5.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl5);
                    }
                    if (Star.equals(movieStarList.get(temp))) {
                        Label lbl6 = new Label();
                        lbl6.setText(movieStarList.get(temp).toString());
                        lbl6.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl6.setMinSize(60, 60);
                        lbl6.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl6);
                    } else {
                        Label lbl6 = new Label();
                        lbl6.setText(movieStarList.get(temp).toString());
                        lbl6.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        lbl6.setMinSize(60, 60);
                        lbl6.setAlignment(Pos.CENTER);
                        root2.getChildren().addAll(lbl6);
                    }
                    sayac++;

                    root2.setAlignment(Pos.CENTER);
                    root2.setSpacing(15);
                    root.getChildren().addAll(root2);
                    root.setSpacing(10);
                    if (sayac == 5) {
                        Alert alert = new Alert(Alert.AlertType.WARNING);
                        alert.setHeaderText("Mission Failed!");
                        alert.setContentText("Press OK to close");
                        alert.showAndWait();
                        stage.close();
                    }
                    break;
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("WARNING ");
                alert.setContentText("Please enter a movie from the Imdb top 250 list,\npay attention to capital letters.");
                alert.showAndWait();
                text.setText("");

            }

        });

        root.getChildren().addAll(root1);

        Scene scene = new Scene(root, 640, 480);
        stage.getIcons().add(new Image("file:Movidle\\image\\m.png"));
        stage.setTitle("Movidle Movie Guessing Game");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) throws IOException {

        launch();

    }
}
