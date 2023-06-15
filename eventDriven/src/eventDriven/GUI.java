package eventDriven;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI {
	MainMenu menu = new MainMenu();
	JFrame frame  = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textArea = new JTextArea();
	JCheckBox box1 = new JCheckBox("First student");
	JCheckBox box2 = new JCheckBox("Second student");
	JLabel label1 = new JLabel("Welcome to our System!");
	JLabel label2 = new JLabel("How can we help you? :)");
	JButton button1 = new JButton("1.listing the majors ");
	JButton button2 = new JButton("2.listing the subjects ");
	JButton button3 = new JButton("3.students marks ");
	JButton button4 = new JButton("Clear");
	JButton button5 = new JButton("Calc the Avg");
	JButton button6 = new JButton("Proceed");
	
	int studentChoosen;
	
	public GUI()
	{
		
	}
	
	public void display()
	{	
		//frame section
		frame.setTitle("Students Info");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(label1);
		frame.add(label2);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(textArea);
		frame.add(box1);
		frame.add(box2);
		
		//label section
		label1.setBounds(50, 50, 150, 50);
		label2.setBounds(50, 70, 150, 50);
		
		//button section
		button1.setBounds(100, 200, 250, 30);
		button2.setBounds(100, 250, 250, 30);
		button3.setBounds(100, 300, 250, 30);
		button4.setBounds(600, 705, 100, 30);
		button5.setBounds(325, 450, 150, 30);
		button6.setBounds(600, 400, 150, 20);
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);
		button5.setEnabled(true);
		button6.setEnabled(true);
		button4.setVisible(false);
		button5.setVisible(false);
		button6.setVisible(false);
		button1.setBackground(Color.black);
		button1.setForeground(Color.WHITE);
		button2.setBackground(Color.black);
		button2.setForeground(Color.WHITE);
		button3.setBackground(Color.black);
		button3.setForeground(Color.WHITE);
		button4.setBackground(Color.black);
		button4.setForeground(Color.WHITE);
		button5.setBackground(Color.black);
		button5.setForeground(Color.WHITE);
		button6.setBackground(Color.black);
		button6.setForeground(Color.WHITE);
		
		//text area section
		textArea.setBounds(100, 500, 600, 200);
		textArea.setEditable(false);
		Font font = new Font("Times New Roman", Font.BOLD, 16);
		textArea.setFont(font);
		
		//boxes section
		box1.setBounds(275, 400, 150, 20);
		box2.setBounds(425, 400, 150, 20);
		box1.setVisible(false);
		box2.setVisible(false);
		
		//calling the action listeners when launching this func 
		actions();
	}
	//action listeners func
	public void actions()
	{
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				textArea.setText(menu.printMajors());
				button4.setVisible(true);
				
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				textArea.setText(menu.print(1));
				button4.setVisible(true);
			}
		});
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				box1.setVisible(true);
				box2.setVisible(true);
			}
		});
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				textArea.setText("");
				box1.setVisible(false);
				box2.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
			}
		});
		button5	.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			if (box1.isSelected()) 
			 {
				JOptionPane.showMessageDialog(button5, "the student Avg is: " + menu.calcAvg(1));
				
             }
			if (box2.isSelected()) 
			 {
				JOptionPane.showMessageDialog(button5, "the student Avg is: " + menu.calcAvg(2));
             }
			}
		});
		button6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (box1.isSelected()) 
				 {
					 textArea.setText(menu.printMarks(1));
					 button4.setVisible(true);
					 button5.setVisible(true);
					 button6.setVisible(true);
					
	             }
				 else if (box2.isSelected()) 
				 {
					 textArea.setText(menu.printMarks(2));
					 button4.setVisible(true);
					 button5.setVisible(true);
					 button6.setVisible(true);
	             }
			}
		});


        box1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (box1.isSelected()) {
                    box2.setSelected(false);
                    button6.setVisible(true);
                }
            }
        });

        box2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (box2.isSelected()) {
                    box1.setSelected(false);
                    button6.setVisible(true);
                }
            }
        });

	}

}
