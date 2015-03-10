/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */
package varieties;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import java.awt.Dimension;
//import oracle.jdeveloper.layout.XYLayout;

//import oracle.jdeveloper.layout.XYConstraints;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Analize extends JFrame implements ActionListener
{
 // private XYLayout xYLayout1 = new XYLayout();
  private JButton start = new JButton();
  private JTextField average = new JTextField();
  private JTextField n1 = new JTextField();
  private JTextField n2 = new JTextField();
  private JTextField n3 = new JTextField();
  private JTextField n4 = new JTextField();
  private JTextField n5 = new JTextField();
  private JTextField n6 = new JTextField();
  private JTextField n7 = new JTextField();
  private JTextField n8 = new JTextField();
  private JTextField n9 = new JTextField();
  private JTextField n10 = new JTextField();
  private JTextField n11 = new JTextField();
  private JTextField bestlevel = new JTextField();
  private JTextField n13 = new JTextField();
  private JTextField n14 = new JTextField();
  private JTextField n15 = new JTextField();
  private JTextField n16 = new JTextField();
  private JTextField n17 = new JTextField();
  private JTextField n18 = new JTextField();
  private JTextField n19 = new JTextField();
  private JTextField n20 = new JTextField();
  private JTextField n21 = new JTextField();
  private JTextField extraNumber = new JTextField();
  private JTextField wincount = new JTextField();
  private JTextField cost = new JTextField();
  private JTextField p1 = new JTextField();
  private JTextField p2 = new JTextField();
  private JTextField p3 = new JTextField();
  private JTextField p4 = new JTextField();
  private JTextField p5 = new JTextField();
  private JTextField p6 = new JTextField();
  private JTextField p7 = new JTextField();
  private JTextField p8 = new JTextField();
  private JTextField p9 = new JTextField();
  private JTextField p10 = new JTextField();
  private JTextField p11 = new JTextField();
  private JTextField winp = new JTextField();
  private JTextField n121 = new JTextField();
  private JTextField p21 = new JTextField();
  private JTextField p20 = new JTextField();
  private JTextField p19 = new JTextField();
  private JTextField p18 = new JTextField();
  private JTextField p17 = new JTextField();
  private JTextField p16 = new JTextField();
  private JTextField p15 = new JTextField();
  private JTextField p14 = new JTextField();
  private JTextField p13 = new JTextField();
  private JTextField bestwin = new JTextField();
  
   private Connection con;
  
  Vector count=new Vector(22);
  Vector count2=new Vector(22);
  String extra="";
  int win=0;
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JComboBox level = new JComboBox();
  private JComboBox method = new JComboBox();
  private JComboBox samplesize = new JComboBox();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  private JLabel jLabel7 = new JLabel();

  public Analize()
  {
    try
    {
    
      //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

      jbInit();
      start.addActionListener(this);
      for(int i=0;i<16;i++)
      {
        level.addItem(""+i);
      }
      
      samplesize.addItem("500");
      samplesize.addItem("5000");
      
      for(int i=0;i<16;i++)
      {
        method.addItem(""+i);
      }
      
       enableEvents(AWTEvent.WINDOW_EVENT_MASK);
       count.add(n1);
       count.add(n2);
       count.add(n3);
       count.add(n4);
       count.add(n5);
       count.add(n6);
       count.add(n7);
       count.add(n8);
       count.add(n9);
       count.add(n10);
       count.add(n11);
       count.add(bestlevel);
       count.add(n13);
       count.add(n14);
       count.add(n15);
       count.add(n16);
       count.add(n17);
       count.add(n18);
       count.add(n19);
       count.add(n20);
       count.add(n21);
       
       count2.add(p1);
       count2.add(p2);
       count2.add(p3);
       count2.add(p4);
       count2.add(p5);
       count2.add(p6);
       count2.add(p7);
       count2.add(p8);
       count2.add(p9);
       count2.add(p10);
       count2.add(p11);
       count2.add(bestwin);
       count2.add(p13);
       count2.add(p14);
       count2.add(p15);
       count2.add(p16);
       count2.add(p17);
       count2.add(p18);
       count2.add(p19);
       count2.add(p20);
       count2.add(p21);
      pack();
      setVisible(true);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }

  }
  protected void processWindowEvent(WindowEvent e)
  {
    if(e.getID()==WindowEvent.WINDOW_CLOSING)
    {
      dispose();
      System.exit(0);
    }
    super.processWindowEvent(e);
  }
public void actionPerformed(ActionEvent e)
  {
    Object source=e.getSource();
    if(source==start)
    {
       
        
        
         try
        {
           con=DriverManager.getConnection("jdbc:odbc:Gamble");
           Statement ste=con.createStatement();
           ResultSet rs;
           byte levelno=Byte.parseByte((String)(level.getSelectedItem()));
           int size=Integer.parseInt((String)(samplesize.getSelectedItem()));
           byte methodno=Byte.parseByte((String)(method.getSelectedItem()));
           String str="";
           
            str="select win from RandomR where gameType="+methodno+" and size="+size+" and level=6";
            rs=ste.executeQuery(str);
            
            while(rs.next())
            {
                  System.out.print(","+rs.getInt("Win"));
            }
            rs.close();
           
           if(levelno==0)
           {
           
                for( int i=1;i<16;i++)
                {
                  str="select AVG(win),AVG(MPayout),MAX(win),MIN(win),MAX(MPayout),count(win) from RandomR where gameType="+methodno+" and size="+size+" and level="+i;
                  rs=ste.executeQuery(str);
                  
                 //System.out.println(str);
                  
                  while(rs.next())
                  {
                  System.out.println("Level="+i+"  "+rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5)+"  "+rs.getInt(6));
                  }
                  rs.close();
                }
           }
           else
           {
                  str="select AVG(win),AVG(MPayout),MAX(win),MIN(win),MAX(MPayout) from RandomR where gameType="+methodno+" and size="+size+" and level="+levelno;
                  rs=ste.executeQuery(str);
                  while(rs.next())
                  {
                  System.out.println("Level="+levelno+"  "+rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5)+"  "+rs.getInt(6));
                  }
                  rs.close();
                  
           }
        
                             
                      
            con.close();
        }catch(SQLException sqle)
        {                        
            sqle.printStackTrace();

        }
   
      return;
    }
  
  }
  /**
   * 
   * @param args
   */
  public static void main(String[] args)
  {
     Analize anewone = new Analize();
  }

  private void jbInit() throws Exception
  {
    this.setSize(new Dimension(778, 528));
    //this.getContentPane().setLayout(xYLayout1);
    start.setText("Start");
    jLabel1.setText("Level:");
    jLabel2.setText("Size:");
    jLabel3.setText("Method:");
    jLabel4.setText("<-Average");
    jLabel5.setText("<-Cost");
    jLabel6.setText("<-Best Level");
    jLabel7.setText("<-Best Win");
    /*/
    this.getContentPane().add(jLabel7, new XYConstraints(665, 75, 85, 20));
    this.getContentPane().add(jLabel6, new XYConstraints(475, 80, 65, 15));
    this.getContentPane().add(jLabel5, new XYConstraints(290, 80, 75, 15));
    this.getContentPane().add(jLabel4, new XYConstraints(110, 75, 60, 20));
    this.getContentPane().add(samplesize, new XYConstraints(370, 20, 90, 20));
    this.getContentPane().add(method, new XYConstraints(575, 20, 60, 20));
    this.getContentPane().add(level, new XYConstraints(205, 20, 60, 20));
    this.getContentPane().add(jLabel3, new XYConstraints(510, 25, 40, 14));
    this.getContentPane().add(jLabel2, new XYConstraints(320, 25, 45, 15));
    this.getContentPane().add(jLabel1, new XYConstraints(110, 20, 55, 20));
    this.getContentPane().add(bestwin, new XYConstraints(575, 75, 65, 20));
    this.getContentPane().add(p13, new XYConstraints(575, 100, 65, 20));
    this.getContentPane().add(p14, new XYConstraints(575, 130, 65, 20));
    this.getContentPane().add(p15, new XYConstraints(575, 160, 65, 20));
    this.getContentPane().add(p16, new XYConstraints(575, 195, 65, 20));
    this.getContentPane().add(p17, new XYConstraints(575, 230, 65, 20));
    this.getContentPane().add(p18, new XYConstraints(575, 265, 65, 20));
    this.getContentPane().add(p19, new XYConstraints(575, 300, 65, 20));
    this.getContentPane().add(p20, new XYConstraints(575, 340, 65, 20));
    this.getContentPane().add(p21, new XYConstraints(575, 375, 65, 20));
    this.getContentPane().add(n121, new XYConstraints(575, 405, 65, 20));
    this.getContentPane().add(winp, new XYConstraints(575, 445, 65, 20));
    this.getContentPane().add(p11, new XYConstraints(205, 445, 65, 20));
    this.getContentPane().add(p10, new XYConstraints(205, 405, 65, 20));
    this.getContentPane().add(p9, new XYConstraints(205, 375, 65, 20));
    this.getContentPane().add(p8, new XYConstraints(205, 340, 65, 20));
    this.getContentPane().add(p7, new XYConstraints(205, 300, 65, 20));
    this.getContentPane().add(p6, new XYConstraints(205, 265, 65, 20));
    this.getContentPane().add(p5, new XYConstraints(205, 230, 65, 20));
    this.getContentPane().add(p4, new XYConstraints(205, 195, 65, 20));
    this.getContentPane().add(p3, new XYConstraints(205, 160, 65, 20));
    this.getContentPane().add(p2, new XYConstraints(205, 130, 65, 20));
    this.getContentPane().add(p1, new XYConstraints(205, 100, 65, 20));
    this.getContentPane().add(cost, new XYConstraints(205, 75, 65, 20));
    this.getContentPane().add(wincount, new XYConstraints(390, 445, 65, 20));
    this.getContentPane().add(extraNumber, new XYConstraints(390, 405, 65, 20));
    this.getContentPane().add(n21, new XYConstraints(390, 375, 65, 20));
    this.getContentPane().add(n20, new XYConstraints(390, 340, 65, 20));
    this.getContentPane().add(n19, new XYConstraints(390, 300, 65, 20));
    this.getContentPane().add(n18, new XYConstraints(390, 265, 65, 20));
    this.getContentPane().add(n17, new XYConstraints(390, 230, 65, 20));
    this.getContentPane().add(n16, new XYConstraints(390, 195, 65, 20));
    this.getContentPane().add(n15, new XYConstraints(390, 160, 65, 20));
    this.getContentPane().add(n14, new XYConstraints(390, 130, 65, 20));
    this.getContentPane().add(n13, new XYConstraints(390, 100, 65, 20));
    this.getContentPane().add(bestlevel, new XYConstraints(390, 75, 65, 20));
    this.getContentPane().add(n11, new XYConstraints(25, 445, 65, 20));
    this.getContentPane().add(n10, new XYConstraints(25, 405, 65, 20));
    this.getContentPane().add(n9, new XYConstraints(25, 375, 65, 20));
    this.getContentPane().add(n8, new XYConstraints(25, 340, 65, 20));
    this.getContentPane().add(n7, new XYConstraints(25, 300, 65, 20));
    this.getContentPane().add(n6, new XYConstraints(25, 265, 65, 20));
    this.getContentPane().add(n5, new XYConstraints(25, 230, 65, 20));
    this.getContentPane().add(n4, new XYConstraints(25, 195, 65, 20));
    this.getContentPane().add(n3, new XYConstraints(25, 160, 65, 20));
    this.getContentPane().add(n2, new XYConstraints(25, 130, 65, 20));
    this.getContentPane().add(n1, new XYConstraints(25, 100, 65, 20));
    this.getContentPane().add(average, new XYConstraints(25, 75, 64, 19));
    this.getContentPane().add(start, new XYConstraints(20, 20, 73, 23));
    //*/
  }
}