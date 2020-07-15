import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class ErrorClass {
	
    @FXML
    private Text errorMessage;
    
    @FXML
    private Button errorID;
    
    @FXML
    public void initialize(){
    	errorMessage.setText(Main.errorText);
    	errorMessage.setFont(new Font(Main.errorSize));
    	switch(Main.errorPriority) {
    	case 1:
    		errorMessage.setFill(Color.RED);
    		break;
    	case 2:
    		errorMessage.setFill(Color.YELLOW);
    		break;
    	case 3:
    		errorMessage.setFill(Color.GREEN);
    		break;
    	default:
    		errorMessage.setFill(Color.BLACK);
    		break;
    	}
    	
    }
	
    @FXML
    void errorEnter(ActionEvent event) {
    	//Main.errorStage.hide();
    	Stage closeStage = (Stage)errorID.getScene().getWindow();
    	closeStage.close();
    	Main.errorText = "שעה לא תקינה!";
    	Main.errorSize = 16;
    	Main.errorPriority = 1;
    }

}
