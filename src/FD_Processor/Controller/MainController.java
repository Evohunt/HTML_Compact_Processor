package FD_Processor.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.File;
import java.nio.file.Files;

public class MainController {

    private File file;

    @FXML
    private Label home_button;

    @FXML
    private Label analyzer_button;

    @FXML
    private Label about_button;

    @FXML
    private Button load_file_button;

    @FXML
    private Label loaded_filename_label;

    @FXML
    private TextArea analyzer_log_textfield;

    @FXML
    private Button analyze_file_button;

    private String getFileExtension(File file) {
        if (file == null) {
            return "";
        }
        String name = file.getName();
        int i = name.lastIndexOf('.');
        String ext;
        ext = i > 0 ? name.substring(i + 1) : "";
        return ext;
    }

    private boolean isHTMLFileValid(String ext) {
        if (ext.equals("")) {
            return false;
        } else return ext.equals("html") || ext.equals("htm");
    }

    @FXML
    void analyze_html_file(ActionEvent event) {

        analyzer_log_textfield.setText("");

        if (isHTMLFileValid(getFileExtension(file))) {
            analyzer_log_textfield.appendText("File is a valid HTML file. \n");
        } else {
            analyzer_log_textfield.setText("Invalid HTML file.");
        }

    }

    @FXML
    void load_html_file(ActionEvent event) {

        FileChooser chooser = new FileChooser();
        chooser.setTitle("Open HTML File");

        file = chooser.showOpenDialog(null);
        if (file != null) {
            loaded_filename_label.setText(file.getName());
        } else {
            System.out.println("No file has been opened!");
        }
    }
}
