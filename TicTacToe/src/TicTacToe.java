import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToe extends JFrame {

	private JPanel contentPane;

	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	int flag=0;
	static public  TicTacToe frame;
	private List<JButton> clickedbuttons = new ArrayList<JButton>(18);
	private List<JButton> buttons = new ArrayList<JButton>(9);
	private JButton randombutton;
	private int randomindex;
	private JButton btnNewButton;
	private JButton btn9;
	private JButton replay;

	public TicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));

		btn0 = new JButton("");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 40));

		contentPane.add(btn0);
		buttons.add(btn0);
		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 40));

		contentPane.add(btn1);
		buttons.add(btn1);
		btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 40));

		contentPane.add(btn2);
		buttons.add(btn2);
		btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 40));

		contentPane.add(btn3);
		buttons.add(btn3);
		btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 40));

		contentPane.add(btn4);
		buttons.add(btn4);
		btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 40));

		contentPane.add(btn5);
		buttons.add(btn5);
		btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 40));

		contentPane.add(btn6);
		buttons.add(btn6);
		btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 40));

		contentPane.add(btn7);
		buttons.add(btn7);
		btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 40));

		contentPane.add(btn8);
		buttons.add(btn8);
		
		replay = new JButton("REPLAY NOW");
		contentPane.add(replay);
		
		replay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
frame.setVisible(false);
				frame.dispose();
		
				frame=	new TicTacToe();
				
				frame.setVisible(true);
	
			}
		});
	
		
		
		
		

		btn8.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
			if(!clickedbuttons.contains(btn8)) {
				btn8.setText("x");
				clickedbuttons.add(btn8);
				btn8.setEnabled(false);
				buttons.remove(btn8);
				
			}
			
			if(clickedbuttons.contains(btn2)&&btn2.getText()=="x"&&!buttons.isEmpty()&&flag==0)
			{
				if(!clickedbuttons.contains(btn5)) {
					btn5.setText("o");
					clickedbuttons.add(btn5);
					buttons.remove(btn5);
						flag=1;
					btn5.setEnabled(false);
					checkwinnero(btn5);
				
					
				}
			}
			if(clickedbuttons.contains(btn5)&&btn5.getText()=="x"&&!buttons.isEmpty()&&flag==0)
			{
				if(!clickedbuttons.contains(btn2)) {
					btn2.setText("o");
					clickedbuttons.add(btn2);
					buttons.remove(btn2);
						flag=1;
						btn2.setEnabled(false);
					checkwinnero(btn2);
				
					
				}
			}
			 if (clickedbuttons.contains(btn6)&&btn6.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
				if(!clickedbuttons.contains(btn7)) {
					btn7.setText("o");
					clickedbuttons.add(btn7);
					btn7.setEnabled(false);
					buttons.remove(btn7);
					flag=1;
					checkwinnero(btn7);
				}
			}
			 if (clickedbuttons.contains(btn7)&&btn7.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn6)) {
						btn6.setText("o");
						clickedbuttons.add(btn6);
						btn6.setEnabled(false);
						buttons.remove(btn6);
						flag=1;
						checkwinnero(btn6);
					}
				}
			if(clickedbuttons.contains(btn0)&&btn0.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
				if(!clickedbuttons.contains(btn4)) {
					btn4.setText("o");
					btn4.setEnabled(false);
					clickedbuttons.add(btn4);
					buttons.remove(btn4);
					flag=1;
					checkwinnero(btn4);
				}
			}
			if(clickedbuttons.contains(btn4)&&btn4.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
				if(!clickedbuttons.contains(btn0)) {
					btn0.setText("o");
					clickedbuttons.add(btn0);
					buttons.remove(btn0);
					flag=1;
					btn0.setEnabled(false);
					checkwinnero(btn0);
				}
			}
			if(flag==0&&!buttons.isEmpty())
			{
				randomindex=(int) (Math.random() * (((buttons.size()-1) - 0) + 1) +0);
				randombutton=buttons.get(randomindex);
				randombutton.setText("o");
				buttons.remove(randombutton);
				clickedbuttons.add(randombutton);
				randombutton.setEnabled(false);
				checkwinnero(randombutton);
				
			}
			flag=0;
			checkwinner(btn8,btn4,btn0);
			checkwinner(btn8,btn5,btn2);
			checkwinner(btn8,btn6,btn7);
			
	}
		
				
			
			
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!clickedbuttons.contains(btn6)) {
					btn6.setText("x");
					clickedbuttons.add(btn6);
					btn6.setEnabled(false);
					buttons.remove(btn6);
					
					
				}
		
				if(clickedbuttons.contains(btn2)&&btn2.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn4)) {
						btn4.setText("o");
						clickedbuttons.add(btn4);
						buttons.remove(btn4);
						flag=1;
						btn4.setEnabled(false);
						checkwinnero(btn4);
						
					}
				}
				if(clickedbuttons.contains(btn4)&&btn4.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn2)) {
						btn2.setText("o");
						clickedbuttons.add(btn2);
						buttons.remove(btn2);
						flag=1;
						btn2.setEnabled(false);
						checkwinnero(btn2);
						
					}
				}
			 if (clickedbuttons.contains(btn8)&&btn8.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn7)) {
						btn7.setText("o");
						clickedbuttons.add(btn7);
						buttons.remove(btn7);
						flag=1;
						btn7.setEnabled(false);
						checkwinnero(btn7);
						
					}
				}
			 if (clickedbuttons.contains(btn7)&&btn7.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn8)) {
						btn8.setText("o");
						clickedbuttons.add(btn8);
						buttons.remove(btn8);
						flag=1;
						btn8.setEnabled(false);
						checkwinnero(btn8);
						
					}
				}
				 if(clickedbuttons.contains(btn0)&&btn0.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn3)) {
						btn3.setText("o");
						clickedbuttons.add(btn3);
						buttons.remove(btn3);
						flag=1;
						btn3.setEnabled(false);
						checkwinnero(btn3);
						
					}
				}
				 if(clickedbuttons.contains(btn3)&&btn3.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
						if(!clickedbuttons.contains(btn0)) {
							btn0.setText("o");
							clickedbuttons.add(btn0);
							buttons.remove(btn0);
							flag=1;
							btn0.setEnabled(false);
							checkwinnero(btn0);
							
						}
					}
				if(flag==0&&!buttons.isEmpty())
				{
					randomindex=(int) (Math.random() * (((buttons.size()-1) - 0) + 1) +0);
					randombutton=buttons.get(randomindex);
					randombutton.setText("o");
					buttons.remove(randombutton);
					clickedbuttons.add(randombutton);
					randombutton.setEnabled(false);
					checkwinnero(randombutton);
					
				}
				flag=0;
				
				checkwinner(btn6,btn7,btn8);
				checkwinner(btn6,btn3,btn0);
				checkwinner(btn6,btn4,btn2);
				
				}
				
		
			
		
		
		});
	
		btn7.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
				if(!clickedbuttons.contains(btn7)) {
					btn7.setText("x");
					clickedbuttons.add(btn7);
					btn7.setEnabled(false);
					buttons.remove(btn7);
					
					
					
				}
			
				if(clickedbuttons.contains(btn1)&&btn1.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn4)) {
						btn4.setText("o");
						clickedbuttons.add(btn4);
						buttons.remove(btn4);
						flag=1;
						btn4.setEnabled(false);
						checkwinnero(btn4);
						
					}
				}
				if(clickedbuttons.contains(btn4)&&btn4.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn1)) {
						btn1.setText("o");
						clickedbuttons.add(btn1);
						buttons.remove(btn1);
						flag=1;
						btn1.setEnabled(false);
						checkwinnero(btn1);
						
					}
				}
				 if (clickedbuttons.contains(btn8)&&btn8.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn6)) {
						btn6.setText("o");
						clickedbuttons.add(btn6);
						buttons.remove(btn6);
						flag=1;
					btn6.setEnabled(false);	
					checkwinnero(btn6);
						
					
					}
				}
				 if(clickedbuttons.contains(btn6)&&btn6.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn8)) {
						btn8.setText("o");
						clickedbuttons.add(btn8);
						buttons.remove(btn8);
						flag=1;
						btn8.setEnabled(false);
						checkwinnero(btn8);
						
					}
				}
				 if(clickedbuttons.contains(btn4)&&btn4.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn1)) {
						btn1.setText("o");
						clickedbuttons.add(btn1);
						buttons.remove(btn1);
						flag=1;
						btn1.setEnabled(false);
						checkwinnero(btn1);
						
					}
				}
				 if(clickedbuttons.contains(btn2)&&btn2.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
						if(!clickedbuttons.contains(btn4)) {
							btn4.setText("o");
							clickedbuttons.add(btn4);
							buttons.remove(btn4);
							flag=1;
							btn4.setEnabled(false);
							checkwinnero(btn4);
							
						}
					}
				if(flag==0&&!buttons.isEmpty())
				{
					randomindex=(int) (Math.random() * (((buttons.size()-1) - 0) + 1) +0);
					randombutton=buttons.get(randomindex);
					randombutton.setText("o");
					buttons.remove(randombutton);
					clickedbuttons.add(randombutton);
					randombutton.setEnabled(false);
					checkwinnero(randombutton);
					
				}
			flag=0;
				checkwinner(btn7,btn6,btn8);
				checkwinner(btn7,btn4,btn1);
			
			}
		});

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!clickedbuttons.contains(btn5)) {
					btn5.setText("x");
					clickedbuttons.add(btn5);
					btn5.setEnabled(false);
					buttons.remove(btn5);
					
				}


				if(clickedbuttons.contains(btn3)&&btn3.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn4)) {
						btn4.setText("o");
						clickedbuttons.add(btn4);
						buttons.remove(btn4);
						flag=1;
						btn4.setEnabled(false);
						checkwinnero(btn4);
						
					}
				}
				if(clickedbuttons.contains(btn4)&&btn4.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn3)) {
						btn3.setText("o");
						clickedbuttons.add(btn3);
						buttons.remove(btn3);
						flag=1;
						btn3.setEnabled(false);
						checkwinnero(btn3);
						
					}
				}
				if (clickedbuttons.contains(btn2)&&btn2.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn8)) {
						btn8.setText("o");
						clickedbuttons.add(btn8);
						buttons.remove(btn8);
						flag=1;
						btn8.setEnabled(false);
						checkwinnero(btn8);
						
					}
				}
				
			 if(clickedbuttons.contains(btn8)&&btn8.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn2)) {
						btn2.setText("o");
						clickedbuttons.add(btn2);
						buttons.remove(btn2);
						flag=1;
						btn2.setEnabled(false);
						checkwinnero(btn2);
						
					}
				}
				if(flag==0&&!buttons.isEmpty())
				{
					randomindex=(int) (Math.random() * (((buttons.size()-1) - 0) + 1) +0);
					randombutton=buttons.get(randomindex);
					randombutton.setText("o");
					buttons.remove(randombutton);
					clickedbuttons.add(randombutton);
					randombutton.setEnabled(false);
					checkwinnero(randombutton);
					
				}
				flag=0;
				checkwinner(btn2,btn5,btn8);
				checkwinner(btn5,btn3,btn4);
				
			
			}
		});

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!clickedbuttons.contains(btn4)&&!buttons.isEmpty()) {
					btn4.setText("x");
					clickedbuttons.add(btn4);
					btn4.setEnabled(false);
					buttons.remove(btn4);
					
				}


				if(clickedbuttons.contains(btn8)&&btn8.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn0)) {
						btn0.setText("o");
						clickedbuttons.add(btn0);
						buttons.remove(btn0);
						flag=1;
						btn0.setEnabled(false);
						checkwinnero(btn0);
						
					}
				}
				if(clickedbuttons.contains(btn0)&&btn0.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn8)) {
						btn8.setText("o");
						clickedbuttons.add(btn8);
						buttons.remove(btn8);
						flag=1;
						btn8.setEnabled(false);
						checkwinnero(btn8);
						
					}
				}
				if (clickedbuttons.contains(btn2)&&btn2.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn6)) {
						btn6.setText("o");
						clickedbuttons.add(btn6);
						buttons.remove(btn6);
						flag=1;	
						btn6.setEnabled(false);
						checkwinnero(btn6);
					
					}
				}
				 if(clickedbuttons.contains(btn5)&&btn5.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn3)) {
						btn3.setText("o");
						clickedbuttons.add(btn3);
						buttons.remove(btn3);
						flag=1;
						btn3.setEnabled(false);
						checkwinnero(btn3);
						
					}
				}
				 if(clickedbuttons.contains(btn3)&&btn3.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
						if(!clickedbuttons.contains(btn5)) {
							btn5.setText("o");
							clickedbuttons.add(btn5);
							buttons.remove(btn5);
							flag=1;
							btn5.setEnabled(false);
							checkwinnero(btn5);
							
						}
					}
				 if(clickedbuttons.contains(btn7)&&btn7.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn1)) {
						btn1.setText("o");
						clickedbuttons.add(btn1);
						buttons.remove(btn1);
						flag=1;
						btn1.setEnabled(false);
						checkwinnero(btn1);
						
					}
				}
				 if(clickedbuttons.contains(btn1)&&btn1.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
						if(!clickedbuttons.contains(btn7)) {
							btn7.setText("o");
							clickedbuttons.add(btn7);
							buttons.remove(btn7);
							flag=1;
							btn7.setEnabled(false);
							checkwinnero(btn7);
							
						}
					}
				 if(clickedbuttons.contains(btn6)&&btn6.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
						if(!clickedbuttons.contains(btn2)) {
							btn2.setText("o");
							clickedbuttons.add(btn2);
							buttons.remove(btn2);
							flag=1;
							btn2.setEnabled(false);
							checkwinnero(btn2);
							
							
						}
					}
			if(flag==0&&!buttons.isEmpty())
				{
					randomindex=(int) (Math.random() * (((buttons.size()-1) - 0) + 1) +0);
					randombutton=buttons.get(randomindex);
					randombutton.setText("o");
					buttons.remove(randombutton);
					clickedbuttons.add(randombutton);
					randombutton.setEnabled(false);
					checkwinnero(randombutton);
					
				}
			flag=0;
				checkwinner(btn4,btn0,btn8);
				checkwinner(btn4,btn3,btn5);
				checkwinner(btn4,btn1,btn7);
				checkwinner(btn4,btn6,btn2);
			
			}
		});
	
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!clickedbuttons.contains(btn3)) {
					btn3.setText("x");
					clickedbuttons.add(btn3);
					btn3.setEnabled(false);
					buttons.remove(btn3);
					
				}


				if(clickedbuttons.contains(btn5)&&btn5.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn4)) {
						btn4.setText("o");
						clickedbuttons.add(btn4);
						buttons.remove(btn4);
						flag=1;			
						btn4.setEnabled(false);
						checkwinnero(btn4);
						
					}
				}
				if (clickedbuttons.contains(btn4)&&btn4.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn5)) {
						btn5.setText("o");
						clickedbuttons.add(btn5);
						buttons.remove(btn5);
						flag=1;
						btn5.setEnabled(false);
						checkwinnero(btn5);
						
					}
				}
				if(clickedbuttons.contains(btn0)&&btn0.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn6)) {
						btn6.setText("o");
						clickedbuttons.add(btn6);
						buttons.remove(btn6);
						flag=1;
							btn6.setEnabled(false);	
							checkwinnero(btn6);
								
					}
				}
				if(clickedbuttons.contains(btn6)&&btn6.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn0)) {
						btn0.setText("o");
						clickedbuttons.add(btn0);
						buttons.remove(btn0);
						flag=1;
								btn0.setEnabled(false);	
								checkwinnero(btn0);
							
					}
				}
				if(flag==0&&!buttons.isEmpty())
				{
					randomindex=(int) (Math.random() * (((buttons.size()-1) - 0) + 1) +0);
					randombutton=buttons.get(randomindex);
					randombutton.setText("o");
					buttons.remove(randombutton);
					clickedbuttons.add(randombutton);
					randombutton.setEnabled(false);
					checkwinnero(randombutton);
					
				}
				flag=0;
				checkwinner(btn3,btn0,btn6);
				checkwinner(btn3,btn4,btn5);
				
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!clickedbuttons.contains(btn2)) {
					btn2.setText("x");
					clickedbuttons.add(btn2);
					btn2.setEnabled(false);
					buttons.remove(btn2);
					
				}


				if(clickedbuttons.contains(btn6)&&btn6.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn4)) {
						btn4.setText("o");
						clickedbuttons.add(btn4);
						buttons.remove(btn4);
						flag=1;
							btn4.setEnabled(false);
							checkwinnero(btn4);
					
					}
				}
				if(clickedbuttons.contains(btn4)&&btn4.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn6)) {
						btn6.setText("o");
						clickedbuttons.add(btn6);
						buttons.remove(btn6);
						flag=1;
							btn6.setEnabled(false);
							checkwinnero(btn6);
					
					}
				}
				if (clickedbuttons.contains(btn0)&&btn0.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn1)) {
						btn1.setText("o");
						clickedbuttons.add(btn1);
						buttons.remove(btn1);
						flag=1;
						btn1.setEnabled(false);
						checkwinnero(btn1);
						
					}
				}
				 if(clickedbuttons.contains(btn1)&&btn1.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn0)) {
						btn0.setText("o");
						clickedbuttons.add(btn0);
						buttons.remove(btn0);
						flag=1;
							btn0.setEnabled(false);
							checkwinnero(btn0);
					
					}
				}
			if(flag==0&&!buttons.isEmpty())
				{
					randomindex=(int) (Math.random() * (((buttons.size()-1) - 0) + 1) +0);
					randombutton=buttons.get(randomindex);
					randombutton.setText("o");
					buttons.remove(randombutton);
					clickedbuttons.add(randombutton);
					randombutton.setEnabled(false);
					checkwinnero(randombutton);
					
				
				}
			flag=0;
				checkwinner(btn2,btn5,btn8);
				checkwinner(btn2,btn0,btn1);
				checkwinner(btn2,btn4,btn6);
				
			}
		});
		

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!clickedbuttons.contains(btn1)) {
					btn1.setText("x");
					clickedbuttons.add(btn1);
					btn1.setEnabled(false);
					buttons.remove(btn1);
					
					
				}
			
				if(clickedbuttons.contains(btn7)&&btn7.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn4)) {
						btn4.setText("o");
						clickedbuttons.add(btn4);
						buttons.remove(btn4);
						flag=1;
						btn4.setEnabled(false);
						checkwinnero(btn4);
						
					}
				}
				if (clickedbuttons.contains(btn4)&&btn4.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn7)) {
						btn7.setText("o");
						clickedbuttons.add(btn7);
						buttons.remove(btn7);
						flag=1;
							btn7.setEnabled(false);
							checkwinnero(btn7);
					
					}
				}
				 if(clickedbuttons.contains(btn0)&&btn0.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn2)) {
						btn2.setText("o");
						clickedbuttons.add(btn2);
						buttons.remove(btn2);
						flag=1;
						btn2.setEnabled(false);
						checkwinnero(btn2);
						
					}
				}
				 if(clickedbuttons.contains(btn2)&&btn2.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
						if(!clickedbuttons.contains(btn3)) {
							btn3.setText("o");
							clickedbuttons.add(btn3);
							buttons.remove(btn3);
							flag=1;
							btn3.setEnabled(false);
							checkwinnero(btn3);
							
						}
					}
			if(flag==0&&!buttons.isEmpty())
				{
					randomindex=(int) (Math.random() * (((buttons.size()-1) - 0) + 1) +0);
					randombutton=buttons.get(randomindex);
					randombutton.setText("o");
					buttons.remove(randombutton);
					clickedbuttons.add(randombutton);
						randombutton.setEnabled(false);
						checkwinnero(randombutton);
				
				}
				flag=0;
				checkwinner(btn1,btn4,btn7);
				checkwinner(btn1,btn0,btn2);
				
			}
		});

		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(!clickedbuttons.contains(btn0)) {
					btn0.setText("x");
					clickedbuttons.add(btn0);
					btn0.setEnabled(false);
					buttons.remove(btn0);


				}


				if(clickedbuttons.contains(btn2)&&btn2.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn1)) {
						btn1.setText("o");
						clickedbuttons.add(btn1);
						buttons.remove(btn1);
						flag=1;
						btn1.setEnabled(false);
						checkwinnero(btn1);
					}
				
				}
				if(clickedbuttons.contains(btn1)&&btn1.getText()=="x"&&!buttons.isEmpty()&&flag==0)
				{
					if(!clickedbuttons.contains(btn2)) {
						btn2.setText("o");
						clickedbuttons.add(btn2);
						buttons.remove(btn2);
						flag=1;
						btn2.setEnabled(false);
						checkwinnero(btn2);
					}
				
				}
				if (clickedbuttons.contains(btn6)&&btn6.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn3)) {
						btn3.setText("o");
						clickedbuttons.add(btn3);
						buttons.remove(btn3);
						flag=1;
						btn3.setEnabled(false);
						checkwinnero(btn3);
						
					}
				
				}
				if (clickedbuttons.contains(btn3)&&btn3.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn6)) {
						btn6.setText("o");
						clickedbuttons.add(btn6);
						buttons.remove(btn6);
						flag=1;
						btn6.setEnabled(false);
						checkwinnero(btn6);
						
					}
				
				}
				 if(clickedbuttons.contains(btn8)&&btn8.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
					if(!clickedbuttons.contains(btn4)) {
						btn4.setText("o");
						clickedbuttons.add(btn4);
						buttons.remove(btn4);
						flag=1;
						btn4.setEnabled(false);
						checkwinnero(btn4);
						
						
					}
				}
				 if(clickedbuttons.contains(btn4)&&btn4.getText()=="x"&&!buttons.isEmpty()&&flag==0) {
						if(!clickedbuttons.contains(btn8)) {
							btn8.setText("o");
							clickedbuttons.add(btn8);
							buttons.remove(btn8);
							flag=1;
							btn8.setEnabled(false);
							checkwinnero(btn8);
							
							
						}
					}
				if(flag==0&&!buttons.isEmpty())
				{
					randomindex=(int) (Math.random() * (((buttons.size()-1) - 0) + 1) +0);
					randombutton=buttons.get(randomindex);
					randombutton.setText("o");
					buttons.remove(randombutton);
					clickedbuttons.add(randombutton);
					randombutton.setEnabled(false);
					checkwinnero(randombutton);
					
				}
				flag=0;
				checkwinner(btn0,btn4,btn8);
				checkwinner(btn0,btn1,btn2);
				checkwinner(btn0,btn3,btn6);
				checkwinnero(randombutton);
			
			}
			
		});

	
	
	}
void checkwinner(JButton btn1,JButton btn2, JButton btn3) {
	if (btn1.getText() == "x" && btn2.getText() == "x"&&btn2!=null && btn3.getText() == "x"&&btn3!=null) {
		JOptionPane.showMessageDialog(null, "x wins");
		frame.setVisible(false);
		int confirmed = JOptionPane.showOptionDialog(frame,
				"Replay?", "Pitanje!",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, new String[] { "Yes", "No" }, "No");
		if(confirmed==0) {
			frame.setVisible(false);
			frame.dispose();
		frame=	new TicTacToe();
			
			frame.setVisible(true);

		}
		else if(confirmed==1) {
			System.exit(1);
		}
		return;
	}
	
	
}
void checkwinnero(JButton btn) {
	if(btn.equals(btn1)) {
		if (btn1.getText() == "o"&&btn7!=null&&btn4!=null  && btn4.getText() == "o"&& btn7.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
		
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn1.getText() == "o"&&btn2!=null &&btn0!=null && btn0.getText() == "o"&& btn2.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
		
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
	}
	if(btn.equals(btn0)) {
		if (btn0.getText() == "o" &&btn8!=null&&btn4!=null&& btn4.getText() == "o" && btn8.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
		
			}
			else if(confirmed==1) {
				System.exit(1);
			}return;
		}
		if (btn0.getText() == "o" &&btn2!=null&&btn1!=null && btn1.getText() == "o"&& btn2.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
	
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn0.getText() == "o"&&btn6!=null&&btn3!=null && btn3.getText() == "o" && btn6.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
		
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
	}
	
	if(btn.equals(btn2)) {
		if (btn2.getText() == "o"&&btn6!=null &&btn4!=null&& btn4.getText() == "o" && btn6.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
		
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn2.getText() == "o"&&btn8!=null&&btn5!=null && btn5.getText() == "o" && btn8.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
		
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn2.getText() == "o" &&btn0!=null&&btn1!=null&& btn1.getText() == "o" && btn0.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
	
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
	}
	if(btn.equals(btn3)) {
		if (btn3.getText() == "o"&&btn5!=null&&btn4!=null && btn4.getText() == "o" && btn5.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
		
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn3.getText() == "o"&&btn0!=null &&btn6!=null&& btn6.getText() == "o" && btn0.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
	
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		
	}
	if(btn.equals(btn4)) {
		if (btn4.getText() == "o"&&btn7!=null &&btn1!=null&& btn1.getText() == "o" && btn7.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
	
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn4.getText() == "o"&&btn5!=null&&btn3!=null && btn3.getText() == "o" && btn5.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
	
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn4.getText() == "o" &&btn8!=null&&btn0!=null &&btn0.getText() == "o" && btn8.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
			
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn4.getText() == "o"&&btn6!=null&&btn2!=null  && btn2.getText() == "o"&& btn6.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
	
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
	}
	if(btn.equals(btn5)) {
		if (btn5.getText() == "o"&&btn8!=null &&btn2!=null && btn2.getText() == "o" &&btn8.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn5.getText() == "o"&&btn4!=null&&btn3!=null  && btn3.getText() == "o"&& btn4.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		
	}
	if(btn6.equals(btn6)) {
		if (btn6.getText() == "o"&&btn8!=null &&btn7!=null&&btn7.getText() == "o" && btn8.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
		
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn6.getText() == "o" &&btn3!=null &&btn0!=null&&btn3.getText() == "o" && btn0.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		
	}
	if(btn.equals(btn7)) {
		if (btn7.getText() == "o" &&btn1!=null &&btn4!=null &&btn4.getText() == "o" && btn1.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
	
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
			
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		if (btn7.getText() == "o" &&btn8!=null &&btn6!=null &&btn6.getText() == "o" &&btn8.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
			
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		
	}
	if(btn.equals(btn8)) {
		if (btn8.getText() == "o" &&btn2!=null&& btn5!=null&&btn2.getText() == "o" && btn5.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
	
				frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			
			return;
		
		}
		if (btn8.getText() == "o"&btn6!=null && btn7!=null&&btn6.getText() == "o" && btn7.getText() == "o"
				) {
			JOptionPane.showMessageDialog(null, "o wins");
			frame.setVisible(false);
			int confirmed = JOptionPane.showOptionDialog(frame,
					"Replay?", "Pitanje!",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] { "Yes", "No" }, "No");
			if(confirmed==0) {
		frame.setVisible(false);
				frame.dispose();
			frame=	new TicTacToe();
				
				frame.setVisible(true);
		
			}
			else if(confirmed==1) {
				System.exit(1);
			}
			return;
		}
		
	}
	}

}
