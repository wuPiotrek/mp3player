package pl.javastart.mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;

public class MainController {

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private TableView<?> contentTable;

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem firMenuItem;

    @FXML
    private Button nextButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button previousButton;

    @FXML
    private Slider progressSlider;

    @FXML
    private Slider volumeSlider;

}
