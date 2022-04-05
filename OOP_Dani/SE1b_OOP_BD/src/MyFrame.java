import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JPanel upPanel=new JPanel();
	JPanel midPanel=new JPanel();
	JPanel downPanel=new JPanel();
	JLabel fnameL=new JLabel("Name");
	JLabel lnameL=new JLabel("LastName");
	JLabel sexL=new JLabel("Sex");
	JLabel ageL=new JLabel("Age");
	JLabel salaryL=new JLabel("Salary");
	JTextField fnameT=new JTextField();
	JTextField lnameT=new JTextField();
	JTextField ageT=new JTextField();
	JTextField salaryT=new JTextField();
	String[] item= {"Male","Female"};
	JComboBox<String> sexCombo=new JComboBox<String>(item);
	JButton addB=new JButton("Add");
	JButton delB=new JButton("Delete");
	JButton ediB=new JButton("Ëdit");
public MyFrame() {
	
	this.setSize(400,600);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setLayout(new GridLayout(3,1));
	//UpPanel
	upPanel.setLayout(new GridLayout(5,2));
	upPanel.add(fnameL);
	upPanel.add(fnameT);
	upPanel.add(lnameL);
	upPanel.add(lnameT);
	upPanel.add(sexL);
	upPanel.add(sexCombo);
	upPanel.add(ageL);
	upPanel.add(ageT);
	upPanel.add(salaryL);
	upPanel.add(salaryT);
	this.add(upPanel);
	//MidPanel
	midPanel.add(addB);
	midPanel.add(delB);
	midPanel.add(ediB);
	this.add(midPanel);
	//DownPanel
	addB.addActionListener(new AddAction());
	this.setVisible(true);
	}
class AddAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fnameT.getText()+" ");
		System.out.println(lnameT.getText()+" ");
		System.out.println(sexCombo.getSelectedItem().toString());
		System.out.println(ageT.getText());
		System.out.println(salaryT.getText());
		System.out.println(Integer.parseInt(ageT.getText())*2);
		System.out.println(Float.parseFloat(salaryT.getText())*2);
	}
	
}
}
