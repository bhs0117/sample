package ex;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex1Main extends JFrame implements ActionListener{
	JButton btn1, btn2;
	JTextField jtf1;
	JPanel pn1;
	
	Ex1Main() {
		super("약수구하기");
		btn1 = new JButton("약수 구하기");
		btn2 = new JButton("소수 구하기");
		pn1 = new JPanel();
		jtf1 = new JTextField(20);
		
		pn1.add(btn1);
		pn1.add(btn2);
		add(pn1,"North");
		add(jtf1);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setSize(400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			String name = JOptionPane.showInputDialog(this,"약수를 구할 정수를 입력하세요.");
			//System.out.println(name);
			Ex1 ex1 = new Ex1();
			
			jtf1.setText(ex1.divisor(Integer.parseInt(name)));
		}else if(e.getSource() == btn2) {
			String name = JOptionPane.showInputDialog(this,"소수를 구할 정수를 입력하세요.");
			//System.out.println(name);
			Ex1 ex2 = new Ex1();
			
			jtf1.setText(ex2.primeNumber(Integer.parseInt(name)));
		}
	}	
	
	public static void main(String[] args) {
		new Ex1Main();
	}
}
