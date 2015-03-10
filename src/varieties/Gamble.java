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
import javax.swing.JComboBox;

public class Gamble extends JFrame implements ActionListener
{
 // private XYLayout xYLayout1 = new XYLayout();
  private JButton start = new JButton();
  private JTextField n = new JTextField();
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
  private JTextField n12 = new JTextField();
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
  private JTextField n112 = new JTextField();
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
  private JTextField p12 = new JTextField();
  
   private Connection con;
  
  Vector count=new Vector(22);
  Vector count2=new Vector(22);
  String extra="";
  int win=0;
  private JTextField looptime = new JTextField();
  private JTextField runsize = new JTextField();
  private JComboBox method = new JComboBox();

  public Gamble()
  {
    try
    {
    
     // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

      jbInit();
      
      for(int i=0;i<16;i++)
      {
        method.addItem(""+i);
      }
      start.addActionListener(this);
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
       count.add(n12);
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
       count2.add(p12);
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
       byte methodno=Byte.parseByte((String)(method.getSelectedItem()));
        for(int i=0;i<count.size();i++)
        {
         ((JTextField)(count.elementAt(i))).setText(String.valueOf(""));
        }
        for(int i=0;i<count2.size();i++)
        {
         ((JTextField)(count2.elementAt(i))).setText(String.valueOf(""));
        }
        
        int[] repeat=new int[16];
        
        int total=0;
        
        int winX=0;
        int winx=0;
        
         try
        {
           con=DriverManager.getConnection("jdbc:odbc:Gamble");
           PreparedStatement pst;
        for (int j=0;j<Integer.parseInt(looptime.getText());j++)
        {
              for(int i=1;i<16;i++)
              {
                  boolean status= true;
          
                  double[] P=new double[20];
                  int random=0;
                  win=0;
                  int tem=0;
                  int lose=0;
                  int winn=0;
                  int payout=0;
                  int invest=200;
                  int lowest=invest;
                  Random gRandom=new Random();
                  total=0; 
                  winx=0;winX=0;
                  for(int n=0;n<16;n++)
                  {repeat[n]=0;}
         // System.out.println("--------------"+i+"---------------");
                  while(status)
                  {
                        random=gRandom.nextInt(2);
                        total=total+1;
        //  System.out.println(random);
                        if(random==1)
                        {
                            tem=tem+1;
                            lose++;
                            if(tem==i)
                            {
                                if(methodno==0)
                                {
                                  payout=payout+(int)(Math.pow(2,(tem-1)));
                                  win=(int)(win-Math.pow(2,(tem-1)));
                                  invest=invest-(int)(Math.pow(2,(tem-1)));
                                  if(invest<lowest)
                                  {
                                    lowest=invest;
                                  }
                                  if(win<winx)
                                  {
                                    winx=win;
                                  }
                                  repeat[tem]=repeat[tem]+1;
                           //     System.out.println("irepeat="+tem);
                                  tem=0;
                                } else if(methodno==1 && tem>1)
                                {
                                  win=(int)(win-Math.pow(2,(i-1))-Math.pow(2,(i-2)));
                                  invest=invest-(int)(Math.pow(2,(i-1)))-(int)(win-Math.pow(2,(i-2)));
                                  if(invest<lowest)
                                  {
                                    lowest=invest;
                                  }
                                  repeat[tem]=repeat[tem]+1;
                                  if(win<winx)
                                  {
                                    winx=win;
                                  }
                                  tem=0;
                                }
                            }
           //System.out.print("<<< "+random+" ");
                        }
                        else
                        {
                            win++; 
                            invest++;
                            winn++;
                            
                            if(win>winX)
                            {
                                    winX=win;
                            }
                            
                            
                            if(tem!=0)
                            {
                                repeat[tem]=repeat[tem]+1;
                            
                                ((JTextField)(count.elementAt(tem-1))).setText(String.valueOf(repeat[tem]));
                                
                                 if(methodno==1 && tem>1)
                                  {
                                    win=(int)(win+Math.pow(2,(tem-2)));
                                    invest=invest+(int)(Math.pow(2,(tem-2)));
                                  }
                                  tem=0;
                            }
            
                          }
          
                          if(total>(Integer.parseInt(runsize.getText())-1))
                          {
                              status=false;
            
                          }
                      }//end of while
                      System.out.print(i+"="+win+",^"+winX+",_"+winx+"   ");
         
                      if(i==1)
                      {
                          n19.setText(String.valueOf(winn));
                          p19.setText(String.valueOf(lose));
                          p18.setText(String.valueOf(payout));
                          n18.setText(String.valueOf(winn-payout));
                      }
                      else if(i==13)
                        {System.out.print(winn-payout);}
          
                      ((JTextField)(count2.elementAt(i-1))).setText(String.valueOf(lowest));
          
          
                      String str="insert into RANDOMR values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
   
                     
                            pst=con.prepareStatement(str);
                            pst.setByte(1,(byte)i);
                            pst.setInt(2,total);
                            pst.setInt(3,win);
                            pst.setInt(4,(200-lowest));
                            pst.setInt(5,repeat[1]);
                            pst.setInt(6,repeat[2]);
                            pst.setInt(7,repeat[3]);
                            pst.setInt(8,repeat[4]);
                            pst.setInt(9,repeat[5]);     
                            pst.setInt(10,repeat[6]);
                            pst.setInt(11,repeat[7]);
                            pst.setInt(12,repeat[8]);
                            pst.setInt(13,repeat[9]);
                            pst.setInt(14,repeat[10]);
                            pst.setInt(15,repeat[11]);     
                            pst.setInt(16,repeat[12]);
                            pst.setInt(17,repeat[13]);     
                            pst.setInt(18,repeat[14]);
                            pst.setInt(19,repeat[15]);
                            pst.setInt(20,methodno);
        
        
                            int index=pst.executeUpdate();
                            if(index<=0)
                            {
                                System.out.println("Insert Failed");
                            }
        
                                pst.close();
                                
        
          
          
                        }//end of for i
                        System.out.println("");
       
           
          
                      }// end of for j 
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
    Gamble gamble = new Gamble();
  }

  private void jbInit() throws Exception
  {
    this.setSize(new Dimension(778, 528));
    this.getContentPane().setLayout(null);
    start.setText("Start");
    looptime.setText("5");
    runsize.setText("500");
    this.getContentPane().add(method);
    this.getContentPane().add(runsize);
    this.getContentPane().add(looptime);
    this.getContentPane().add(p12);
    this.getContentPane().add(p13);
    this.getContentPane().add(p14);
    this.getContentPane().add(p15);
    this.getContentPane().add(p16);
    this.getContentPane().add(p17);
    this.getContentPane().add(p18);
    this.getContentPane().add(p19);
    this.getContentPane().add(p20);
    this.getContentPane().add(p21);
    this.getContentPane().add(n121);
    this.getContentPane().add(winp);
    this.getContentPane().add(p11);
    this.getContentPane().add(p10);
    this.getContentPane().add(p9);
    this.getContentPane().add(p8);
    this.getContentPane().add(p7);
    this.getContentPane().add(p6);
    this.getContentPane().add(p5);
    this.getContentPane().add(p4);
    this.getContentPane().add(p3);
    this.getContentPane().add(p2);
    this.getContentPane().add(p1);
    this.getContentPane().add(n112);
    this.getContentPane().add(wincount);
    this.getContentPane().add(extraNumber);
    this.getContentPane().add(n21);
    this.getContentPane().add(n20);
    this.getContentPane().add(n19);
    this.getContentPane().add(n18);
    this.getContentPane().add(n17);
    this.getContentPane().add(n16);
    this.getContentPane().add(n15);
    this.getContentPane().add(n14);
    this.getContentPane().add(n13);
    this.getContentPane().add(n12);
    this.getContentPane().add(n11);
    this.getContentPane().add(n10);
    this.getContentPane().add(n9);
    this.getContentPane().add(n8);
    this.getContentPane().add(n7);
    this.getContentPane().add(n6);
    this.getContentPane().add(n5);
    this.getContentPane().add(n4);
    this.getContentPane().add(n3);
    this.getContentPane().add(n2);
    this.getContentPane().add(n1);
    this.getContentPane().add(n);
    this.getContentPane().add(start);
    /*/
    this.getContentPane().add(method, new XYConstraints(575, 25, 65, 20));
    this.getContentPane().add(runsize, new XYConstraints(385, 20, 64, 19));
    this.getContentPane().add(looptime, new XYConstraints(205, 20, 64, 19));
    this.getContentPane().add(p12, new XYConstraints(575, 75, 65, 20));
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
    this.getContentPane().add(n112, new XYConstraints(205, 75, 65, 20));
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
    this.getContentPane().add(n12, new XYConstraints(390, 75, 65, 20));
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
    this.getContentPane().add(n, new XYConstraints(25, 75, 64, 19));
    this.getContentPane().add(start, new XYConstraints(20, 20, 73, 23));
    
    //*/
  }
}