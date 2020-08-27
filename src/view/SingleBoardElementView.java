package view;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SingleBoardElementView extends StackPane {

    private SizesView sizesView;
    private ElementView elementView;
    private AccessoryView accessoryViewOne;
    private AccessoryView accessoryViewTwo;
    private AccessoryView accessoryViewThree;
    private ButtonView buttonViewHorizontal;
    private ButtonView buttonViewVertical;
    private ImageView elementImageView;

    private VBox boxForElementImageViewAndButtons;
    private HBox boxForButtonsImageViewsElementAccessories;

    private GridPane gridForButtonAddDelete;
    private GridPane gridForSizesView;
    private GridPane gridForElementView;
    private GridPane gridForAccessoriesView;
    private VBox VBoxForAccessoriesImageView;
    private GridPane gridForAll;

    private HBox boxForElementAnAccessoriesViews;

    public SingleBoardElementView() {

        //MasterGrid
        gridForAll = new GridPane();

        //Buttons
        gridForButtonAddDelete = new GridPane();
        buttonViewHorizontal = new ButtonView();
        buttonViewVertical = new ButtonView();

        //Sizes
        gridForSizesView = new GridPane();
        sizesView = new SizesView();

        //Elements
        gridForElementView = new GridPane();
        elementView = new ElementView();

        //Accessories
        gridForAccessoriesView = new GridPane();
        accessoryViewOne = new AccessoryView();
        accessoryViewTwo = new AccessoryView();
        accessoryViewThree = new AccessoryView();

        generateSizeView();
        generateElementView();
        generateImageViewElement();
        generateAccessoriesViews();
        generateImageViewAccessories();
        generateAddDeleteButton();
        createSubGrid();
        //setShowGridLines();
    }

    private void createSubGrid(){
        boxForElementImageViewAndButtons = new VBox();
        boxForElementImageViewAndButtons.getChildren().addAll(elementImageView, gridForButtonAddDelete);
        boxForButtonsImageViewsElementAccessories = new HBox();
        boxForButtonsImageViewsElementAccessories.getChildren().addAll(VBoxForAccessoriesImageView, boxForElementImageViewAndButtons);
        boxForElementAnAccessoriesViews = new HBox();
        boxForElementAnAccessoriesViews.getChildren().addAll(gridForSizesView, gridForElementView);

        gridForAll.add(boxForButtonsImageViewsElementAccessories,0,0);
        gridForAll.add(boxForElementAnAccessoriesViews, 0,1);

        getChildren().addAll(gridForAll);

    }

    private void generateImageViewElement(){

        elementImageView = elementView.getElementImageView();

    }

    
    private void generateImageViewAccessories(){

        VBoxForAccessoriesImageView = new VBox();
        ImageView accessoryOne = accessoryViewOne.getImageView();
        ImageView accessoryTwo = accessoryViewTwo.getImageView();
        ImageView accessoryThree = accessoryViewThree.getImageView();

        VBoxForAccessoriesImageView.getChildren().addAll(accessoryOne, accessoryTwo, accessoryThree);
    }

    private void generateAddDeleteButton() {

        gridForButtonAddDelete.add(buttonViewHorizontal.getButtonAdd(), 0,0);
        gridForButtonAddDelete.add(buttonViewHorizontal.getButtonDelete(), 1,0);
        gridForButtonAddDelete.add(buttonViewVertical.getButtonAdd(), 0,1);
        gridForButtonAddDelete.add(buttonViewVertical.getButtonDelete(), 1,1);
    }

    private void generateAccessoriesViews() {

        gridForAccessoriesView.add(accessoryViewOne.getLabelAccessory(), 0,0);
        gridForAccessoriesView.add(accessoryViewOne.getModel(), 0,1);
        gridForAccessoriesView.add(accessoryViewTwo.getModel(), 0,2);
        gridForAccessoriesView.add(accessoryViewThree.getModel(), 0,3);
    }

    private void generateElementView() {

        gridForElementView.add(elementView.getLabelElement(), 0,0);
        gridForElementView.add(elementView.getModel(), 0,1);
        gridForElementView.add(gridForAccessoriesView, 0,2);
    }

    private void generateSizeView() {

        gridForSizesView.add(sizesView.getHoehe(), 0,0);
        gridForSizesView.add(sizesView.getModelHoehe(), 0,1);

        gridForSizesView.add(sizesView.getLaenge(), 0,2);
        gridForSizesView.add(sizesView.getModelLaenge(), 0,3);

        gridForSizesView.add(sizesView.getTiefe(), 0,4);
        gridForSizesView.add(sizesView.getModelTiefe(), 0,5);
    }

    //Show lines
    private void setShowGridLines(){

        gridForAll.setGridLinesVisible(true);
    }


}