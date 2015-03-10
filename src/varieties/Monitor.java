package varieties;

/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Monitor extends JFrame {
	public JLabel jLabel1 = new JLabel();
	public JLabel jLabel2 = new JLabel();
	public JLabel jLabel3 = new JLabel();
	public JLabel jLabel4 = new JLabel();
	public JLabel jLabel5 = new JLabel();
	public JLabel jLabel6 = new JLabel();
	public JLabel jLabel7 = new JLabel();
	public JLabel jLabel8 = new JLabel();
	public JLabel jLabel9 = new JLabel();
	public JLabel jLabel10 = new JLabel();
	public JLabel jLabel11 = new JLabel();
	public JLabel jLabel12 = new JLabel();
	public JLabel jLabel13 = new JLabel();
	public JLabel jLabel14 = new JLabel();
	public JLabel jLabel15 = new JLabel();
	public JLabel jLabel16 = new JLabel();
	public JLabel jLabel17 = new JLabel();
	public JLabel jLabel18 = new JLabel();
	public JLabel jLabel19 = new JLabel();
	public JLabel jLabel110 = new JLabel();
	public JLabel jLabel111 = new JLabel();
	public JLabel jLabel112 = new JLabel();

	public Monitor(String string, GraphicsConfiguration graphicsConfiguration) {
		super(string, graphicsConfiguration);
	}

	public Monitor(String string) throws HeadlessException {
		super(string);
	}

	public Monitor(GraphicsConfiguration graphicsConfiguration) {
		super(graphicsConfiguration);
	}

	public Monitor() throws HeadlessException {
		super();
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setVisible(true);
		this.setAlwaysOnTop(true);
		setTitle("Monitor");
	}

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
	}

	public void jbInit() throws Exception {
		this.setSize(new Dimension(391, 299));
		this.getContentPane().setLayout(null);
		jLabel1.setBounds(new Rectangle(5, 5, 220, 30));
		jLabel1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel1.setFont(new Font("Arial Black", 0, 18));
		jLabel2.setBounds(new Rectangle(5, 155, 220, 30));
		jLabel2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel2.setFont(new Font("Arial Black", 0, 18));
		jLabel3.setBounds(new Rectangle(5, 43, 220, 30));
		jLabel3.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel3.setFont(new Font("Arial Black", 0, 18));
		jLabel4.setBounds(new Rectangle(5, 195, 220, 30));
		jLabel4.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel4.setFont(new Font("Arial Black", 0, 18));
		jLabel5.setBounds(new Rectangle(5, 81, 220, 30));
		jLabel5.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel5.setFont(new Font("Arial Black", 0, 18));
		jLabel6.setBounds(new Rectangle(240, 365, 220, 30));
		jLabel6.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel6.setFont(new Font("Arial Black", 0, 18));
		jLabel7.setBounds(new Rectangle(5, 119, 220, 30));
		jLabel7.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel7.setFont(new Font("Arial Black", 0, 18));
		jLabel8.setBounds(new Rectangle(240, 405, 220, 30));
		jLabel8.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel8.setFont(new Font("Arial Black", 0, 18));
		jLabel9.setBounds(new Rectangle(5, 235, 220, 30));
		jLabel9.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel9.setFont(new Font("Arial Black", 0, 18));
		jLabel9.setBackground(new Color(202, 237, 202));
		jLabel10.setBounds(new Rectangle(240, 330, 220, 30));
		jLabel10.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel10.setFont(new Font("Arial Black", 0, 18));
		jLabel10.setBackground(new Color(202, 237, 202));
		jLabel11.setBounds(new Rectangle(235, 5, 130, 30));
		jLabel11.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel11.setFont(new Font("Arial", 1, 22));
		jLabel12.setBounds(new Rectangle(235, 40, 130, 30));
		jLabel12.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel12.setFont(new Font("Arial", 1, 22));
		jLabel13.setBounds(new Rectangle(235, 80, 130, 30));
		jLabel13.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel13.setFont(new Font("Arial", 1, 22));
		jLabel14.setBounds(new Rectangle(235, 120, 130, 30));
		jLabel14.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel14.setFont(new Font("Arial", 1, 22));
		jLabel15.setBounds(new Rectangle(235, 155, 130, 30));
		jLabel15.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel15.setFont(new Font("Arial", 1, 22));
		jLabel16.setBounds(new Rectangle(235, 195, 130, 30));
		jLabel16.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel16.setFont(new Font("Arial", 1, 22));
		jLabel17.setBounds(new Rectangle(445, 5, 70, 30));
		jLabel17.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel17.setFont(new Font("Arial", 1, 22));
		jLabel18.setBounds(new Rectangle(445, 40, 70, 30));
		jLabel18.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel18.setFont(new Font("Arial", 1, 22));
		jLabel19.setBounds(new Rectangle(445, 80, 70, 30));
		jLabel19.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel19.setFont(new Font("Arial", 1, 22));
		jLabel110.setBounds(new Rectangle(445, 120, 70, 30));
		jLabel110.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel110.setFont(new Font("Arial", 1, 22));
		jLabel111.setBounds(new Rectangle(445, 155, 70, 30));
		jLabel111.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel111.setFont(new Font("Arial", 1, 22));
		jLabel112.setBounds(new Rectangle(445, 195, 70, 30));
		jLabel112.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel112.setFont(new Font("Arial", 1, 22));
		this.getContentPane().add(jLabel112, null);
		this.getContentPane().add(jLabel111, null);
		this.getContentPane().add(jLabel110, null);
		this.getContentPane().add(jLabel19, null);
		this.getContentPane().add(jLabel18, null);
		this.getContentPane().add(jLabel17, null);
		this.getContentPane().add(jLabel16, null);
		this.getContentPane().add(jLabel15, null);
		this.getContentPane().add(jLabel14, null);
		this.getContentPane().add(jLabel13, null);
		this.getContentPane().add(jLabel12, null);
		this.getContentPane().add(jLabel11, null);
		this.getContentPane().add(jLabel10, null);
		this.getContentPane().add(jLabel9, null);
		this.getContentPane().add(jLabel8, null);
		this.getContentPane().add(jLabel7, null);
		this.getContentPane().add(jLabel6, null);
		this.getContentPane().add(jLabel5, null);
		this.getContentPane().add(jLabel4, null);
		this.getContentPane().add(jLabel3, null);
		this.getContentPane().add(jLabel2, null);
		this.getContentPane().add(jLabel1, null);
	}
}
