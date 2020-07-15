import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.format.*;

public class ControlClass {
	
	
	Date date2 = new Date();
	
    @FXML
    private MenuButton menu;
    
    int hourSelected = -1;
	
    public static String spc = System.lineSeparator();
    
    public void storeInfoFunc() {
    	if(hourSelected == -1)
    		return;
    	
    	storeInfo[0][hourSelected] = Vehicles[0][0];
    	storeInfo[1][hourSelected] = Vehicles[0][1];
    	storeInfo[2][hourSelected] = Vehicles[0][2];
    	
    	storeInfo[3][hourSelected] = Vehicles[1][0];
    	storeInfo[4][hourSelected] = Vehicles[1][1];
    	storeInfo[5][hourSelected] = Vehicles[1][2];
    	
    	storeInfo[6][hourSelected] = Vehicles[2][0];
    	storeInfo[7][hourSelected] = Vehicles[2][1];
    	storeInfo[8][hourSelected] = Vehicles[2][2];
    	
    	if(emptyCheckbox.isSelected()) {
    		storeZero[hourSelected] = true;
    		emptyCheckbox.setSelected(false);
	    	System.out.println("hour: " + menu.getText() + spc
	    	+ "Left Private: " + Vehicles[0][0] + spc
	    	+ "Left Bus: " + Vehicles[0][1] + spc
	    	+ "Left Truck: " + Vehicles[0][2] + spc
	    	+ "Middle Private: " + Vehicles[1][0] + spc
	    	+ "Middle Bus: " + Vehicles[1][1] + spc
	    	+ "Middle Truck: " + Vehicles[1][2] + spc
	    	+ "Right Private: " + Vehicles[2][0] + spc
	    	+ "Right Bus: " + Vehicles[2][1] + spc
	    	+ "Right Truck: " + Vehicles[2][2] + spc);
    	}
    	
    }
    
    public void reupdateInfo() {
    	
    	if(storeZero[hourSelected] == true)
    		emptyCheckbox.setSelected(true);
    	
    	Vehicles[0][0] = storeInfo[0][hourSelected];
    	Vehicles[0][1] = storeInfo[1][hourSelected];
    	Vehicles[0][2] = storeInfo[2][hourSelected];
    	Vehicles[1][0] = storeInfo[3][hourSelected];
    	Vehicles[1][1] = storeInfo[4][hourSelected];
    	Vehicles[1][2] = storeInfo[5][hourSelected];
    	Vehicles[2][0] = storeInfo[6][hourSelected];
    	Vehicles[2][1] = storeInfo[7][hourSelected];
    	Vehicles[2][2] = storeInfo[8][hourSelected];
    }
    
    
    @FXML
    void h1(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("06:00");
    	hourSelected = 0;
    	l1.setText(Integer.toString(storeInfo[0][0])); //left private
    	l4.setText(Integer.toString(storeInfo[1][0])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][0])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][0])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][0])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][0])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][0])); //right private
    	r6.setText(Integer.toString(storeInfo[7][0])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][0])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h10(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("08:15");
    	hourSelected = 9;
    	l1.setText(Integer.toString(storeInfo[0][9])); //left private
    	l4.setText(Integer.toString(storeInfo[1][9])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][9])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][9])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][9])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][9])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][9])); //right private
    	r6.setText(Integer.toString(storeInfo[7][9])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][9])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h11(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("08:30");
    	hourSelected = 10;
    	l1.setText(Integer.toString(storeInfo[0][10])); //left private
    	l4.setText(Integer.toString(storeInfo[1][10])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][10])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][10])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][10])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][10])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][10])); //right private
    	r6.setText(Integer.toString(storeInfo[7][10])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][10])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h12(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("08:45");
    	hourSelected = 11;
    	l1.setText(Integer.toString(storeInfo[0][11])); //left private
    	l4.setText(Integer.toString(storeInfo[1][11])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][11])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][11])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][11])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][11])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][11])); //right private
    	r6.setText(Integer.toString(storeInfo[7][11])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][11])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h13(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("09:00");
    	hourSelected = 12;
    	l1.setText(Integer.toString(storeInfo[0][12])); //left private
    	l4.setText(Integer.toString(storeInfo[1][12])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][12])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][12])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][12])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][12])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][12])); //right private
    	r6.setText(Integer.toString(storeInfo[7][12])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][12])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h14(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("09:15");
    	hourSelected = 13;
    	l1.setText(Integer.toString(storeInfo[0][13])); //left private
    	l4.setText(Integer.toString(storeInfo[1][13])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][13])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][13])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][13])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][13])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][13])); //right private
    	r6.setText(Integer.toString(storeInfo[7][13])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][13])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h15(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("09:30");
    	hourSelected = 14;
    	l1.setText(Integer.toString(storeInfo[0][14])); //left private
    	l4.setText(Integer.toString(storeInfo[1][14])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][14])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][14])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][14])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][14])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][14])); //right private
    	r6.setText(Integer.toString(storeInfo[7][14])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][14])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h16(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("09:45");
    	hourSelected = 15;
    	l1.setText(Integer.toString(storeInfo[0][15])); //left private
    	l4.setText(Integer.toString(storeInfo[1][15])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][15])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][15])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][15])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][15])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][15])); //right private
    	r6.setText(Integer.toString(storeInfo[7][15])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][15])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h17(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("10:00");
    	hourSelected = 16;
    	l1.setText(Integer.toString(storeInfo[0][16])); //left private
    	l4.setText(Integer.toString(storeInfo[1][16])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][16])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][16])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][16])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][16])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][16])); //right private
    	r6.setText(Integer.toString(storeInfo[7][16])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][16])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h18(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("10:15");
    	hourSelected = 17;
    	l1.setText(Integer.toString(storeInfo[0][17])); //left private
    	l4.setText(Integer.toString(storeInfo[1][17])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][17])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][17])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][17])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][17])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][17])); //right private
    	r6.setText(Integer.toString(storeInfo[7][17])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][17])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h19(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("10:30");
    	hourSelected = 18;
    	l1.setText(Integer.toString(storeInfo[0][18])); //left private
    	l4.setText(Integer.toString(storeInfo[1][18])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][18])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][18])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][18])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][18])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][18])); //right private
    	r6.setText(Integer.toString(storeInfo[7][18])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][18])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h2(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("06:15");
    	hourSelected = 1;
    	l1.setText(Integer.toString(storeInfo[0][1])); //left private
    	l4.setText(Integer.toString(storeInfo[1][1])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][1])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][1])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][1])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][1])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][1])); //right private
    	r6.setText(Integer.toString(storeInfo[7][1])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][1])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h20(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("10:45");
    	hourSelected = 19;
    	l1.setText(Integer.toString(storeInfo[0][19])); //left private
    	l4.setText(Integer.toString(storeInfo[1][19])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][19])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][19])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][19])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][19])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][19])); //right private
    	r6.setText(Integer.toString(storeInfo[7][19])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][19])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h21(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("11:00");
    	hourSelected = 20;
    	l1.setText(Integer.toString(storeInfo[0][20])); //left private
    	l4.setText(Integer.toString(storeInfo[1][20])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][20])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][20])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][20])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][20])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][20])); //right private
    	r6.setText(Integer.toString(storeInfo[7][20])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][20])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h22(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("11:15");
    	hourSelected = 21;
    	l1.setText(Integer.toString(storeInfo[0][21])); //left private
    	l4.setText(Integer.toString(storeInfo[1][21])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][21])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][21])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][21])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][21])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][21])); //right private
    	r6.setText(Integer.toString(storeInfo[7][21])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][21])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h23(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("11:30");
    	hourSelected = 22;
    	l1.setText(Integer.toString(storeInfo[0][22])); //left private
    	l4.setText(Integer.toString(storeInfo[1][22])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][22])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][22])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][22])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][22])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][22])); //right private
    	r6.setText(Integer.toString(storeInfo[7][22])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][22])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h24(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("11:45");
    	hourSelected = 23;
    	l1.setText(Integer.toString(storeInfo[0][23])); //left private
    	l4.setText(Integer.toString(storeInfo[1][23])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][23])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][23])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][23])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][23])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][23])); //right private
    	r6.setText(Integer.toString(storeInfo[7][23])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][23])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h25(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("12:00");
    	hourSelected = 24;
    	l1.setText(Integer.toString(storeInfo[0][24])); //left private
    	l4.setText(Integer.toString(storeInfo[1][24])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][24])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][24])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][24])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][24])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][24])); //right private
    	r6.setText(Integer.toString(storeInfo[7][24])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][24])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h26(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("12:15");
    	hourSelected = 25;
    	l1.setText(Integer.toString(storeInfo[0][25])); //left private
    	l4.setText(Integer.toString(storeInfo[1][25])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][25])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][25])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][25])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][25])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][25])); //right private
    	r6.setText(Integer.toString(storeInfo[7][25])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][25])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h27(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("12:30");
    	hourSelected = 26;
    	l1.setText(Integer.toString(storeInfo[0][26])); //left private
    	l4.setText(Integer.toString(storeInfo[1][26])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][26])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][26])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][26])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][26])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][26])); //right private
    	r6.setText(Integer.toString(storeInfo[7][26])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][26])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h28(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("12:45");
    	hourSelected = 27;
    	l1.setText(Integer.toString(storeInfo[0][27])); //left private
    	l4.setText(Integer.toString(storeInfo[1][27])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][27])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][27])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][27])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][27])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][27])); //right private
    	r6.setText(Integer.toString(storeInfo[7][27])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][27])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h29(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("13:00");
    	hourSelected = 28;
    	l1.setText(Integer.toString(storeInfo[0][28])); //left private
    	l4.setText(Integer.toString(storeInfo[1][28])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][28])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][28])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][28])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][28])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][28])); //right private
    	r6.setText(Integer.toString(storeInfo[7][28])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][28])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h3(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("06:30");
    	hourSelected = 2;
    	l1.setText(Integer.toString(storeInfo[0][2])); //left private
    	l4.setText(Integer.toString(storeInfo[1][2])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][2])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][2])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][2])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][2])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][2])); //right private
    	r6.setText(Integer.toString(storeInfo[7][2])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][2])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h30(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("13:15");
    	hourSelected = 29;
    	l1.setText(Integer.toString(storeInfo[0][29])); //left private
    	l4.setText(Integer.toString(storeInfo[1][29])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][29])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][29])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][29])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][29])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][29])); //right private
    	r6.setText(Integer.toString(storeInfo[7][29])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][29])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h31(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("13:30");
    	hourSelected = 30;
    	l1.setText(Integer.toString(storeInfo[0][30])); //left private
    	l4.setText(Integer.toString(storeInfo[1][30])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][30])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][30])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][30])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][30])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][30])); //right private
    	r6.setText(Integer.toString(storeInfo[7][30])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][30])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h32(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("13:45");
    	hourSelected = 31;
    	l1.setText(Integer.toString(storeInfo[0][31])); //left private
    	l4.setText(Integer.toString(storeInfo[1][31])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][31])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][31])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][31])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][31])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][31])); //right private
    	r6.setText(Integer.toString(storeInfo[7][31])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][31])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h33(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("14:00");
    	hourSelected = 32;
    	l1.setText(Integer.toString(storeInfo[0][32])); //left private
    	l4.setText(Integer.toString(storeInfo[1][32])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][32])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][32])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][32])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][32])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][32])); //right private
    	r6.setText(Integer.toString(storeInfo[7][32])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][32])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h34(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("14:15");
    	hourSelected = 33;
    	l1.setText(Integer.toString(storeInfo[0][33])); //left private
    	l4.setText(Integer.toString(storeInfo[1][33])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][33])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][33])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][33])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][33])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][33])); //right private
    	r6.setText(Integer.toString(storeInfo[7][33])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][33])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h35(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("14:30");
    	hourSelected = 34;
    	l1.setText(Integer.toString(storeInfo[0][34])); //left private
    	l4.setText(Integer.toString(storeInfo[1][34])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][34])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][34])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][34])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][34])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][34])); //right private
    	r6.setText(Integer.toString(storeInfo[7][34])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][34])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h36(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("14:45");
    	hourSelected = 35;
    	l1.setText(Integer.toString(storeInfo[0][35])); //left private
    	l4.setText(Integer.toString(storeInfo[1][35])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][35])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][35])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][35])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][35])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][35])); //right private
    	r6.setText(Integer.toString(storeInfo[7][35])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][35])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h37(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("15:00");
    	hourSelected = 36;
    	l1.setText(Integer.toString(storeInfo[0][36])); //left private
    	l4.setText(Integer.toString(storeInfo[1][36])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][36])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][36])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][36])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][36])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][36])); //right private
    	r6.setText(Integer.toString(storeInfo[7][36])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][36])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h38(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("15:15");
    	hourSelected = 37;
    	l1.setText(Integer.toString(storeInfo[0][37])); //left private
    	l4.setText(Integer.toString(storeInfo[1][37])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][37])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][37])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][37])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][37])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][37])); //right private
    	r6.setText(Integer.toString(storeInfo[7][37])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][37])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h39(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("15:30");
    	hourSelected = 38;
    	l1.setText(Integer.toString(storeInfo[0][38])); //left private
    	l4.setText(Integer.toString(storeInfo[1][38])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][38])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][38])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][38])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][38])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][38])); //right private
    	r6.setText(Integer.toString(storeInfo[7][38])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][38])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h4(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("06:45");
    	hourSelected = 3;
    	l1.setText(Integer.toString(storeInfo[0][3])); //left private
    	l4.setText(Integer.toString(storeInfo[1][3])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][3])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][3])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][3])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][3])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][3])); //right private
    	r6.setText(Integer.toString(storeInfo[7][3])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][3])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h40(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("15:45");
    	hourSelected = 39;
    	l1.setText(Integer.toString(storeInfo[0][39])); //left private
    	l4.setText(Integer.toString(storeInfo[1][39])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][39])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][39])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][39])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][39])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][39])); //right private
    	r6.setText(Integer.toString(storeInfo[7][39])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][39])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h41(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("16:00");
    	hourSelected = 40;
    	l1.setText(Integer.toString(storeInfo[0][40])); //left private
    	l4.setText(Integer.toString(storeInfo[1][40])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][40])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][40])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][40])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][40])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][40])); //right private
    	r6.setText(Integer.toString(storeInfo[7][40])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][40])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h42(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("16:15");
    	hourSelected = 41;
    	l1.setText(Integer.toString(storeInfo[0][41])); //left private
    	l4.setText(Integer.toString(storeInfo[1][41])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][41])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][41])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][41])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][41])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][41])); //right private
    	r6.setText(Integer.toString(storeInfo[7][41])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][41])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h43(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("16:30");
    	hourSelected = 42;
    	l1.setText(Integer.toString(storeInfo[0][42])); //left private
    	l4.setText(Integer.toString(storeInfo[1][42])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][42])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][42])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][42])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][42])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][42])); //right private
    	r6.setText(Integer.toString(storeInfo[7][42])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][42])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h44(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("16:45");
    	hourSelected = 43;
    	l1.setText(Integer.toString(storeInfo[0][43])); //left private
    	l4.setText(Integer.toString(storeInfo[1][43])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][43])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][43])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][43])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][43])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][43])); //right private
    	r6.setText(Integer.toString(storeInfo[7][43])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][43])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h45(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("17:00");
    	hourSelected = 44;
    	l1.setText(Integer.toString(storeInfo[0][44])); //left private
    	l4.setText(Integer.toString(storeInfo[1][44])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][44])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][44])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][44])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][44])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][44])); //right private
    	r6.setText(Integer.toString(storeInfo[7][44])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][44])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h46(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("17:15");
    	hourSelected = 45;
    	l1.setText(Integer.toString(storeInfo[0][45])); //left private
    	l4.setText(Integer.toString(storeInfo[1][45])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][45])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][45])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][45])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][45])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][45])); //right private
    	r6.setText(Integer.toString(storeInfo[7][45])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][45])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h47(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("17:30");
    	hourSelected = 46;
    	l1.setText(Integer.toString(storeInfo[0][46])); //left private
    	l4.setText(Integer.toString(storeInfo[1][46])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][46])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][46])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][46])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][46])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][46])); //right private
    	r6.setText(Integer.toString(storeInfo[7][46])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][46])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h48(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("17:45");
    	hourSelected = 47;
    	l1.setText(Integer.toString(storeInfo[0][47])); //left private
    	l4.setText(Integer.toString(storeInfo[1][47])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][47])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][47])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][47])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][47])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][47])); //right private
    	r6.setText(Integer.toString(storeInfo[7][47])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][47])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h49(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("18:00");
    	hourSelected = 48;
    	l1.setText(Integer.toString(storeInfo[0][48])); //left private
    	l4.setText(Integer.toString(storeInfo[1][48])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][48])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][48])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][48])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][48])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][48])); //right private
    	r6.setText(Integer.toString(storeInfo[7][48])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][48])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h5(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("07:00");
    	hourSelected = 4;
    	l1.setText(Integer.toString(storeInfo[0][4])); //left private
    	l4.setText(Integer.toString(storeInfo[1][4])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][4])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][4])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][4])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][4])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][4])); //right private
    	r6.setText(Integer.toString(storeInfo[7][4])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][4])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h50(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("18:15");
    	hourSelected = 49;
    	l1.setText(Integer.toString(storeInfo[0][49])); //left private
    	l4.setText(Integer.toString(storeInfo[1][49])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][49])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][49])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][49])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][49])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][49])); //right private
    	r6.setText(Integer.toString(storeInfo[7][49])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][49])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h51(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("18:30");
    	hourSelected = 50;
    	l1.setText(Integer.toString(storeInfo[0][50])); //left private
    	l4.setText(Integer.toString(storeInfo[1][50])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][50])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][50])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][50])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][50])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][50])); //right private
    	r6.setText(Integer.toString(storeInfo[7][50])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][50])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h52(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("18:45");
    	hourSelected = 51;
    	l1.setText(Integer.toString(storeInfo[0][51])); //left private
    	l4.setText(Integer.toString(storeInfo[1][51])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][51])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][51])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][51])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][51])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][51])); //right private
    	r6.setText(Integer.toString(storeInfo[7][51])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][51])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h53(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("19:00");
    	hourSelected = 52;
    	l1.setText(Integer.toString(storeInfo[0][52])); //left private
    	l4.setText(Integer.toString(storeInfo[1][52])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][52])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][52])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][52])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][52])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][52])); //right private
    	r6.setText(Integer.toString(storeInfo[7][52])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][52])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h54(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("19:15");
    	hourSelected = 53;
    	l1.setText(Integer.toString(storeInfo[0][53])); //left private
    	l4.setText(Integer.toString(storeInfo[1][53])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][53])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][53])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][53])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][53])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][53])); //right private
    	r6.setText(Integer.toString(storeInfo[7][53])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][53])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h55(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("19:30");
    	hourSelected = 54;
    	l1.setText(Integer.toString(storeInfo[0][54])); //left private
    	l4.setText(Integer.toString(storeInfo[1][54])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][54])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][54])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][54])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][54])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][54])); //right private
    	r6.setText(Integer.toString(storeInfo[7][54])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][54])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h56(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("19:45");
    	hourSelected = 55;
    	l1.setText(Integer.toString(storeInfo[0][55])); //left private
    	l4.setText(Integer.toString(storeInfo[1][55])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][55])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][55])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][55])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][55])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][55])); //right private
    	r6.setText(Integer.toString(storeInfo[7][55])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][55])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h57(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("20:00");
    	hourSelected = 56;
    	l1.setText(Integer.toString(storeInfo[0][56])); //left private
    	l4.setText(Integer.toString(storeInfo[1][56])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][56])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][56])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][56])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][56])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][56])); //right private
    	r6.setText(Integer.toString(storeInfo[7][56])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][56])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h58(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("20:15");
    	hourSelected = 57;
    	l1.setText(Integer.toString(storeInfo[0][57])); //left private
    	l4.setText(Integer.toString(storeInfo[1][57])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][57])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][57])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][57])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][57])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][57])); //right private
    	r6.setText(Integer.toString(storeInfo[7][57])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][57])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h59(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("20:30");
    	hourSelected = 58;
    	l1.setText(Integer.toString(storeInfo[0][58])); //left private
    	l4.setText(Integer.toString(storeInfo[1][58])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][58])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][58])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][58])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][58])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][58])); //right private
    	r6.setText(Integer.toString(storeInfo[7][58])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][58])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h6(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("07:15");
    	hourSelected = 5;
    	l1.setText(Integer.toString(storeInfo[0][5])); //left private
    	l4.setText(Integer.toString(storeInfo[1][5])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][5])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][5])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][5])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][5])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][5])); //right private
    	r6.setText(Integer.toString(storeInfo[7][5])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][5])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h60(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("20:45");
    	hourSelected = 59;
    	l1.setText(Integer.toString(storeInfo[0][59])); //left private
    	l4.setText(Integer.toString(storeInfo[1][59])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][59])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][59])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][59])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][59])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][59])); //right private
    	r6.setText(Integer.toString(storeInfo[7][59])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][59])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h61(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("21:00");
    	hourSelected = 60;
    	l1.setText(Integer.toString(storeInfo[0][60])); //left private
    	l4.setText(Integer.toString(storeInfo[1][60])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][60])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][60])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][60])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][60])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][60])); //right private
    	r6.setText(Integer.toString(storeInfo[7][60])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][60])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h62(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("21:15");
    	hourSelected = 61;
    	l1.setText(Integer.toString(storeInfo[0][61])); //left private
    	l4.setText(Integer.toString(storeInfo[1][61])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][61])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][61])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][61])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][61])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][61])); //right private
    	r6.setText(Integer.toString(storeInfo[7][61])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][61])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h63(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("21:30");
    	hourSelected = 62;
    	l1.setText(Integer.toString(storeInfo[0][62])); //left private
    	l4.setText(Integer.toString(storeInfo[1][62])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][62])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][62])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][62])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][62])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][62])); //right private
    	r6.setText(Integer.toString(storeInfo[7][62])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][62])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h64(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("21:45");
    	hourSelected = 63;
    	l1.setText(Integer.toString(storeInfo[0][63])); //left private
    	l4.setText(Integer.toString(storeInfo[1][63])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][63])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][63])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][63])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][63])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][63])); //right private
    	r6.setText(Integer.toString(storeInfo[7][63])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][63])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h65(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("22:00");
    	hourSelected = 64;
    	l1.setText(Integer.toString(storeInfo[0][64])); //left private
    	l4.setText(Integer.toString(storeInfo[1][64])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][64])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][64])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][64])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][64])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][64])); //right private
    	r6.setText(Integer.toString(storeInfo[7][64])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][64])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h66(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("22:15");
    	hourSelected = 65;
    	l1.setText(Integer.toString(storeInfo[0][65])); //left private
    	l4.setText(Integer.toString(storeInfo[1][65])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][65])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][65])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][65])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][65])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][65])); //right private
    	r6.setText(Integer.toString(storeInfo[7][65])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][65])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h67(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("22:30");
    	hourSelected = 66;
    	l1.setText(Integer.toString(storeInfo[0][66])); //left private
    	l4.setText(Integer.toString(storeInfo[1][66])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][66])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][66])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][66])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][66])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][66])); //right private
    	r6.setText(Integer.toString(storeInfo[7][66])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][66])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h68(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("22:45");
    	hourSelected = 67;
    	l1.setText(Integer.toString(storeInfo[0][67])); //left private
    	l4.setText(Integer.toString(storeInfo[1][67])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][67])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][67])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][67])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][67])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][67])); //right private
    	r6.setText(Integer.toString(storeInfo[7][67])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][67])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h69(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("23:00");
    	hourSelected = 68;
    	l1.setText(Integer.toString(storeInfo[0][68])); //left private
    	l4.setText(Integer.toString(storeInfo[1][68])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][68])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][68])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][68])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][68])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][68])); //right private
    	r6.setText(Integer.toString(storeInfo[7][68])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][68])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h7(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("07:30");
    	hourSelected = 6;
    	l1.setText(Integer.toString(storeInfo[0][6])); //left private
    	l4.setText(Integer.toString(storeInfo[1][6])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][6])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][6])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][6])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][6])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][6])); //right private
    	r6.setText(Integer.toString(storeInfo[7][6])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][6])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h70(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("23:15");
    	hourSelected = 69;
    	l1.setText(Integer.toString(storeInfo[0][69])); //left private
    	l4.setText(Integer.toString(storeInfo[1][69])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][69])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][69])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][69])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][69])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][69])); //right private
    	r6.setText(Integer.toString(storeInfo[7][69])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][69])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h71(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("23:30");
    	hourSelected = 70;
    	l1.setText(Integer.toString(storeInfo[0][70])); //left private
    	l4.setText(Integer.toString(storeInfo[1][70])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][70])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][70])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][70])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][70])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][70])); //right private
    	r6.setText(Integer.toString(storeInfo[7][70])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][70])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h72(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("23:45");
    	hourSelected = 71;
    	l1.setText(Integer.toString(storeInfo[0][71])); //left private
    	l4.setText(Integer.toString(storeInfo[1][71])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][71])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][71])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][71])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][71])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][71])); //right private
    	r6.setText(Integer.toString(storeInfo[7][71])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][71])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h73(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("00:00");
    	hourSelected = 72;
    	l1.setText(Integer.toString(storeInfo[0][72])); //left private
    	l4.setText(Integer.toString(storeInfo[1][72])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][72])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][72])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][72])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][72])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][72])); //right private
    	r6.setText(Integer.toString(storeInfo[7][72])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][72])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h74(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("00:15");
    	hourSelected = 73;
    	l1.setText(Integer.toString(storeInfo[0][73])); //left private
    	l4.setText(Integer.toString(storeInfo[1][73])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][73])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][73])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][73])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][73])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][73])); //right private
    	r6.setText(Integer.toString(storeInfo[7][73])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][73])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h75(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("00:30");
    	hourSelected = 74;
    	l1.setText(Integer.toString(storeInfo[0][74])); //left private
    	l4.setText(Integer.toString(storeInfo[1][74])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][74])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][74])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][74])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][74])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][74])); //right private
    	r6.setText(Integer.toString(storeInfo[7][74])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][74])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h76(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("00:45");
    	hourSelected = 75;
    	l1.setText(Integer.toString(storeInfo[0][75])); //left private
    	l4.setText(Integer.toString(storeInfo[1][75])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][75])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][75])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][75])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][75])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][75])); //right private
    	r6.setText(Integer.toString(storeInfo[7][75])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][75])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h77(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("01:00");
    	hourSelected = 76;
    	l1.setText(Integer.toString(storeInfo[0][76])); //left private
    	l4.setText(Integer.toString(storeInfo[1][76])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][76])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][76])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][76])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][76])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][76])); //right private
    	r6.setText(Integer.toString(storeInfo[7][76])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][76])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h78(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("01:15");
    	hourSelected = 77;
    	l1.setText(Integer.toString(storeInfo[0][77])); //left private
    	l4.setText(Integer.toString(storeInfo[1][77])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][77])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][77])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][77])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][77])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][77])); //right private
    	r6.setText(Integer.toString(storeInfo[7][77])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][77])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h79(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("01:30");
    	hourSelected = 78;
    	l1.setText(Integer.toString(storeInfo[0][78])); //left private
    	l4.setText(Integer.toString(storeInfo[1][78])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][78])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][78])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][78])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][78])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][78])); //right private
    	r6.setText(Integer.toString(storeInfo[7][78])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][78])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h8(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("07:45");
    	hourSelected = 7;
    	l1.setText(Integer.toString(storeInfo[0][7])); //left private
    	l4.setText(Integer.toString(storeInfo[1][7])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][7])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][7])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][7])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][7])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][7])); //right private
    	r6.setText(Integer.toString(storeInfo[7][7])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][7])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h80(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("01:45");
    	hourSelected = 79;
    	l1.setText(Integer.toString(storeInfo[0][79])); //left private
    	l4.setText(Integer.toString(storeInfo[1][79])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][79])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][79])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][79])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][79])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][79])); //right private
    	r6.setText(Integer.toString(storeInfo[7][79])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][79])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h81(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("02:00");
    	hourSelected = 80;
    	l1.setText(Integer.toString(storeInfo[0][80])); //left private
    	l4.setText(Integer.toString(storeInfo[1][80])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][80])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][80])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][80])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][80])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][80])); //right private
    	r6.setText(Integer.toString(storeInfo[7][80])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][80])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h82(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("02:15");
    	hourSelected = 81;
    	l1.setText(Integer.toString(storeInfo[0][81])); //left private
    	l4.setText(Integer.toString(storeInfo[1][81])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][81])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][81])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][81])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][81])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][81])); //right private
    	r6.setText(Integer.toString(storeInfo[7][81])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][81])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h83(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("02:30");
    	hourSelected = 82;
    	l1.setText(Integer.toString(storeInfo[0][82])); //left private
    	l4.setText(Integer.toString(storeInfo[1][82])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][82])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][82])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][82])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][82])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][82])); //right private
    	r6.setText(Integer.toString(storeInfo[7][82])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][82])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h84(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("02:45");
    	hourSelected = 83;
    	l1.setText(Integer.toString(storeInfo[0][83])); //left private
    	l4.setText(Integer.toString(storeInfo[1][83])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][83])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][83])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][83])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][83])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][83])); //right private
    	r6.setText(Integer.toString(storeInfo[7][83])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][83])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h85(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("03:00");
    	hourSelected = 84;
    	l1.setText(Integer.toString(storeInfo[0][84])); //left private
    	l4.setText(Integer.toString(storeInfo[1][84])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][84])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][84])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][84])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][84])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][84])); //right private
    	r6.setText(Integer.toString(storeInfo[7][84])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][84])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h86(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("03:15");
    	hourSelected = 85;
    	l1.setText(Integer.toString(storeInfo[0][85])); //left private
    	l4.setText(Integer.toString(storeInfo[1][85])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][85])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][85])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][85])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][85])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][85])); //right private
    	r6.setText(Integer.toString(storeInfo[7][85])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][85])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h87(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("03:30");
    	hourSelected = 86;
    	l1.setText(Integer.toString(storeInfo[0][86])); //left private
    	l4.setText(Integer.toString(storeInfo[1][86])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][86])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][86])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][86])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][86])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][86])); //right private
    	r6.setText(Integer.toString(storeInfo[7][86])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][86])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h88(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("03:45");
    	hourSelected = 87;
    	l1.setText(Integer.toString(storeInfo[0][87])); //left private
    	l4.setText(Integer.toString(storeInfo[1][87])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][87])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][87])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][87])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][87])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][87])); //right private
    	r6.setText(Integer.toString(storeInfo[7][87])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][87])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h89(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("04:00");
    	hourSelected = 88;
    	l1.setText(Integer.toString(storeInfo[0][88])); //left private
    	l4.setText(Integer.toString(storeInfo[1][88])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][88])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][88])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][88])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][88])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][88])); //right private
    	r6.setText(Integer.toString(storeInfo[7][88])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][88])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h9(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("08:00");
    	hourSelected = 8;
    	l1.setText(Integer.toString(storeInfo[0][8])); //left private
    	l4.setText(Integer.toString(storeInfo[1][8])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][8])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][8])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][8])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][8])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][8])); //right private
    	r6.setText(Integer.toString(storeInfo[7][8])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][8])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h90(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("04:15");
    	hourSelected = 89;
    	l1.setText(Integer.toString(storeInfo[0][89])); //left private
    	l4.setText(Integer.toString(storeInfo[1][89])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][89])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][89])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][89])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][89])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][89])); //right private
    	r6.setText(Integer.toString(storeInfo[7][89])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][89])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h91(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("04:30");
    	hourSelected = 90;
    	l1.setText(Integer.toString(storeInfo[0][90])); //left private
    	l4.setText(Integer.toString(storeInfo[1][90])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][90])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][90])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][90])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][90])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][90])); //right private
    	r6.setText(Integer.toString(storeInfo[7][90])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][90])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h92(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("04:45");
    	hourSelected = 91;
    	l1.setText(Integer.toString(storeInfo[0][91])); //left private
    	l4.setText(Integer.toString(storeInfo[1][91])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][91])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][91])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][91])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][91])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][91])); //right private
    	r6.setText(Integer.toString(storeInfo[7][91])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][91])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h93(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("05:00");
    	hourSelected = 92;
    	l1.setText(Integer.toString(storeInfo[0][92])); //left private
    	l4.setText(Integer.toString(storeInfo[1][92])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][92])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][92])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][92])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][92])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][92])); //right private
    	r6.setText(Integer.toString(storeInfo[7][92])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][92])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h94(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("05:15");
    	hourSelected = 93;
    	l1.setText(Integer.toString(storeInfo[0][93])); //left private
    	l4.setText(Integer.toString(storeInfo[1][93])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][93])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][93])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][93])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][93])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][93])); //right private
    	r6.setText(Integer.toString(storeInfo[7][93])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][93])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h95(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("05:30");
    	hourSelected = 94;
    	l1.setText(Integer.toString(storeInfo[0][94])); //left private
    	l4.setText(Integer.toString(storeInfo[1][94])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][94])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][94])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][94])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][94])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][94])); //right private
    	r6.setText(Integer.toString(storeInfo[7][94])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][94])); //right truck
    	reupdateInfo();
    }

    @FXML
    void h96(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("05:45");
    	hourSelected = 95;
    	l1.setText(Integer.toString(storeInfo[0][95])); //left private
    	l4.setText(Integer.toString(storeInfo[1][95])); //left bus
    	l7.setText(Integer.toString(storeInfo[2][95])); //left truck
    	m2.setText(Integer.toString(storeInfo[3][95])); //middle private
    	m5.setText(Integer.toString(storeInfo[4][95])); //middle bus
    	m8.setText(Integer.toString(storeInfo[5][95])); //middle truck
    	r3.setText(Integer.toString(storeInfo[6][95])); //right private
    	r6.setText(Integer.toString(storeInfo[7][95])); //right bus
    	r9.setText(Integer.toString(storeInfo[8][95])); //right truck
    	reupdateInfo();
    }
    
    int[][] storeInfo = new int[9][96]; // [carTypes+Direction][quarters]
    
    @FXML
    private CheckBox emptyCheckbox;
    
    boolean[] storeZero = new boolean[96];
    
    @FXML
    private Text l1;

    @FXML
    private Text l4;

    @FXML
    private Text l7;

    @FXML
    private Text m2;

    @FXML
    private Text m5;

    @FXML
    private Text m8;

    @FXML
    private Text r3;

    @FXML
    private Text r6;

    @FXML
    private Text r9;
    
    
    public void setL1(int num) {
    	l1.setText(Integer.toString(num));
    }
    
    public void setL2(int num) {
    	l4.setText(Integer.toString(num));
    }
    
    public void setL3(int num) {
    	l7.setText(Integer.toString(num));
    }
    
    public void setM1(int num) {
    	m2.setText(Integer.toString(num));
    }
    
    public void setM2(int num) {
    	m5.setText(Integer.toString(num));
    }
    
    public void setM3(int num) {
    	m8.setText(Integer.toString(num));
    }
    
    public void setR1(int num) {
    	r3.setText(Integer.toString(num));
    }
    
    public void setR2(int num) {
    	r6.setText(Integer.toString(num));
    }
    
    public void setR3(int num) {
    	r9.setText(Integer.toString(num));
    }
    
    public static int[][] Vehicles = new int[3][3];
    
    private boolean add = true;
    
	public void numOne() {
		if(add)
			Vehicles[0][0]++;
		else
			if(!(Vehicles[0][0]==0))
				Vehicles[0][0]--;
	}
	
	public void numTwo() {
		if(add)
			Vehicles[0][1]++;
		else
			if(!(Vehicles[0][1]==0))
				Vehicles[0][1]--;
	}
	
	public void numThree() {
		if(add)
			Vehicles[0][2]++;
		else
			if(!(Vehicles[0][2]==0))
				Vehicles[0][2]--;
	}
	
	public void numFour() {
		if(add)
			Vehicles[1][0]++;
		else
			if(!(Vehicles[1][0]==0))
				Vehicles[1][0]--;
	}
	
	public void numFive() {
		if(add)
			Vehicles[1][1]++;
		else
			if(!(Vehicles[1][1]==0))
				Vehicles[1][1]--;
	}
	
	public void numSix() {
		if(add)
			Vehicles[1][2]++;
		else
			if(!(Vehicles[1][2]==0))
				Vehicles[1][2]--;
	}
	
	public void numSeven() {
		if(add)
			Vehicles[2][0]++;
		else
			if(!(Vehicles[2][0]==0))
				Vehicles[2][0]--;
	}
	
	public void numEight() {
		if(add)
			Vehicles[2][1]++;
		else
			if(!(Vehicles[2][1]==0))
				Vehicles[2][1]--;
	}
	
	public void numNine() {
		if(add)
			Vehicles[2][2]++;
		else
			if(!(Vehicles[2][2]==0))
				Vehicles[2][2]--;
	}
	
    @FXML
    void minus(ActionEvent event) {
    	add = false;
    }

    @FXML
    void plus(ActionEvent event) {
    	add = true;
    }
    


    @FXML
    void minusPress(KeyEvent event) {
    	if(hourSelected == -1) {
    		try {
				Stage errorStage = new Stage();
				Parent errorParent;
				Scene errorScene;
				errorStage = new Stage();
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
    		return;
    	}
		switch(event.getCode()) {
		case NUMPAD1: numOne(); break;
		case NUMPAD2: numFour(); break;
		case NUMPAD3: numSeven(); break;
		case NUMPAD4: numTwo(); break;
		case NUMPAD5: numFive(); break;
		case NUMPAD6: numEight(); break;
		case NUMPAD7: numThree(); break;
		case NUMPAD8: numSix(); break;
		case NUMPAD9: numNine(); break;
	
	}
	l1.setText(Integer.toString(Vehicles[0][0]));
	l4.setText(Integer.toString(Vehicles[0][1]));
	l7.setText(Integer.toString(Vehicles[0][2]));
	m2.setText(Integer.toString(Vehicles[1][0]));
	m5.setText(Integer.toString(Vehicles[1][1]));
	m8.setText(Integer.toString(Vehicles[1][2]));
	r3.setText(Integer.toString(Vehicles[2][0]));
	r6.setText(Integer.toString(Vehicles[2][1]));
	r9.setText(Integer.toString(Vehicles[2][2]));
    }

    @FXML
    void plusPress(KeyEvent event) {
    	if(hourSelected == -1) {
    		try {
				Stage errorStage = new Stage();
				Parent errorParent;
				Scene errorScene;
				errorStage = new Stage();
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
    		return;
    	}
		switch(event.getCode()) {
		case NUMPAD1: numOne(); break;
		case NUMPAD2: numFour(); break;
		case NUMPAD3: numSeven(); break;
		case NUMPAD4: numTwo(); break;
		case NUMPAD5: numFive(); break;
		case NUMPAD6: numEight(); break;
		case NUMPAD7: numThree(); break;
		case NUMPAD8: numSix(); break;
		case NUMPAD9: numNine(); break;
	
	}
	l1.setText(Integer.toString(Vehicles[0][0]));
	l4.setText(Integer.toString(Vehicles[0][1]));
	l7.setText(Integer.toString(Vehicles[0][2]));
	m2.setText(Integer.toString(Vehicles[1][0]));
	m5.setText(Integer.toString(Vehicles[1][1]));
	m8.setText(Integer.toString(Vehicles[1][2]));
	r3.setText(Integer.toString(Vehicles[2][0]));
	r6.setText(Integer.toString(Vehicles[2][1]));
	r9.setText(Integer.toString(Vehicles[2][2]));
    }
    

    @FXML
    void saveFile(ActionEvent event) {
    	
    	System.out.println("hour: " + menu.getText() + spc
    			+ "Left Private: " + Vehicles[0][0] + spc
    			+ "Left Bus: " + Vehicles[0][1] + spc
    			+ "Left Truck: " + Vehicles[0][2] + spc
    			+ "Middle Private: " + Vehicles[1][0] + spc
    			+ "Middle Bus: " + Vehicles[1][1] + spc
    			+ "Middle Truck: " + Vehicles[1][2] + spc
    			+ "Right Private: " + Vehicles[2][0] + spc
    			+ "Right Bus: " + Vehicles[2][1] + spc
    			+ "Right Truck: " + Vehicles[2][2] + spc);
    	if(Main.isSaveOK == true)
    		saveFunction();
    	else
    		Main.askHour();
    }
    
	public void saveFunction() {
		
		storeInfoFunc();
		
		if(storeZero[hourSelected])
			emptyCheckbox.setSelected(true);
		
		Main.isSaveOK = false;
		
		DateFormat dateFormat;
		dateFormat = new SimpleDateFormat("yyMMddHHmm");
		Date date = new Date();
		
		File file = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\" + Main.cityBoxS + "," + Main.monthBoxS + "," +  Main.numBoxS + "," +  Main.directionBoxS + "," +  Main.nameBoxS + "," +  Main.amountBoxS + ".xls");
		if(file.exists())
			file = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\" + Main.cityBoxS + "," + Main.monthBoxS + "," +  Main.numBoxS + "," +  Main.directionBoxS + "," +  Main.nameBoxS + "," +  Main.amountBoxS + "(" + dateFormat.format(date) + ")" + ".xls");

		WritableWorkbook excelFile = null;
		
		try {
			
			WritableFont font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			WritableCellFormat format = new WritableCellFormat(font);
			
			excelFile = Workbook.createWorkbook(file);
			WritableSheet excelSheet = excelFile.createSheet("Sheet", 0);
			
			Label label;
			Number number;
			
			label = new Label(0, 0, "START DATE");
			excelSheet.addCell(label);
			dateFormat = new SimpleDateFormat("dd/MM/yy");
			label = new Label(0, 1, dateFormat.format(date2));
			excelSheet.addCell(label);
			dateFormat = new SimpleDateFormat("HH:mm");
			label = new Label(0, 2, dateFormat.format(date2));
			excelSheet.addCell(label);
			
			label = new Label(1, 0, "END DATE");
			excelSheet.addCell(label);
			dateFormat = new SimpleDateFormat("dd/MM/yy");
			label = new Label(1, 1, dateFormat.format(date));
			excelSheet.addCell(label);
			dateFormat = new SimpleDateFormat("HH:mm");
			label = new Label(1, 2, dateFormat.format(date));
			excelSheet.addCell(label);
			
			int doneHalfs = 0;
			for(boolean dh : storeZero) {
				if(dh)
					doneHalfs++;
			}
			
			double APQh, APQm, APQ;
			label = new Label(2, 0, "APQ");
			excelSheet.addCell(label);
			dateFormat = new SimpleDateFormat("HH");
			APQh = (Integer.parseInt(dateFormat.format(date))*60) - (Integer.parseInt(dateFormat.format(date2))*60);
			dateFormat = new SimpleDateFormat("mm");
			APQm = Integer.parseInt(dateFormat.format(date)) - Integer.parseInt(dateFormat.format(date2));
			APQ = (APQh + APQm)/doneHalfs;
			number = new Number(2, 1, APQ);
			excelSheet.addCell(number);
			
			//CATEGORIES
			
			font.setColour(Colour.GREEN);
			label = new Label(5, 9, "Car R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(8, 9, "Bus R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(9, 9, "Truck R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLUE);
			label = new Label(10, 9, "Car M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(13, 9, "Bus M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(14, 9, "Truck M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.RED);
			label = new Label(15, 9, "Car L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(18, 9, "Bus L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(19, 9, "Truck L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			
			//HOURS
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.YELLOW);
			
			label = new Label(4, 10, "00:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 11, "00:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 12, "00:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 13, "00:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 14, "01:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 15, "01:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 16, "01:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 17, "01:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 18, "02:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 19, "02:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 20, "02:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 21, "02:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 22, "03:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 23, "03:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 24, "03:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 25, "03:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 26, "04:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 27, "04:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 28, "04:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 29, "04:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 30, "05:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 31, "05:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 32, "05:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 33, "05:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 34, "06:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 35, "06:15");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 36, "06:30");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 37, "06:45");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 38, "07:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 39, "07:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 40, "07:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 41, "07:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 42, "08:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 43, "08:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 44, "08:30");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 45, "08:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 46, "09:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 47, "09:15");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 48, "09:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 49, "09:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 50, "10:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 51, "10:15");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 52, "10:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 53, "10:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 54, "11:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 55, "11:15");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 56, "11:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 57, "11:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 58, "12:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 59, "12:15");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 60, "12:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 61, "12:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 62, "13:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 63, "13:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 64, "13:30");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 65, "13:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 66, "14:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 67, "14:15");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 68, "14:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 69, "14:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 70, "15:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 71, "15:15");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 72, "15:30");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 73, "15:45");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 74, "16:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 75, "16:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 76, "16:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 77, "16:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 78, "17:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 79, "17:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 80, "17:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 81, "17:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 82, "18:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 83, "18:15");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 84, "18:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 85, "18:45");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 86, "19:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 87, "19:15");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 88, "19:30");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.ORANGE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 89, "19:45");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.WHITE);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 90, "20:00");
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLACK);
			format.setBackground(Colour.YELLOW);
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 91, "20:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 92, "20:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 93, "20:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 94, "21:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 95, "21:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 96, "21:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 97, "21:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 98, "22:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 99, "22:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 100, "22:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 101, "22:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 102, "23:00");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 103, "23:15");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 104, "23:30");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(4, 105, "23:45");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			
			//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@INFO-IN
			
			//LEFT
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.RED);
			
			int numBefore = 0;
			boolean startNumCheck = false;
			
			for(int x=0;x<96;x++) {
				if(!storeZero[x])
					continue;
				
				if(startNumCheck) {
					if(numBefore>=400) {
						if(numBefore*1.1<=storeInfo[0][(x)] || numBefore/1.1>=storeInfo[0][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.RED);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=300) {
						if(numBefore*1.15<=storeInfo[0][(x)] || numBefore/1.15>=storeInfo[0][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.RED);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=250) {
						if(numBefore*1.2<=storeInfo[0][(x)] || numBefore/1.2>=storeInfo[0][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.RED);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=200) {
						if(numBefore*1.3<=storeInfo[0][(x)] || numBefore/1.3>=storeInfo[0][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.RED);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=150) {
						if(numBefore*1.4<=storeInfo[0][(x)] || numBefore/1.4>=storeInfo[0][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.RED);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=100) {
						if(numBefore*1.5<=storeInfo[0][(x)] || numBefore/1.5>=storeInfo[0][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.RED);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=50) {
						if(numBefore*1.6<=storeInfo[0][(x)] || numBefore/1.6>=storeInfo[0][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.RED);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=20) {
						if(numBefore*2<=storeInfo[0][(x)] || numBefore/2>=storeInfo[0][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.RED);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=10) {
						if(numBefore*2.5<=storeInfo[0][(x)] || numBefore/2.5>=storeInfo[0][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.RED);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=1) {
						if(numBefore+10<=storeInfo[0][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.RED);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}
					numBefore = storeInfo[0][(x)];
				}else {
					numBefore = storeInfo[0][(x)];
					startNumCheck = true;
				}
					
				if(x>=72) {
					number = new Number(15, (-62+x), (storeInfo[0][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
					format = new WritableCellFormat(font);
					font.setColour(Colour.RED);
					number = new Number(18, (-62+x), (storeInfo[1][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(19, (-62+x), (storeInfo[2][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}else {
					number = new Number(15, (34+x), (storeInfo[0][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
					format = new WritableCellFormat(font);
					font.setColour(Colour.RED);
					number = new Number(18, (34+x), (storeInfo[1][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(19, (34+x), (storeInfo[2][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}
			}
			
			//MIDDLE
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLUE);
			
			numBefore = 0;
			startNumCheck = false;

			for(int x=0;x<96;x++) {
				if(!storeZero[x])
					continue;
				
				if(startNumCheck) {
					if(numBefore>=400) {
						if(numBefore*1.1<=storeInfo[3][(x)] || numBefore/1.1>=storeInfo[3][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.BLUE);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=300) {
						if(numBefore*1.15<=storeInfo[3][(x)] || numBefore/1.15>=storeInfo[3][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.BLUE);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=250) {
						if(numBefore*1.2<=storeInfo[3][(x)] || numBefore/1.2>=storeInfo[3][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.BLUE);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=200) {
						if(numBefore*1.3<=storeInfo[3][(x)] || numBefore/1.3>=storeInfo[3][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.BLUE);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=150) {
						if(numBefore*1.4<=storeInfo[3][(x)] || numBefore/1.4>=storeInfo[3][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.BLUE);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=100) {
						if(numBefore*1.5<=storeInfo[3][(x)] || numBefore/1.5>=storeInfo[3][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.BLUE);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=50) {
						if(numBefore*1.6<=storeInfo[3][(x)] || numBefore/1.6>=storeInfo[3][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.BLUE);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=20) {
						if(numBefore*2<=storeInfo[3][(x)] || numBefore/2>=storeInfo[3][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.BLUE);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=10) {
						if(numBefore*2.5<=storeInfo[3][(x)] || numBefore/2.5>=storeInfo[3][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.BLUE);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=1) {
						if(numBefore+10<=storeInfo[3][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.BLUE);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}
					numBefore = storeInfo[3][(x)];
				}else {
					numBefore = storeInfo[3][(x)];
					startNumCheck = true;
				}
				
				if(x>=72) {
					number = new Number(10, (-62+x), (storeInfo[3][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
					format = new WritableCellFormat(font);
					font.setColour(Colour.BLUE);
					number = new Number(13, (-62+x), (storeInfo[4][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(14, (-62+x), (storeInfo[5][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}else {
					number = new Number(10, (34+x), (storeInfo[3][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
					format = new WritableCellFormat(font);
					font.setColour(Colour.BLUE);
					number = new Number(13, (34+x), (storeInfo[4][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(14, (34+x), (storeInfo[5][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}

			}
			
			//RIGHT
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.GREEN);
			
			numBefore = 0;
			startNumCheck = false;
			
			for(int x=0;x<96;x++) {
				if(!storeZero[x])
					continue;
				
				if(startNumCheck) {
					if(numBefore>=400) {
						if(numBefore*1.1<=storeInfo[6][(x)] || numBefore/1.1>=storeInfo[6][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.GREEN);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=300) {
						if(numBefore*1.15<=storeInfo[6][(x)] || numBefore/1.15>=storeInfo[6][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.GREEN);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=250) {
						if(numBefore*1.2<=storeInfo[6][(x)] || numBefore/1.2>=storeInfo[6][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.GREEN);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=200) {
						if(numBefore*1.3<=storeInfo[6][(x)] || numBefore/1.3>=storeInfo[6][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.GREEN);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=150) {
						if(numBefore*1.4<=storeInfo[6][(x)] || numBefore/1.4>=storeInfo[6][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.GREEN);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=100) {
						if(numBefore*1.5<=storeInfo[6][(x)] || numBefore/1.5>=storeInfo[6][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.GREEN);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=50) {
						if(numBefore*1.6<=storeInfo[6][(x)] || numBefore/1.6>=storeInfo[6][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.GREEN);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=20) {
						if(numBefore*2<=storeInfo[6][(x)] || numBefore/2>=storeInfo[6][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.GREEN);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=10) {
						if(numBefore*2.5<=storeInfo[6][(x)] || numBefore/2.5>=storeInfo[6][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.GREEN);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}else if(numBefore>=1) {
						if(numBefore+10<=storeInfo[6][(x)]) {
							font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
							format = new WritableCellFormat(font);
							font.setColour(Colour.GREEN);
							format.setBackground(Colour.LIGHT_ORANGE);
						}
					}
					numBefore = storeInfo[6][(x)];
				}else {
					numBefore = storeInfo[6][(x)];
					startNumCheck = true;
				}
				
				if(x>=72) {
					number = new Number(5, (-62+x), (storeInfo[6][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
					format = new WritableCellFormat(font);
					font.setColour(Colour.GREEN);
					number = new Number(8, (-62+x), (storeInfo[7][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(9, (-62+x), (storeInfo[8][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}else {
					number = new Number(5, (34+x), (storeInfo[6][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
					format = new WritableCellFormat(font);
					font.setColour(Colour.GREEN);
					number = new Number(8, (34+x), (storeInfo[7][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(9, (34+x), (storeInfo[8][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}
				

			}
			
			boolean operate = true;
			
			for(int x=0; x<Main.amountBoxS.length();x++) {
				if(Main.amountBoxS.charAt(x)=='/' || Main.amountBoxS.charAt(x)=='\\' || Main.amountBoxS.charAt(x)==':' || Main.amountBoxS.charAt(x)=='*' || Main.amountBoxS.charAt(x)=='?' || Main.amountBoxS.charAt(x)=='"' || Main.amountBoxS.charAt(x)=='<' || Main.amountBoxS.charAt(x)=='>' || Main.amountBoxS.charAt(x)=='|') {
					operate = false;
					Stage errorStage = new Stage();
					Parent errorParent;
					Scene errorScene;
					errorStage = new Stage();
					errorParent = FXMLLoader.load(getClass().getResource("/ErrorBOX.fxml"));
					errorScene = new Scene(errorParent, 200, 100);
					errorStage.setTitle("MESSAGE");
					errorStage.setScene(errorScene);
					errorStage.setResizable(false);
					errorStage.setOnCloseRequest(e->e.consume());
					errorStage.initModality(Modality.APPLICATION_MODAL);
		    		errorStage.show();
		    		excelFile.close();
				}
			}
			if(operate) {
				System.out.println("all good");
				excelFile.write();
				excelFile.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("File: " + file + " Successfully saved!");
	}
		
}
