import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	

	String operator=new String();
	double result=0;
	String answer=new String();
	double number1;
	double number2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 220, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 12, 184, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button8 = new JButton("8");
		button8.setFont(new Font("Tahoma", Font.BOLD, 16));
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText()+button8.getText();
				textField.setText(EnterNumber);
			}
		});
		button8.setBounds(58, 62, 45, 45);
		frame.getContentPane().add(button8);
		
		
		
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+button7.getText();
				textField.setText(EnterNumber);
				
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 16));
		button7.setBounds(12, 62, 45, 45);
		frame.getContentPane().add(button7);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+button9.getText();
				textField.setText(EnterNumber);
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 16));
		button9.setBounds(104, 62, 45, 45);
		frame.getContentPane().add(button9);
		
		JButton buttondvid = new JButton("/");
		buttondvid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(textField.getText());
				operator=buttondvid.getText();
				textField.setText("");
				
			}
		});
		buttondvid.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttondvid.setBounds(150, 62, 45, 45);
		frame.getContentPane().add(buttondvid);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+button4.getText();
				textField.setText(EnterNumber);
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 16));
		button4.setBounds(11, 109, 45, 45);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+button5.getText();
				textField.setText(EnterNumber);
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 16));
		button5.setBounds(57, 109, 45, 45);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+button6.getText();
				textField.setText(EnterNumber);
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 16));
		button6.setBounds(103, 109, 45, 45);
		frame.getContentPane().add(button6);
		
		JButton buttonmul = new JButton("*");
		buttonmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(textField.getText());
				operator=buttonmul.getText();
				textField.setText("");
			}
		});
		buttonmul.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonmul.setBounds(149, 109, 45, 45);
		frame.getContentPane().add(buttonmul);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+button1.getText();
				textField.setText(EnterNumber);
				
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button1.setBounds(11, 157, 45, 45);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+button2.getText();
				textField.setText(EnterNumber);
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 16));
		button2.setBounds(57, 157, 45, 45);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+button3.getText();
				textField.setText(EnterNumber);
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 16));
		button3.setBounds(103, 157, 45, 45);
		frame.getContentPane().add(button3);
		
		JButton buttonmins = new JButton("-");
		buttonmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(textField.getText());
				operator=buttonmins.getText();
				textField.setText("");
			}
		});
		buttonmins.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonmins.setBounds(149, 157, 45, 45);
		frame.getContentPane().add(buttonmins);
		
		JButton buttonclr = new JButton("C");
		buttonclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		buttonclr.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonclr.setBounds(10, 205, 45, 45);
		frame.getContentPane().add(buttonclr);
		
		JButton buttonpoint = new JButton(".");
		buttonpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField.getText();

				if(str.contains(".")) {
					textField.setText(str);
					
				}
				else {
					String EnterNumber=textField.getText()+buttonpoint.getText();
					textField.setText(EnterNumber);
				}
			}
		});
		buttonpoint.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonpoint.setBounds(56, 205, 45, 45);
		frame.getContentPane().add(buttonpoint);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+button0.getText();
				textField.setText(EnterNumber);
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 16));
		button0.setBounds(102, 205, 45, 45);
		frame.getContentPane().add(button0);
		
		JButton buttonprsnt = new JButton("%");
		buttonprsnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(textField.getText());
				operator=buttonprsnt.getText();
				textField.setText("");
			}
		});
		buttonprsnt.setFont(new Font("Times New Roman", Font.BOLD, 12));
		buttonprsnt.setBounds(148, 205, 45, 45);
		frame.getContentPane().add(buttonprsnt);
		
		JButton buttonzero = new JButton("=");
		buttonzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number2=Double.parseDouble(textField.getText());

				if(operator=="+") {
					result=number1+number2;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
					
				}
				else if(operator=="-") {
					result=number1-number2;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator=="/") {
					result=number1/number2;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator=="*") {
					result=number1*number2;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator=="%") {
					result=number1*number2/100;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		buttonzero.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonzero.setBounds(10, 254, 91, 45);
		frame.getContentPane().add(buttonzero);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(textField.getText());
				operator=button_1.getText();
				textField.setText("");
			}
		});
		{
		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_1.setBounds(102, 254, 92, 45);
		frame.getContentPane().add(button_1);
		}
	}
	
}
