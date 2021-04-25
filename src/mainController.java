import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class mainController extends Solver {
	
	//extends solver class

	String[][] vals = new String[9][9];
	int[][] intVals = new int[9][9];
	

    @FXML
    private Pane puzzle;
	
    @FXML
    private TextField one_one;

    @FXML
    private TextField one_two;

    @FXML
    private TextField two_one;

    @FXML
    private TextField two_two;

    @FXML
    private TextField one_three;

    @FXML
    private TextField two_three;

    @FXML
    private TextField three_one;

    @FXML
    private TextField three_two;

    @FXML
    private TextField three_three;

    @FXML
    private TextField one_four;

    @FXML
    private TextField one_five;

    @FXML
    private TextField two_four;

    @FXML
    private TextField two_five;

    @FXML
    private TextField one_six;

    @FXML
    private TextField two_six;

    @FXML
    private TextField three_four;

    @FXML
    private TextField three_five;

    @FXML
    private TextField three_six;

    @FXML
    private TextField one_seven;

    @FXML
    private TextField one_eight;

    @FXML
    private TextField two_seven;

    @FXML
    private TextField two_eight;

    @FXML
    private TextField one_nine;

    @FXML
    private TextField two_nine;

    @FXML
    private TextField three_seven;

    @FXML
    private TextField three_eight;

    @FXML
    private TextField three_nine;

    @FXML
    private TextField four_one;

    @FXML
    private TextField four_two;

    @FXML
    private TextField five_one;

    @FXML
    private TextField five_two;

    @FXML
    private TextField four_three;

    @FXML
    private TextField five_three;

    @FXML
    private TextField six_one;

    @FXML
    private TextField six_two;

    @FXML
    private TextField six_three;

    @FXML
    private TextField four_four;

    @FXML
    private TextField four_five;

    @FXML
    private TextField five_four;

    @FXML
    private TextField five_five;

    @FXML
    private TextField four_six;

    @FXML
    private TextField five_six;

    @FXML
    private TextField six_four;

    @FXML
    private TextField six_five;

    @FXML
    private TextField six_six;

    @FXML
    private TextField four_seven;

    @FXML
    private TextField four_eight;

    @FXML
    private TextField five_seven;

    @FXML
    private TextField five_eight;

    @FXML
    private TextField four_nine;

    @FXML
    private TextField five_nine;

    @FXML
    private TextField six_seven;

    @FXML
    private TextField six_eight;

    @FXML
    private TextField six_nine;

    @FXML
    private TextField seven_one;

    @FXML
    private TextField seven_two;

    @FXML
    private TextField eight_one;

    @FXML
    private TextField eight_two;

    @FXML
    private TextField seven_three;

    @FXML
    private TextField eight_three;

    @FXML
    private TextField nine_one;

    @FXML
    private TextField nine_two;

    @FXML
    private TextField nine_three;

    @FXML
    private TextField seven_four;

    @FXML
    private TextField seven_five;

    @FXML
    private TextField eight_four;

    @FXML
    private TextField eight_five;

    @FXML
    private TextField seven_six;

    @FXML
    private TextField eight_six;

    @FXML
    private TextField nine_four;

    @FXML
    private TextField nine_five;

    @FXML
    private TextField nine_six;

    @FXML
    private TextField seven_seven;

    @FXML
    private TextField seven_eight;

    @FXML
    private TextField eight_seven;

    @FXML
    private TextField eight_eight;

    @FXML
    private TextField seven_nine;

    @FXML
    private TextField eight_nine;

    @FXML
    private TextField nine_seven;

    @FXML
    private TextField nine_eight;

    @FXML
    private TextField nine_nine;

    @FXML
    private Button start;

    @FXML
    private Label message;

    @FXML
    private Button reset;

    @FXML
    private Pane intro;

    @FXML
    private Button startPrgm;
   
    @FXML
    private Button gotoIntro;
    
    @FXML
    void startPrgm(ActionEvent event) {
    	intro.setVisible(false);
    	puzzle.setVisible(true);
    }
    
    @FXML
    void gotoIntro(ActionEvent event) {
    	intro.setVisible(true);
    	puzzle.setVisible(false);
    }
    
    @FXML
    void reset(ActionEvent event) {
    	one_one.setText("");
    	one_two.setText("");
        one_three.setText("");
        one_four.setText("");
        one_five.setText("");
        one_six.setText("");
        one_seven.setText("");
        one_eight.setText("");
        one_nine.setText("");
        
        two_one.setText("");
        two_two.setText("");
        two_three.setText("");
        two_four.setText("");
        two_five.setText("");
        two_six.setText("");
        two_seven.setText("");
        two_eight.setText("");
        two_nine.setText("");
        
        three_one.setText("");
        three_two.setText("");
        three_three.setText("");
        three_four.setText("");
        three_five.setText("");
        three_six.setText("");
        three_seven.setText("");
        three_eight.setText("");
        three_nine.setText("");
        
        four_one.setText("");
        four_two.setText("");
        four_three.setText("");
        four_four.setText("");
        four_five.setText("");
        four_six.setText("");
        four_seven.setText("");
        four_eight.setText("");
        four_nine.setText("");
        
        five_one.setText("");
        five_two.setText("");
        five_three.setText("");
        five_four.setText("");
        five_five.setText("");
        five_six.setText("");
        five_seven.setText("");
        five_eight.setText("");
        five_nine.setText("");
        
        six_one.setText("");
        six_two.setText("");
        six_three.setText("");
        six_four.setText("");
        six_five.setText("");
        six_six.setText("");
        six_seven.setText("");
        six_eight.setText("");
        six_nine.setText("");
        
        seven_one.setText("");
        seven_two.setText("");
        seven_three.setText("");
        seven_four.setText("");
        seven_five.setText("");
        seven_six.setText("");
        seven_seven.setText("");
        seven_eight.setText("");
        seven_nine.setText("");
        
        eight_one.setText("");
        eight_two.setText("");
        eight_three.setText("");
        eight_four.setText("");
        eight_five.setText("");
        eight_six.setText("");
        eight_seven.setText("");
        eight_eight.setText("");
        eight_nine.setText("");
        
        nine_one.setText("");
        nine_two.setText("");
        nine_three.setText("");
        nine_four.setText("");
        nine_five.setText("");
        nine_six.setText("");
        nine_seven.setText("");
        nine_eight.setText("");
        nine_nine.setText("");
        message.setText("");
  
    }

    @FXML
    void startSolve(ActionEvent event) {
    	
    	vals[0][0] = one_one.getText();
    	vals[0][1] = one_two.getText();
    	vals[0][2] = one_three.getText();
    	vals[0][3] = one_four.getText();
    	vals[0][4] = one_five.getText();
    	vals[0][5] = one_six.getText();
    	vals[0][6] = one_seven.getText();
    	vals[0][7] = one_eight.getText();
    	vals[0][8] = one_nine.getText();
    	
    	vals[1][0] = two_one.getText();
    	vals[1][1] = two_two.getText();
    	vals[1][2] = two_three.getText();
    	vals[1][3] = two_four.getText();
    	vals[1][4] = two_five.getText();
    	vals[1][5] = two_six.getText();
    	vals[1][6] = two_seven.getText();
    	vals[1][7] = two_eight.getText();
    	vals[1][8] = two_nine.getText();
    	
    	vals[2][0] = three_one.getText();
    	vals[2][1] = three_two.getText();
    	vals[2][2] = three_three.getText();
    	vals[2][3] = three_four.getText();
    	vals[2][4] = three_five.getText();
    	vals[2][5] = three_six.getText();
    	vals[2][6] = three_seven.getText();
    	vals[2][7] = three_eight.getText();
    	vals[2][8] = three_nine.getText();
    	
    	vals[3][0] = four_one.getText();
    	vals[3][1] = four_two.getText();
    	vals[3][2] = four_three.getText();
    	vals[3][3] = four_four.getText();
    	vals[3][4] = four_five.getText();
    	vals[3][5] = four_six.getText();
    	vals[3][6] = four_seven.getText();
    	vals[3][7] = four_eight.getText();
    	vals[3][8] = four_nine.getText();
    	
    	vals[4][0] = five_one.getText();
    	vals[4][1] = five_two.getText();
    	vals[4][2] = five_three.getText();
    	vals[4][3] = five_four.getText();
    	vals[4][4] = five_five.getText();
    	vals[4][5] = five_six.getText();
    	vals[4][6] = five_seven.getText();
    	vals[4][7] = five_eight.getText();
    	vals[4][8] = five_nine.getText();
    	
    	vals[5][0] = six_one.getText();
        vals[5][1] = six_two.getText();
        vals[5][2] = six_three.getText();
        vals[5][3] = six_four.getText();
        vals[5][4] = six_five.getText();
        vals[5][5] = six_six.getText();
        vals[5][6] = six_seven.getText();
        vals[5][7] = six_eight.getText();
        vals[5][8] = six_nine.getText();
    	
    	vals[6][0] = seven_one.getText();
        vals[6][1] = seven_two.getText();
        vals[6][2] = seven_three.getText();
        vals[6][3] = seven_four.getText();
        vals[6][4] = seven_five.getText();
        vals[6][5] = seven_six.getText();
        vals[6][6] = seven_seven.getText();
        vals[6][7] = seven_eight.getText();
        vals[6][8] = seven_nine.getText();

        vals[7][0] = eight_one.getText();
        vals[7][1] = eight_two.getText();
        vals[7][2] = eight_three.getText();
        vals[7][3] = eight_four.getText();
        vals[7][4] = eight_five.getText();
        vals[7][5] = eight_six.getText();
        vals[7][6] = eight_seven.getText();
        vals[7][7] = eight_eight.getText();
        vals[7][8] = eight_nine.getText();

        vals[8][0] = nine_one.getText();
        vals[8][1] = nine_two.getText();
        vals[8][2] = nine_three.getText();
        vals[8][3] = nine_four.getText();
        vals[8][4] = nine_five.getText();
        vals[8][5] = nine_six.getText();
        vals[8][6] = nine_seven.getText();
        vals[8][7] = nine_eight.getText();
        vals[8][8] = nine_nine.getText();
       
        
 
        
        try {
        	boolean zero = false;
        	//Sets empty spaces to 0 and then converts string inputs into integers.
        	for(int i = 0; i < 9; i++) {
        		for(int u = 0; u < 9; u++) {
        			if(vals[i][u].equals("") || vals[i][u].equals(" ")) {
        				vals[i][u] = "0";
        			}
        			intVals[i][u] = Integer.parseInt(vals[i][u]);
        		}
        	}
        	
        	//Executes solve code for given values
            solve(intVals);
            
            //Converts solved puzzle values back into strings.
            for(int i = 0; i < 9; i++) {
        		for(int u = 0; u < 9; u++) {
        			if(intVals[i][u] == 0) {
        				zero = true;
        			}
        			vals[i][u] = String.valueOf(intVals[i][u]);
        		}
        	}
            
            //Checks if there are remaining zeros, if not displays the solution.
            if(zero) {
            	message.setText("Not solvable.");
            }
            else {
            	one_one.setText(vals[0][0]);
                one_two.setText(vals[0][1]);
                one_three.setText(vals[0][2]);
                one_four.setText(vals[0][3]);
                one_five.setText(vals[0][4]);
                one_six.setText(vals[0][5]);
                one_seven.setText(vals[0][6]);
                one_eight.setText(vals[0][7]);
                one_nine.setText(vals[0][8]);
                
                two_one.setText(vals[1][0]);
                two_two.setText(vals[1][1]);
                two_three.setText(vals[1][2]);
                two_four.setText(vals[1][3]);
                two_five.setText(vals[1][4]);
                two_six.setText(vals[1][5]);
                two_seven.setText(vals[1][6]);
                two_eight.setText(vals[1][7]);
                two_nine.setText(vals[1][8]);
                
                three_one.setText(vals[2][0]);
                three_two.setText(vals[2][1]);
                three_three.setText(vals[2][2]);
                three_four.setText(vals[2][3]);
                three_five.setText(vals[2][4]);
                three_six.setText(vals[2][5]);
                three_seven.setText(vals[2][6]);
                three_eight.setText(vals[2][7]);
                three_nine.setText(vals[2][8]);
                
                four_one.setText(vals[3][0]);
                four_two.setText(vals[3][1]);
                four_three.setText(vals[3][2]);
                four_four.setText(vals[3][3]);
                four_five.setText(vals[3][4]);
                four_six.setText(vals[3][5]);
                four_seven.setText(vals[3][6]);
                four_eight.setText(vals[3][7]);
                four_nine.setText(vals[3][8]);
                
                five_one.setText(vals[4][0]);
                five_two.setText(vals[4][1]);
                five_three.setText(vals[4][2]);
                five_four.setText(vals[4][3]);
                five_five.setText(vals[4][4]);
                five_six.setText(vals[4][5]);
                five_seven.setText(vals[4][6]);
                five_eight.setText(vals[4][7]);
                five_nine.setText(vals[4][8]);
                
                six_one.setText(vals[5][0]);
                six_two.setText(vals[5][1]);
                six_three.setText(vals[5][2]);
                six_four.setText(vals[5][3]);
                six_five.setText(vals[5][4]);
                six_six.setText(vals[5][5]);
                six_seven.setText(vals[5][6]);
                six_eight.setText(vals[5][7]);
                six_nine.setText(vals[5][8]);
                
                seven_one.setText(vals[6][0]);
                seven_two.setText(vals[6][1]);
                seven_three.setText(vals[6][2]);
                seven_four.setText(vals[6][3]);
                seven_five.setText(vals[6][4]);
                seven_six.setText(vals[6][5]);
                seven_seven.setText(vals[6][6]);
                seven_eight.setText(vals[6][7]);
                seven_nine.setText(vals[6][8]);
                
                eight_one.setText(vals[7][0]);
                eight_two.setText(vals[7][1]);
                eight_three.setText(vals[7][2]);
                eight_four.setText(vals[7][3]);
                eight_five.setText(vals[7][4]);
                eight_six.setText(vals[7][5]);
                eight_seven.setText(vals[7][6]);
                eight_eight.setText(vals[7][7]);
                eight_nine.setText(vals[7][8]);
                
                nine_one.setText(vals[8][0]);
                nine_two.setText(vals[8][1]);
                nine_three.setText(vals[8][2]);
                nine_four.setText(vals[8][3]);
                nine_five.setText(vals[8][4]);
                nine_six.setText(vals[8][5]);
                nine_seven.setText(vals[8][6]);
                nine_eight.setText(vals[8][7]);
                nine_nine.setText(vals[8][8]);
                message.setText("Puzzle solved.");
            }
            
        }
        catch(NumberFormatException ex) {
        	message.setText("Enter numbers only.");
        }
             
    }

}
