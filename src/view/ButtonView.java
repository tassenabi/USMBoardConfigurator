package view;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.File;

public class ButtonView {

    private Button buttonDelete;
    private Button buttonAdd;

    public ButtonView(){

        generateButtons();
    }

    public Button getButtonDelete(){
        return this.buttonDelete;
    }

    public Button getButtonAdd(){
        return this.buttonAdd;
    }

    private ImageView createButtonImageView(String sourcePath){

        ImageView iconButtonImageView = createIcon(sourcePath);
        iconButtonImageView.setFitHeight(15);
        iconButtonImageView.setFitWidth(15);

        return iconButtonImageView;
    }

    private void generateButtons(){
        buttonAdd = new Button();
        buttonDelete = new Button();

        buttonAdd.setGraphic(createButtonImageView("src/resources/others/addIcon.png"));
        buttonDelete.setGraphic(createButtonImageView("src/resources/others/deleteIcon.png"));
    }

    private ImageView createIcon(String sourcePath){

        File fileAddIcon = new File(sourcePath);
        Image Icon = new Image(fileAddIcon.toURI().toString());
        ImageView IconView = new ImageView(Icon);

        return IconView;
    }

}

