package vendingmachine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class VendingApp {

	private JFrame frame;
	private JTextField textTotal;

	
	 //Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendingApp window = new VendingApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 //Create the application.
	 
	public VendingApp() {
		initialize();
	}

	//Initialize the contents of the frame.
	 
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 849, 997);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
	
		//Title of vending machine app
		JLabel labelTitle = new JLabel("Vending Machine");
		labelTitle.setBackground(Color.DARK_GRAY);
		labelTitle.setVerticalAlignment(SwingConstants.BOTTOM);
		labelTitle.setFont(new Font("Gabriola", Font.BOLD, 33));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(243, 0, 374, 79);
		frame.getContentPane().add(labelTitle);
		
		//Insert Amount heading
		JLabel labelInsert = new JLabel("Insert Amount");
		labelInsert.setFont(new Font("Gabriola", Font.BOLD, 20));
		labelInsert.setHorizontalAlignment(SwingConstants.CENTER);
		labelInsert.setBounds(634, 359, 128, 35);
		frame.getContentPane().add(labelInsert);
		
		
		//5p button
		JButton buttonFIVE_P = new JButton("\u00A30.05");
		buttonFIVE_P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fiveP = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(fiveP + 0.05));
			}
		});
		buttonFIVE_P.setBounds(603, 405, 89, 23);
		frame.getContentPane().add(buttonFIVE_P);
		
		
		//10p button
		JButton buttonTEN_P = new JButton("\u00A30.10");
		buttonTEN_P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tenP = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(tenP + 0.10));
			}
		});
		buttonTEN_P.setBounds(702, 405, 89, 23);
		frame.getContentPane().add(buttonTEN_P);
		
		
		//20p button
		JButton buttonTWENTY_P = new JButton("\u00A30.20");
		buttonTWENTY_P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				double twentyP = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(twentyP + 0.20));
			}
		});
		buttonTWENTY_P.setBounds(603, 439, 89, 23);
		frame.getContentPane().add(buttonTWENTY_P);
		
		
		//50p button
		JButton buttonFIFTY_P = new JButton("\u00A30.50");
		buttonFIFTY_P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				double fiftyP = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(fiftyP + 0.50));				
			}
		});
		buttonFIFTY_P.setBounds(702, 439, 89, 23);
		frame.getContentPane().add(buttonFIFTY_P);
		
		
		//1 pound button
		JButton buttonONE_PD = new JButton("\u00A31.00");
		buttonONE_PD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double onePD = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(onePD + 1));		
			}
		});
		buttonONE_PD.setBounds(603, 473, 89, 23);
		frame.getContentPane().add(buttonONE_PD);
		
		
		//2 pound button
		JButton buttonTWO_PD = new JButton("\u00A32.00");
		buttonTWO_PD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				double twoPD = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(twoPD + 2));				
			}
		});
		buttonTWO_PD.setBounds(702, 473, 89, 23);
		frame.getContentPane().add(buttonTWO_PD);
		
		
		//Total amount title
		JLabel labelTotal = new JLabel("Total Amount (\u00A3)");
		labelTotal.setHorizontalAlignment(SwingConstants.CENTER);
		labelTotal.setFont(new Font("Gabriola", Font.BOLD, 20));
		labelTotal.setBounds(634, 541, 128, 35);
		frame.getContentPane().add(labelTotal);
		
		//Total text field
		textTotal = new JTextField("0.00",4);
		textTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textTotal.setBounds(603, 569, 188, 20);
		frame.getContentPane().add(textTotal);
		textTotal.setColumns(10);
		
		
		//Take change button
		JButton buttonChange = new JButton("Take Change");
		buttonChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {					
				textTotal.setText("0.00");
			}
		});
		buttonChange.setBounds(634, 600, 128, 23);
		frame.getContentPane().add(buttonChange);
		
		
		//A1 price heading
		JLabel labelA1Price = new JLabel("\u00A31.00");
		labelA1Price.setBounds(79, 142, 48, 14);
		frame.getContentPane().add(labelA1Price);
		
		//A1 Icon Image
		JLabel labelA1img = new JLabel("");
		labelA1img.setIcon(new ImageIcon(VendingApp.class.getResource("/imgs/sodabottle.png")));
		labelA1img.setBounds(35, 167, 128, 150);
		frame.getContentPane().add(labelA1img);
		
		//A1 purchase button
		JButton buttonA1 = new JButton("A1");
		buttonA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				double A1 = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(A1 - 1));				
			}
		});
		buttonA1.setBounds(62, 324, 89, 23);
		frame.getContentPane().add(buttonA1);
		
		
		
		//A2 price heading
		JLabel labelA2Price = new JLabel("\u00A31.50");
		labelA2Price.setBounds(238, 142, 48, 14);
		frame.getContentPane().add(labelA2Price);
		
		//A2 Icon Image
		JLabel labelA2img = new JLabel("");
		labelA2img.setIcon(new ImageIcon(VendingApp.class.getResource("/imgs/yoghurt.png")));
		labelA2img.setBounds(191, 167, 128, 150);
		frame.getContentPane().add(labelA2img);
		
		//A2 purchase button
		JButton buttonA2 = new JButton("A2");
		buttonA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double A2 = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(A2 - 1.50));			
			}
		});
		buttonA2.setBounds(214, 324, 89, 23);
		frame.getContentPane().add(buttonA2);
		
		
		
		//A3 price heading
		JLabel labelA3Price = new JLabel("\u00A30.80");
		labelA3Price.setBounds(403, 142, 48, 14);
		frame.getContentPane().add(labelA3Price);
		
		//A3 Icon Image
		JLabel labelA3img = new JLabel("");
		labelA3img.setIcon(new ImageIcon(VendingApp.class.getResource("/imgs/chocolatebar.png")));
		labelA3img.setBounds(351, 167, 128, 150);
		frame.getContentPane().add(labelA3img);
		
		//A3 purchase button
		JButton buttonA3 = new JButton("A3");
		buttonA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double A3 = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(A3 - 0.80));	
			}
		});
		buttonA3.setBounds(380, 324, 89, 23);
		frame.getContentPane().add(buttonA3);
		
		
		
		//B1 price heading
		JLabel labelB1Price = new JLabel("\u00A30.80");
		labelB1Price.setBounds(79, 418, 48, 14);
		frame.getContentPane().add(labelB1Price);
		
		//B1  Icon Image
		JLabel labelB1img = new JLabel("");
		labelB1img.setIcon(new ImageIcon(VendingApp.class.getResource("/imgs/cookies.png")));
		labelB1img.setBounds(35, 443, 128, 150);
		frame.getContentPane().add(labelB1img);
		
		//B1 purchase button
		JButton buttonB1 = new JButton("B1");
		buttonB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double B1 = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(B1 - 0.80));	
			}
		});
		buttonB1.setBounds(62, 600, 89, 23);
		frame.getContentPane().add(buttonB1);
		
		
		
		// B2 price heading
		JLabel labelB2Price = new JLabel("\u00A31.00");
		labelB2Price.setBounds(238, 418, 48, 14);
		frame.getContentPane().add(labelB2Price);
		
		//B2 Icon Image
		JLabel labelB2img = new JLabel("");
		labelB2img.setIcon(new ImageIcon(VendingApp.class.getResource("/imgs/chocolateroll.png")));
		labelB2img.setBounds(191, 443, 128, 150);
		frame.getContentPane().add(labelB2img);
		
		//B2 purchase button
		JButton buttonB2 = new JButton("B2");
		buttonB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double B2 = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(B2 - 1.00));	
			}
		});
		buttonB2.setBounds(214, 600, 89, 23);
		frame.getContentPane().add(buttonB2);
		
		
		
		//B3 price heading
		JLabel labelB3Price = new JLabel("\u00A31.20");
		labelB3Price.setBounds(403, 418, 48, 14);
		frame.getContentPane().add(labelB3Price);
		
		//B3 Icon Image
		JLabel labelB3img = new JLabel("");
		labelB3img.setIcon(new ImageIcon(VendingApp.class.getResource("/imgs/cake.png")));
		labelB3img.setBounds(351, 443, 128, 150);
		frame.getContentPane().add(labelB3img);
		
		//B3 purchase button
		JButton buttonB3 = new JButton("B3");
		buttonB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double B3 = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(B3 - 1.20));	
			}
		});
		buttonB3.setBounds(380, 600, 89, 23);
		frame.getContentPane().add(buttonB3);
		
		
		
		//C1 price heading
		JLabel labelC1Price = new JLabel("\u00A32.50");
		labelC1Price.setBounds(79, 702, 48, 14);
		frame.getContentPane().add(labelC1Price);
		
		//C1 Icon Image
		JLabel labelC1img = new JLabel("");
		labelC1img.setIcon(new ImageIcon(VendingApp.class.getResource("/imgs/sandwich.png")));
		labelC1img.setBounds(35, 727, 128, 150);
		frame.getContentPane().add(labelC1img);
		
		//C1 purchase button
		JButton buttonC1 = new JButton("C1");
		buttonC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double C1 = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(C1 - 2.50));	
			}
		});
		buttonC1.setBounds(62, 884, 89, 23);
		frame.getContentPane().add(buttonC1);
		
		
		
		//C2 price heading
		JLabel labelC2Price = new JLabel("\u00A32.00");
		labelC2Price.setBounds(238, 702, 48, 14);
		frame.getContentPane().add(labelC2Price);
		
		//C2 Icon Image
		JLabel labelC2img = new JLabel("");
		labelC2img.setIcon(new ImageIcon(VendingApp.class.getResource("/imgs/greensalad.png")));
		labelC2img.setBounds(191, 727, 128, 150);
		frame.getContentPane().add(labelC2img);
		
		//C2 purchase button
		JButton buttonC2 = new JButton("C2");
		buttonC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double C2 = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(C2 - 2.00));	
			}
		});
		buttonC2.setBounds(214, 884, 89, 23);
		frame.getContentPane().add(buttonC2);
		
		
		
		//C3 price heading
		JLabel labelC3Price = new JLabel("\u00A31.50");
		labelC3Price.setBounds(403, 702, 48, 14);
		frame.getContentPane().add(labelC3Price);
		
		//C3 Icon Image
		JLabel labelC3img = new JLabel("");
		labelC3img.setIcon(new ImageIcon(VendingApp.class.getResource("/imgs/brioche.png")));
		labelC3img.setBounds(351, 727, 128, 150);
		frame.getContentPane().add(labelC3img);
		
		//C3 purchase button
		JButton buttonC3 = new JButton("C3");
		buttonC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double C3 = Double.parseDouble(textTotal.getText());
				textTotal.setText(Double.toString(C3 - 1.50));	
			}
		});
		buttonC3.setBounds(380, 884, 89, 23);
		frame.getContentPane().add(buttonC3);
		
		
		
		
	}
}
