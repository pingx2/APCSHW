import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener{
    private Container pane;
    private JTextField t;
    private JCheckBox c, f;
    private JButton b;
    
    public TemperatureConverter(){
	this.setTitle("Temperature Converter");
	this.setSize(400,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	//pane = this.getContentPane();
    }

	
    public static void main(String[]args){
	TemperatureConverter g = new TemperatureConverter();
	g.setVisible(true);
    }
}