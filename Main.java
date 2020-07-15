

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	
	static Stage errorStage = new Stage();
	static Parent errorParent;
	static Scene errorScene;
	static String errorText = "שעה לא תקינה!";
	static int errorSize = 16, errorPriority = 1;
	
	
	public static void main(String[]args) {
		/* @@@ Not relevant
		try {
		File file = new File("P:\\\\Serial.s");
		if(!file.exists()) {
			System.out.println("noF");
			return;
		}
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String auth = br.readLine();
		
		DateFormat dateFormat;
		dateFormat = new SimpleDateFormat("yyMM");
		Date date = new Date();
		
		if(!auth.equals(dateFormat.format(date))) {
			System.out.println("noS");
			return;
		}
		br.close();
		fr.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		launch(args);
	}
	
	Stage mainStage = new Stage();
	
	Stage stage = new Stage();
	Parent parent;
	Scene scene;
	
	static Stage askStage = new Stage();
	static Parent askParent;
	static Scene askScene;
	
	boolean select = false;
	
    @FXML
    private Button threeType;

    @FXML
    private Button eightType;
    
    @FXML
    private MenuButton monthBox;

    @FXML
    private TextField directionBox;

    @FXML
    private TextField amountBox;

    @FXML
    private TextField cityBox;

    @FXML
    private TextField numBox;

    @FXML
    private TextField nameBox;
    
    public static String monthBoxS, directionBoxS, amountBoxS, cityBoxS, numBoxS, nameBoxS;
    
    @FXML
    private TextField finalHour;

    @FXML
    void finalCancel(ActionEvent event) {
    	askStage.hide();
    }
    
    public static boolean isSaveOK = false;

    @FXML
    void finalSave(ActionEvent event) {
    	isSaveOK = true;
    	this.amountBoxS = finalHour.getText();
    	askStage.hide();
    	callError("שעה נקבעה! לשמירה סופית לחצו על 'שמור' פעם נוספת", 12, 3);
    }
	
    @FXML
    void eightTypeAction(ActionEvent event) {
    	if(!select && !monthBox.getText().equals("") && !directionBox.getText().equals("") && !amountBox.getText().equals("") && !cityBox.getText().equals("") && !numBox.getText().equals("") && !nameBox.getText().equals("")) {
    		try {
    			monthBoxS = monthBox.getText();
    			directionBoxS = directionBox.getText();
    			amountBoxS = amountBox.getText();
    			cityBoxS = cityBox.getText();
    			numBoxS = numBox.getText();
    			nameBoxS = nameBox.getText();
    			
    			parent = FXMLLoader.load(getClass().getResource("/Prog6GUI.fxml"));
    			scene = new Scene(parent, 200, 220); //PROG6
    			stage.setTitle("Count");
    			stage.setScene(scene);
    			stage.setResizable(false);
    			stage.setOnCloseRequest(e->e.consume());
    			stage.show();
    			select = true;
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}else
    		callError("יש למלא את כל השדות!", 16, 1);
    }

    @FXML
    void threeTypeAction(ActionEvent event) {
    	System.out.println(monthBox.getText());
    	if(!select && !monthBox.getText().equals("") && !directionBox.getText().equals("") && !amountBox.getText().equals("") && !cityBox.getText().equals("") && !numBox.getText().equals("") && !nameBox.getText().equals("")) {
    		try {
    			monthBoxS = monthBox.getText();
    			directionBoxS = directionBox.getText();
    			amountBoxS = amountBox.getText();
    			cityBoxS = cityBox.getText();
    			numBoxS = numBox.getText();
    			nameBoxS = nameBox.getText();
    			
    			parent = FXMLLoader.load(getClass().getResource("/ProgGUI.fxml"));
    			Scene scene = new Scene(parent, 200, 95); //PROG
    			stage.setTitle("Count");
    			stage.setScene(scene);
    			stage.setResizable(false);
    			stage.setOnCloseRequest(e->e.consume());
    			stage.show();
    			select = true;
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}else {
    		callError("יש למלא את כל השדות!", 16, 1);
    	}
    }
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent defParent = FXMLLoader.load(getClass().getResource("/Prog.fxml"));
			Scene defScene = new Scene(defParent, 200, 275);
			
			mainStage.setTitle("Count");
			mainStage.setScene(defScene);
			mainStage.setResizable(false);
			mainStage.show();
			
			askParent = FXMLLoader.load(getClass().getResource("/ProgASK.fxml"));
			askScene = new Scene(askParent, 200, 200);
			
			askStage.setTitle("Save");
			askStage.setScene(askScene);
			askStage.setResizable(false);
			askStage.initModality(Modality.APPLICATION_MODAL);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void callError(String message, int size, int priority) {
		try {
			errorStage = new Stage();
			errorText = message;
			errorSize = size;
			errorPriority = priority;
			errorParent = FXMLLoader.load(getClass().getResource("/ErrorBOX.fxml"));
			errorScene = new Scene(errorParent, 200, 100);
			errorStage.setTitle("MESSAGE");
			errorStage.setScene(errorScene);
			errorStage.setResizable(false);
			errorStage.setOnCloseRequest(e->e.consume());
			errorStage.initModality(Modality.APPLICATION_MODAL);
    		errorStage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void askHour() {
		askStage.show();
	}
	


    @FXML
    void januaryMenu(ActionEvent event) {
    	monthBox.setText("ינואר");
    }
   
    @FXML
    void februaryMenu(ActionEvent event) {
    	monthBox.setText("פברואר");
    }
    
    @FXML
    void marchMenu(ActionEvent event) {
    	monthBox.setText("מרץ");
    }
    
    @FXML
    void aprilMenu(ActionEvent event) {
    	monthBox.setText("אפריל");
    }
    
    @FXML
    void mayMenu(ActionEvent event) {
    	monthBox.setText("מאי");
    }
    
    @FXML
    void juneMenu(ActionEvent event) {
    	monthBox.setText("יוני");
    }
    
    @FXML
    void julyMenu(ActionEvent event) {
    	monthBox.setText("יולי");
    }
    
    @FXML
    void augustMenu(ActionEvent event) {
    	monthBox.setText("אוגוסט");
    }
    
    @FXML
    void septemberMenu(ActionEvent event) {
    	monthBox.setText("ספטמבר");
    }
    
    @FXML
    void octoberMenu(ActionEvent event) {
    	monthBox.setText("אוקטובר");
    }
        
    @FXML
    void novemberMenu(ActionEvent event) {
    	monthBox.setText("נובמבר");
    }
    
    @FXML
    void decemberMenu(ActionEvent event) {
    	monthBox.setText("דצמבר");
    }
}
