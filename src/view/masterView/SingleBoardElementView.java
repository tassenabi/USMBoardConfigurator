package view.masterView;

import javafx.scene.layout.*;
import view.componentviews.*;

public class SingleBoardElementView extends StackPane {

    private ElementSizesView elementSizesView;
    private ElementView elementView;
    private ZubehoerView zubehoerViewOne;
    private ZubehoerView zubehoerViewTwo;
    private ZubehoerView zubehoerViewThree;

    private HBox boxIsElementActive;

    private GridPane gridForSizesView;
    private GridPane gridForElementView;
    private GridPane gridForAccessoriesView;
    private GridPane gridForAll;

    private HBox boxForZubehoerViews;

    private IsElementActiveView ElementActiveComboBox;

    private ColorView colorView;

    public ElementSizesView getElementSizesView() {
        return elementSizesView;
    }

    public ElementView getElementView() {
        return elementView;
    }

    public ZubehoerView getZubehoerViewOne() {
        return zubehoerViewOne;
    }

    public ZubehoerView getZubehoerViewTwo() {
        return zubehoerViewTwo;
    }

    public ZubehoerView getZubehoerViewThree() {
        return zubehoerViewThree;
    }

    public IsElementActiveView getElementActiveComboBox() {
        return ElementActiveComboBox;
    }

    public ColorView getColorView() {
        return colorView;
    }

    public SingleBoardElementView() {

        //MasterGrid
        gridForAll = new GridPane();

        ElementActiveComboBox = new IsElementActiveView();

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

        colorView = new ColorView();

        generateSizeView();
        generateElementView();
        generateAccessoriesViews();
        createSubGrid();

    }

    private void createSubGrid(){
        boxIsElementActive = new HBox();
        boxIsElementActive.getChildren().addAll();
        boxIsElementActive.getChildren().addAll(ElementActiveComboBox.getModel(), colorView.getModel());

        boxForZubehoerViews = new HBox();
        boxForZubehoerViews.getChildren().addAll(gridForSizesView, gridForElementView);

        gridForAll.add(boxIsElementActive,0,0);
        gridForAll.add(boxForZubehoerViews, 0,1);

        getChildren().addAll(gridForAll);

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