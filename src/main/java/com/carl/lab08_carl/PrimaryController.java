import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class PrimaryController {
    
    @FXML private RadioButton blackRadioButton;
    @FXML private RadioButton redRadioButton;
    @FXML private RadioButton greenRadioButton;
    @FXML private RadioButton blueRadioButton;
    @FXML private RadioButton smallRadioButton;
    @FXML private RadioButton mediumRadioButton;
    @FXML private RadioButton largeRadioButton;
    @FXML private Pane drawingAreaPane;
    @FXML private ToggleGroup colorToggleGroup;
    @FXML private ToggleGroup sizeToggleGroup;
    
    private PenSize radius = PenSize.MEDIUM;
    private Paint brushColor = Color.BLACK;
    
    public void initialize() {
        blackRadioButton.setUserData(Color.BLACK);
        redRadioButton.setUserData(Color.RED);
        greenRadioButton.setUserData(Color.GREEN);
        blueRadioButton.setUserData(Color.BLUE);
        smallRadioButton.setUserData(PenSize.SMALL);
        mediumRadioButton.setUserData(PenSize.MEDIUM);
        largeRadioButton.setUserData(PenSize.LARGE);
    }
    
    @FXML
    void largeRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void mediumRadioButtonSelected(ActionEvent event) {

    }
    
    @FXML
    private ToggleGroup colorToggleGroup;

    @FXML
    private ToggleGroup sizeToggleGroup;

    @FXML
    void OnMouseDragged(MouseEvent event) {
        
    }

    @FXML
    void blackRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void blueRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void clearButtonPressed(ActionEvent event) {

    }

    @FXML
    void greenRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void redRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void smallRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void undoButtonPressed(ActionEvent event) {

    }
    
    private enum PenSize {
        SMALL(2), MEDIUM(4), LARGE(6);
        
        private final int radius;
        
        PenSize(int radius) {this.radius = radius;}
        
        public int getRadius() {return radius;}
    };
}