package view;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import view.componentviews.ElementSizesView;
import view.componentviews.ElementView;
import view.componentviews.ZubehoerView;

public class SingleBoardElementView extends StackPane {

    private ElementSizesView elementSizesView;
    private ElementView elementView;
    private ZubehoerView zubehoerViewOne;
    private ZubehoerView zubehoerViewTwo;
    private ZubehoerView zubehoerViewThree;
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

        //Sizes
        gridForSizesView = new GridPane();
        elementSizesView = new ElementSizesView();

        //Elements
        gridForElementView = new GridPane();
        elementView = new ElementView();

        //Accessories
        gridForAccessoriesView = new GridPane();
        zubehoerViewOne = new ZubehoerView();
        zubehoerViewTwo = new ZubehoerView();
        zubehoerViewThree = new ZubehoerView();

        generateSizeView();
        generateElementView();
        generateImageViewElement();
        generateAccessoriesViews();
        generateImageViewAccessories();
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
        ImageView accessoryOne = zubehoerViewOne.getImageView();
        ImageView accessoryTwo = zubehoerViewTwo.getImageView();
        ImageView accessoryThree = zubehoerViewThree.getImageView();

        VBoxForAccessoriesImageView.getChildren().addAll(accessoryOne, accessoryTwo, accessoryThree);
    }

    private void generateAccessoriesViews() {

        gridForAccessoriesView.add(zubehoerViewOne.getLabelAccessory(), 0,0);
        gridForAccessoriesView.add(zubehoerViewOne.getModel(), 0,1);
        gridForAccessoriesView.add(zubehoerViewTwo.getModel(), 0,2);
        gridForAccessoriesView.add(zubehoerViewThree.getModel(), 0,3);
    }

    private void generateElementView() {

        gridForElementView.add(elementView.getLabelElement(), 0,0);
        gridForElementView.add(elementView.getModel(), 0,1);
        gridForElementView.add(gridForAccessoriesView, 0,2);
    }

    private void generateSizeView() {

        gridForSizesView.add(elementSizesView.getHoehe(), 0,0);
        gridForSizesView.add(elementSizesView.getModelHoehe(), 0,1);

        gridForSizesView.add(elementSizesView.getLaenge(), 0,2);
        gridForSizesView.add(elementSizesView.getModelLaenge(), 0,3);

        gridForSizesView.add(elementSizesView.getTiefe(), 0,4);
        gridForSizesView.add(elementSizesView.getModelTiefe(), 0,5);
    }

    //Show lines
    private void setShowGridLines(){

        gridForAll.setGridLinesVisible(true);
    }


}