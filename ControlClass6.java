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

public class ControlClass6 {
	
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
    	storeInfo[3][hourSelected] = Vehicles[0][3];
    	storeInfo[4][hourSelected] = Vehicles[0][4];
    	storeInfo[5][hourSelected] = Vehicles[0][5];
    	storeInfo[6][hourSelected] = Vehicles[0][6];
    	storeInfo[7][hourSelected] = Vehicles[0][7];
    	storeInfo[8][hourSelected] = Vehicles[0][8];
    	storeInfo[9][hourSelected] = Vehicles[0][9];
    	
    	storeInfo[10][hourSelected] = Vehicles[1][0];
    	storeInfo[11][hourSelected] = Vehicles[1][1];
    	storeInfo[12][hourSelected] = Vehicles[1][2];
    	storeInfo[13][hourSelected] = Vehicles[1][3];
    	storeInfo[14][hourSelected] = Vehicles[1][4];
    	storeInfo[15][hourSelected] = Vehicles[1][5];
    	storeInfo[16][hourSelected] = Vehicles[1][6];
    	storeInfo[17][hourSelected] = Vehicles[1][7];
    	storeInfo[18][hourSelected] = Vehicles[1][8];
    	storeInfo[19][hourSelected] = Vehicles[1][9];
    	
    	storeInfo[20][hourSelected] = Vehicles[2][0];
    	storeInfo[21][hourSelected] = Vehicles[2][1];
    	storeInfo[22][hourSelected] = Vehicles[2][2];
    	storeInfo[23][hourSelected] = Vehicles[2][3];
    	storeInfo[24][hourSelected] = Vehicles[2][4];
    	storeInfo[25][hourSelected] = Vehicles[2][5];
    	storeInfo[26][hourSelected] = Vehicles[2][6];
    	storeInfo[27][hourSelected] = Vehicles[2][7];
    	storeInfo[28][hourSelected] = Vehicles[2][8];
    	storeInfo[29][hourSelected] = Vehicles[2][9];
    	
    	if(emptyCheckbox.isSelected()) {
    		storeZero[hourSelected] = true;
    		emptyCheckbox.setSelected(false);
	    	System.out.println("hour: " + menu.getText() + spc
		    + "Left Private: " + Vehicles[0][0] + spc
		   	+ "Left Cab: " + Vehicles[0][1] + spc
	  		+ "Left Commercial: " + Vehicles[0][2] + spc
	  		+ "Left Bus: " + Vehicles[0][3] + spc
	  		+ "Left Truck: " + Vehicles[0][4] + spc
    		+ "Left Motorcycle: " + Vehicles[0][5] + spc
	   		+ "Left Bicycle: " + Vehicles[0][6] + spc
	   		+ "Left Other: " + Vehicles[0][7] + spc
	   		+ "Left Other 2: " + Vehicles[0][8] + spc
	   		+ "Left Other 3: " + Vehicles[0][9] + spc
	   		+ "Middle Private: " + Vehicles[1][0] + spc
	   		+ "Middle Cab: " + Vehicles[1][1] + spc
	   		+ "Middle Commercial: " + Vehicles[1][2] + spc
	   		+ "Middle Bus: " + Vehicles[1][3] + spc
	   		+ "Middle Truck: " + Vehicles[1][4] + spc
	   		+ "Middle Motorcycle: " + Vehicles[1][5] + spc
	   		+ "Middle Bicycle: " + Vehicles[1][6] + spc
	   		+ "Middle Other: " + Vehicles[1][7] + spc
	   		+ "Middle Other 2: " + Vehicles[1][8] + spc
	   		+ "Middle Other 3: " + Vehicles[1][9] + spc
	   		+ "Right Private: " + Vehicles[2][0] + spc
	   		+ "Right Cab: " + Vehicles[2][1] + spc
	   		+ "Right Commercial: " + Vehicles[2][2] + spc
	   		+ "Right Bus: " + Vehicles[2][3] + spc
	   		+ "Right Truck: " + Vehicles[2][4] + spc
	   		+ "Right Motorcycle: " + Vehicles[2][5] + spc
	   		+ "Right Bicycle: " + Vehicles[2][6] + spc
	   		+ "Right Other: " + Vehicles[2][7] + spc
	   		+ "Right Other 2: " + Vehicles[2][7] + spc
	   		+ "Right Other 3: " + Vehicles[2][7] + spc);
    	}
    	
    }
    
    public void reupdateInfo() {
    	
    	if(storeZero[hourSelected] == true)
    		emptyCheckbox.setSelected(true);
    	
    	Vehicles[0][0] = storeInfo[0][hourSelected];
    	Vehicles[0][1] = storeInfo[1][hourSelected];
    	Vehicles[0][2] = storeInfo[2][hourSelected];
    	Vehicles[0][3] = storeInfo[3][hourSelected];
    	Vehicles[0][4] = storeInfo[4][hourSelected];
    	Vehicles[0][5] = storeInfo[5][hourSelected];
    	Vehicles[0][6] = storeInfo[6][hourSelected];
    	Vehicles[0][7] = storeInfo[7][hourSelected];
    	Vehicles[0][8] = storeInfo[8][hourSelected];
    	Vehicles[0][9] = storeInfo[9][hourSelected];
    	
    	Vehicles[1][0] = storeInfo[10][hourSelected];
    	Vehicles[1][1] = storeInfo[11][hourSelected];
    	Vehicles[1][2] = storeInfo[12][hourSelected];
    	Vehicles[1][3] = storeInfo[13][hourSelected];
    	Vehicles[1][4] = storeInfo[14][hourSelected];
    	Vehicles[1][5] = storeInfo[15][hourSelected];
    	Vehicles[1][6] = storeInfo[16][hourSelected];
    	Vehicles[1][7] = storeInfo[17][hourSelected];
    	Vehicles[1][8] = storeInfo[18][hourSelected];
    	Vehicles[1][9] = storeInfo[19][hourSelected];
    	
    	Vehicles[2][0] = storeInfo[20][hourSelected];
    	Vehicles[2][1] = storeInfo[21][hourSelected];
    	Vehicles[2][2] = storeInfo[22][hourSelected];
    	Vehicles[2][3] = storeInfo[23][hourSelected];
    	Vehicles[2][4] = storeInfo[24][hourSelected];
    	Vehicles[2][5] = storeInfo[25][hourSelected];
    	Vehicles[2][6] = storeInfo[26][hourSelected];
    	Vehicles[2][7] = storeInfo[27][hourSelected];
    	Vehicles[2][8] = storeInfo[28][hourSelected];
    	Vehicles[2][9] = storeInfo[29][hourSelected];
    	
    }
    
    
    @FXML
    void h1(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("06:00");
    	hourSelected = 0;
    	qL.setText(Integer.toString(storeInfo[0][0])); //left private
    	wL.setText(Integer.toString(storeInfo[1][0])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][0])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][0])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][0])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][0])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][0])); //right private
    	iL.setText(Integer.toString(storeInfo[7][0])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][0])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][0])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][0])); //left private
    	sM.setText(Integer.toString(storeInfo[11][0])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][0])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][0])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][0])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][0])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][0])); //right private
    	kM.setText(Integer.toString(storeInfo[17][0])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][0])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][0])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][0])); //left private
    	xR.setText(Integer.toString(storeInfo[21][0])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][0])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][0])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][0])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][0])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][0])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][0])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][0])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][0])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h10(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("08:15");
    	hourSelected = 9;
    	qL.setText(Integer.toString(storeInfo[0][9])); //left private
    	wL.setText(Integer.toString(storeInfo[1][9])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][9])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][9])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][9])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][9])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][9])); //right private
    	iL.setText(Integer.toString(storeInfo[7][9])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][9])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][9])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][9])); //left private
    	sM.setText(Integer.toString(storeInfo[11][9])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][9])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][9])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][9])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][9])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][9])); //right private
    	kM.setText(Integer.toString(storeInfo[17][9])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][9])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][9])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][9])); //left private
    	xR.setText(Integer.toString(storeInfo[21][9])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][9])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][9])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][9])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][9])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][9])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][9])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][9])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][9])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h11(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("08:30");
    	hourSelected = 10;
    	qL.setText(Integer.toString(storeInfo[0][10])); //left private
    	wL.setText(Integer.toString(storeInfo[1][10])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][10])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][10])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][10])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][10])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][10])); //right private
    	iL.setText(Integer.toString(storeInfo[7][10])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][10])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][10])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][10])); //left private
    	sM.setText(Integer.toString(storeInfo[11][10])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][10])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][10])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][10])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][10])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][10])); //right private
    	kM.setText(Integer.toString(storeInfo[17][10])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][10])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][10])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][10])); //left private
    	xR.setText(Integer.toString(storeInfo[21][10])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][10])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][10])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][10])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][10])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][10])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][10])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][10])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][10])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h12(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("08:45");
    	hourSelected = 11;
    	qL.setText(Integer.toString(storeInfo[0][11])); //left private
    	wL.setText(Integer.toString(storeInfo[1][11])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][11])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][11])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][11])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][11])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][11])); //right private
    	iL.setText(Integer.toString(storeInfo[7][11])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][11])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][11])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][11])); //left private
    	sM.setText(Integer.toString(storeInfo[11][11])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][11])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][11])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][11])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][11])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][11])); //right private
    	kM.setText(Integer.toString(storeInfo[17][11])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][11])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][11])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][11])); //left private
    	xR.setText(Integer.toString(storeInfo[21][11])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][11])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][11])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][11])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][11])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][11])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][11])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][11])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][11])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h13(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("09:00");
    	hourSelected = 12;
    	qL.setText(Integer.toString(storeInfo[0][12])); //left private
    	wL.setText(Integer.toString(storeInfo[1][12])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][12])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][12])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][12])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][12])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][12])); //right private
    	iL.setText(Integer.toString(storeInfo[7][12])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][12])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][12])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][12])); //left private
    	sM.setText(Integer.toString(storeInfo[11][12])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][12])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][12])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][12])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][12])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][12])); //right private
    	kM.setText(Integer.toString(storeInfo[17][12])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][12])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][12])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][12])); //left private
    	xR.setText(Integer.toString(storeInfo[21][12])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][12])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][12])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][12])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][12])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][12])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][12])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][12])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][12])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h14(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("09:15");
    	hourSelected = 13;
    	qL.setText(Integer.toString(storeInfo[0][13])); //left private
    	wL.setText(Integer.toString(storeInfo[1][13])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][13])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][13])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][13])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][13])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][13])); //right private
    	iL.setText(Integer.toString(storeInfo[7][13])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][13])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][13])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][13])); //left private
    	sM.setText(Integer.toString(storeInfo[11][13])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][13])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][13])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][13])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][13])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][13])); //right private
    	kM.setText(Integer.toString(storeInfo[17][13])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][13])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][13])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][13])); //left private
    	xR.setText(Integer.toString(storeInfo[21][13])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][13])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][13])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][13])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][13])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][13])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][13])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][13])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][13])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h15(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("09:30");
    	hourSelected = 14;
    	qL.setText(Integer.toString(storeInfo[0][14])); //left private
    	wL.setText(Integer.toString(storeInfo[1][14])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][14])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][14])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][14])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][14])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][14])); //right private
    	iL.setText(Integer.toString(storeInfo[7][14])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][14])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][14])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][14])); //left private
    	sM.setText(Integer.toString(storeInfo[11][14])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][14])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][14])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][14])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][14])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][14])); //right private
    	kM.setText(Integer.toString(storeInfo[17][14])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][14])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][14])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][14])); //left private
    	xR.setText(Integer.toString(storeInfo[21][14])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][14])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][14])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][14])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][14])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][14])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][14])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][14])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][14])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h16(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("09:45");
    	hourSelected = 15;
    	qL.setText(Integer.toString(storeInfo[0][15])); //left private
    	wL.setText(Integer.toString(storeInfo[1][15])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][15])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][15])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][15])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][15])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][15])); //right private
    	iL.setText(Integer.toString(storeInfo[7][15])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][15])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][15])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][15])); //left private
    	sM.setText(Integer.toString(storeInfo[11][15])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][15])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][15])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][15])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][15])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][15])); //right private
    	kM.setText(Integer.toString(storeInfo[17][15])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][15])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][15])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][15])); //left private
    	xR.setText(Integer.toString(storeInfo[21][15])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][15])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][15])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][15])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][15])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][15])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][15])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][15])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][15])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h17(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("10:00");
    	hourSelected = 16;
    	qL.setText(Integer.toString(storeInfo[0][16])); //left private
    	wL.setText(Integer.toString(storeInfo[1][16])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][16])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][16])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][16])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][16])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][16])); //right private
    	iL.setText(Integer.toString(storeInfo[7][16])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][16])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][16])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][16])); //left private
    	sM.setText(Integer.toString(storeInfo[11][16])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][16])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][16])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][16])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][16])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][16])); //right private
    	kM.setText(Integer.toString(storeInfo[17][16])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][16])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][16])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][16])); //left private
    	xR.setText(Integer.toString(storeInfo[21][16])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][16])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][16])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][16])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][16])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][16])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][16])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][16])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][16])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h18(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("10:15");
    	hourSelected = 17;
    	qL.setText(Integer.toString(storeInfo[0][17])); //left private
    	wL.setText(Integer.toString(storeInfo[1][17])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][17])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][17])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][17])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][17])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][17])); //right private
    	iL.setText(Integer.toString(storeInfo[7][17])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][17])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][17])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][17])); //left private
    	sM.setText(Integer.toString(storeInfo[11][17])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][17])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][17])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][17])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][17])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][17])); //right private
    	kM.setText(Integer.toString(storeInfo[17][17])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][17])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][17])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][17])); //left private
    	xR.setText(Integer.toString(storeInfo[21][17])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][17])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][17])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][17])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][17])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][17])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][17])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][17])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][17])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h19(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("10:30");
    	hourSelected = 18;
    	qL.setText(Integer.toString(storeInfo[0][18])); //left private
    	wL.setText(Integer.toString(storeInfo[1][18])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][18])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][18])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][18])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][18])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][18])); //right private
    	iL.setText(Integer.toString(storeInfo[7][18])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][18])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][18])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][18])); //left private
    	sM.setText(Integer.toString(storeInfo[11][18])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][18])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][18])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][18])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][18])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][18])); //right private
    	kM.setText(Integer.toString(storeInfo[17][18])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][18])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][18])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][18])); //left private
    	xR.setText(Integer.toString(storeInfo[21][18])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][18])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][18])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][18])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][18])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][18])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][18])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][18])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][18])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h2(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("06:15");
    	hourSelected = 1;
    	qL.setText(Integer.toString(storeInfo[0][1])); //left private
    	wL.setText(Integer.toString(storeInfo[1][1])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][1])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][1])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][1])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][1])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][1])); //right private
    	iL.setText(Integer.toString(storeInfo[7][1])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][1])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][1])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][1])); //left private
    	sM.setText(Integer.toString(storeInfo[11][1])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][1])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][1])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][1])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][1])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][1])); //right private
    	kM.setText(Integer.toString(storeInfo[17][1])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][1])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][1])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][1])); //left private
    	xR.setText(Integer.toString(storeInfo[21][1])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][1])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][1])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][1])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][1])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][1])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][1])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][1])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][1])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h20(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("10:45");
    	hourSelected = 19;
    	qL.setText(Integer.toString(storeInfo[0][19])); //left private
    	wL.setText(Integer.toString(storeInfo[1][19])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][19])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][19])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][19])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][19])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][19])); //right private
    	iL.setText(Integer.toString(storeInfo[7][19])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][19])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][19])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][19])); //left private
    	sM.setText(Integer.toString(storeInfo[11][19])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][19])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][19])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][19])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][19])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][19])); //right private
    	kM.setText(Integer.toString(storeInfo[17][19])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][19])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][19])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][19])); //left private
    	xR.setText(Integer.toString(storeInfo[21][19])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][19])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][19])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][19])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][19])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][19])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][19])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][19])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][19])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h21(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("11:00");
    	hourSelected = 20;
    	qL.setText(Integer.toString(storeInfo[0][20])); //left private
    	wL.setText(Integer.toString(storeInfo[1][20])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][20])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][20])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][20])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][20])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][20])); //right private
    	iL.setText(Integer.toString(storeInfo[7][20])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][20])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][20])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][20])); //left private
    	sM.setText(Integer.toString(storeInfo[11][20])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][20])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][20])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][20])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][20])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][20])); //right private
    	kM.setText(Integer.toString(storeInfo[17][20])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][20])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][20])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][20])); //left private
    	xR.setText(Integer.toString(storeInfo[21][20])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][20])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][20])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][20])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][20])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][20])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][20])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][20])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][20])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h22(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("11:15");
    	hourSelected = 21;
    	qL.setText(Integer.toString(storeInfo[0][21])); //left private
    	wL.setText(Integer.toString(storeInfo[1][21])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][21])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][21])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][21])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][21])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][21])); //right private
    	iL.setText(Integer.toString(storeInfo[7][21])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][21])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][21])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][21])); //left private
    	sM.setText(Integer.toString(storeInfo[11][21])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][21])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][21])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][21])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][21])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][21])); //right private
    	kM.setText(Integer.toString(storeInfo[17][21])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][21])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][21])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][21])); //left private
    	xR.setText(Integer.toString(storeInfo[21][21])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][21])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][21])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][21])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][21])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][21])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][21])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][21])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][21])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h23(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("11:30");
    	hourSelected = 22;
    	qL.setText(Integer.toString(storeInfo[0][22])); //left private
    	wL.setText(Integer.toString(storeInfo[1][22])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][22])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][22])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][22])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][22])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][22])); //right private
    	iL.setText(Integer.toString(storeInfo[7][22])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][22])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][22])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][22])); //left private
    	sM.setText(Integer.toString(storeInfo[11][22])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][22])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][22])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][22])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][22])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][22])); //right private
    	kM.setText(Integer.toString(storeInfo[17][22])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][22])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][22])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][22])); //left private
    	xR.setText(Integer.toString(storeInfo[21][22])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][22])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][22])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][22])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][22])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][22])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][22])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][22])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][22])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h24(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("11:45");
    	hourSelected = 23;
    	qL.setText(Integer.toString(storeInfo[0][23])); //left private
    	wL.setText(Integer.toString(storeInfo[1][23])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][23])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][23])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][23])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][23])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][23])); //right private
    	iL.setText(Integer.toString(storeInfo[7][23])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][23])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][23])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][23])); //left private
    	sM.setText(Integer.toString(storeInfo[11][23])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][23])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][23])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][23])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][23])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][23])); //right private
    	kM.setText(Integer.toString(storeInfo[17][23])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][23])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][23])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][23])); //left private
    	xR.setText(Integer.toString(storeInfo[21][23])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][23])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][23])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][23])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][23])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][23])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][23])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][23])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][23])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h25(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("12:00");
    	hourSelected = 24;
    	qL.setText(Integer.toString(storeInfo[0][24])); //left private
    	wL.setText(Integer.toString(storeInfo[1][24])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][24])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][24])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][24])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][24])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][24])); //right private
    	iL.setText(Integer.toString(storeInfo[7][24])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][24])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][24])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][24])); //left private
    	sM.setText(Integer.toString(storeInfo[11][24])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][24])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][24])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][24])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][24])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][24])); //right private
    	kM.setText(Integer.toString(storeInfo[17][24])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][24])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][24])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][24])); //left private
    	xR.setText(Integer.toString(storeInfo[21][24])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][24])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][24])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][24])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][24])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][24])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][24])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][24])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][24])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h26(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("12:15");
    	hourSelected = 25;
    	qL.setText(Integer.toString(storeInfo[0][25])); //left private
    	wL.setText(Integer.toString(storeInfo[1][25])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][25])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][25])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][25])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][25])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][25])); //right private
    	iL.setText(Integer.toString(storeInfo[7][25])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][25])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][25])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][25])); //left private
    	sM.setText(Integer.toString(storeInfo[11][25])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][25])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][25])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][25])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][25])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][25])); //right private
    	kM.setText(Integer.toString(storeInfo[17][25])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][25])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][25])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][25])); //left private
    	xR.setText(Integer.toString(storeInfo[21][25])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][25])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][25])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][25])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][25])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][25])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][25])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][25])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][25])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h27(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("12:30");
    	hourSelected = 26;
    	qL.setText(Integer.toString(storeInfo[0][26])); //left private
    	wL.setText(Integer.toString(storeInfo[1][26])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][26])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][26])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][26])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][26])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][26])); //right private
    	iL.setText(Integer.toString(storeInfo[7][26])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][26])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][26])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][26])); //left private
    	sM.setText(Integer.toString(storeInfo[11][26])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][26])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][26])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][26])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][26])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][26])); //right private
    	kM.setText(Integer.toString(storeInfo[17][26])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][26])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][26])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][26])); //left private
    	xR.setText(Integer.toString(storeInfo[21][26])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][26])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][26])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][26])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][26])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][26])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][26])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][26])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][26])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h28(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("12:45");
    	hourSelected = 27;
    	qL.setText(Integer.toString(storeInfo[0][27])); //left private
    	wL.setText(Integer.toString(storeInfo[1][27])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][27])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][27])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][27])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][27])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][27])); //right private
    	iL.setText(Integer.toString(storeInfo[7][27])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][27])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][27])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][27])); //left private
    	sM.setText(Integer.toString(storeInfo[11][27])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][27])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][27])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][27])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][27])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][27])); //right private
    	kM.setText(Integer.toString(storeInfo[17][27])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][27])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][27])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][27])); //left private
    	xR.setText(Integer.toString(storeInfo[21][27])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][27])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][27])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][27])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][27])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][27])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][27])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][27])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][27])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h29(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("13:00");
    	hourSelected = 28;
    	qL.setText(Integer.toString(storeInfo[0][28])); //left private
    	wL.setText(Integer.toString(storeInfo[1][28])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][28])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][28])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][28])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][28])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][28])); //right private
    	iL.setText(Integer.toString(storeInfo[7][28])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][28])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][28])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][28])); //left private
    	sM.setText(Integer.toString(storeInfo[11][28])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][28])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][28])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][28])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][28])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][28])); //right private
    	kM.setText(Integer.toString(storeInfo[17][28])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][28])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][28])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][28])); //left private
    	xR.setText(Integer.toString(storeInfo[21][28])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][28])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][28])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][28])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][28])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][28])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][28])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][28])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][28])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h3(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("06:30");
    	hourSelected = 2;
    	qL.setText(Integer.toString(storeInfo[0][2])); //left private
    	wL.setText(Integer.toString(storeInfo[1][2])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][2])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][2])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][2])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][2])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][2])); //right private
    	iL.setText(Integer.toString(storeInfo[7][2])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][2])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][2])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][2])); //left private
    	sM.setText(Integer.toString(storeInfo[11][2])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][2])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][2])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][2])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][2])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][2])); //right private
    	kM.setText(Integer.toString(storeInfo[17][2])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][2])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][2])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][2])); //left private
    	xR.setText(Integer.toString(storeInfo[21][2])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][2])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][2])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][2])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][2])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][2])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][2])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][2])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][2])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h30(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("13:15");
    	hourSelected = 29;
    	qL.setText(Integer.toString(storeInfo[0][29])); //left private
    	wL.setText(Integer.toString(storeInfo[1][29])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][29])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][29])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][29])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][29])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][29])); //right private
    	iL.setText(Integer.toString(storeInfo[7][29])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][29])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][29])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][29])); //left private
    	sM.setText(Integer.toString(storeInfo[11][29])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][29])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][29])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][29])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][29])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][29])); //right private
    	kM.setText(Integer.toString(storeInfo[17][29])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][29])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][29])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][29])); //left private
    	xR.setText(Integer.toString(storeInfo[21][29])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][29])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][29])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][29])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][29])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][29])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][29])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][29])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][29])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h31(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("13:30");
    	hourSelected = 30;
    	qL.setText(Integer.toString(storeInfo[0][30])); //left private
    	wL.setText(Integer.toString(storeInfo[1][30])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][30])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][30])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][30])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][30])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][30])); //right private
    	iL.setText(Integer.toString(storeInfo[7][30])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][30])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][30])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][30])); //left private
    	sM.setText(Integer.toString(storeInfo[11][30])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][30])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][30])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][30])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][30])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][30])); //right private
    	kM.setText(Integer.toString(storeInfo[17][30])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][30])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][30])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][30])); //left private
    	xR.setText(Integer.toString(storeInfo[21][30])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][30])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][30])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][30])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][30])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][30])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][30])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][30])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][30])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h32(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("13:45");
    	hourSelected = 31;
    	qL.setText(Integer.toString(storeInfo[0][31])); //left private
    	wL.setText(Integer.toString(storeInfo[1][31])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][31])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][31])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][31])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][31])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][31])); //right private
    	iL.setText(Integer.toString(storeInfo[7][31])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][31])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][31])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][31])); //left private
    	sM.setText(Integer.toString(storeInfo[11][31])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][31])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][31])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][31])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][31])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][31])); //right private
    	kM.setText(Integer.toString(storeInfo[17][31])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][31])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][31])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][31])); //left private
    	xR.setText(Integer.toString(storeInfo[21][31])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][31])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][31])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][31])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][31])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][31])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][31])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][31])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][31])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h33(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("14:00");
    	hourSelected = 32;
    	qL.setText(Integer.toString(storeInfo[0][32])); //left private
    	wL.setText(Integer.toString(storeInfo[1][32])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][32])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][32])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][32])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][32])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][32])); //right private
    	iL.setText(Integer.toString(storeInfo[7][32])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][32])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][32])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][32])); //left private
    	sM.setText(Integer.toString(storeInfo[11][32])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][32])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][32])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][32])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][32])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][32])); //right private
    	kM.setText(Integer.toString(storeInfo[17][32])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][32])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][32])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][32])); //left private
    	xR.setText(Integer.toString(storeInfo[21][32])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][32])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][32])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][32])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][32])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][32])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][32])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][32])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][32])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h34(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("14:15");
    	hourSelected = 33;
    	qL.setText(Integer.toString(storeInfo[0][33])); //left private
    	wL.setText(Integer.toString(storeInfo[1][33])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][33])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][33])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][33])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][33])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][33])); //right private
    	iL.setText(Integer.toString(storeInfo[7][33])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][33])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][33])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][33])); //left private
    	sM.setText(Integer.toString(storeInfo[11][33])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][33])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][33])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][33])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][33])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][33])); //right private
    	kM.setText(Integer.toString(storeInfo[17][33])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][33])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][33])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][33])); //left private
    	xR.setText(Integer.toString(storeInfo[21][33])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][33])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][33])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][33])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][33])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][33])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][33])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][33])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][33])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h35(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("14:30");
    	hourSelected = 34;
    	qL.setText(Integer.toString(storeInfo[0][34])); //left private
    	wL.setText(Integer.toString(storeInfo[1][34])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][34])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][34])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][34])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][34])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][34])); //right private
    	iL.setText(Integer.toString(storeInfo[7][34])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][34])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][34])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][34])); //left private
    	sM.setText(Integer.toString(storeInfo[11][34])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][34])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][34])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][34])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][34])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][34])); //right private
    	kM.setText(Integer.toString(storeInfo[17][34])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][34])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][34])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][34])); //left private
    	xR.setText(Integer.toString(storeInfo[21][34])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][34])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][34])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][34])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][34])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][34])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][34])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][34])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][34])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h36(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("14:45");
    	hourSelected = 35;
    	qL.setText(Integer.toString(storeInfo[0][35])); //left private
    	wL.setText(Integer.toString(storeInfo[1][35])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][35])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][35])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][35])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][35])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][35])); //right private
    	iL.setText(Integer.toString(storeInfo[7][35])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][35])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][35])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][35])); //left private
    	sM.setText(Integer.toString(storeInfo[11][35])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][35])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][35])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][35])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][35])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][35])); //right private
    	kM.setText(Integer.toString(storeInfo[17][35])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][35])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][35])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][35])); //left private
    	xR.setText(Integer.toString(storeInfo[21][35])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][35])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][35])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][35])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][35])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][35])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][35])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][35])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][35])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h37(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("15:00");
    	hourSelected = 36;
    	qL.setText(Integer.toString(storeInfo[0][36])); //left private
    	wL.setText(Integer.toString(storeInfo[1][36])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][36])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][36])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][36])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][36])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][36])); //right private
    	iL.setText(Integer.toString(storeInfo[7][36])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][36])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][36])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][36])); //left private
    	sM.setText(Integer.toString(storeInfo[11][36])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][36])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][36])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][36])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][36])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][36])); //right private
    	kM.setText(Integer.toString(storeInfo[17][36])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][36])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][36])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][36])); //left private
    	xR.setText(Integer.toString(storeInfo[21][36])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][36])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][36])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][36])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][36])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][36])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][36])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][36])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][36])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h38(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("15:15");
    	hourSelected = 37;
    	qL.setText(Integer.toString(storeInfo[0][37])); //left private
    	wL.setText(Integer.toString(storeInfo[1][37])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][37])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][37])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][37])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][37])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][37])); //right private
    	iL.setText(Integer.toString(storeInfo[7][37])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][37])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][37])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][37])); //left private
    	sM.setText(Integer.toString(storeInfo[11][37])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][37])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][37])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][37])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][37])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][37])); //right private
    	kM.setText(Integer.toString(storeInfo[17][37])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][37])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][37])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][37])); //left private
    	xR.setText(Integer.toString(storeInfo[21][37])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][37])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][37])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][37])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][37])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][37])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][37])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][37])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][37])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h39(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("15:30");
    	hourSelected = 38;
    	qL.setText(Integer.toString(storeInfo[0][38])); //left private
    	wL.setText(Integer.toString(storeInfo[1][38])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][38])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][38])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][38])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][38])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][38])); //right private
    	iL.setText(Integer.toString(storeInfo[7][38])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][38])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][38])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][38])); //left private
    	sM.setText(Integer.toString(storeInfo[11][38])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][38])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][38])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][38])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][38])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][38])); //right private
    	kM.setText(Integer.toString(storeInfo[17][38])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][38])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][38])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][38])); //left private
    	xR.setText(Integer.toString(storeInfo[21][38])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][38])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][38])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][38])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][38])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][38])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][38])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][38])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][38])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h4(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("06:45");
    	hourSelected = 3;
    	qL.setText(Integer.toString(storeInfo[0][3])); //left private
    	wL.setText(Integer.toString(storeInfo[1][3])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][3])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][3])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][3])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][3])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][3])); //right private
    	iL.setText(Integer.toString(storeInfo[7][3])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][3])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][3])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][3])); //left private
    	sM.setText(Integer.toString(storeInfo[11][3])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][3])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][3])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][3])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][3])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][3])); //right private
    	kM.setText(Integer.toString(storeInfo[17][3])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][3])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][3])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][3])); //left private
    	xR.setText(Integer.toString(storeInfo[21][3])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][3])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][3])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][3])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][3])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][3])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][3])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][3])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][3])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h40(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("15:45");
    	hourSelected = 39;
    	qL.setText(Integer.toString(storeInfo[0][39])); //left private
    	wL.setText(Integer.toString(storeInfo[1][39])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][39])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][39])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][39])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][39])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][39])); //right private
    	iL.setText(Integer.toString(storeInfo[7][39])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][39])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][39])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][39])); //left private
    	sM.setText(Integer.toString(storeInfo[11][39])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][39])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][39])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][39])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][39])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][39])); //right private
    	kM.setText(Integer.toString(storeInfo[17][39])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][39])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][39])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][39])); //left private
    	xR.setText(Integer.toString(storeInfo[21][39])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][39])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][39])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][39])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][39])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][39])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][39])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][39])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][39])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h41(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("16:00");
    	hourSelected = 40;
    	qL.setText(Integer.toString(storeInfo[0][40])); //left private
    	wL.setText(Integer.toString(storeInfo[1][40])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][40])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][40])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][40])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][40])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][40])); //right private
    	iL.setText(Integer.toString(storeInfo[7][40])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][40])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][40])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][40])); //left private
    	sM.setText(Integer.toString(storeInfo[11][40])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][40])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][40])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][40])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][40])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][40])); //right private
    	kM.setText(Integer.toString(storeInfo[17][40])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][40])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][40])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][40])); //left private
    	xR.setText(Integer.toString(storeInfo[21][40])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][40])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][40])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][40])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][40])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][40])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][40])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][40])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][40])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h42(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("16:15");
    	hourSelected = 41;
    	qL.setText(Integer.toString(storeInfo[0][41])); //left private
    	wL.setText(Integer.toString(storeInfo[1][41])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][41])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][41])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][41])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][41])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][41])); //right private
    	iL.setText(Integer.toString(storeInfo[7][41])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][41])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][41])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][41])); //left private
    	sM.setText(Integer.toString(storeInfo[11][41])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][41])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][41])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][41])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][41])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][41])); //right private
    	kM.setText(Integer.toString(storeInfo[17][41])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][41])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][41])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][41])); //left private
    	xR.setText(Integer.toString(storeInfo[21][41])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][41])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][41])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][41])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][41])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][41])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][41])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][41])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][41])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h43(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("16:30");
    	hourSelected = 42;
    	qL.setText(Integer.toString(storeInfo[0][42])); //left private
    	wL.setText(Integer.toString(storeInfo[1][42])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][42])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][42])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][42])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][42])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][42])); //right private
    	iL.setText(Integer.toString(storeInfo[7][42])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][42])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][42])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][42])); //left private
    	sM.setText(Integer.toString(storeInfo[11][42])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][42])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][42])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][42])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][42])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][42])); //right private
    	kM.setText(Integer.toString(storeInfo[17][42])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][42])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][42])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][42])); //left private
    	xR.setText(Integer.toString(storeInfo[21][42])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][42])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][42])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][42])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][42])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][42])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][42])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][42])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][42])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h44(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("16:45");
    	hourSelected = 43;
    	qL.setText(Integer.toString(storeInfo[0][43])); //left private
    	wL.setText(Integer.toString(storeInfo[1][43])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][43])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][43])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][43])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][43])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][43])); //right private
    	iL.setText(Integer.toString(storeInfo[7][43])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][43])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][43])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][43])); //left private
    	sM.setText(Integer.toString(storeInfo[11][43])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][43])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][43])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][43])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][43])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][43])); //right private
    	kM.setText(Integer.toString(storeInfo[17][43])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][43])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][43])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][43])); //left private
    	xR.setText(Integer.toString(storeInfo[21][43])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][43])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][43])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][43])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][43])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][43])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][43])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][43])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][43])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h45(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("17:00");
    	hourSelected = 44;
    	qL.setText(Integer.toString(storeInfo[0][44])); //left private
    	wL.setText(Integer.toString(storeInfo[1][44])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][44])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][44])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][44])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][44])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][44])); //right private
    	iL.setText(Integer.toString(storeInfo[7][44])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][44])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][44])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][44])); //left private
    	sM.setText(Integer.toString(storeInfo[11][44])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][44])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][44])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][44])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][44])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][44])); //right private
    	kM.setText(Integer.toString(storeInfo[17][44])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][44])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][44])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][44])); //left private
    	xR.setText(Integer.toString(storeInfo[21][44])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][44])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][44])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][44])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][44])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][44])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][44])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][44])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][44])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h46(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("17:15");
    	hourSelected = 45;
    	qL.setText(Integer.toString(storeInfo[0][45])); //left private
    	wL.setText(Integer.toString(storeInfo[1][45])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][45])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][45])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][45])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][45])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][45])); //right private
    	iL.setText(Integer.toString(storeInfo[7][45])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][45])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][45])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][45])); //left private
    	sM.setText(Integer.toString(storeInfo[11][45])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][45])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][45])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][45])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][45])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][45])); //right private
    	kM.setText(Integer.toString(storeInfo[17][45])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][45])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][45])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][45])); //left private
    	xR.setText(Integer.toString(storeInfo[21][45])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][45])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][45])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][45])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][45])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][45])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][45])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][45])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][45])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h47(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("17:30");
    	hourSelected = 46;
    	qL.setText(Integer.toString(storeInfo[0][46])); //left private
    	wL.setText(Integer.toString(storeInfo[1][46])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][46])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][46])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][46])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][46])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][46])); //right private
    	iL.setText(Integer.toString(storeInfo[7][46])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][46])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][46])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][46])); //left private
    	sM.setText(Integer.toString(storeInfo[11][46])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][46])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][46])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][46])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][46])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][46])); //right private
    	kM.setText(Integer.toString(storeInfo[17][46])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][46])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][46])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][46])); //left private
    	xR.setText(Integer.toString(storeInfo[21][46])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][46])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][46])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][46])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][46])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][46])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][46])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][46])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][46])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h48(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("17:45");
    	hourSelected = 47;
    	qL.setText(Integer.toString(storeInfo[0][47])); //left private
    	wL.setText(Integer.toString(storeInfo[1][47])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][47])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][47])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][47])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][47])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][47])); //right private
    	iL.setText(Integer.toString(storeInfo[7][47])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][47])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][47])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][47])); //left private
    	sM.setText(Integer.toString(storeInfo[11][47])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][47])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][47])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][47])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][47])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][47])); //right private
    	kM.setText(Integer.toString(storeInfo[17][47])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][47])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][47])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][47])); //left private
    	xR.setText(Integer.toString(storeInfo[21][47])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][47])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][47])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][47])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][47])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][47])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][47])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][47])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][47])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h49(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("18:00");
    	hourSelected = 48;
    	qL.setText(Integer.toString(storeInfo[0][48])); //left private
    	wL.setText(Integer.toString(storeInfo[1][48])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][48])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][48])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][48])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][48])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][48])); //right private
    	iL.setText(Integer.toString(storeInfo[7][48])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][48])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][48])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][48])); //left private
    	sM.setText(Integer.toString(storeInfo[11][48])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][48])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][48])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][48])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][48])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][48])); //right private
    	kM.setText(Integer.toString(storeInfo[17][48])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][48])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][48])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][48])); //left private
    	xR.setText(Integer.toString(storeInfo[21][48])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][48])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][48])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][48])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][48])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][48])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][48])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][48])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][48])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h5(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("07:00");
    	hourSelected = 4;
    	qL.setText(Integer.toString(storeInfo[0][4])); //left private
    	wL.setText(Integer.toString(storeInfo[1][4])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][4])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][4])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][4])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][4])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][4])); //right private
    	iL.setText(Integer.toString(storeInfo[7][4])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][4])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][4])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][4])); //left private
    	sM.setText(Integer.toString(storeInfo[11][4])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][4])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][4])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][4])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][4])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][4])); //right private
    	kM.setText(Integer.toString(storeInfo[17][4])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][4])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][4])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][4])); //left private
    	xR.setText(Integer.toString(storeInfo[21][4])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][4])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][4])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][4])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][4])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][4])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][4])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][4])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][4])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h50(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("18:15");
    	hourSelected = 49;
    	qL.setText(Integer.toString(storeInfo[0][49])); //left private
    	wL.setText(Integer.toString(storeInfo[1][49])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][49])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][49])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][49])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][49])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][49])); //right private
    	iL.setText(Integer.toString(storeInfo[7][49])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][49])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][49])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][49])); //left private
    	sM.setText(Integer.toString(storeInfo[11][49])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][49])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][49])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][49])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][49])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][49])); //right private
    	kM.setText(Integer.toString(storeInfo[17][49])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][49])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][49])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][49])); //left private
    	xR.setText(Integer.toString(storeInfo[21][49])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][49])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][49])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][49])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][49])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][49])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][49])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][49])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][49])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h51(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("18:30");
    	hourSelected = 50;
    	qL.setText(Integer.toString(storeInfo[0][50])); //left private
    	wL.setText(Integer.toString(storeInfo[1][50])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][50])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][50])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][50])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][50])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][50])); //right private
    	iL.setText(Integer.toString(storeInfo[7][50])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][50])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][50])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][50])); //left private
    	sM.setText(Integer.toString(storeInfo[11][50])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][50])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][50])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][50])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][50])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][50])); //right private
    	kM.setText(Integer.toString(storeInfo[17][50])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][50])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][50])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][50])); //left private
    	xR.setText(Integer.toString(storeInfo[21][50])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][50])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][50])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][50])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][50])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][50])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][50])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][50])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][50])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h52(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("18:45");
    	hourSelected = 51;
    	qL.setText(Integer.toString(storeInfo[0][51])); //left private
    	wL.setText(Integer.toString(storeInfo[1][51])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][51])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][51])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][51])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][51])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][51])); //right private
    	iL.setText(Integer.toString(storeInfo[7][51])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][51])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][51])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][51])); //left private
    	sM.setText(Integer.toString(storeInfo[11][51])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][51])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][51])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][51])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][51])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][51])); //right private
    	kM.setText(Integer.toString(storeInfo[17][51])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][51])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][51])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][51])); //left private
    	xR.setText(Integer.toString(storeInfo[21][51])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][51])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][51])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][51])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][51])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][51])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][51])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][51])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][51])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h53(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("19:00");
    	hourSelected = 52;
    	qL.setText(Integer.toString(storeInfo[0][52])); //left private
    	wL.setText(Integer.toString(storeInfo[1][52])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][52])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][52])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][52])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][52])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][52])); //right private
    	iL.setText(Integer.toString(storeInfo[7][52])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][52])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][52])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][52])); //left private
    	sM.setText(Integer.toString(storeInfo[11][52])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][52])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][52])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][52])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][52])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][52])); //right private
    	kM.setText(Integer.toString(storeInfo[17][52])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][52])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][52])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][52])); //left private
    	xR.setText(Integer.toString(storeInfo[21][52])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][52])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][52])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][52])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][52])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][52])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][52])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][52])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][52])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h54(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("19:15");
    	hourSelected = 53;
    	qL.setText(Integer.toString(storeInfo[0][53])); //left private
    	wL.setText(Integer.toString(storeInfo[1][53])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][53])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][53])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][53])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][53])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][53])); //right private
    	iL.setText(Integer.toString(storeInfo[7][53])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][53])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][53])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][53])); //left private
    	sM.setText(Integer.toString(storeInfo[11][53])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][53])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][53])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][53])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][53])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][53])); //right private
    	kM.setText(Integer.toString(storeInfo[17][53])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][53])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][53])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][53])); //left private
    	xR.setText(Integer.toString(storeInfo[21][53])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][53])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][53])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][53])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][53])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][53])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][53])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][53])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][53])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h55(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("19:30");
    	hourSelected = 54;
    	qL.setText(Integer.toString(storeInfo[0][54])); //left private
    	wL.setText(Integer.toString(storeInfo[1][54])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][54])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][54])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][54])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][54])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][54])); //right private
    	iL.setText(Integer.toString(storeInfo[7][54])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][54])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][54])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][54])); //left private
    	sM.setText(Integer.toString(storeInfo[11][54])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][54])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][54])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][54])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][54])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][54])); //right private
    	kM.setText(Integer.toString(storeInfo[17][54])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][54])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][54])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][54])); //left private
    	xR.setText(Integer.toString(storeInfo[21][54])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][54])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][54])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][54])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][54])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][54])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][54])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][54])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][54])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h56(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("19:45");
    	hourSelected = 55;
    	qL.setText(Integer.toString(storeInfo[0][55])); //left private
    	wL.setText(Integer.toString(storeInfo[1][55])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][55])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][55])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][55])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][55])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][55])); //right private
    	iL.setText(Integer.toString(storeInfo[7][55])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][55])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][55])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][55])); //left private
    	sM.setText(Integer.toString(storeInfo[11][55])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][55])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][55])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][55])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][55])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][55])); //right private
    	kM.setText(Integer.toString(storeInfo[17][55])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][55])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][55])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][55])); //left private
    	xR.setText(Integer.toString(storeInfo[21][55])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][55])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][55])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][55])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][55])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][55])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][55])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][55])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][55])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h57(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("20:00");
    	hourSelected = 56;
    	qL.setText(Integer.toString(storeInfo[0][56])); //left private
    	wL.setText(Integer.toString(storeInfo[1][56])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][56])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][56])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][56])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][56])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][56])); //right private
    	iL.setText(Integer.toString(storeInfo[7][56])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][56])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][56])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][56])); //left private
    	sM.setText(Integer.toString(storeInfo[11][56])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][56])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][56])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][56])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][56])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][56])); //right private
    	kM.setText(Integer.toString(storeInfo[17][56])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][56])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][56])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][56])); //left private
    	xR.setText(Integer.toString(storeInfo[21][56])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][56])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][56])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][56])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][56])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][56])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][56])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][56])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][56])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h58(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("20:15");
    	hourSelected = 57;
    	qL.setText(Integer.toString(storeInfo[0][57])); //left private
    	wL.setText(Integer.toString(storeInfo[1][57])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][57])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][57])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][57])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][57])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][57])); //right private
    	iL.setText(Integer.toString(storeInfo[7][57])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][57])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][57])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][57])); //left private
    	sM.setText(Integer.toString(storeInfo[11][57])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][57])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][57])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][57])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][57])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][57])); //right private
    	kM.setText(Integer.toString(storeInfo[17][57])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][57])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][57])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][57])); //left private
    	xR.setText(Integer.toString(storeInfo[21][57])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][57])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][57])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][57])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][57])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][57])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][57])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][57])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][57])); //right bus
    	reupdateInfo();
    }

    @FXML
    void h59(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("20:30");
    	hourSelected = 58;
    	qL.setText(Integer.toString(storeInfo[0][58])); //left private
    	wL.setText(Integer.toString(storeInfo[1][58])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][58])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][58])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][58])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][58])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][58])); //right private
    	iL.setText(Integer.toString(storeInfo[7][58])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][58])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][58])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][58])); //left private
    	sM.setText(Integer.toString(storeInfo[11][58])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][58])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][58])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][58])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][58])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][58])); //right private
    	kM.setText(Integer.toString(storeInfo[17][58])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][58])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][58])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][58])); //left private
    	xR.setText(Integer.toString(storeInfo[21][58])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][58])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][58])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][58])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][58])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][58])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][58])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][58])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][58])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h6(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("07:15");
    	hourSelected = 5;
    	qL.setText(Integer.toString(storeInfo[0][5])); //left private
    	wL.setText(Integer.toString(storeInfo[1][5])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][5])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][5])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][5])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][5])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][5])); //right private
    	iL.setText(Integer.toString(storeInfo[7][5])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][5])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][5])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][5])); //left private
    	sM.setText(Integer.toString(storeInfo[11][5])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][5])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][5])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][5])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][5])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][5])); //right private
    	kM.setText(Integer.toString(storeInfo[17][5])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][5])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][5])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][5])); //left private
    	xR.setText(Integer.toString(storeInfo[21][5])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][5])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][5])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][5])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][5])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][5])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][5])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][5])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][5])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h60(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("20:45");
    	hourSelected = 59;
    	qL.setText(Integer.toString(storeInfo[0][59])); //left private
    	wL.setText(Integer.toString(storeInfo[1][59])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][59])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][59])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][59])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][59])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][59])); //right private
    	iL.setText(Integer.toString(storeInfo[7][59])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][59])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][59])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][59])); //left private
    	sM.setText(Integer.toString(storeInfo[11][59])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][59])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][59])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][59])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][59])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][59])); //right private
    	kM.setText(Integer.toString(storeInfo[17][59])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][59])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][59])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][59])); //left private
    	xR.setText(Integer.toString(storeInfo[21][59])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][59])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][59])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][59])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][59])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][59])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][59])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][59])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][59])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h61(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("21:00");
    	hourSelected = 60;
    	qL.setText(Integer.toString(storeInfo[0][60])); //left private
    	wL.setText(Integer.toString(storeInfo[1][60])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][60])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][60])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][60])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][60])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][60])); //right private
    	iL.setText(Integer.toString(storeInfo[7][60])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][60])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][60])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][60])); //left private
    	sM.setText(Integer.toString(storeInfo[11][60])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][60])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][60])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][60])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][60])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][60])); //right private
    	kM.setText(Integer.toString(storeInfo[17][60])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][60])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][60])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][60])); //left private
    	xR.setText(Integer.toString(storeInfo[21][60])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][60])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][60])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][60])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][60])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][60])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][60])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][60])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][60])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h62(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("21:15");
    	hourSelected = 61;
    	qL.setText(Integer.toString(storeInfo[0][61])); //left private
    	wL.setText(Integer.toString(storeInfo[1][61])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][61])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][61])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][61])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][61])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][61])); //right private
    	iL.setText(Integer.toString(storeInfo[7][61])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][61])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][61])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][61])); //left private
    	sM.setText(Integer.toString(storeInfo[11][61])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][61])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][61])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][61])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][61])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][61])); //right private
    	kM.setText(Integer.toString(storeInfo[17][61])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][61])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][61])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][61])); //left private
    	xR.setText(Integer.toString(storeInfo[21][61])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][61])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][61])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][61])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][61])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][61])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][61])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][61])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][61])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h63(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("21:30");
    	hourSelected = 62;
    	qL.setText(Integer.toString(storeInfo[0][62])); //left private
    	wL.setText(Integer.toString(storeInfo[1][62])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][62])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][62])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][62])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][62])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][62])); //right private
    	iL.setText(Integer.toString(storeInfo[7][62])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][62])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][62])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][62])); //left private
    	sM.setText(Integer.toString(storeInfo[11][62])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][62])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][62])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][62])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][62])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][62])); //right private
    	kM.setText(Integer.toString(storeInfo[17][62])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][62])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][62])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][62])); //left private
    	xR.setText(Integer.toString(storeInfo[21][62])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][62])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][62])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][62])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][62])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][62])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][62])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][62])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][62])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h64(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("21:45");
    	hourSelected = 63;
    	qL.setText(Integer.toString(storeInfo[0][63])); //left private
    	wL.setText(Integer.toString(storeInfo[1][63])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][63])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][63])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][63])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][63])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][63])); //right private
    	iL.setText(Integer.toString(storeInfo[7][63])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][63])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][63])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][63])); //left private
    	sM.setText(Integer.toString(storeInfo[11][63])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][63])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][63])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][63])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][63])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][63])); //right private
    	kM.setText(Integer.toString(storeInfo[17][63])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][63])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][63])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][63])); //left private
    	xR.setText(Integer.toString(storeInfo[21][63])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][63])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][63])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][63])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][63])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][63])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][63])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][63])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][63])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h65(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("22:00");
    	hourSelected = 64;
    	qL.setText(Integer.toString(storeInfo[0][64])); //left private
    	wL.setText(Integer.toString(storeInfo[1][64])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][64])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][64])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][64])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][64])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][64])); //right private
    	iL.setText(Integer.toString(storeInfo[7][64])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][64])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][64])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][64])); //left private
    	sM.setText(Integer.toString(storeInfo[11][64])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][64])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][64])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][64])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][64])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][64])); //right private
    	kM.setText(Integer.toString(storeInfo[17][64])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][64])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][64])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][64])); //left private
    	xR.setText(Integer.toString(storeInfo[21][64])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][64])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][64])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][64])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][64])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][64])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][64])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][64])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][64])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h66(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("22:15");
    	hourSelected = 65;
    	qL.setText(Integer.toString(storeInfo[0][65])); //left private
    	wL.setText(Integer.toString(storeInfo[1][65])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][65])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][65])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][65])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][65])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][65])); //right private
    	iL.setText(Integer.toString(storeInfo[7][65])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][65])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][65])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][65])); //left private
    	sM.setText(Integer.toString(storeInfo[11][65])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][65])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][65])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][65])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][65])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][65])); //right private
    	kM.setText(Integer.toString(storeInfo[17][65])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][65])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][65])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][65])); //left private
    	xR.setText(Integer.toString(storeInfo[21][65])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][65])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][65])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][65])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][65])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][65])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][65])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][65])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][65])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h67(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("22:30");
    	hourSelected = 66;
    	qL.setText(Integer.toString(storeInfo[0][66])); //left private
    	wL.setText(Integer.toString(storeInfo[1][66])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][66])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][66])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][66])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][66])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][66])); //right private
    	iL.setText(Integer.toString(storeInfo[7][66])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][66])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][66])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][66])); //left private
    	sM.setText(Integer.toString(storeInfo[11][66])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][66])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][66])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][66])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][66])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][66])); //right private
    	kM.setText(Integer.toString(storeInfo[17][66])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][66])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][66])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][66])); //left private
    	xR.setText(Integer.toString(storeInfo[21][66])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][66])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][66])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][66])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][66])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][66])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][66])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][66])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][66])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h68(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("22:45");
    	hourSelected = 67;
    	qL.setText(Integer.toString(storeInfo[0][67])); //left private
    	wL.setText(Integer.toString(storeInfo[1][67])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][67])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][67])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][67])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][67])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][67])); //right private
    	iL.setText(Integer.toString(storeInfo[7][67])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][67])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][67])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][67])); //left private
    	sM.setText(Integer.toString(storeInfo[11][67])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][67])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][67])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][67])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][67])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][67])); //right private
    	kM.setText(Integer.toString(storeInfo[17][67])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][67])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][67])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][67])); //left private
    	xR.setText(Integer.toString(storeInfo[21][67])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][67])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][67])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][67])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][67])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][67])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][67])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][67])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][67])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h69(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("23:00");
    	hourSelected = 68;
    	qL.setText(Integer.toString(storeInfo[0][68])); //left private
    	wL.setText(Integer.toString(storeInfo[1][68])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][68])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][68])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][68])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][68])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][68])); //right private
    	iL.setText(Integer.toString(storeInfo[7][68])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][68])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][68])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][68])); //left private
    	sM.setText(Integer.toString(storeInfo[11][68])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][68])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][68])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][68])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][68])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][68])); //right private
    	kM.setText(Integer.toString(storeInfo[17][68])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][68])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][68])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][68])); //left private
    	xR.setText(Integer.toString(storeInfo[21][68])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][68])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][68])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][68])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][68])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][68])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][68])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][68])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][68])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h7(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("07:30");
    	hourSelected = 6;
    	qL.setText(Integer.toString(storeInfo[0][6])); //left private
    	wL.setText(Integer.toString(storeInfo[1][6])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][6])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][6])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][6])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][6])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][6])); //right private
    	iL.setText(Integer.toString(storeInfo[7][6])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][6])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][6])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][6])); //left private
    	sM.setText(Integer.toString(storeInfo[11][6])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][6])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][6])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][6])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][6])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][6])); //right private
    	kM.setText(Integer.toString(storeInfo[17][6])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][6])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][6])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][6])); //left private
    	xR.setText(Integer.toString(storeInfo[21][6])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][6])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][6])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][6])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][6])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][6])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][6])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][6])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][6])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h70(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("23:15");
    	hourSelected = 69;
    	qL.setText(Integer.toString(storeInfo[0][69])); //left private
    	wL.setText(Integer.toString(storeInfo[1][69])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][69])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][69])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][69])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][69])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][69])); //right private
    	iL.setText(Integer.toString(storeInfo[7][69])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][69])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][69])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][69])); //left private
    	sM.setText(Integer.toString(storeInfo[11][69])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][69])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][69])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][69])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][69])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][69])); //right private
    	kM.setText(Integer.toString(storeInfo[17][69])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][69])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][69])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][69])); //left private
    	xR.setText(Integer.toString(storeInfo[21][69])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][69])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][69])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][69])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][69])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][69])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][69])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][69])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][69])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h71(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("23:30");
    	hourSelected = 70;
    	qL.setText(Integer.toString(storeInfo[0][70])); //left private
    	wL.setText(Integer.toString(storeInfo[1][70])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][70])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][70])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][70])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][70])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][70])); //right private
    	iL.setText(Integer.toString(storeInfo[7][70])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][70])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][70])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][70])); //left private
    	sM.setText(Integer.toString(storeInfo[11][70])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][70])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][70])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][70])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][70])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][70])); //right private
    	kM.setText(Integer.toString(storeInfo[17][70])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][70])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][70])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][70])); //left private
    	xR.setText(Integer.toString(storeInfo[21][70])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][70])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][70])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][70])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][70])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][70])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][70])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][70])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][70])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h72(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("23:45");
    	hourSelected = 71;
    	qL.setText(Integer.toString(storeInfo[0][71])); //left private
    	wL.setText(Integer.toString(storeInfo[1][71])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][71])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][71])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][71])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][71])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][71])); //right private
    	iL.setText(Integer.toString(storeInfo[7][71])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][71])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][71])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][71])); //left private
    	sM.setText(Integer.toString(storeInfo[11][71])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][71])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][71])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][71])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][71])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][71])); //right private
    	kM.setText(Integer.toString(storeInfo[17][71])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][71])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][71])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][71])); //left private
    	xR.setText(Integer.toString(storeInfo[21][71])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][71])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][71])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][71])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][71])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][71])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][71])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][71])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][71])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h73(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("00:00");
    	hourSelected = 72;
    	qL.setText(Integer.toString(storeInfo[0][72])); //left private
    	wL.setText(Integer.toString(storeInfo[1][72])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][72])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][72])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][72])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][72])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][72])); //right private
    	iL.setText(Integer.toString(storeInfo[7][72])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][72])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][72])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][72])); //left private
    	sM.setText(Integer.toString(storeInfo[11][72])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][72])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][72])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][72])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][72])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][72])); //right private
    	kM.setText(Integer.toString(storeInfo[17][72])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][72])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][72])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][72])); //left private
    	xR.setText(Integer.toString(storeInfo[21][72])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][72])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][72])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][72])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][72])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][72])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][72])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][72])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][72])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h74(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("00:15");
    	hourSelected = 73;
    	qL.setText(Integer.toString(storeInfo[0][73])); //left private
    	wL.setText(Integer.toString(storeInfo[1][73])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][73])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][73])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][73])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][73])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][73])); //right private
    	iL.setText(Integer.toString(storeInfo[7][73])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][73])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][73])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][73])); //left private
    	sM.setText(Integer.toString(storeInfo[11][73])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][73])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][73])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][73])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][73])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][73])); //right private
    	kM.setText(Integer.toString(storeInfo[17][73])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][73])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][73])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][73])); //left private
    	xR.setText(Integer.toString(storeInfo[21][73])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][73])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][73])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][73])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][73])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][73])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][73])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][73])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][73])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h75(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("00:30");
    	hourSelected = 74;
    	qL.setText(Integer.toString(storeInfo[0][74])); //left private
    	wL.setText(Integer.toString(storeInfo[1][74])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][74])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][74])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][74])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][74])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][74])); //right private
    	iL.setText(Integer.toString(storeInfo[7][74])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][74])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][74])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][74])); //left private
    	sM.setText(Integer.toString(storeInfo[11][74])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][74])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][74])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][74])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][74])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][74])); //right private
    	kM.setText(Integer.toString(storeInfo[17][74])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][74])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][74])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][74])); //left private
    	xR.setText(Integer.toString(storeInfo[21][74])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][74])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][74])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][74])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][74])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][74])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][74])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][74])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][74])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h76(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("00:45");
    	hourSelected = 75;
    	qL.setText(Integer.toString(storeInfo[0][75])); //left private
    	wL.setText(Integer.toString(storeInfo[1][75])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][75])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][75])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][75])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][75])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][75])); //right private
    	iL.setText(Integer.toString(storeInfo[7][75])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][75])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][75])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][75])); //left private
    	sM.setText(Integer.toString(storeInfo[11][75])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][75])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][75])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][75])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][75])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][75])); //right private
    	kM.setText(Integer.toString(storeInfo[17][75])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][75])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][75])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][75])); //left private
    	xR.setText(Integer.toString(storeInfo[21][75])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][75])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][75])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][75])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][75])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][75])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][75])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][75])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][75])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h77(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("01:00");
    	hourSelected = 76;
    	qL.setText(Integer.toString(storeInfo[0][76])); //left private
    	wL.setText(Integer.toString(storeInfo[1][76])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][76])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][76])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][76])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][76])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][76])); //right private
    	iL.setText(Integer.toString(storeInfo[7][76])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][76])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][76])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][76])); //left private
    	sM.setText(Integer.toString(storeInfo[11][76])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][76])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][76])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][76])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][76])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][76])); //right private
    	kM.setText(Integer.toString(storeInfo[17][76])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][76])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][76])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][76])); //left private
    	xR.setText(Integer.toString(storeInfo[21][76])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][76])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][76])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][76])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][76])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][76])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][76])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][76])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][76])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h78(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("01:15");
    	hourSelected = 77;
    	qL.setText(Integer.toString(storeInfo[0][77])); //left private
    	wL.setText(Integer.toString(storeInfo[1][77])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][77])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][77])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][77])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][77])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][77])); //right private
    	iL.setText(Integer.toString(storeInfo[7][77])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][77])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][77])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][77])); //left private
    	sM.setText(Integer.toString(storeInfo[11][77])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][77])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][77])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][77])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][77])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][77])); //right private
    	kM.setText(Integer.toString(storeInfo[17][77])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][77])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][77])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][77])); //left private
    	xR.setText(Integer.toString(storeInfo[21][77])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][77])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][77])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][77])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][77])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][77])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][77])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][77])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][77])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h79(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("01:30");
    	hourSelected = 78;
    	qL.setText(Integer.toString(storeInfo[0][78])); //left private
    	wL.setText(Integer.toString(storeInfo[1][78])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][78])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][78])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][78])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][78])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][78])); //right private
    	iL.setText(Integer.toString(storeInfo[7][78])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][78])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][78])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][78])); //left private
    	sM.setText(Integer.toString(storeInfo[11][78])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][78])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][78])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][78])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][78])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][78])); //right private
    	kM.setText(Integer.toString(storeInfo[17][78])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][78])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][78])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][78])); //left private
    	xR.setText(Integer.toString(storeInfo[21][78])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][78])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][78])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][78])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][78])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][78])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][78])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][78])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][78])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h8(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("07:45");
    	hourSelected = 7;
    	qL.setText(Integer.toString(storeInfo[0][7])); //left private
    	wL.setText(Integer.toString(storeInfo[1][7])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][7])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][7])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][7])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][7])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][7])); //right private
    	iL.setText(Integer.toString(storeInfo[7][7])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][7])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][7])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][7])); //left private
    	sM.setText(Integer.toString(storeInfo[11][7])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][7])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][7])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][7])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][7])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][7])); //right private
    	kM.setText(Integer.toString(storeInfo[17][7])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][7])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][7])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][7])); //left private
    	xR.setText(Integer.toString(storeInfo[21][7])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][7])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][7])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][7])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][7])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][7])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][7])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][7])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][7])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h80(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("01:45");
    	hourSelected = 79;
    	qL.setText(Integer.toString(storeInfo[0][79])); //left private
    	wL.setText(Integer.toString(storeInfo[1][79])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][79])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][79])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][79])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][79])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][79])); //right private
    	iL.setText(Integer.toString(storeInfo[7][79])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][79])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][79])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][79])); //left private
    	sM.setText(Integer.toString(storeInfo[11][79])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][79])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][79])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][79])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][79])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][79])); //right private
    	kM.setText(Integer.toString(storeInfo[17][79])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][79])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][79])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][79])); //left private
    	xR.setText(Integer.toString(storeInfo[21][79])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][79])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][79])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][79])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][79])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][79])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][79])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][79])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][79])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h81(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("02:00");
    	hourSelected = 80;
    	qL.setText(Integer.toString(storeInfo[0][80])); //left private
    	wL.setText(Integer.toString(storeInfo[1][80])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][80])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][80])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][80])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][80])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][80])); //right private
    	iL.setText(Integer.toString(storeInfo[7][80])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][80])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][80])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][80])); //left private
    	sM.setText(Integer.toString(storeInfo[11][80])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][80])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][80])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][80])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][80])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][80])); //right private
    	kM.setText(Integer.toString(storeInfo[17][80])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][80])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][80])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][80])); //left private
    	xR.setText(Integer.toString(storeInfo[21][80])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][80])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][80])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][80])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][80])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][80])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][80])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][80])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][80])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h82(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("02:15");
    	hourSelected = 81;
    	qL.setText(Integer.toString(storeInfo[0][81])); //left private
    	wL.setText(Integer.toString(storeInfo[1][81])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][81])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][81])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][81])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][81])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][81])); //right private
    	iL.setText(Integer.toString(storeInfo[7][81])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][81])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][81])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][81])); //left private
    	sM.setText(Integer.toString(storeInfo[11][81])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][81])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][81])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][81])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][81])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][81])); //right private
    	kM.setText(Integer.toString(storeInfo[17][81])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][81])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][81])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][81])); //left private
    	xR.setText(Integer.toString(storeInfo[21][81])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][81])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][81])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][81])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][81])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][81])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][81])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][81])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][81])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h83(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("02:30");
    	hourSelected = 82;
    	qL.setText(Integer.toString(storeInfo[0][82])); //left private
    	wL.setText(Integer.toString(storeInfo[1][82])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][82])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][82])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][82])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][82])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][82])); //right private
    	iL.setText(Integer.toString(storeInfo[7][82])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][82])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][82])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][82])); //left private
    	sM.setText(Integer.toString(storeInfo[11][82])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][82])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][82])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][82])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][82])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][82])); //right private
    	kM.setText(Integer.toString(storeInfo[17][82])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][82])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][82])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][82])); //left private
    	xR.setText(Integer.toString(storeInfo[21][82])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][82])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][82])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][82])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][82])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][82])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][82])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][82])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][82])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h84(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("02:45");
    	hourSelected = 83;
    	qL.setText(Integer.toString(storeInfo[0][83])); //left private
    	wL.setText(Integer.toString(storeInfo[1][83])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][83])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][83])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][83])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][83])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][83])); //right private
    	iL.setText(Integer.toString(storeInfo[7][83])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][83])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][83])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][83])); //left private
    	sM.setText(Integer.toString(storeInfo[11][83])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][83])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][83])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][83])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][83])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][83])); //right private
    	kM.setText(Integer.toString(storeInfo[17][83])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][83])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][83])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][83])); //left private
    	xR.setText(Integer.toString(storeInfo[21][83])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][83])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][83])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][83])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][83])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][83])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][83])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][83])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][83])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h85(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("03:00");
    	hourSelected = 84;
    	qL.setText(Integer.toString(storeInfo[0][84])); //left private
    	wL.setText(Integer.toString(storeInfo[1][84])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][84])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][84])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][84])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][84])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][84])); //right private
    	iL.setText(Integer.toString(storeInfo[7][84])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][84])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][84])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][84])); //left private
    	sM.setText(Integer.toString(storeInfo[11][84])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][84])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][84])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][84])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][84])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][84])); //right private
    	kM.setText(Integer.toString(storeInfo[17][84])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][84])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][84])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][84])); //left private
    	xR.setText(Integer.toString(storeInfo[21][84])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][84])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][84])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][84])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][84])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][84])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][84])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][84])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][84])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h86(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("03:15");
    	hourSelected = 85;
    	qL.setText(Integer.toString(storeInfo[0][85])); //left private
    	wL.setText(Integer.toString(storeInfo[1][85])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][85])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][85])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][85])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][85])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][85])); //right private
    	iL.setText(Integer.toString(storeInfo[7][85])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][85])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][85])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][85])); //left private
    	sM.setText(Integer.toString(storeInfo[11][85])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][85])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][85])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][85])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][85])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][85])); //right private
    	kM.setText(Integer.toString(storeInfo[17][85])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][85])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][85])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][85])); //left private
    	xR.setText(Integer.toString(storeInfo[21][85])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][85])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][85])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][85])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][85])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][85])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][85])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][85])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][85])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h87(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("03:30");
    	hourSelected = 86;
    	qL.setText(Integer.toString(storeInfo[0][86])); //left private
    	wL.setText(Integer.toString(storeInfo[1][86])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][86])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][86])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][86])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][86])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][86])); //right private
    	iL.setText(Integer.toString(storeInfo[7][86])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][86])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][86])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][86])); //left private
    	sM.setText(Integer.toString(storeInfo[11][86])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][86])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][86])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][86])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][86])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][86])); //right private
    	kM.setText(Integer.toString(storeInfo[17][86])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][86])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][86])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][86])); //left private
    	xR.setText(Integer.toString(storeInfo[21][86])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][86])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][86])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][86])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][86])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][86])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][86])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][86])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][86])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h88(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("03:45");
    	hourSelected = 87;
    	qL.setText(Integer.toString(storeInfo[0][87])); //left private
    	wL.setText(Integer.toString(storeInfo[1][87])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][87])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][87])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][87])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][87])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][87])); //right private
    	iL.setText(Integer.toString(storeInfo[7][87])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][87])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][87])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][87])); //left private
    	sM.setText(Integer.toString(storeInfo[11][87])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][87])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][87])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][87])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][87])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][87])); //right private
    	kM.setText(Integer.toString(storeInfo[17][87])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][87])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][87])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][87])); //left private
    	xR.setText(Integer.toString(storeInfo[21][87])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][87])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][87])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][87])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][87])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][87])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][87])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][87])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][87])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h89(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("04:00");
    	hourSelected = 88;
    	qL.setText(Integer.toString(storeInfo[0][88])); //left private
    	wL.setText(Integer.toString(storeInfo[1][88])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][88])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][88])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][88])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][88])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][88])); //right private
    	iL.setText(Integer.toString(storeInfo[7][88])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][88])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][88])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][88])); //left private
    	sM.setText(Integer.toString(storeInfo[11][88])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][88])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][88])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][88])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][88])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][88])); //right private
    	kM.setText(Integer.toString(storeInfo[17][88])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][88])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][88])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][88])); //left private
    	xR.setText(Integer.toString(storeInfo[21][88])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][88])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][88])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][88])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][88])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][88])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][88])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][88])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][88])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h9(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("08:00");
    	hourSelected = 8;
    	qL.setText(Integer.toString(storeInfo[0][8])); //left private
    	wL.setText(Integer.toString(storeInfo[1][8])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][8])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][8])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][8])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][8])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][8])); //right private
    	iL.setText(Integer.toString(storeInfo[7][8])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][8])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][8])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][8])); //left private
    	sM.setText(Integer.toString(storeInfo[11][8])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][8])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][8])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][8])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][8])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][8])); //right private
    	kM.setText(Integer.toString(storeInfo[17][8])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][8])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][8])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][8])); //left private
    	xR.setText(Integer.toString(storeInfo[21][8])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][8])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][8])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][8])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][8])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][8])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][8])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][8])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][8])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h90(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("04:15");
    	hourSelected = 89;
    	qL.setText(Integer.toString(storeInfo[0][89])); //left private
    	wL.setText(Integer.toString(storeInfo[1][89])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][89])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][89])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][89])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][89])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][89])); //right private
    	iL.setText(Integer.toString(storeInfo[7][89])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][89])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][89])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][89])); //left private
    	sM.setText(Integer.toString(storeInfo[11][89])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][89])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][89])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][89])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][89])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][89])); //right private
    	kM.setText(Integer.toString(storeInfo[17][89])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][89])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][89])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][89])); //left private
    	xR.setText(Integer.toString(storeInfo[21][89])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][89])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][89])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][89])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][89])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][89])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][89])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][89])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][89])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h91(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("04:30");
    	hourSelected = 90;
    	qL.setText(Integer.toString(storeInfo[0][90])); //left private
    	wL.setText(Integer.toString(storeInfo[1][90])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][90])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][90])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][90])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][90])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][90])); //right private
    	iL.setText(Integer.toString(storeInfo[7][90])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][90])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][90])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][90])); //left private
    	sM.setText(Integer.toString(storeInfo[11][90])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][90])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][90])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][90])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][90])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][90])); //right private
    	kM.setText(Integer.toString(storeInfo[17][90])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][90])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][90])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][90])); //left private
    	xR.setText(Integer.toString(storeInfo[21][90])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][90])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][90])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][90])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][90])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][90])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][90])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][90])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][90])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h92(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("04:45");
    	hourSelected = 91;
    	qL.setText(Integer.toString(storeInfo[0][91])); //left private
    	wL.setText(Integer.toString(storeInfo[1][91])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][91])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][91])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][91])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][91])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][91])); //right private
    	iL.setText(Integer.toString(storeInfo[7][91])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][91])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][91])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][91])); //left private
    	sM.setText(Integer.toString(storeInfo[11][91])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][91])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][91])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][91])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][91])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][91])); //right private
    	kM.setText(Integer.toString(storeInfo[17][91])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][91])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][91])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][91])); //left private
    	xR.setText(Integer.toString(storeInfo[21][91])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][91])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][91])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][91])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][91])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][91])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][91])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][91])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][91])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h93(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("05:00");
    	hourSelected = 92;
    	qL.setText(Integer.toString(storeInfo[0][92])); //left private
    	wL.setText(Integer.toString(storeInfo[1][92])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][92])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][92])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][92])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][92])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][92])); //right private
    	iL.setText(Integer.toString(storeInfo[7][92])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][92])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][92])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][92])); //left private
    	sM.setText(Integer.toString(storeInfo[11][92])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][92])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][92])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][92])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][92])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][92])); //right private
    	kM.setText(Integer.toString(storeInfo[17][92])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][92])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][92])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][92])); //left private
    	xR.setText(Integer.toString(storeInfo[21][92])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][92])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][92])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][92])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][92])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][92])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][92])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][92])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][92])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h94(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("05:15");
    	hourSelected = 93;
    	qL.setText(Integer.toString(storeInfo[0][93])); //left private
    	wL.setText(Integer.toString(storeInfo[1][93])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][93])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][93])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][93])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][93])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][93])); //right private
    	iL.setText(Integer.toString(storeInfo[7][93])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][93])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][93])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][93])); //left private
    	sM.setText(Integer.toString(storeInfo[11][93])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][93])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][93])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][93])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][93])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][93])); //right private
    	kM.setText(Integer.toString(storeInfo[17][93])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][93])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][93])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][93])); //left private
    	xR.setText(Integer.toString(storeInfo[21][93])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][93])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][93])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][93])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][93])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][93])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][93])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][93])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][93])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h95(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("05:30");
    	hourSelected = 94;
    	qL.setText(Integer.toString(storeInfo[0][94])); //left private
    	wL.setText(Integer.toString(storeInfo[1][94])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][94])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][94])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][94])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][94])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][94])); //right private
    	iL.setText(Integer.toString(storeInfo[7][94])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][94])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][94])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][94])); //left private
    	sM.setText(Integer.toString(storeInfo[11][94])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][94])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][94])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][94])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][94])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][94])); //right private
    	kM.setText(Integer.toString(storeInfo[17][94])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][94])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][94])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][94])); //left private
    	xR.setText(Integer.toString(storeInfo[21][94])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][94])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][94])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][94])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][94])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][94])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][94])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][94])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][94])); //right bus
    	    	reupdateInfo();
    }

    @FXML
    void h96(ActionEvent event) {
    	storeInfoFunc();
    	menu.setText("05:45");
    	hourSelected = 95;
    	qL.setText(Integer.toString(storeInfo[0][95])); //left private
    	wL.setText(Integer.toString(storeInfo[1][95])); //left bus
    	eL.setText(Integer.toString(storeInfo[2][95])); //left truck
    	rL.setText(Integer.toString(storeInfo[3][95])); //middle private
    	tL.setText(Integer.toString(storeInfo[4][95])); //middle bus
    	yL.setText(Integer.toString(storeInfo[5][95])); //middle truck
    	uL.setText(Integer.toString(storeInfo[6][95])); //right private
    	iL.setText(Integer.toString(storeInfo[7][95])); //right bus
    	oL.setText(Integer.toString(storeInfo[8][95])); //right bus
    	pL.setText(Integer.toString(storeInfo[9][95])); //right bus
    	
    	aM.setText(Integer.toString(storeInfo[10][95])); //left private
    	sM.setText(Integer.toString(storeInfo[11][95])); //left bus
    	dM.setText(Integer.toString(storeInfo[12][95])); //left truck
    	fM.setText(Integer.toString(storeInfo[13][95])); //middle private
    	gM.setText(Integer.toString(storeInfo[14][95])); //middle bus
    	hM.setText(Integer.toString(storeInfo[15][95])); //middle truck
    	jM.setText(Integer.toString(storeInfo[16][95])); //right private
    	kM.setText(Integer.toString(storeInfo[17][95])); //right bus
    	lM.setText(Integer.toString(storeInfo[18][95])); //right bus
    	llM.setText(Integer.toString(storeInfo[19][95])); //right bus
    	
    	zR.setText(Integer.toString(storeInfo[20][95])); //left private
    	xR.setText(Integer.toString(storeInfo[21][95])); //left bus
    	cR.setText(Integer.toString(storeInfo[22][95])); //left truck
    	vR.setText(Integer.toString(storeInfo[23][95])); //middle private
    	bR.setText(Integer.toString(storeInfo[24][95])); //middle bus
    	nR.setText(Integer.toString(storeInfo[25][95])); //middle truck
    	mR.setText(Integer.toString(storeInfo[26][95])); //right private
    	mmR.setText(Integer.toString(storeInfo[27][95])); //right bus
    	mmmR.setText(Integer.toString(storeInfo[28][95])); //right bus
    	mmmmR.setText(Integer.toString(storeInfo[29][95])); //right bus
    	    	reupdateInfo();
    }
    
    int[][] storeInfo = new int[30][96]; // [carTypes+Direction][quarters]
    
    @FXML
    private CheckBox emptyCheckbox;
    
    boolean[] storeZero = new boolean[96];
    
    @FXML
    private Text pL;

    @FXML
    private Text oL;
    
    @FXML
    private Text iL;

    @FXML
    private Text uL;

    @FXML
    private Text yL;

    @FXML
    private Text tL;

    @FXML
    private Text rL;

    @FXML
    private Text eL;

    @FXML
    private Text wL;

    @FXML
    private Text qL;
    
    @FXML
    private Text llM;

    @FXML
    private Text lM;

    @FXML
    private Text kM;

    @FXML
    private Text jM;

    @FXML
    private Text hM;

    @FXML
    private Text gM;

    @FXML
    private Text fM;

    @FXML
    private Text dM;

    @FXML
    private Text sM;

    @FXML
    private Text aM;
    
    @FXML
    private Text mmmmR;

    @FXML
    private Text mmmR;

    @FXML
    private Text mmR;

    @FXML
    private Text mR;

    @FXML
    private Text nR;

    @FXML
    private Text bR;

    @FXML
    private Text vR;

    @FXML
    private Text cR;

    @FXML
    private Text xR;

    @FXML
    private Text zR;
    
    public static int[][] Vehicles = new int[3][10];
    
    private boolean add = true;
    
    public void qPress() {
		if(add)
			Vehicles[0][0]++;
		else
			if(!(Vehicles[0][0]==0))
				Vehicles[0][0]--;
    }
    
    public void wPress() {
		if(add)
			Vehicles[0][1]++;
		else
			if(!(Vehicles[0][1]==0))
				Vehicles[0][1]--;
    }
    
    public void ePress() {
		if(add)
			Vehicles[0][2]++;
		else
			if(!(Vehicles[0][2]==0))
				Vehicles[0][2]--;
    }
    
    public void rPress() {
		if(add)
			Vehicles[0][3]++;
		else
			if(!(Vehicles[0][3]==0))
				Vehicles[0][3]--;
    }
    
    public void tPress() {
		if(add)
			Vehicles[0][4]++;
		else
			if(!(Vehicles[0][4]==0))
				Vehicles[0][4]--;
    }
    
    public void yPress() {
		if(add)
			Vehicles[0][5]++;
		else
			if(!(Vehicles[0][5]==0))
				Vehicles[0][5]--;
    }
    
    public void uPress() {
		if(add)
			Vehicles[0][6]++;
		else
			if(!(Vehicles[0][6]==0))
				Vehicles[0][6]--;
    }
    
    public void iPress() {
		if(add)
			Vehicles[0][7]++;
		else
			if(!(Vehicles[0][7]==0))
				Vehicles[0][7]--;
    }
    
    public void oPress() {
		if(add)
			Vehicles[0][8]++;
		else
			if(!(Vehicles[0][8]==0))
				Vehicles[0][8]--;
    }
    
    public void pPress() {
		if(add)
			Vehicles[0][9]++;
		else
			if(!(Vehicles[0][9]==0))
				Vehicles[0][9]--;
    }
    
    public void aPress() {
		if(add)
			Vehicles[1][0]++;
		else
			if(!(Vehicles[1][0]==0))
				Vehicles[1][0]--;
    }
    
    public void sPress() {
		if(add)
			Vehicles[1][1]++;
		else
			if(!(Vehicles[1][1]==0))
				Vehicles[1][1]--;
    }
    
    public void dPress() {
		if(add)
			Vehicles[1][2]++;
		else
			if(!(Vehicles[1][2]==0))
				Vehicles[1][2]--;
    }
    
    public void fPress() {
		if(add)
			Vehicles[1][3]++;
		else
			if(!(Vehicles[1][3]==0))
				Vehicles[1][3]--;
    }
    
    public void gPress() {
		if(add)
			Vehicles[1][4]++;
		else
			if(!(Vehicles[1][4]==0))
				Vehicles[1][4]--;
    }
    
    public void hPress() {
		if(add)
			Vehicles[1][5]++;
		else
			if(!(Vehicles[1][5]==0))
				Vehicles[1][5]--;
    }
    
    public void jPress() {
		if(add)
			Vehicles[1][6]++;
		else
			if(!(Vehicles[1][6]==0))
				Vehicles[1][6]--;
    }
    
    public void kPress() {
		if(add)
			Vehicles[1][7]++;
		else
			if(!(Vehicles[1][7]==0))
				Vehicles[1][7]--;
    }
    
    public void lPress() {
		if(add)
			Vehicles[1][8]++;
		else
			if(!(Vehicles[1][8]==0))
				Vehicles[1][8]--;
    }
    
    public void llPress() {
		if(add)
			Vehicles[1][9]++;
		else
			if(!(Vehicles[1][9]==0))
				Vehicles[1][9]--;
    }
    
    public void zPress() {
		if(add)
			Vehicles[2][0]++;
		else
			if(!(Vehicles[2][0]==0))
				Vehicles[2][0]--;
    }
    
    public void xPress() {
		if(add)
			Vehicles[2][1]++;
		else
			if(!(Vehicles[2][1]==0))
				Vehicles[2][1]--;
    }
    
    public void cPress() {
		if(add)
			Vehicles[2][2]++;
		else
			if(!(Vehicles[2][2]==0))
				Vehicles[2][2]--;
    }
    
    public void vPress() {
		if(add)
			Vehicles[2][3]++;
		else
			if(!(Vehicles[2][3]==0))
				Vehicles[2][3]--;
    }
    
    public void bPress() {
		if(add)
			Vehicles[2][4]++;
		else
			if(!(Vehicles[2][4]==0))
				Vehicles[2][4]--;
    }
    
    public void nPress() {
		if(add)
			Vehicles[2][5]++;
		else
			if(!(Vehicles[2][5]==0))
				Vehicles[2][5]--;
    }
    
    public void mPress() {
		if(add)
			Vehicles[2][6]++;
		else
			if(!(Vehicles[2][6]==0))
				Vehicles[2][6]--;
    }
    
    public void mmPress() {
		if(add)
			Vehicles[2][7]++;
		else
			if(!(Vehicles[2][7]==0))
				Vehicles[2][7]--;
    }
    
    public void mmmPress() {
		if(add)
			Vehicles[2][8]++;
		else
			if(!(Vehicles[2][8]==0))
				Vehicles[2][8]--;
    }
    
    public void mmmmPress() {
		if(add)
			Vehicles[2][9]++;
		else
			if(!(Vehicles[2][9]==0))
				Vehicles[2][9]--;
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
		case Q: qPress(); break;
		case W: wPress(); break;
		case E: ePress(); break;
		case R: rPress(); break;
		case T: tPress(); break;
		case Y: yPress(); break;
		case U: uPress(); break;
		case I: iPress(); break;
		case O: oPress(); break;
		case P: pPress(); break;
		case A: aPress(); break;
		case S: sPress(); break;
		case D: dPress(); break;
		case F: fPress(); break;
		case G: gPress(); break;
		case H: hPress(); break;
		case J: jPress(); break;
		case K: kPress(); break;
		case L: lPress(); break;
		case SEMICOLON: llPress(); break;
		case Z: zPress(); break;
		case X: xPress(); break;
		case C: cPress(); break;
		case V: vPress(); break;
		case B: bPress(); break;
		case N: nPress(); break;
		case M: mPress(); break;
		case COMMA: mmPress(); break;
		case PERIOD: mmmPress(); break;
		case SLASH: mmmmPress(); break;
	
	}
	qL.setText(Integer.toString(Vehicles[0][0]));
	wL.setText(Integer.toString(Vehicles[0][1]));
	eL.setText(Integer.toString(Vehicles[0][2]));
	rL.setText(Integer.toString(Vehicles[0][3]));
	tL.setText(Integer.toString(Vehicles[0][4]));
	yL.setText(Integer.toString(Vehicles[0][5]));
	uL.setText(Integer.toString(Vehicles[0][6]));
	iL.setText(Integer.toString(Vehicles[0][7]));
	oL.setText(Integer.toString(Vehicles[0][8]));
	pL.setText(Integer.toString(Vehicles[0][9]));
	
	aM.setText(Integer.toString(Vehicles[1][0]));
	sM.setText(Integer.toString(Vehicles[1][1]));
	dM.setText(Integer.toString(Vehicles[1][2]));
	fM.setText(Integer.toString(Vehicles[1][3]));
	gM.setText(Integer.toString(Vehicles[1][4]));
	hM.setText(Integer.toString(Vehicles[1][5]));
	jM.setText(Integer.toString(Vehicles[1][6]));
	kM.setText(Integer.toString(Vehicles[1][7]));
	lM.setText(Integer.toString(Vehicles[1][8]));
	llM.setText(Integer.toString(Vehicles[1][9]));
	
	zR.setText(Integer.toString(Vehicles[2][0]));
	xR.setText(Integer.toString(Vehicles[2][1]));
	cR.setText(Integer.toString(Vehicles[2][2]));
	vR.setText(Integer.toString(Vehicles[2][3]));
	bR.setText(Integer.toString(Vehicles[2][4]));
	nR.setText(Integer.toString(Vehicles[2][5]));
	mR.setText(Integer.toString(Vehicles[2][6]));
	mmR.setText(Integer.toString(Vehicles[2][7]));
	mmmR.setText(Integer.toString(Vehicles[2][8]));
	mmmmR.setText(Integer.toString(Vehicles[2][9]));
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
		case Q: qPress(); break;
		case W: wPress(); break;
		case E: ePress(); break;
		case R: rPress(); break;
		case T: tPress(); break;
		case Y: yPress(); break;
		case U: uPress(); break;
		case I: iPress(); break;
		case O: oPress(); break;
		case P: pPress(); break;
		case A: aPress(); break;
		case S: sPress(); break;
		case D: dPress(); break;
		case F: fPress(); break;
		case G: gPress(); break;
		case H: hPress(); break;
		case J: jPress(); break;
		case K: kPress(); break;
		case L: lPress(); break;
		case SEMICOLON: llPress(); break;
		case Z: zPress(); break;
		case X: xPress(); break;
		case C: cPress(); break;
		case V: vPress(); break;
		case B: bPress(); break;
		case N: nPress(); break;
		case M: mPress(); break;
		case COMMA: mmPress(); break;
		case PERIOD: mmmPress(); break;
		case SLASH: mmmmPress(); break;
	
	}
	qL.setText(Integer.toString(Vehicles[0][0]));
	wL.setText(Integer.toString(Vehicles[0][1]));
	eL.setText(Integer.toString(Vehicles[0][2]));
	rL.setText(Integer.toString(Vehicles[0][3]));
	tL.setText(Integer.toString(Vehicles[0][4]));
	yL.setText(Integer.toString(Vehicles[0][5]));
	uL.setText(Integer.toString(Vehicles[0][6]));
	iL.setText(Integer.toString(Vehicles[0][7]));
	oL.setText(Integer.toString(Vehicles[0][8]));
	pL.setText(Integer.toString(Vehicles[0][9]));
	
	aM.setText(Integer.toString(Vehicles[1][0]));
	sM.setText(Integer.toString(Vehicles[1][1]));
	dM.setText(Integer.toString(Vehicles[1][2]));
	fM.setText(Integer.toString(Vehicles[1][3]));
	gM.setText(Integer.toString(Vehicles[1][4]));
	hM.setText(Integer.toString(Vehicles[1][5]));
	jM.setText(Integer.toString(Vehicles[1][6]));
	kM.setText(Integer.toString(Vehicles[1][7]));
	lM.setText(Integer.toString(Vehicles[1][8]));
	llM.setText(Integer.toString(Vehicles[1][9]));
	
	zR.setText(Integer.toString(Vehicles[2][0]));
	xR.setText(Integer.toString(Vehicles[2][1]));
	cR.setText(Integer.toString(Vehicles[2][2]));
	vR.setText(Integer.toString(Vehicles[2][3]));
	bR.setText(Integer.toString(Vehicles[2][4]));
	nR.setText(Integer.toString(Vehicles[2][5]));
	mR.setText(Integer.toString(Vehicles[2][6]));
	mmR.setText(Integer.toString(Vehicles[2][7]));
	mmmR.setText(Integer.toString(Vehicles[2][8]));
	mmmmR.setText(Integer.toString(Vehicles[2][9]));
	}
    

    @FXML
    void saveFile(ActionEvent event) {
    	System.out.println("hour: " + menu.getText() + spc
    		    + "Left Private: " + Vehicles[0][0] + spc
    		   	+ "Left Cab: " + Vehicles[0][1] + spc
    	  		+ "Left Commercial: " + Vehicles[0][2] + spc
    	  		+ "Left Bus: " + Vehicles[0][3] + spc
    	  		+ "Left Truck: " + Vehicles[0][4] + spc
        		+ "Left Motorcycle: " + Vehicles[0][5] + spc
    	   		+ "Left Bicycle: " + Vehicles[0][6] + spc
    	   		+ "Left Other: " + Vehicles[0][7] + spc
    	   		+ "Left Other 2: " + Vehicles[0][8] + spc
    	   		+ "Left Other 3: " + Vehicles[0][9] + spc
    	   		+ "Middle Private: " + Vehicles[1][0] + spc
    	   		+ "Middle Cab: " + Vehicles[1][1] + spc
    	   		+ "Middle Commercial: " + Vehicles[1][2] + spc
    	   		+ "Middle Bus: " + Vehicles[1][3] + spc
    	   		+ "Middle Truck: " + Vehicles[1][4] + spc
    	   		+ "Middle Motorcycle: " + Vehicles[1][5] + spc
    	   		+ "Middle Bicycle: " + Vehicles[1][6] + spc
    	   		+ "Middle Other: " + Vehicles[1][7] + spc
    	   		+ "Middle Other 2: " + Vehicles[1][8] + spc
    	   		+ "Middle Other 3: " + Vehicles[1][9] + spc
    	   		+ "Right Private: " + Vehicles[2][0] + spc
    	   		+ "Right Cab: " + Vehicles[2][1] + spc
    	   		+ "Right Commercial: " + Vehicles[2][2] + spc
    	   		+ "Right Bus: " + Vehicles[2][3] + spc
    	   		+ "Right Truck: " + Vehicles[2][4] + spc
    	   		+ "Right Motorcycle: " + Vehicles[2][5] + spc
    	   		+ "Right Bicycle: " + Vehicles[2][6] + spc
    	   		+ "Right Other: " + Vehicles[2][7] + spc
    	   		+ "Right Other 2: " + Vehicles[2][7] + spc
    	   		+ "Right Other 3: " + Vehicles[2][7] + spc);
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
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.GREEN);
			label = new Label(5, 9, "Car R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(6, 9, "Cab R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(7, 9, "Commercial R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(8, 9, "Bus R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(9, 9, "Truck R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(10, 9, "Motorcycle R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(11, 9, "Bike R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(12, 9, "Other R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(13, 9, "Other2 R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(14, 9, "Other3 R");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLUE);
			label = new Label(15, 9, "Car M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(16, 9, "Cab M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(17, 9, "Commercial M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(18, 9, "Bus M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(19, 9, "Truck M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(20, 9, "Motorcycle M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(21, 9, "Bike M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(22, 9, "Other M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(23, 9, "Other2 M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(24, 9, "Other3 M");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.RED);
			label = new Label(25, 9, "Car L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(26, 9, "Cab L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(27, 9, "Commercial L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(28, 9, "Bus L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(29, 9, "Truck L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(30, 9, "Motorcycle L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(31, 9, "Bike L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(32, 9, "Other L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(33, 9, "Other2 L");
			label.setCellFormat(format);
			excelSheet.addCell(label);
			label = new Label(34, 9, "Other3 L");
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
			
			for(int x=0;x<96;x++) {
				if(!storeZero[x])
					continue;
				if(x>=72) {
					number = new Number(25, (-62+x), (storeInfo[0][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(26, (-62+x), (storeInfo[1][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(27, (-62+x), (storeInfo[2][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(28, (-62+x), (storeInfo[3][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(29, (-62+x), (storeInfo[4][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(30, (-62+x), (storeInfo[5][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(31, (-62+x), (storeInfo[6][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(32, (-62+x), (storeInfo[7][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(33, (-62+x), (storeInfo[8][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(34, (-62+x), (storeInfo[9][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}else {
					number = new Number(25, (34+x), (storeInfo[0][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(26, (34+x), (storeInfo[1][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(27, (34+x), (storeInfo[2][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(28, (34+x), (storeInfo[3][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(29, (34+x), (storeInfo[4][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(30, (34+x), (storeInfo[5][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(31, (34+x), (storeInfo[6][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(32, (34+x), (storeInfo[7][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(33, (34+x), (storeInfo[8][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(34, (34+x), (storeInfo[9][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}

			}
			
			//MIDDLE
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.BLUE);

			for(int x=0;x<96;x++) {
				if(!storeZero[x])
					continue;
				if(x>=72) {
					number = new Number(15, (-62+x), (storeInfo[10][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(16, (-62+x), (storeInfo[11][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(17, (-62+x), (storeInfo[12][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(18, (-62+x), (storeInfo[13][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(19, (-62+x), (storeInfo[14][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(20, (-62+x), (storeInfo[15][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(21, (-62+x), (storeInfo[16][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(22, (-62+x), (storeInfo[17][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(23, (-62+x), (storeInfo[18][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(24, (-62+x), (storeInfo[19][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}else {
					number = new Number(15, (34+x), (storeInfo[10][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(16, (34+x), (storeInfo[11][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(17, (34+x), (storeInfo[12][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(18, (34+x), (storeInfo[13][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(19, (34+x), (storeInfo[14][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(20, (34+x), (storeInfo[15][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(21, (34+x), (storeInfo[16][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(22, (34+x), (storeInfo[17][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(23, (34+x), (storeInfo[18][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(24, (34+x), (storeInfo[19][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}

			}
			
			//RIGHT
			
			font = new WritableFont(WritableFont.TIMES, 10, WritableFont.NO_BOLD);
			format = new WritableCellFormat(font);
			font.setColour(Colour.GREEN);
			
			for(int x=0;x<96;x++) {
				if(!storeZero[x])
					continue;
				if(x>=72) {
					number = new Number(5, (-62+x), (storeInfo[20][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(6, (-62+x), (storeInfo[21][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(7, (-62+x), (storeInfo[22][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(8, (-62+x), (storeInfo[23][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(9, (-62+x), (storeInfo[24][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(10, (-62+x), (storeInfo[25][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(11, (-62+x), (storeInfo[26][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(12, (-62+x), (storeInfo[27][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(13, (-62+x), (storeInfo[28][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(14, (-62+x), (storeInfo[29][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
				}else {
					number = new Number(5, (34+x), (storeInfo[20][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(6, (34+x), (storeInfo[21][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(7, (34+x), (storeInfo[22][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(8, (34+x), (storeInfo[23][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(9, (34+x), (storeInfo[24][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(10, (34+x), (storeInfo[25][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(11, (34+x), (storeInfo[26][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(12, (34+x), (storeInfo[27][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(13, (34+x), (storeInfo[28][(x)]));
					number.setCellFormat(format);
					excelSheet.addCell(number);
					number = new Number(14, (34+x), (storeInfo[29][(x)]));
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
			try {
				Stage errorStage = new Stage();
				Parent errorParent;
				Scene errorScene;
				String errorText;
				int errorSize, errorPriority;
				errorStage = new Stage();
				errorText = "תקלה לא ידועה!";
				errorSize = 16;
				errorPriority = 1;
				errorParent = FXMLLoader.load(getClass().getResource("/ErrorBOX.fxml"));
				errorScene = new Scene(errorParent, 200, 100);
				errorStage.setTitle("MESSAGE");
				errorStage.setScene(errorScene);
				errorStage.setResizable(false);
				errorStage.setOnCloseRequest(f->f.consume());
				errorStage.initModality(Modality.APPLICATION_MODAL);
	    		errorStage.show();
			}catch(Exception a) {
				a.printStackTrace();
			}
		}
		
		System.out.println("File: " + file + " Successfully saved!");
	}
		
}
