import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener{
    private Container pane, text, check, buttons;
    private JLabel l, m;
    private JTextField t;
    private JCheckBox c, f;
    private JButton b, cl;
    
    public TemperatureConverter(){
	this.setTitle("Temperature Converter");
	this.setSize(600,200);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new GridLayout(3,1));
	
	l = new JLabel("Temperature:",null,JLabel.CENTER);
	m = new JLabel("Convert to:",null,JLabel.CENTER);
	t = new JTextField(10);
	c = new JCheckBox("Celcius");
	f = new JCheckBox("Fahrenheit");
	b = new JButton("Convert!");
	cl = new JButton("Clear");
	
	b.setActionCommand("convert");
	b.addActionListener(this);
	cl.setActionCommand("delete");
	cl.addActionListener(this);
	
	text = new Container();
	text.setLayout(new FlowLayout());
	text.add(l);
	text.add(t);
 				
	check = new Container();
	check.setLayout(new FlowLayout());
	check.add(m);
	check.add(c);
	check.add(f);
	
	buttons = new Container();
	buttons.setLayout(new FlowLayout());
	buttons.add(b);
	buttons.add(cl);
	
	pane.add(text);
	pane.add(check);
	pane.add(buttons);
	
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if(action.equals("convert")){
	    String s = t.getText();
	    int temp = Integer.parseInt(s);
	    if(c.isSelected()){
		temp = (temp - 32) * 5 / 9;
	    }
	    if(f.isSelected()){
		temp = temp * 9 / 5 + 32; 
	    }
	    s = ""+temp;
	    t.setText(s);
	}
	if(action.equals("delete")){
	    t.setText("");
	}		
    }
	
    public static void main(String[]args){
	TemperatureConverter g = new TemperatureConverter();
	g.setVisible(true);
    }
}
