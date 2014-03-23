package Operations.jni;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

import Operations.jni.*;

//Interfaz de usuario y clase que llama a la biblioteca en c
public class MainWindow {

	//metodos de biblioteca en C
	 public native void sayHello();
	 public native int suma(int arg, int arg2);
	 public native int mul(int arg, int arg2);
	 public native int div(int arg, int arg2);
	 public native int rest(int arg, int arg2);
	 public native int mod(int arg, int arg2);
	 static {
	  System.loadLibrary("OperationsLibrary");	  
	 }
	private JFrame frmCalculator;
	private JTextField textField;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton btnC;
	private JButton button_15;
	private JButton button_16;
	private String operation;
	private int operator1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
		this.sayHello();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setColumns(10);
		frmCalculator.setAutoRequestFocus(false);
		frmCalculator.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCalculator.setTitle("Calculator\r\n");
		frmCalculator.setResizable(false);
		frmCalculator.setMinimumSize(new Dimension(380,380));
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String information = textField.getText();
				information = information.concat("1");
				textField.setText(information);				
			}
		});
				
		button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				information = information.concat("2");
				textField.setText(information);
			}
		});
		button.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				information = information.concat("3");
				textField.setText(information);
			}
		});
		button_1.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_2 = new JButton("0");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				information = information.concat("0");
				textField.setText(information);
			}
		});
		button_2.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				information = information.concat("6");
				textField.setText(information);
			}
		});
		button_4.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				information = information.concat("5");
				textField.setText(information);
			}
		});
		button_5.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_6 = new JButton("4");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				information = information.concat("4");
				textField.setText(information);
			}
		});
		button_6.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				information = information.concat("7");
				textField.setText(information);
			}
		});
		button_7.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				information = information.concat("8");
				textField.setText(information);
			}
		});
		button_8.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				information = information.concat("9");
				textField.setText(information);
			}
		});
		button_9.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_10 = new JButton("/");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				operation = "Div";
				operator1 =  Integer.parseInt(information);
				information = information.concat("/");
				textField_1.setText(information);
				textField.setText("");
				
			}
		});
		button_10.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				operation = "Suma";
				operator1 =  Integer.parseInt(information);
				information = information.concat("+");
				textField_1.setText(information);
				textField.setText("");
			}
		});
		button_11.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				operation = "Resta";
				operator1 =  Integer.parseInt(information);
				information = information.concat("-");
				textField_1.setText(information);
				textField.setText("");
			}
		});
		button_12.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				operation = "Mult";
				operator1 =  Integer.parseInt(information);
				information = information.concat("*");
				textField_1.setText(information);
				textField.setText("");
			}
		});
		button_13.setFont(new Font("Arial", Font.PLAIN, 14));
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText("");
				textField.setText("");
				operator1=0;
			}
			
		});
		btnC.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_15 = new JButton("%");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				operation = "Mod";
				operator1 =  Integer.parseInt(information);
				information = information.concat("%");
				textField_1.setText(information);
				textField.setText("");
			}
		});
		button_15.setFont(new Font("Arial", Font.PLAIN, 14));
		
		button_16 = new JButton("=");
		button_16.setFont(new Font("Arial", Font.PLAIN, 14));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String information = textField.getText();
				int operator2 = Integer.parseInt(textField.getText());
				String information2 = "";
				if (operation == "Mult")
				{					
					operator1 = mul(operator1, operator2);
					information2 = Integer.toString(operator1);
				}	
				else if (operation == "Mod")
				{					
					operator1 = mod(operator1, operator2);
					information2 = Integer.toString(operator1);
				}	
				else if (operation == "Resta")
				{					
					operator1 = rest(operator1, operator2);
					information2 = Integer.toString(operator1);
				}	
				else if (operation == "Suma")
				{					
					operator1 = suma(operator1, operator2);
					information2 = Integer.toString(operator1);
				}	
				else if (operation == "Div")
				{					
					operator1 = div(operator1, operator2);
					information2 = Integer.toString(operator1);
				}	
				information = textField_1.getText();
				information = information.concat(Integer.toString(operator2));
				textField_1.setText(information);
				textField.setText(information2);
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frmCalculator.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
						.addComponent(textField, 310, 310, 310)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(34)
								.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addGap(34)
								.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))
					.addGap(40))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(button_16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_12, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
					.addGap(115))
		);
		frmCalculator.getContentPane().setLayout(groupLayout);
		frmCalculator.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmCalculator.getContentPane(), textField, button_2, btnNewButton, button, button_1, button_12, button_11, button_16, button_6, button_5, button_4, button_13, button_15, button_7, button_8, button_9, button_10, btnC}));
	}

	public JTextField getTextField() {
		return textField;
	}
}
