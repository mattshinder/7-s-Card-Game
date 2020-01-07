//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class finalpart extends Application {
    static ArrayList<Score> scores = new ArrayList();
    int[] deck = shuffle();
    int wins;
    int losses;
    boolean gameOver = false;
    boolean firstTurn = true;
    final String FILE_PROTOCOL = "file:";
    final String IMAGES_PATH = "./images/";
    final String cardback_url = "file:./images/Back_Of_Card.png";
    final String hearts1 = "file:./images/Playing_card_heart_A.jpg";
    final String hearts2 = "file:./images/Playing_card_heart_2.jpg";
    final String hearts3 = "file:./images/Playing_card_heart_3.jpg";
    final String hearts4 = "file:./images/Playing_card_heart_4.jpg";
    final String hearts5 = "file:./images/Playing_card_heart_5.jpg";
    final String hearts6 = "file:./images/Playing_card_heart_6.jpg";
    final String hearts7 = "file:./images/Playing_card_heart_7.jpg";
    final String hearts8 = "file:./images/Playing_card_heart_8.jpg";
    final String hearts9 = "file:./images/Playing_card_heart_9.jpg";
    final String hearts10 = "file:./images/Playing_card_heart_10.jpg";
    final String hearts11 = "file:./images/Playing_card_heart_J.jpg";
    final String hearts12 = "file:./images/Playing_card_heart_Q.jpg";
    final String hearts13 = "file:./images/Playing_card_heart_K.jpg";
    final String diamonds1 = "file:./images/Playing_card_diamond_A.jpg";
    final String diamonds2 = "file:./images/Playing_card_diamond_2.jpg";
    final String diamonds3 = "file:./images/Playing_card_diamond_3.jpg";
    final String diamonds4 = "file:./images/Playing_card_diamond_4.jpg";
    final String diamonds5 = "file:./images/Playing_card_diamond_5.jpg";
    final String diamonds6 = "file:./images/Playing_card_diamond_6.jpg";
    final String diamonds7 = "file:./images/Playing_card_diamond_7.jpg";
    final String diamonds8 = "file:./images/Playing_card_diamond_8.jpg";
    final String diamonds9 = "file:./images/Playing_card_diamond_9.jpg";
    final String diamonds10 = "file:./images/Playing_card_diamond_10.jpg";
    final String diamonds11 = "file:./images/Playing_card_diamond_J.jpg";
    final String diamonds12 = "file:./images/Playing_card_diamond_Q.jpg";
    final String diamonds13 = "file:./images/Playing_card_diamond_K.jpg";
    final String clubs1 = "file:./images/Playing_card_club_A.jpg";
    final String clubs2 = "file:./images/Playing_card_club_2.jpg";
    final String clubs3 = "file:./images/Playing_card_club_3.jpg";
    final String clubs4 = "file:./images/Playing_card_club_4.jpg";
    final String clubs5 = "file:./images/Playing_card_club_5.jpg";
    final String clubs6 = "file:./images/Playing_card_club_6.jpg";
    final String clubs7 = "file:./images/Playing_card_club_7.jpg";
    final String clubs8 = "file:./images/Playing_card_club_8.jpg";
    final String clubs9 = "file:./images/Playing_card_club_9.jpg";
    final String clubs10 = "file:./images/Playing_card_club_10.jpg";
    final String clubs11 = "file:./images/Playing_card_club_J.jpg";
    final String clubs12 = "file:./images/Playing_card_club_Q.jpg";
    final String clubs13 = "file:./images/Playing_card_club_K.jpg";
    final String spades1 = "file:./images/Playing_card_spade_A.jpg";
    final String spades2 = "file:./images/Playing_card_spade_2.jpg";
    final String spades3 = "file:./images/Playing_card_spade_3.jpg";
    final String spades4 = "file:./images/Playing_card_spade_4.jpg";
    final String spades5 = "file:./images/Playing_card_spade_5.jpg";
    final String spades6 = "file:./images/Playing_card_spade_6.jpg";
    final String spades7 = "file:./images/Playing_card_spade_7.jpg";
    final String spades8 = "file:./images/Playing_card_spade_8.jpg";
    final String spades9 = "file:./images/Playing_card_spade_9.jpg";
    final String spades10 = "file:./images/Playing_card_spade_10.jpg";
    final String spades11 = "file:./images/Playing_card_spade_J.jpg";
    final String spades12 = "file:./images/Playing_card_spade_Q.jpg";
    final String spades13 = "file:./images/Playing_card_spade_K.jpg";
    Image cardback = this.loadImage("file:./images/Back_Of_Card.png");
    Image h1 = this.loadImage("file:./images/Playing_card_heart_A.jpg");
    Image h2 = this.loadImage("file:./images/Playing_card_heart_2.jpg");
    Image h3 = this.loadImage("file:./images/Playing_card_heart_3.jpg");
    Image h4 = this.loadImage("file:./images/Playing_card_heart_4.jpg");
    Image h5 = this.loadImage("file:./images/Playing_card_heart_5.jpg");
    Image h6 = this.loadImage("file:./images/Playing_card_heart_6.jpg");
    Image h7 = this.loadImage("file:./images/Playing_card_heart_7.jpg");
    Image h8 = this.loadImage("file:./images/Playing_card_heart_8.jpg");
    Image h9 = this.loadImage("file:./images/Playing_card_heart_9.jpg");
    Image h10 = this.loadImage("file:./images/Playing_card_heart_10.jpg");
    Image h11 = this.loadImage("file:./images/Playing_card_heart_J.jpg");
    Image h12 = this.loadImage("file:./images/Playing_card_heart_Q.jpg");
    Image h13 = this.loadImage("file:./images/Playing_card_heart_K.jpg");
    Image d1 = this.loadImage("file:./images/Playing_card_diamond_A.jpg");
    Image d2 = this.loadImage("file:./images/Playing_card_diamond_2.jpg");
    Image d3 = this.loadImage("file:./images/Playing_card_diamond_3.jpg");
    Image d4 = this.loadImage("file:./images/Playing_card_diamond_4.jpg");
    Image d5 = this.loadImage("file:./images/Playing_card_diamond_5.jpg");
    Image d6 = this.loadImage("file:./images/Playing_card_diamond_6.jpg");
    Image d7 = this.loadImage("file:./images/Playing_card_diamond_7.jpg");
    Image d8 = this.loadImage("file:./images/Playing_card_diamond_8.jpg");
    Image d9 = this.loadImage("file:./images/Playing_card_diamond_9.jpg");
    Image d10 = this.loadImage("file:./images/Playing_card_diamond_10.jpg");
    Image d11 = this.loadImage("file:./images/Playing_card_diamond_J.jpg");
    Image d12 = this.loadImage("file:./images/Playing_card_diamond_Q.jpg");
    Image d13 = this.loadImage("file:./images/Playing_card_diamond_K.jpg");
    Image c1 = this.loadImage("file:./images/Playing_card_club_A.jpg");
    Image c2 = this.loadImage("file:./images/Playing_card_club_2.jpg");
    Image c3 = this.loadImage("file:./images/Playing_card_club_3.jpg");
    Image c4 = this.loadImage("file:./images/Playing_card_club_4.jpg");
    Image c5 = this.loadImage("file:./images/Playing_card_club_5.jpg");
    Image c6 = this.loadImage("file:./images/Playing_card_club_6.jpg");
    Image c7 = this.loadImage("file:./images/Playing_card_club_7.jpg");
    Image c8 = this.loadImage("file:./images/Playing_card_club_8.jpg");
    Image c9 = this.loadImage("file:./images/Playing_card_club_9.jpg");
    Image c10 = this.loadImage("file:./images/Playing_card_club_10.jpg");
    Image c11 = this.loadImage("file:./images/Playing_card_club_J.jpg");
    Image c12 = this.loadImage("file:./images/Playing_card_club_Q.jpg");
    Image c13 = this.loadImage("file:./images/Playing_card_club_K.jpg");
    Image s1 = this.loadImage("file:./images/Playing_card_spade_A.jpg");
    Image s2 = this.loadImage("file:./images/Playing_card_spade_2.jpg");
    Image s3 = this.loadImage("file:./images/Playing_card_spade_3.jpg");
    Image s4 = this.loadImage("file:./images/Playing_card_spade_4.jpg");
    Image s5 = this.loadImage("file:./images/Playing_card_spade_5.jpg");
    Image s6 = this.loadImage("file:./images/Playing_card_spade_6.jpg");
    Image s7 = this.loadImage("file:./images/Playing_card_spade_7.jpg");
    Image s8 = this.loadImage("file:./images/Playing_card_spade_8.jpg");
    Image s9 = this.loadImage("file:./images/Playing_card_spade_9.jpg");
    Image s10 = this.loadImage("file:./images/Playing_card_spade_10.jpg");
    Image s11 = this.loadImage("file:./images/Playing_card_spade_J.jpg");
    Image s12 = this.loadImage("file:./images/Playing_card_spade_Q.jpg");
    Image s13 = this.loadImage("file:./images/Playing_card_spade_K.jpg");
    ImageView heart1 = new ImageView();
    ImageView heart2 = new ImageView();
    ImageView heart3 = new ImageView();
    ImageView heart4 = new ImageView();
    ImageView heart5 = new ImageView();
    ImageView heart6 = new ImageView();
    ImageView heart7 = new ImageView();
    ImageView heart8 = new ImageView();
    ImageView heart9 = new ImageView();
    ImageView heart10 = new ImageView();
    ImageView heart11 = new ImageView();
    ImageView heart12 = new ImageView();
    ImageView heart13 = new ImageView();
    ImageView diamond1 = new ImageView();
    ImageView diamond2 = new ImageView();
    ImageView diamond3 = new ImageView();
    ImageView diamond4 = new ImageView();
    ImageView diamond5 = new ImageView();
    ImageView diamond6 = new ImageView();
    ImageView diamond7 = new ImageView();
    ImageView diamond8 = new ImageView();
    ImageView diamond9 = new ImageView();
    ImageView diamond10 = new ImageView();
    ImageView diamond11 = new ImageView();
    ImageView diamond12 = new ImageView();
    ImageView diamond13 = new ImageView();
    ImageView club1 = new ImageView();
    ImageView club2 = new ImageView();
    ImageView club3 = new ImageView();
    ImageView club4 = new ImageView();
    ImageView club5 = new ImageView();
    ImageView club6 = new ImageView();
    ImageView club7 = new ImageView();
    ImageView club8 = new ImageView();
    ImageView club9 = new ImageView();
    ImageView club10 = new ImageView();
    ImageView club11 = new ImageView();
    ImageView club12 = new ImageView();
    ImageView club13 = new ImageView();
    ImageView spade1 = new ImageView();
    ImageView spade2 = new ImageView();
    ImageView spade3 = new ImageView();
    ImageView spade4 = new ImageView();
    ImageView spade5 = new ImageView();
    ImageView spade6 = new ImageView();
    ImageView spade7 = new ImageView();
    ImageView spade8 = new ImageView();
    ImageView spade9 = new ImageView();
    ImageView spade10 = new ImageView();
    ImageView spade11 = new ImageView();
    ImageView spade12 = new ImageView();
    ImageView spade13 = new ImageView();
    ImageView leftcard1 = new ImageView();
    ImageView leftcard2 = new ImageView();
    ImageView leftcard3 = new ImageView();
    ImageView leftcard4 = new ImageView();
    ImageView leftcard5 = new ImageView();
    ImageView leftcard6 = new ImageView();
    ImageView leftcard7 = new ImageView();
    ImageView leftcard8 = new ImageView();
    ImageView leftcard9 = new ImageView();
    ImageView leftcard10 = new ImageView();
    ImageView leftcard11 = new ImageView();
    ImageView leftcard12 = new ImageView();
    ImageView leftcard13 = new ImageView();
    ImageView rightcard1 = new ImageView();
    ImageView rightcard2 = new ImageView();
    ImageView rightcard3 = new ImageView();
    ImageView rightcard4 = new ImageView();
    ImageView rightcard5 = new ImageView();
    ImageView rightcard6 = new ImageView();
    ImageView rightcard7 = new ImageView();
    ImageView rightcard8 = new ImageView();
    ImageView rightcard9 = new ImageView();
    ImageView rightcard10 = new ImageView();
    ImageView rightcard11 = new ImageView();
    ImageView rightcard12 = new ImageView();
    ImageView rightcard13 = new ImageView();
    ImageView topcard1 = new ImageView();
    ImageView topcard2 = new ImageView();
    ImageView topcard3 = new ImageView();
    ImageView topcard4 = new ImageView();
    ImageView topcard5 = new ImageView();
    ImageView topcard6 = new ImageView();
    ImageView topcard7 = new ImageView();
    ImageView topcard8 = new ImageView();
    ImageView topcard9 = new ImageView();
    ImageView topcard10 = new ImageView();
    ImageView topcard11 = new ImageView();
    ImageView topcard12 = new ImageView();
    ImageView topcard13 = new ImageView();
    BorderPane appPane = new BorderPane();
    Pane centerPane = new Pane();
    Label skip = new Label("");
    Label score = new Label("Start game to get score");
    Button newGame = new Button("New Game");
    CheckBox cheat = new CheckBox("");
    Button random = new Button("Random");
    Scene scene;
    HBox topPane;
    Pane topPane2;
    Button exit;
    HBox bottomPane;
    Pane leftPane;
    Pane rightPane;
    Label turn;
    ImageView player1;
    ImageView player2;
    ImageView player3;
    ImageView player4;
    ImageView player5;
    ImageView player6;
    ImageView player7;
    ImageView player8;
    ImageView player9;
    ImageView player10;
    ImageView player11;
    ImageView player12;
    ImageView player13;
    Button card1;
    Button card2;
    Button card3;
    Button card4;
    Button card5;
    Button card6;
    Button card7;
    Button card8;
    Button card9;
    Button card10;
    Button card11;
    Button card12;
    Button card13;
    Button cheatButton;
    Stage window;

    public finalpart() {
        this.scene = new Scene(this.appPane);
        this.topPane = new HBox();
        this.topPane2 = new Pane();
        this.exit = new Button("Exit Game");
        this.bottomPane = new HBox();
        this.leftPane = new Pane();
        this.rightPane = new Pane();
        this.turn = new Label(" ");
        this.player1 = new ImageView();
        this.player2 = new ImageView();
        this.player3 = new ImageView();
        this.player4 = new ImageView();
        this.player5 = new ImageView();
        this.player6 = new ImageView();
        this.player7 = new ImageView();
        this.player8 = new ImageView();
        this.player9 = new ImageView();
        this.player10 = new ImageView();
        this.player11 = new ImageView();
        this.player12 = new ImageView();
        this.player13 = new ImageView();
        this.card1 = new Button("1", this.player1);
        this.card2 = new Button("2", this.player2);
        this.card3 = new Button("3", this.player3);
        this.card4 = new Button("4", this.player4);
        this.card5 = new Button("5", this.player5);
        this.card6 = new Button("6", this.player6);
        this.card7 = new Button("7", this.player7);
        this.card8 = new Button("8", this.player8);
        this.card9 = new Button("9", this.player9);
        this.card10 = new Button("10", this.player10);
        this.card11 = new Button("11", this.player11);
        this.card12 = new Button("12", this.player12);
        this.card13 = new Button("13", this.player13);
        this.cheatButton = new Button("Cheat");
    }

    public void start(Stage primaryStage) {
        this.topPane.getChildren().add(this.newGame);
        this.topPane.getChildren().add(this.cheat);
        this.topPane.getChildren().add(this.cheatButton);
        this.topPane.getChildren().add(this.random);
        this.topPane.getChildren().add(this.score);
        this.topPane.getChildren().add(this.exit);
        this.centerPane.getChildren().add(this.heart13);
        this.heart13.setX(100.0D);
        this.heart13.setY(100.0D);
        this.heart13.setFitWidth(50.0D);
        this.heart13.setFitHeight(75.0D);
        this.heart13.setImage(this.h13);
        this.centerPane.getChildren().add(this.heart12);
        this.heart12.setX(100.0D);
        this.heart12.setY(120.0D);
        this.heart12.setFitWidth(50.0D);
        this.heart12.setFitHeight(75.0D);
        this.heart12.setImage(this.h12);
        this.centerPane.getChildren().add(this.heart11);
        this.heart11.setX(100.0D);
        this.heart11.setY(140.0D);
        this.heart11.setFitWidth(50.0D);
        this.heart11.setFitHeight(75.0D);
        this.heart11.setImage(this.h11);
        this.centerPane.getChildren().add(this.heart10);
        this.heart10.setX(100.0D);
        this.heart10.setY(160.0D);
        this.heart10.setFitWidth(50.0D);
        this.heart10.setFitHeight(75.0D);
        this.heart10.setImage(this.h10);
        this.centerPane.getChildren().add(this.heart9);
        this.heart9.setX(100.0D);
        this.heart9.setY(180.0D);
        this.heart9.setFitWidth(50.0D);
        this.heart9.setFitHeight(75.0D);
        this.heart9.setImage(this.h9);
        this.centerPane.getChildren().add(this.heart8);
        this.heart8.setX(100.0D);
        this.heart8.setY(200.0D);
        this.heart8.setFitWidth(50.0D);
        this.heart8.setFitHeight(75.0D);
        this.heart8.setImage(this.h8);
        this.centerPane.getChildren().add(this.heart7);
        this.heart7.setX(100.0D);
        this.heart7.setY(220.0D);
        this.heart7.setFitWidth(50.0D);
        this.heart7.setFitHeight(75.0D);
        this.heart7.setImage(this.h7);
        this.centerPane.getChildren().add(this.heart6);
        this.heart6.setX(100.0D);
        this.heart6.setY(240.0D);
        this.heart6.setFitWidth(50.0D);
        this.heart6.setFitHeight(75.0D);
        this.heart6.setImage(this.h6);
        this.centerPane.getChildren().add(this.heart5);
        this.heart5.setX(100.0D);
        this.heart5.setY(260.0D);
        this.heart5.setFitWidth(50.0D);
        this.heart5.setFitHeight(75.0D);
        this.heart5.setImage(this.h5);
        this.centerPane.getChildren().add(this.heart4);
        this.heart4.setX(100.0D);
        this.heart4.setY(280.0D);
        this.heart4.setFitWidth(50.0D);
        this.heart4.setFitHeight(75.0D);
        this.heart4.setImage(this.h4);
        this.centerPane.getChildren().add(this.heart3);
        this.heart3.setX(100.0D);
        this.heart3.setY(300.0D);
        this.heart3.setFitWidth(50.0D);
        this.heart3.setFitHeight(75.0D);
        this.heart3.setImage(this.h3);
        this.centerPane.getChildren().add(this.heart2);
        this.heart2.setX(100.0D);
        this.heart2.setY(320.0D);
        this.heart2.setFitWidth(50.0D);
        this.heart2.setFitHeight(75.0D);
        this.heart2.setImage(this.h2);
        this.centerPane.getChildren().add(this.heart1);
        this.heart1.setX(100.0D);
        this.heart1.setY(340.0D);
        this.heart1.setFitWidth(50.0D);
        this.heart1.setFitHeight(75.0D);
        this.heart1.setImage(this.h1);
        this.centerPane.getChildren().add(this.diamond13);
        this.diamond13.setX(300.0D);
        this.diamond13.setY(100.0D);
        this.diamond13.setFitWidth(50.0D);
        this.diamond13.setFitHeight(75.0D);
        this.diamond13.setImage(this.d13);
        this.centerPane.getChildren().add(this.diamond12);
        this.diamond12.setX(300.0D);
        this.diamond12.setY(120.0D);
        this.diamond12.setFitWidth(50.0D);
        this.diamond12.setFitHeight(75.0D);
        this.diamond12.setImage(this.d12);
        this.centerPane.getChildren().add(this.diamond11);
        this.diamond11.setX(300.0D);
        this.diamond11.setY(140.0D);
        this.diamond11.setFitWidth(50.0D);
        this.diamond11.setFitHeight(75.0D);
        this.diamond11.setImage(this.d11);
        this.centerPane.getChildren().add(this.diamond10);
        this.diamond10.setX(300.0D);
        this.diamond10.setY(160.0D);
        this.diamond10.setFitWidth(50.0D);
        this.diamond10.setFitHeight(75.0D);
        this.diamond10.setImage(this.d10);
        this.centerPane.getChildren().add(this.diamond9);
        this.diamond9.setX(300.0D);
        this.diamond9.setY(180.0D);
        this.diamond9.setFitWidth(50.0D);
        this.diamond9.setFitHeight(75.0D);
        this.diamond9.setImage(this.d9);
        this.centerPane.getChildren().add(this.diamond8);
        this.diamond8.setX(300.0D);
        this.diamond8.setY(200.0D);
        this.diamond8.setFitWidth(50.0D);
        this.diamond8.setFitHeight(75.0D);
        this.diamond8.setImage(this.d8);
        this.centerPane.getChildren().add(this.diamond7);
        this.diamond7.setX(300.0D);
        this.diamond7.setY(220.0D);
        this.diamond7.setFitWidth(50.0D);
        this.diamond7.setFitHeight(75.0D);
        this.diamond7.setImage(this.d7);
        this.centerPane.getChildren().add(this.diamond6);
        this.diamond6.setX(300.0D);
        this.diamond6.setY(240.0D);
        this.diamond6.setFitWidth(50.0D);
        this.diamond6.setFitHeight(75.0D);
        this.diamond6.setImage(this.d6);
        this.centerPane.getChildren().add(this.diamond5);
        this.diamond5.setX(300.0D);
        this.diamond5.setY(260.0D);
        this.diamond5.setFitWidth(50.0D);
        this.diamond5.setFitHeight(75.0D);
        this.diamond5.setImage(this.d5);
        this.centerPane.getChildren().add(this.diamond4);
        this.diamond4.setX(300.0D);
        this.diamond4.setY(280.0D);
        this.diamond4.setFitWidth(50.0D);
        this.diamond4.setFitHeight(75.0D);
        this.diamond4.setImage(this.d4);
        this.centerPane.getChildren().add(this.diamond3);
        this.diamond3.setX(300.0D);
        this.diamond3.setY(300.0D);
        this.diamond3.setFitWidth(50.0D);
        this.diamond3.setFitHeight(75.0D);
        this.diamond3.setImage(this.d3);
        this.centerPane.getChildren().add(this.diamond2);
        this.diamond2.setX(300.0D);
        this.diamond2.setY(320.0D);
        this.diamond2.setFitWidth(50.0D);
        this.diamond2.setFitHeight(75.0D);
        this.diamond2.setImage(this.d2);
        this.centerPane.getChildren().add(this.diamond1);
        this.diamond1.setX(300.0D);
        this.diamond1.setY(340.0D);
        this.diamond1.setFitWidth(50.0D);
        this.diamond1.setFitHeight(75.0D);
        this.diamond1.setImage(this.d1);
        this.centerPane.getChildren().add(this.club13);
        this.club13.setX(500.0D);
        this.club13.setY(100.0D);
        this.club13.setFitWidth(50.0D);
        this.club13.setFitHeight(75.0D);
        this.club13.setImage(this.c13);
        this.centerPane.getChildren().add(this.club12);
        this.club12.setX(500.0D);
        this.club12.setY(120.0D);
        this.club12.setFitWidth(50.0D);
        this.club12.setFitHeight(75.0D);
        this.club12.setImage(this.c12);
        this.centerPane.getChildren().add(this.club11);
        this.club11.setX(500.0D);
        this.club11.setY(140.0D);
        this.club11.setFitWidth(50.0D);
        this.club11.setFitHeight(75.0D);
        this.club11.setImage(this.c11);
        this.centerPane.getChildren().add(this.club10);
        this.club10.setX(500.0D);
        this.club10.setY(160.0D);
        this.club10.setFitWidth(50.0D);
        this.club10.setFitHeight(75.0D);
        this.club10.setImage(this.c10);
        this.centerPane.getChildren().add(this.club9);
        this.club9.setX(500.0D);
        this.club9.setY(180.0D);
        this.club9.setFitWidth(50.0D);
        this.club9.setFitHeight(75.0D);
        this.club9.setImage(this.c9);
        this.centerPane.getChildren().add(this.club8);
        this.club8.setX(500.0D);
        this.club8.setY(200.0D);
        this.club8.setFitWidth(50.0D);
        this.club8.setFitHeight(75.0D);
        this.club8.setImage(this.c8);
        this.centerPane.getChildren().add(this.club7);
        this.club7.setX(500.0D);
        this.club7.setY(220.0D);
        this.club7.setFitWidth(50.0D);
        this.club7.setFitHeight(75.0D);
        this.club7.setImage(this.c7);
        this.centerPane.getChildren().add(this.club6);
        this.club6.setX(500.0D);
        this.club6.setY(240.0D);
        this.club6.setFitWidth(50.0D);
        this.club6.setFitHeight(75.0D);
        this.club6.setImage(this.c6);
        this.centerPane.getChildren().add(this.club5);
        this.club5.setX(500.0D);
        this.club5.setY(260.0D);
        this.club5.setFitWidth(50.0D);
        this.club5.setFitHeight(75.0D);
        this.club5.setImage(this.c5);
        this.centerPane.getChildren().add(this.club4);
        this.club4.setX(500.0D);
        this.club4.setY(280.0D);
        this.club4.setFitWidth(50.0D);
        this.club4.setFitHeight(75.0D);
        this.club4.setImage(this.c4);
        this.centerPane.getChildren().add(this.club3);
        this.club3.setX(500.0D);
        this.club3.setY(300.0D);
        this.club3.setFitWidth(50.0D);
        this.club3.setFitHeight(75.0D);
        this.club3.setImage(this.c3);
        this.centerPane.getChildren().add(this.club2);
        this.club2.setX(500.0D);
        this.club2.setY(320.0D);
        this.club2.setFitWidth(50.0D);
        this.club2.setFitHeight(75.0D);
        this.club2.setImage(this.c2);
        this.centerPane.getChildren().add(this.club1);
        this.club1.setX(500.0D);
        this.club1.setY(340.0D);
        this.club1.setFitWidth(50.0D);
        this.club1.setFitHeight(75.0D);
        this.club1.setImage(this.c1);
        this.centerPane.getChildren().add(this.spade13);
        this.spade13.setX(700.0D);
        this.spade13.setY(100.0D);
        this.spade13.setFitWidth(50.0D);
        this.spade13.setFitHeight(75.0D);
        this.spade13.setImage(this.s13);
        this.centerPane.getChildren().add(this.spade12);
        this.spade12.setX(700.0D);
        this.spade12.setY(120.0D);
        this.spade12.setFitWidth(50.0D);
        this.spade12.setFitHeight(75.0D);
        this.spade12.setImage(this.s12);
        this.centerPane.getChildren().add(this.spade11);
        this.spade11.setX(700.0D);
        this.spade11.setY(140.0D);
        this.spade11.setFitWidth(50.0D);
        this.spade11.setFitHeight(75.0D);
        this.spade11.setImage(this.s11);
        this.centerPane.getChildren().add(this.spade10);
        this.spade10.setX(700.0D);
        this.spade10.setY(160.0D);
        this.spade10.setFitWidth(50.0D);
        this.spade10.setFitHeight(75.0D);
        this.spade10.setImage(this.s10);
        this.centerPane.getChildren().add(this.spade9);
        this.spade9.setX(700.0D);
        this.spade9.setY(180.0D);
        this.spade9.setFitWidth(50.0D);
        this.spade9.setFitHeight(75.0D);
        this.spade9.setImage(this.s9);
        this.centerPane.getChildren().add(this.spade8);
        this.spade8.setX(700.0D);
        this.spade8.setY(200.0D);
        this.spade8.setFitWidth(50.0D);
        this.spade8.setFitHeight(75.0D);
        this.spade8.setImage(this.s8);
        this.centerPane.getChildren().add(this.spade7);
        this.spade7.setX(700.0D);
        this.spade7.setY(220.0D);
        this.spade7.setFitWidth(50.0D);
        this.spade7.setFitHeight(75.0D);
        this.spade7.setImage(this.s7);
        this.centerPane.getChildren().add(this.spade6);
        this.spade6.setX(700.0D);
        this.spade6.setY(240.0D);
        this.spade6.setFitWidth(50.0D);
        this.spade6.setFitHeight(75.0D);
        this.spade6.setImage(this.s6);
        this.centerPane.getChildren().add(this.spade5);
        this.spade5.setX(700.0D);
        this.spade5.setY(260.0D);
        this.spade5.setFitWidth(50.0D);
        this.spade5.setFitHeight(75.0D);
        this.spade5.setImage(this.s5);
        this.centerPane.getChildren().add(this.spade4);
        this.spade4.setX(700.0D);
        this.spade4.setY(280.0D);
        this.spade4.setFitWidth(50.0D);
        this.spade4.setFitHeight(75.0D);
        this.spade4.setImage(this.s4);
        this.centerPane.getChildren().add(this.spade3);
        this.spade3.setX(700.0D);
        this.spade3.setY(300.0D);
        this.spade3.setFitWidth(50.0D);
        this.spade3.setFitHeight(75.0D);
        this.spade3.setImage(this.s3);
        this.centerPane.getChildren().add(this.spade2);
        this.spade2.setX(700.0D);
        this.spade2.setY(320.0D);
        this.spade2.setFitWidth(50.0D);
        this.spade2.setFitHeight(75.0D);
        this.spade2.setImage(this.s2);
        this.centerPane.getChildren().add(this.spade1);
        this.spade1.setX(700.0D);
        this.spade1.setY(340.0D);
        this.spade1.setFitWidth(50.0D);
        this.spade1.setFitHeight(75.0D);
        this.spade1.setImage(this.s1);
        this.centerPane.getChildren().add(this.topcard1);
        this.topcard1.setX(200.0D);
        this.topcard1.setY(15.0D);
        this.topcard1.setImage(this.cardback);
        this.topcard1.setFitWidth(50.0D);
        this.topcard1.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard2);
        this.topcard2.setX(250.0D);
        this.topcard2.setY(15.0D);
        this.topcard2.setImage(this.cardback);
        this.topcard2.setFitWidth(50.0D);
        this.topcard2.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard3);
        this.topcard3.setX(300.0D);
        this.topcard3.setY(15.0D);
        this.topcard3.setImage(this.cardback);
        this.topcard3.setFitWidth(50.0D);
        this.topcard3.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard4);
        this.topcard4.setX(350.0D);
        this.topcard4.setY(15.0D);
        this.topcard4.setImage(this.cardback);
        this.topcard4.setFitWidth(50.0D);
        this.topcard4.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard5);
        this.topcard5.setX(400.0D);
        this.topcard5.setY(15.0D);
        this.topcard5.setImage(this.cardback);
        this.topcard5.setFitWidth(50.0D);
        this.topcard5.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard6);
        this.topcard6.setX(450.0D);
        this.topcard6.setY(15.0D);
        this.topcard6.setImage(this.cardback);
        this.topcard6.setFitWidth(50.0D);
        this.topcard6.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard7);
        this.topcard7.setX(500.0D);
        this.topcard7.setY(15.0D);
        this.topcard7.setImage(this.cardback);
        this.topcard7.setFitWidth(50.0D);
        this.topcard7.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard8);
        this.topcard8.setX(550.0D);
        this.topcard8.setY(15.0D);
        this.topcard8.setImage(this.cardback);
        this.topcard8.setFitWidth(50.0D);
        this.topcard8.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard9);
        this.topcard9.setX(600.0D);
        this.topcard9.setY(15.0D);
        this.topcard9.setImage(this.cardback);
        this.topcard9.setFitWidth(50.0D);
        this.topcard9.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard10);
        this.topcard10.setX(650.0D);
        this.topcard10.setY(15.0D);
        this.topcard10.setImage(this.cardback);
        this.topcard10.setFitWidth(50.0D);
        this.topcard10.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard11);
        this.topcard11.setX(700.0D);
        this.topcard11.setY(15.0D);
        this.topcard11.setImage(this.cardback);
        this.topcard11.setFitWidth(50.0D);
        this.topcard11.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard12);
        this.topcard12.setX(750.0D);
        this.topcard12.setY(15.0D);
        this.topcard12.setImage(this.cardback);
        this.topcard12.setFitWidth(50.0D);
        this.topcard12.setFitHeight(75.0D);
        this.centerPane.getChildren().add(this.topcard13);
        this.topcard13.setX(800.0D);
        this.topcard13.setY(15.0D);
        this.topcard13.setImage(this.cardback);
        this.topcard13.setFitWidth(50.0D);
        this.topcard13.setFitHeight(75.0D);
        this.bottomPane.getChildren().add(this.card1);
        this.player1.setImage(this.cardback);
        this.player1.setFitWidth(50.0D);
        this.player1.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card2);
        this.player2.setImage(this.cardback);
        this.player2.setFitWidth(50.0D);
        this.player2.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card3);
        this.player3.setImage(this.cardback);
        this.player3.setFitWidth(50.0D);
        this.player3.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card4);
        this.player4.setImage(this.cardback);
        this.player4.setFitWidth(50.0D);
        this.player4.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card5);
        this.player5.setImage(this.cardback);
        this.player5.setFitWidth(50.0D);
        this.player5.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card6);
        this.player6.setImage(this.cardback);
        this.player6.setFitWidth(50.0D);
        this.player6.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card7);
        this.player7.setImage(this.cardback);
        this.player7.setFitWidth(50.0D);
        this.player7.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card8);
        this.player8.setImage(this.cardback);
        this.player8.setFitWidth(50.0D);
        this.player8.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card9);
        this.player9.setImage(this.cardback);
        this.player9.setFitWidth(50.0D);
        this.player9.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card10);
        this.player10.setImage(this.cardback);
        this.player10.setFitWidth(50.0D);
        this.player10.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card11);
        this.player11.setImage(this.cardback);
        this.player11.setFitWidth(50.0D);
        this.player11.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card12);
        this.player12.setImage(this.cardback);
        this.player12.setFitWidth(50.0D);
        this.player12.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.card13);
        this.player13.setImage(this.cardback);
        this.player13.setFitWidth(50.0D);
        this.player13.setFitHeight(100.0D);
        this.bottomPane.getChildren().add(this.turn);
        this.bottomPane.getChildren().add(this.skip);
        this.leftPane.getChildren().add(this.leftcard1);
        this.leftcard1.setImage(this.cardback);
        this.leftcard1.setFitWidth(50.0D);
        this.leftcard1.setFitHeight(100.0D);
        this.leftcard1.setY(50.0D);
        this.leftPane.getChildren().add(this.leftcard2);
        this.leftcard2.setImage(this.cardback);
        this.leftcard2.setFitWidth(50.0D);
        this.leftcard2.setFitHeight(100.0D);
        this.leftcard2.setY(75.0D);
        this.leftPane.getChildren().add(this.leftcard3);
        this.leftcard3.setImage(this.cardback);
        this.leftcard3.setFitWidth(50.0D);
        this.leftcard3.setFitHeight(100.0D);
        this.leftcard3.setY(100.0D);
        this.leftPane.getChildren().add(this.leftcard4);
        this.leftcard4.setY(125.0D);
        this.leftcard4.setImage(this.cardback);
        this.leftcard4.setFitWidth(50.0D);
        this.leftcard4.setFitHeight(100.0D);
        this.leftPane.getChildren().add(this.leftcard5);
        this.leftcard5.setY(150.0D);
        this.leftcard5.setImage(this.cardback);
        this.leftcard5.setFitWidth(50.0D);
        this.leftcard5.setFitHeight(100.0D);
        this.leftPane.getChildren().add(this.leftcard6);
        this.leftcard6.setY(175.0D);
        this.leftcard6.setImage(this.cardback);
        this.leftcard6.setFitWidth(50.0D);
        this.leftcard6.setFitHeight(100.0D);
        this.leftPane.getChildren().add(this.leftcard7);
        this.leftcard7.setY(200.0D);
        this.leftcard7.setImage(this.cardback);
        this.leftcard7.setFitWidth(50.0D);
        this.leftcard7.setFitHeight(100.0D);
        this.leftPane.getChildren().add(this.leftcard8);
        this.leftcard8.setY(225.0D);
        this.leftcard8.setImage(this.cardback);
        this.leftcard8.setFitWidth(50.0D);
        this.leftcard8.setFitHeight(100.0D);
        this.leftPane.getChildren().add(this.leftcard9);
        this.leftcard9.setY(250.0D);
        this.leftcard9.setImage(this.cardback);
        this.leftcard9.setFitWidth(50.0D);
        this.leftcard9.setFitHeight(100.0D);
        this.leftPane.getChildren().add(this.leftcard10);
        this.leftcard10.setY(275.0D);
        this.leftcard10.setImage(this.cardback);
        this.leftcard10.setFitWidth(50.0D);
        this.leftcard10.setFitHeight(100.0D);
        this.leftPane.getChildren().add(this.leftcard11);
        this.leftcard11.setY(300.0D);
        this.leftcard11.setImage(this.cardback);
        this.leftcard11.setFitWidth(50.0D);
        this.leftcard11.setFitHeight(100.0D);
        this.leftPane.getChildren().add(this.leftcard12);
        this.leftcard12.setY(325.0D);
        this.leftcard12.setImage(this.cardback);
        this.leftcard12.setFitWidth(50.0D);
        this.leftcard12.setFitHeight(100.0D);
        this.leftPane.getChildren().add(this.leftcard13);
        this.leftcard13.setY(350.0D);
        this.leftcard13.setImage(this.cardback);
        this.leftcard13.setFitWidth(50.0D);
        this.leftcard13.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard1);
        this.rightcard1.setY(50.0D);
        this.rightcard1.setImage(this.cardback);
        this.rightcard1.setFitWidth(50.0D);
        this.rightcard1.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard2);
        this.rightcard2.setY(75.0D);
        this.rightcard2.setImage(this.cardback);
        this.rightcard2.setFitWidth(50.0D);
        this.rightcard2.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard3);
        this.rightcard3.setY(100.0D);
        this.rightcard3.setImage(this.cardback);
        this.rightcard3.setFitWidth(50.0D);
        this.rightcard3.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard4);
        this.rightcard4.setY(125.0D);
        this.rightcard4.setImage(this.cardback);
        this.rightcard4.setFitWidth(50.0D);
        this.rightcard4.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard5);
        this.rightcard5.setY(150.0D);
        this.rightcard5.setImage(this.cardback);
        this.rightcard5.setFitWidth(50.0D);
        this.rightcard5.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard6);
        this.rightcard6.setY(175.0D);
        this.rightcard6.setImage(this.cardback);
        this.rightcard6.setFitWidth(50.0D);
        this.rightcard6.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard7);
        this.rightcard7.setY(200.0D);
        this.rightcard7.setImage(this.cardback);
        this.rightcard7.setFitWidth(50.0D);
        this.rightcard7.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard8);
        this.rightcard8.setY(225.0D);
        this.rightcard8.setImage(this.cardback);
        this.rightcard8.setFitWidth(50.0D);
        this.rightcard8.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard9);
        this.rightcard9.setY(250.0D);
        this.rightcard9.setImage(this.cardback);
        this.rightcard9.setFitWidth(50.0D);
        this.rightcard9.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard10);
        this.rightcard10.setY(275.0D);
        this.rightcard10.setImage(this.cardback);
        this.rightcard10.setFitWidth(50.0D);
        this.rightcard10.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard11);
        this.rightcard11.setY(300.0D);
        this.rightcard11.setImage(this.cardback);
        this.rightcard11.setFitWidth(50.0D);
        this.rightcard11.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard12);
        this.rightcard12.setY(325.0D);
        this.rightcard12.setImage(this.cardback);
        this.rightcard12.setFitWidth(50.0D);
        this.rightcard12.setFitHeight(100.0D);
        this.rightPane.getChildren().add(this.rightcard13);
        this.rightcard13.setY(350.0D);
        this.rightcard13.setImage(this.cardback);
        this.rightcard13.setFitWidth(50.0D);
        this.rightcard13.setFitHeight(100.0D);
        this.appPane.setTop(this.topPane);
        this.appPane.setCenter(this.centerPane);
        this.appPane.setBottom(this.bottomPane);
        this.appPane.setLeft(this.leftPane);
        this.appPane.setRight(this.rightPane);
        this.window = primaryStage;
        this.window.setWidth(1200.0D);
        this.window.setHeight(650.0D);
        this.window.setScene(this.scene);
        this.window.show();
        this.Handlers();
    }

    private Image loadImage(String imageFileURL) {
        Image image = new Image(imageFileURL);
        return !image.isError() ? image : null;
    }

    private ImageView getImageView(Image image, int width, int height) {
        ImageView view = new ImageView(image);
        view.setFitWidth((double)width);
        view.setFitHeight((double)height);
        return view;
    }

    public void Handlers() {
        this.exit.setOnAction((e) -> {
            System.exit(0);
        });
        this.newGame.setOnAction((e) -> {
            this.reset();
        });
    }

    public void reset() {
        this.skip.setText("");
        this.loadScore("Score.dat");
        this.gameOver = false;
        this.turn.setText("Your Turn");
        this.heart1.setVisible(false);
        this.heart2.setVisible(false);
        this.heart3.setVisible(false);
        this.heart4.setVisible(false);
        this.heart5.setVisible(false);
        this.heart6.setVisible(false);
        this.heart7.setVisible(false);
        this.heart8.setVisible(false);
        this.heart9.setVisible(false);
        this.heart10.setVisible(false);
        this.heart11.setVisible(false);
        this.heart12.setVisible(false);
        this.heart13.setVisible(false);
        this.diamond1.setVisible(false);
        this.diamond2.setVisible(false);
        this.diamond3.setVisible(false);
        this.diamond4.setVisible(false);
        this.diamond5.setVisible(false);
        this.diamond6.setVisible(false);
        this.diamond7.setVisible(false);
        this.diamond8.setVisible(false);
        this.diamond9.setVisible(false);
        this.diamond10.setVisible(false);
        this.diamond11.setVisible(false);
        this.diamond12.setVisible(false);
        this.diamond13.setVisible(false);
        this.club1.setVisible(false);
        this.club2.setVisible(false);
        this.club3.setVisible(false);
        this.club4.setVisible(false);
        this.club5.setVisible(false);
        this.club6.setVisible(false);
        this.club7.setVisible(false);
        this.club8.setVisible(false);
        this.club9.setVisible(false);
        this.club10.setVisible(false);
        this.club11.setVisible(false);
        this.club12.setVisible(false);
        this.club13.setVisible(false);
        this.spade1.setVisible(false);
        this.spade2.setVisible(false);
        this.spade3.setVisible(false);
        this.spade4.setVisible(false);
        this.spade5.setVisible(false);
        this.spade6.setVisible(false);
        this.spade7.setVisible(false);
        this.spade8.setVisible(false);
        this.spade9.setVisible(false);
        this.spade10.setVisible(false);
        this.spade11.setVisible(false);
        this.spade12.setVisible(false);
        this.spade13.setVisible(false);
        this.card1.setVisible(true);
        this.card2.setVisible(true);
        this.card3.setVisible(true);
        this.card4.setVisible(true);
        this.card5.setVisible(true);
        this.card6.setVisible(true);
        this.card7.setVisible(true);
        this.card8.setVisible(true);
        this.card9.setVisible(true);
        this.card10.setVisible(true);
        this.card11.setVisible(true);
        this.card12.setVisible(true);
        this.card13.setVisible(true);
        this.leftcard1.setVisible(true);
        this.leftcard2.setVisible(true);
        this.leftcard3.setVisible(true);
        this.leftcard4.setVisible(true);
        this.leftcard5.setVisible(true);
        this.leftcard6.setVisible(true);
        this.leftcard7.setVisible(true);
        this.leftcard8.setVisible(true);
        this.leftcard9.setVisible(true);
        this.leftcard10.setVisible(true);
        this.leftcard11.setVisible(true);
        this.leftcard12.setVisible(true);
        this.leftcard13.setVisible(true);
        this.rightcard1.setVisible(true);
        this.rightcard2.setVisible(true);
        this.rightcard3.setVisible(true);
        this.rightcard4.setVisible(true);
        this.rightcard5.setVisible(true);
        this.rightcard6.setVisible(true);
        this.rightcard7.setVisible(true);
        this.rightcard8.setVisible(true);
        this.rightcard9.setVisible(true);
        this.rightcard10.setVisible(true);
        this.rightcard11.setVisible(true);
        this.rightcard12.setVisible(true);
        this.rightcard13.setVisible(true);
        this.topcard1.setVisible(true);
        this.topcard2.setVisible(true);
        this.topcard3.setVisible(true);
        this.topcard4.setVisible(true);
        this.topcard5.setVisible(true);
        this.topcard6.setVisible(true);
        this.topcard7.setVisible(true);
        this.topcard8.setVisible(true);
        this.topcard9.setVisible(true);
        this.topcard10.setVisible(true);
        this.topcard11.setVisible(true);
        this.topcard12.setVisible(true);
        this.topcard13.setVisible(true);
        this.firstTurn = true;
        this.deck = shuffle();
        this.gameOver = false;
        this.startgame(this.deck);
        this.Checkbox();
        this.firstTurn(this.deck);
    }

    public void firstTurn(int[] array) {
        boolean first = false;
        boolean move = true;
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        boolean five = false;
        boolean six = false;
        boolean seven = false;
        boolean eight = false;
        boolean nine = false;
        boolean ten = false;
        boolean eleven = false;
        boolean twelve = false;
        boolean thirteen = false;

        for(int i = 0; i <= 12; ++i) {
            int value = array[i];
            if (value == 6 || value == 19 || value == 32 || value == 45) {
                first = true;
                if (i == 0) {
                    one = true;
                } else if (i == 1) {
                    two = true;
                } else if (i == 2) {
                    three = true;
                } else if (i == 3) {
                    four = true;
                } else if (i == 4) {
                    five = true;
                } else if (i == 5) {
                    six = true;
                } else if (i == 6) {
                    seven = true;
                } else if (i == 7) {
                    eight = true;
                } else if (i == 8) {
                    nine = true;
                } else if (i == 9) {
                    ten = true;
                } else if (i == 10) {
                    eleven = true;
                } else if (i == 11) {
                    twelve = true;
                } else if (i == 12) {
                    thirteen = true;
                }
            }
        }

        if (!first) {
            this.skip.setText(" 1st turn skipped");
            this.AITurns();
            this.initFirstTurn(one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen);
        } else {
            this.initFirstTurn(one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen);
        }

    }

    public void initFirstTurn(boolean one, boolean two, boolean three, boolean four, boolean five, boolean six, boolean seven, boolean eight, boolean nine, boolean ten, boolean eleven, boolean twelve, boolean thirteen) {
        this.random.setOnAction((e) -> {
            if (!this.gameOver) {
                this.randomPlay();
            }

        });
        this.cheatButton.setOnAction((e) -> {
            this.Checkbox();
        });
        this.card1.setOnAction((e) -> {
            int a = 1;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card2.setOnAction((e) -> {
            int a = 2;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card3.setOnAction((e) -> {
            int a = 3;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card4.setOnAction((e) -> {
            int a = 4;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card5.setOnAction((e) -> {
            int a = 5;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card6.setOnAction((e) -> {
            int a = 6;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card7.setOnAction((e) -> {
            int a = 7;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card8.setOnAction((e) -> {
            int a = 8;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card9.setOnAction((e) -> {
            int a = 9;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card10.setOnAction((e) -> {
            int a = 10;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card11.setOnAction((e) -> {
            int a = 11;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card12.setOnAction((e) -> {
            int a = 12;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
        this.card13.setOnAction((e) -> {
            int a = 13;
            if (!this.gameOver) {
                this.checkcard(a);
            }

        });
    }

    public void checkcard(int a) {
        boolean check;
        if (a == 1) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card1.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 2) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card2.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 3) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card3.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 4) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card4.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 5) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card5.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 6) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card6.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 7) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card7.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 8) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card8.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 9) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card9.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 10) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card10.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 11) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card11.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 12) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card12.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        } else if (a == 13) {
            check = this.CheckLegal(this.deck[a - 1]);
            if (check) {
                this.Change(a - 1);
                this.card13.setVisible(false);
                this.deck[a - 1] = -1;
                this.AITurns();
            }
        }

    }

    public void loadScore(String fileName) {
        try {
            File f = new File(fileName);
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            int length = dis.readInt();
            byte[] data = new byte[length];
            dis.readFully(data);
            String str = new String(data, "UTF-8");
            int a = str.indexOf(32) + 1;
            int b = str.indexOf(76);
            String str2 = str.substring(a, b - 1);
            Integer g = Integer.valueOf(str2);
            Score.setWins(g);
            int c = str.lastIndexOf(32) + 1;
            int e = str.length();
            String str1 = str.substring(c, e);
            Integer d = Integer.valueOf(str1);
            Score.setLosses(d);
            this.score.setText(str);
        } catch (IOException var16) {
            var16.printStackTrace();
        }

    }

    public void writeScore(String fileName, boolean win) {
        try {
            File f = new File(fileName);
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            String temp;
            byte[] data;
            if (win) {
                temp = "Wins: " + Score.getWins() + " Losses: " + Score.getLosses();
                data = temp.getBytes("UTF-8");
                dos.writeInt(data.length);
                dos.write(data);
            } else {
                temp = "Wins: " + Score.getWinss() + " Losses: " + Score.getLossess();
                data = temp.getBytes("UTF-8");
                dos.writeInt(data.length);
                dos.write(data);
            }

            dos.close();
        } catch (IOException var8) {
            var8.printStackTrace();
        }

    }

    public boolean Winner(int min, int max) {
        boolean win = true;

        for(int i = min; i <= max; ++i) {
            if (this.deck[i] != -1) {
                win = false;
            }
        }

        return win;
    }

    public void AITurns() {
        boolean first = true;
        this.firstTurn = false;
        if (this.Winner(0, 12)) {
            this.skip.setText(" You Win");
            this.turn.setText("");
            this.gameOver = true;
            this.writeScore("Score.dat", true);
        } else {
            this.LeftFirstTurn(this.deck, first);
            if (this.Winner(13, 25)) {
                this.skip.setText(" Left AI wins");
                this.turn.setText(" ");
                this.gameOver = true;
                this.writeScore("Score.dat", false);
            } else {
                this.RightFirstTurn(this.deck, first);
                if (this.Winner(26, 38)) {
                    this.skip.setText(" Right AI wins");
                    this.turn.setText(" ");
                    this.gameOver = true;
                    this.writeScore("Score.dat", false);
                } else {
                    this.TopFirstTurn(this.deck, first);
                    if (this.Winner(39, 51)) {
                        this.skip.setText(" Top AI wins");
                        this.turn.setText(" ");
                        this.gameOver = true;
                        this.writeScore("Score.dat", false);
                    }
                }
            }
        }

    }

    public void LeftFirstTurn(int[] array, boolean first) {
        boolean one = true;
        boolean succ = false;

        for(int i = 13; i <= 25; ++i) {
            boolean legal = this.CheckLegal(array[i]);
            if (one && legal) {
                one = false;
                this.Change(i);
                this.Dissapear(i);
                array[i] = -1;
                succ = true;
            }
        }

    }

    public void Dissapear(int i) {
        if (i == 13) {
            this.leftcard1.setVisible(false);
        } else if (i == 14) {
            this.leftcard2.setVisible(false);
        } else if (i == 15) {
            this.leftcard3.setVisible(false);
        } else if (i == 16) {
            this.leftcard4.setVisible(false);
        } else if (i == 17) {
            this.leftcard5.setVisible(false);
        } else if (i == 18) {
            this.leftcard6.setVisible(false);
        } else if (i == 19) {
            this.leftcard7.setVisible(false);
        } else if (i == 20) {
            this.leftcard8.setVisible(false);
        } else if (i == 21) {
            this.leftcard9.setVisible(false);
        } else if (i == 22) {
            this.leftcard10.setVisible(false);
        } else if (i == 23) {
            this.leftcard11.setVisible(false);
        } else if (i == 24) {
            this.leftcard12.setVisible(false);
        } else if (i == 25) {
            this.leftcard13.setVisible(false);
        } else if (i == 26) {
            this.rightcard1.setVisible(false);
        } else if (i == 27) {
            this.rightcard2.setVisible(false);
        } else if (i == 28) {
            this.rightcard3.setVisible(false);
        } else if (i == 29) {
            this.rightcard4.setVisible(false);
        } else if (i == 30) {
            this.rightcard5.setVisible(false);
        } else if (i == 31) {
            this.rightcard6.setVisible(false);
        } else if (i == 32) {
            this.rightcard7.setVisible(false);
        } else if (i == 33) {
            this.rightcard8.setVisible(false);
        } else if (i == 34) {
            this.rightcard9.setVisible(false);
        } else if (i == 35) {
            this.rightcard10.setVisible(false);
        } else if (i == 36) {
            this.rightcard11.setVisible(false);
        } else if (i == 37) {
            this.rightcard12.setVisible(false);
        } else if (i == 38) {
            this.rightcard13.setVisible(false);
        } else if (i == 39) {
            this.topcard1.setVisible(false);
        } else if (i == 40) {
            this.topcard2.setVisible(false);
        } else if (i == 41) {
            this.topcard3.setVisible(false);
        } else if (i == 42) {
            this.topcard4.setVisible(false);
        } else if (i == 43) {
            this.topcard5.setVisible(false);
        } else if (i == 44) {
            this.topcard6.setVisible(false);
        } else if (i == 45) {
            this.topcard7.setVisible(false);
        } else if (i == 46) {
            this.topcard8.setVisible(false);
        } else if (i == 47) {
            this.topcard9.setVisible(false);
        } else if (i == 48) {
            this.topcard10.setVisible(false);
        } else if (i == 49) {
            this.topcard11.setVisible(false);
        } else if (i == 50) {
            this.topcard12.setVisible(false);
        } else if (i == 51) {
            this.topcard13.setVisible(false);
        }

    }

    public boolean CheckLegal(int a) {
        boolean legal = false;
        if (a == -1) {
            legal = false;
        } else if (a == 0) {
            if (this.heart2.isVisible()) {
                legal = true;
            }
        } else if (a == 1) {
            if (this.heart3.isVisible()) {
                legal = true;
            }
        } else if (a == 2) {
            if (this.heart4.isVisible()) {
                legal = true;
            }
        } else if (a == 3) {
            if (this.heart5.isVisible()) {
                legal = true;
            }
        } else if (a == 4) {
            if (this.heart6.isVisible()) {
                legal = true;
            }
        } else if (a == 5) {
            if (this.heart7.isVisible()) {
                legal = true;
            }
        } else if (a == 6) {
            legal = true;
        } else if (a == 7) {
            if (this.heart7.isVisible()) {
                legal = true;
            }
        } else if (a == 8) {
            if (this.heart8.isVisible()) {
                legal = true;
            }
        } else if (a == 9) {
            if (this.heart9.isVisible()) {
                legal = true;
            }
        } else if (a == 10) {
            if (this.heart10.isVisible()) {
                legal = true;
            }
        } else if (a == 11) {
            if (this.heart11.isVisible()) {
                legal = true;
            }
        } else if (a == 12) {
            if (this.heart12.isVisible()) {
                legal = true;
            }
        } else if (a == 13) {
            if (this.diamond2.isVisible()) {
                legal = true;
            }
        } else if (a == 14) {
            if (this.diamond3.isVisible()) {
                legal = true;
            }
        } else if (a == 15) {
            if (this.diamond4.isVisible()) {
                legal = true;
            }
        } else if (a == 16) {
            if (this.diamond5.isVisible()) {
                legal = true;
            }
        } else if (a == 17) {
            if (this.diamond6.isVisible()) {
                legal = true;
            }
        } else if (a == 18) {
            if (this.diamond7.isVisible()) {
                legal = true;
            }
        } else if (a == 19) {
            legal = true;
        } else if (a == 20) {
            if (this.diamond7.isVisible()) {
                legal = true;
            }
        } else if (a == 21) {
            if (this.diamond8.isVisible()) {
                legal = true;
            }
        } else if (a == 22) {
            if (this.diamond9.isVisible()) {
                legal = true;
            }
        } else if (a == 23) {
            if (this.diamond10.isVisible()) {
                legal = true;
            }
        } else if (a == 24) {
            if (this.diamond11.isVisible()) {
                legal = true;
            }
        } else if (a == 25) {
            if (this.diamond12.isVisible()) {
                legal = true;
            }
        } else if (a == 26) {
            if (this.club2.isVisible()) {
                legal = true;
            }
        } else if (a == 27) {
            if (this.club3.isVisible()) {
                legal = true;
            }
        } else if (a == 28) {
            if (this.club4.isVisible()) {
                legal = true;
            }
        } else if (a == 29) {
            if (this.club5.isVisible()) {
                legal = true;
            }
        } else if (a == 30) {
            if (this.club6.isVisible()) {
                legal = true;
            }
        } else if (a == 31) {
            if (this.club7.isVisible()) {
                legal = true;
            }
        } else if (a == 32) {
            legal = true;
        } else if (a == 33) {
            if (this.club7.isVisible()) {
                legal = true;
            }
        } else if (a == 34) {
            if (this.club8.isVisible()) {
                legal = true;
            }
        } else if (a == 35) {
            if (this.club9.isVisible()) {
                legal = true;
            }
        } else if (a == 36) {
            if (this.club10.isVisible()) {
                legal = true;
            }
        } else if (a == 37) {
            if (this.club11.isVisible()) {
                legal = true;
            }
        } else if (a == 38) {
            if (this.club12.isVisible()) {
                legal = true;
            }
        } else if (a == 39) {
            if (this.spade2.isVisible()) {
                legal = true;
            }
        } else if (a == 40) {
            if (this.spade3.isVisible()) {
                legal = true;
            }
        } else if (a == 41) {
            if (this.spade4.isVisible()) {
                legal = true;
            }
        } else if (a == 42) {
            if (this.spade5.isVisible()) {
                legal = true;
            }
        } else if (a == 43) {
            if (this.spade6.isVisible()) {
                legal = true;
            }
        } else if (a == 44) {
            if (this.spade7.isVisible()) {
                legal = true;
            }
        } else if (a == 45) {
            legal = true;
        } else if (a == 46) {
            if (this.spade7.isVisible()) {
                legal = true;
            }
        } else if (a == 47) {
            if (this.spade8.isVisible()) {
                legal = true;
            }
        } else if (a == 48) {
            if (this.spade9.isVisible()) {
                legal = true;
            }
        } else if (a == 49) {
            if (this.spade10.isVisible()) {
                legal = true;
            }
        } else if (a == 50) {
            if (this.spade11.isVisible()) {
                legal = true;
            }
        } else if (a == 51 && this.spade12.isVisible()) {
            legal = true;
        }

        return legal;
    }

    public boolean CheckPlayerTurn() {
        boolean ans = true;

        for(int i = 0; i <= 12; ++i) {
            if (this.CheckLegal(this.deck[i])) {
                ans = false;
            }
        }

        return ans;
    }

    public void TopFirstTurn(int[] array, boolean first) {
        boolean one = true;
        boolean succ = false;

        for(int i = 39; i <= 51; ++i) {
            boolean legal = this.CheckLegal(array[i]);
            if (one && legal) {
                one = false;
                this.Change(i);
                this.Dissapear(i);
                array[i] = -1;
                succ = true;
            }
        }

        boolean skipe = this.CheckPlayerTurn();
        if (skipe) {
            this.skip.setText(" (You were skipped");
            this.AITurns();
        } else {
            this.skip.setText(" ");
        }

    }

    public void RightFirstTurn(int[] array, boolean first) {
        boolean one = true;
        boolean succ = false;

        for(int i = 26; i <= 38; ++i) {
            boolean legal = this.CheckLegal(array[i]);
            if (one && legal) {
                one = false;
                this.Change(i);
                this.Dissapear(i);
                array[i] = -1;
                succ = true;
            }
        }

    }

    public void Change(int a) {
        int b = this.deck[a];
        if (b == 0) {
            this.heart1.setImage(this.h1);
            this.heart1.setVisible(true);
        } else if (b == 1) {
            this.heart2.setImage(this.h2);
            this.heart2.setVisible(true);
        } else if (b == 2) {
            this.heart3.setImage(this.h3);
            this.heart3.setVisible(true);
        } else if (b == 3) {
            this.heart4.setImage(this.h4);
            this.heart4.setVisible(true);
        } else if (b == 4) {
            this.heart5.setImage(this.h5);
            this.heart5.setVisible(true);
        } else if (b == 5) {
            this.heart6.setImage(this.h6);
            this.heart6.setVisible(true);
        } else if (b == 6) {
            this.heart7.setImage(this.h7);
            this.heart7.setVisible(true);
        } else if (b == 7) {
            this.heart8.setImage(this.h8);
            this.heart8.setVisible(true);
        } else if (b == 8) {
            this.heart9.setImage(this.h9);
            this.heart9.setVisible(true);
        } else if (b == 9) {
            this.heart10.setImage(this.h10);
            this.heart10.setVisible(true);
        } else if (b == 10) {
            this.heart11.setImage(this.h11);
            this.heart11.setVisible(true);
        } else if (b == 11) {
            this.heart12.setImage(this.h12);
            this.heart12.setVisible(true);
        } else if (b == 12) {
            this.heart13.setImage(this.h13);
            this.heart13.setVisible(true);
        } else if (b == 13) {
            this.diamond1.setImage(this.d1);
            this.diamond1.setVisible(true);
        } else if (b == 14) {
            this.diamond2.setImage(this.d2);
            this.diamond2.setVisible(true);
        } else if (b == 15) {
            this.diamond3.setImage(this.d3);
            this.diamond3.setVisible(true);
        } else if (b == 16) {
            this.diamond4.setImage(this.d4);
            this.diamond4.setVisible(true);
        } else if (b == 17) {
            this.diamond5.setImage(this.d5);
            this.diamond5.setVisible(true);
        } else if (b == 18) {
            this.diamond6.setImage(this.d6);
            this.diamond6.setVisible(true);
        } else if (b == 19) {
            this.diamond7.setImage(this.d7);
            this.diamond7.setVisible(true);
        } else if (b == 20) {
            this.diamond8.setImage(this.d8);
            this.diamond8.setVisible(true);
        } else if (b == 21) {
            this.diamond9.setImage(this.d9);
            this.diamond9.setVisible(true);
        } else if (b == 22) {
            this.diamond10.setImage(this.d10);
            this.diamond10.setVisible(true);
        } else if (b == 23) {
            this.diamond11.setImage(this.d11);
            this.diamond11.setVisible(true);
        } else if (b == 24) {
            this.diamond12.setImage(this.d12);
            this.diamond12.setVisible(true);
        } else if (b == 25) {
            this.diamond13.setImage(this.d13);
            this.diamond13.setVisible(true);
        } else if (b == 26) {
            this.club1.setImage(this.c1);
            this.club1.setVisible(true);
        } else if (b == 27) {
            this.club2.setImage(this.c2);
            this.club2.setVisible(true);
        } else if (b == 28) {
            this.club3.setImage(this.c3);
            this.club3.setVisible(true);
        } else if (b == 29) {
            this.club4.setImage(this.c4);
            this.club4.setVisible(true);
        } else if (b == 30) {
            this.club5.setImage(this.c5);
            this.club5.setVisible(true);
        } else if (b == 31) {
            this.club6.setImage(this.c6);
            this.club6.setVisible(true);
        } else if (b == 32) {
            this.club7.setImage(this.c7);
            this.club7.setVisible(true);
        } else if (b == 33) {
            this.club8.setImage(this.c8);
            this.club8.setVisible(true);
        } else if (b == 34) {
            this.club9.setImage(this.c9);
            this.club9.setVisible(true);
        } else if (b == 35) {
            this.club10.setImage(this.c10);
            this.club10.setVisible(true);
        } else if (b == 36) {
            this.club11.setImage(this.c11);
            this.club11.setVisible(true);
        } else if (b == 37) {
            this.club12.setImage(this.c12);
            this.club12.setVisible(true);
        } else if (b == 38) {
            this.club13.setImage(this.c13);
            this.club13.setVisible(true);
        } else if (b == 39) {
            this.spade1.setImage(this.s1);
            this.spade1.setVisible(true);
        } else if (b == 40) {
            this.spade2.setImage(this.s2);
            this.spade2.setVisible(true);
        } else if (b == 41) {
            this.spade3.setImage(this.s3);
            this.spade3.setVisible(true);
        } else if (b == 42) {
            this.spade4.setImage(this.s4);
            this.spade4.setVisible(true);
        } else if (b == 43) {
            this.spade5.setImage(this.s5);
            this.spade5.setVisible(true);
        } else if (b == 44) {
            this.spade6.setImage(this.s6);
            this.spade6.setVisible(true);
        } else if (b == 45) {
            this.spade7.setImage(this.s7);
            this.spade7.setVisible(true);
        } else if (b == 46) {
            this.spade8.setImage(this.s8);
            this.spade8.setVisible(true);
        } else if (b == 47) {
            this.spade9.setImage(this.s9);
            this.spade9.setVisible(true);
        } else if (b == 48) {
            this.spade10.setImage(this.s10);
            this.spade10.setVisible(true);
        } else if (b == 49) {
            this.spade11.setImage(this.s11);
            this.spade11.setVisible(true);
        } else if (b == 50) {
            this.spade12.setImage(this.s12);
            this.spade12.setVisible(true);
        } else if (b == 51) {
            this.spade13.setImage(this.s13);
            this.spade13.setVisible(true);
        }

    }

    public static int[] shuffle() {
        int[] deck = new int[52];

        int l;
        for(l = 0; l < deck.length; deck[l] = l++) {
        }

        for(l = 0; l < deck.length; ++l) {
            int index = (int)(Math.random() * (double)deck.length);
            int temp = deck[l];
            deck[l] = deck[index];
            deck[index] = temp;
        }

        return deck;
    }

    public void startgame(int[] array) {
        int counter = 0;

        int counter2;
        int counter3;
        for(counter2 = 0; counter2 <= 12; ++counter2) {
            counter3 = array[counter2];
            this.loadplayercard(counter3, counter);
            ++counter;
        }

        counter2 = 0;

        int counter4;
        for(counter3 = 13; counter3 <= 25; ++counter3) {
            counter4 = array[counter3];
            this.loadleftcard(counter4, counter2);
            ++counter2;
        }

        counter3 = 0;

        int l;
        for(counter4 = 26; counter4 <= 38; ++counter4) {
            l = array[counter4];
            this.loadrightcard(l, counter3);
            ++counter3;
        }

        counter4 = 0;

        for(l = 39; l <= 51; ++l) {
            int num4 = array[l];
            this.loadtopcard(num4, counter4);
            ++counter4;
        }

    }

    public void loadplayercard(int num, int number) {
        Image img = this.find(num);
        if (number == 0) {
            this.player1.setImage(img);
        } else if (number == 1) {
            this.player2.setImage(img);
        } else if (number == 2) {
            this.player3.setImage(img);
        } else if (number == 3) {
            this.player4.setImage(img);
        } else if (number == 4) {
            this.player5.setImage(img);
        } else if (number == 5) {
            this.player6.setImage(img);
        } else if (number == 6) {
            this.player7.setImage(img);
        } else if (number == 7) {
            this.player8.setImage(img);
        } else if (number == 8) {
            this.player9.setImage(img);
        } else if (number == 9) {
            this.player10.setImage(img);
        } else if (number == 10) {
            this.player11.setImage(img);
        } else if (number == 11) {
            this.player12.setImage(img);
        } else if (number == 12) {
            this.player13.setImage(img);
        }

    }

    public void loadleftcard(int num, int number) {
        Image img = this.find(num);
        if (number == 0) {
            this.leftcard1.setImage(img);
        } else if (number == 1) {
            this.leftcard2.setImage(img);
        } else if (number == 2) {
            this.leftcard3.setImage(img);
        } else if (number == 3) {
            this.leftcard4.setImage(img);
        } else if (number == 4) {
            this.leftcard5.setImage(img);
        } else if (number == 5) {
            this.leftcard6.setImage(img);
        } else if (number == 6) {
            this.leftcard7.setImage(img);
        } else if (number == 7) {
            this.leftcard8.setImage(img);
        } else if (number == 8) {
            this.leftcard9.setImage(img);
        } else if (number == 9) {
            this.leftcard10.setImage(img);
        } else if (number == 10) {
            this.leftcard11.setImage(img);
        } else if (number == 11) {
            this.leftcard12.setImage(img);
        } else if (number == 12) {
            this.leftcard13.setImage(img);
        }

    }

    public void loadrightcard(int num, int number) {
        Image img = this.find(num);
        if (number == 0) {
            this.rightcard1.setImage(img);
        } else if (number == 1) {
            this.rightcard2.setImage(img);
        } else if (number == 2) {
            this.rightcard3.setImage(img);
        } else if (number == 3) {
            this.rightcard4.setImage(img);
        } else if (number == 4) {
            this.rightcard5.setImage(img);
        } else if (number == 5) {
            this.rightcard6.setImage(img);
        } else if (number == 6) {
            this.rightcard7.setImage(img);
        } else if (number == 7) {
            this.rightcard8.setImage(img);
        } else if (number == 8) {
            this.rightcard9.setImage(img);
        } else if (number == 9) {
            this.rightcard10.setImage(img);
        } else if (number == 10) {
            this.rightcard11.setImage(img);
        } else if (number == 11) {
            this.rightcard12.setImage(img);
        } else if (number == 12) {
            this.rightcard13.setImage(img);
        }

    }

    public void loadtopcard(int num, int number) {
        Image img = this.find(num);
        if (number == 0) {
            this.topcard1.setImage(img);
        } else if (number == 1) {
            this.topcard2.setImage(img);
        } else if (number == 2) {
            this.topcard3.setImage(img);
        } else if (number == 3) {
            this.topcard4.setImage(img);
        } else if (number == 4) {
            this.topcard5.setImage(img);
        } else if (number == 5) {
            this.topcard6.setImage(img);
        } else if (number == 6) {
            this.topcard7.setImage(img);
        } else if (number == 7) {
            this.topcard8.setImage(img);
        } else if (number == 8) {
            this.topcard9.setImage(img);
        } else if (number == 9) {
            this.topcard10.setImage(img);
        } else if (number == 10) {
            this.topcard11.setImage(img);
        } else if (number == 11) {
            this.topcard12.setImage(img);
        } else if (number == 12) {
            this.topcard13.setImage(img);
        }

    }

    public Image find(int number) {
        Image image;
        if (number == 0) {
            image = this.h1;
        } else if (number == 1) {
            image = this.h2;
        } else if (number == 2) {
            image = this.h3;
        } else if (number == 3) {
            image = this.h4;
        } else if (number == 4) {
            image = this.h5;
        } else if (number == 5) {
            image = this.h6;
        } else if (number == 6) {
            image = this.h7;
        } else if (number == 7) {
            image = this.h8;
        } else if (number == 8) {
            image = this.h9;
        } else if (number == 9) {
            image = this.h10;
        } else if (number == 10) {
            image = this.h11;
        } else if (number == 11) {
            image = this.h12;
        } else if (number == 12) {
            image = this.h13;
        } else if (number == 13) {
            image = this.d1;
        } else if (number == 14) {
            image = this.d2;
        } else if (number == 15) {
            image = this.d3;
        } else if (number == 16) {
            image = this.d4;
        } else if (number == 17) {
            image = this.d5;
        } else if (number == 18) {
            image = this.d6;
        } else if (number == 19) {
            image = this.d7;
        } else if (number == 20) {
            image = this.d8;
        } else if (number == 21) {
            image = this.d9;
        } else if (number == 22) {
            image = this.d10;
        } else if (number == 23) {
            image = this.d11;
        } else if (number == 24) {
            image = this.d12;
        } else if (number == 25) {
            image = this.d13;
        } else if (number == 26) {
            image = this.c1;
        } else if (number == 27) {
            image = this.c2;
        } else if (number == 28) {
            image = this.c3;
        } else if (number == 29) {
            image = this.c4;
        } else if (number == 30) {
            image = this.c5;
        } else if (number == 31) {
            image = this.c6;
        } else if (number == 32) {
            image = this.c7;
        } else if (number == 33) {
            image = this.c8;
        } else if (number == 34) {
            image = this.c9;
        } else if (number == 35) {
            image = this.c10;
        } else if (number == 36) {
            image = this.c11;
        } else if (number == 37) {
            image = this.c12;
        } else if (number == 38) {
            image = this.c13;
        } else if (number == 39) {
            image = this.s1;
        } else if (number == 40) {
            image = this.s2;
        } else if (number == 41) {
            image = this.s3;
        } else if (number == 42) {
            image = this.s4;
        } else if (number == 43) {
            image = this.s5;
        } else if (number == 44) {
            image = this.s6;
        } else if (number == 45) {
            image = this.s7;
        } else if (number == 46) {
            image = this.s8;
        } else if (number == 47) {
            image = this.s9;
        } else if (number == 48) {
            image = this.s10;
        } else if (number == 49) {
            image = this.s11;
        } else if (number == 50) {
            image = this.s12;
        } else {
            image = this.s13;
        }

        return image;
    }

    public void Checkbox() {
        if (this.cheat.isSelected()) {
            this.startgame(this.deck);
        } else {
            this.rightcard1.setImage(this.cardback);
            this.rightcard2.setImage(this.cardback);
            this.rightcard3.setImage(this.cardback);
            this.rightcard4.setImage(this.cardback);
            this.rightcard5.setImage(this.cardback);
            this.rightcard6.setImage(this.cardback);
            this.rightcard7.setImage(this.cardback);
            this.rightcard8.setImage(this.cardback);
            this.rightcard9.setImage(this.cardback);
            this.rightcard10.setImage(this.cardback);
            this.rightcard11.setImage(this.cardback);
            this.rightcard12.setImage(this.cardback);
            this.rightcard13.setImage(this.cardback);
            this.leftcard1.setImage(this.cardback);
            this.leftcard2.setImage(this.cardback);
            this.leftcard3.setImage(this.cardback);
            this.leftcard4.setImage(this.cardback);
            this.leftcard5.setImage(this.cardback);
            this.leftcard6.setImage(this.cardback);
            this.leftcard7.setImage(this.cardback);
            this.leftcard8.setImage(this.cardback);
            this.leftcard9.setImage(this.cardback);
            this.leftcard10.setImage(this.cardback);
            this.leftcard11.setImage(this.cardback);
            this.leftcard12.setImage(this.cardback);
            this.leftcard13.setImage(this.cardback);
            this.topcard1.setImage(this.cardback);
            this.topcard2.setImage(this.cardback);
            this.topcard3.setImage(this.cardback);
            this.topcard4.setImage(this.cardback);
            this.topcard5.setImage(this.cardback);
            this.topcard6.setImage(this.cardback);
            this.topcard7.setImage(this.cardback);
            this.topcard8.setImage(this.cardback);
            this.topcard9.setImage(this.cardback);
            this.topcard10.setImage(this.cardback);
            this.topcard11.setImage(this.cardback);
            this.topcard12.setImage(this.cardback);
            this.topcard13.setImage(this.cardback);
        }

    }

    public void randomPlay() {
        boolean one = false;

        for(int i = 0; i <= 12; ++i) {
            if (!one) {
                boolean check = this.CheckLegal(this.deck[i]);
                if (check) {
                    this.Change(i);
                    if (i == 0) {
                        this.card1.setVisible(false);
                    } else if (i == 1) {
                        this.card2.setVisible(false);
                    } else if (i == 2) {
                        this.card3.setVisible(false);
                    } else if (i == 3) {
                        this.card4.setVisible(false);
                    } else if (i == 4) {
                        this.card5.setVisible(false);
                    } else if (i == 5) {
                        this.card6.setVisible(false);
                    } else if (i == 6) {
                        this.card7.setVisible(false);
                    } else if (i == 7) {
                        this.card8.setVisible(false);
                    } else if (i == 8) {
                        this.card9.setVisible(false);
                    } else if (i == 9) {
                        this.card10.setVisible(false);
                    } else if (i == 10) {
                        this.card11.setVisible(false);
                    } else if (i == 11) {
                        this.card12.setVisible(false);
                    } else if (i == 12) {
                        this.card13.setVisible(false);
                    }

                    this.deck[i] = -1;
                    this.AITurns();
                    one = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
