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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Arrays;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class Roulette extends JFrame {
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private JButton jButton3 = new JButton();
	private JButton jButton4 = new JButton();
	private JButton jButton5 = new JButton();
	private JButton jButton6 = new JButton();
	private JButton jButton7 = new JButton();
	private JButton jButton8 = new JButton();
	private JButton jButton9 = new JButton();
	private JButton jButton10 = new JButton();
	private JButton jButton11 = new JButton();
	private JButton jButton12 = new JButton();
	private JButton jButton13 = new JButton();
	private JButton jButton14 = new JButton();
	private JButton jButton15 = new JButton();
	private JButton jButton16 = new JButton();
	private JButton jButton17 = new JButton();
	private JButton jButton18 = new JButton();
	private JButton jButton19 = new JButton();
	private JButton jButton20 = new JButton();
	private JButton jButton21 = new JButton();
	private JButton jButton22 = new JButton();
	private JButton jButton23 = new JButton();
	private JButton jButton24 = new JButton();
	private JButton jButton25 = new JButton();
	private JButton jButton26 = new JButton();
	private JButton jButton27 = new JButton();
	private JButton jButton28 = new JButton();
	private JButton jButton29 = new JButton();
	private JButton jButton30 = new JButton();
	private JButton jButton31 = new JButton();
	private JButton jButton32 = new JButton();
	private JButton jButton33 = new JButton();
	private JButton jButton34 = new JButton();
	private JButton jButton35 = new JButton();
	private JButton jButton36 = new JButton();
	double round, even, odd, evenodd, evenodd_max, evenodd_min, evenodd_m_max,
			evenodd_m_min, evenodd_repeat, zero;
	double evenodd_av, evenodd_tp, av;
	double rr, bb, evens, odds, lhs, uhs, fgs, sgs, tgs, f12s, s12s, t12s;
	boolean evenodd_lock, evenodd_max_lock, evenodd_min_lock, evenbet;
	double[][] aves = new double[5][100], saves = new double[5][10];
	double r, b, rb, lh, uh, lu, f12, s12, t12, fg, sg, tg;
	private JLabel jLabel11 = new JLabel();
	private JButton jButton37 = new JButton();
	private JLabel jLabel12 = new JLabel();
	private JButton jButton38 = new JButton();
	private JLabel jLabel13 = new JLabel();
	private JLabel jLabel14 = new JLabel();
	private JLabel jLabel15 = new JLabel();
	private JLabel jLabel16 = new JLabel();
	private JTextField jTextField2 = new JTextField();
	private JButton jButton39 = new JButton();
	Chart333 bjchart = new Chart333("Roulette");
	private JList jList1 = new JList();
	int bet = 1, t;
	Chart333 genchart = new Chart333("T");
			//avchart = new Chart333("T");
	double rmax, rmin, rmmax, rmmin, bmax, bmin, bmmax, bmmin;
	boolean rmaxlock, rminlock, bmaxlock, bminlock;
	double uhmax, uhmin, uhmmax, uhmmin, lhmax, lhmin, lhmmax, lhmmin;
	boolean uhmaxlock, uhminlock, lhmaxlock, lhminlock;
	double oddmax, oddmin, oddmmax, oddmmin, evenmax, evenmin, evenmmax,
			evenmmin, sb;
	boolean oddmaxlock, oddminlock, evenmaxlock, evenminlock;
	private JButton jButton40 = new JButton();
	private Monitor monitor = new Monitor();
	int f12i, s12i, t12i, fgi, sgi, tgi, f12i_p, s12i_p, t12i_p, fgi_p, sgi_p,
			tgi_p;
	private JButton jButton41 = new JButton();
	int[] ids = new int[5];
	boolean et, ot, rt, bt, lt, ut;
	int elen, olen, rlen, blen, llen, ulen;
	private JComboBox jComboBox1 = new JComboBox();
	double ymove = 0;
	private JButton jButton42 = new JButton();
	private JButton jButton43 = new JButton();
	private JButton jButton44 = new JButton();
	private JButton jButton45 = new JButton();
	int[] nos = new int[37], orders = new int[37], maxdist = new int[23],
			splitbet = new int[60], trows = new int[12], sboxs = new int[11],
			fbox = new int[23]; // ,neibers=new int[37];
	int sortmax = 0, same = -1, samerepeat = 0;;
	double beisum = 0, temsum = 0, rrep = 0;
	// int[] payout=new
	// int[]{34,33,32,32,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,48,46,44,42,40,38,36,34,32,30,62,59,56,53,50,47,44,41,72,68,64,60,56,52,48,78,73,68,63,58,53,82,76,70,64,58,86,79,72,65,58,85,77,69,61,87,78,69,60,85,75,65,89,78,67,90,78,66,88,75,62,83,69,};
	int[] payout = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3,
			3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7,
			7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12,
			13, 13, 13, 14, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
			27, 28, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57,
			59, 61, 63, 65, 67, 69, 71, 73, 76, 79, 82, 85, 88, 91, 94, 97, 100 };
	int[] nss = new int[37];
	int[] bets = new int[0];
	double wl = 0;

	public Roulette(String string, GraphicsConfiguration graphicsConfiguration) {
		super(string, graphicsConfiguration);
	}

	public Roulette(String string) throws HeadlessException {
		super(string);
	}

	public Roulette(GraphicsConfiguration graphicsConfiguration) {
		super(graphicsConfiguration);
	}

	public Roulette() throws HeadlessException {
		super();
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		bjchart.setMaxItem(800);
		//avchart.setID("Ave. for Red,Even,19-36");
		//avchart.setFrameTitle("AvFR.E.U");
		// schart.setID("Black,Odd,1-18");
		// schart.setFrameTitle("BOL");
		//fchart.setID("Selection");
		//fchart.setFrameTitle("Select");
		//fchart.setMaxItem(120);
		bjchart.setFrameTitle("T.View");
		setAlwaysOnTop(true);
		setTitle("Thinker");
		genchart.setMaxItem(1500);
		jComboBox1.addItem("Red");

		jComboBox1.addItem("Even");
		jComboBox1.addItem("19-36");

		jComboBox1.addItem("Black");
		jComboBox1.addItem("Odd");
		jComboBox1.addItem("1-18");

		for (int i = 0; i < orders.length; i++)
			orders[i] = i;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void evenop() {

		even++;
		elen++;
		if (!et) {
			et = true;
			ot = false;
			olen = 0;
		}
		// evenbet=true;
		evenodd = even - odd - sb;
		cal();

		if (evens > evenmax) {
			evenmax = evens;

		}

		if (evens > evenmmax) {
			evenmmax = evens;
			evenminlock = true;
		}

		if (evenmaxlock && (evens - evenmmin) >= 5) {
			evenmmax = evens;
			evenmaxlock = false;

		}
		// for bb:
		if (odds < oddmin) {
			oddmin = odds;

		}

		if (odds < oddmmin) {
			oddmmin = odds;
			oddmaxlock = true;
		}

		if (oddminlock && (oddmmax - odds) >= 5) {
			oddmmin = odds;
			oddminlock = false;

		}

		//fchart.setdata5(odds, t);
		//fchart.setdata2(evens, t);
		bjchart.setdata2(evens, t);
		bjchart.setdata5(odds, t);

		//avchart.setdata2(getave(evens, 1), t);
		//avchart.setdata4(getsave(evens, 1), t);

		// System.out.println("evens="+evens);
	}

	private void oddop() {

		odd++;
		olen++;
		if (!ot) {
			ot = true;
			et = false;
			elen = 0;
		}
		evenodd = even - odd - sb;

		cal();

		if (odds > oddmax) {
			oddmax = odds;

		}

		if (odds > oddmmax) {
			oddmmax = odds;
			oddminlock = true;
		}

		if (oddmaxlock && (odds - oddmmin) >= 5) {
			oddmmax = odds;
			oddmaxlock = false;

		}
		// for bb:
		if (evens < evenmin) {
			evenmin = evens;

		}

		if (evens < evenmmin) {
			evenmmin = evens;
			evenmaxlock = true;
		}

		if (evenminlock && (evenmmax - evens) >= 5) {
			evenmmin = evens;
			evenminlock = false;

		}

		//fchart.setdata5(odds, t);
		//fchart.setdata2(evens, t);
		bjchart.setdata2(evens, t);
		bjchart.setdata5(odds, t);

		//avchart.setdata2(getave(evens, 1), t);
		//avchart.setdata4(getsave(evens, 1), t);

	}

	private void redop() {
		r++;
		round++;
		rlen++;
		if (!rt) {
			rt = true;
			bt = false;
			blen = 0;
		}

		jLabel12.setText("" + round);
		cal();

		if (rr > rmax) {
			rmax = rr;

		}

		if (rr > rmmax) {
			rmmax = rr;
			rminlock = true;
		}

		if (rmaxlock && (rr - rmmin) >= 5) {
			rmmax = rr;
			rmaxlock = false;

		}
		// for bb:
		if (bb < bmin) {
			bmin = bb;

		}

		if (bb < bmmin) {
			bmmin = bb;
			bmaxlock = true;
		}

		if (bminlock && (bmmax - bb) >= 5) {
			bmmin = bb;
			bminlock = false;

		}

		op();
		//fchart.setdata4(bb, t);
		//fchart.setdata(rr, t);
		bjchart.setdata(rr, t);
		bjchart.setdata4(bb, t);
		//avchart.setdata(getave(rr, 0), t);
		//avchart.setdata5(getsave(rr, 0), t);

		// System.out.println(evens+","+getgendata(jComboBox1.getSelectedIndex()));

	}

	private void blackop() {
		b++;
		round++;
		blen++;
		if (!bt) {
			bt = true;
			rlen = 0;
			rt = false;
		}

		jLabel12.setText("" + round);
		rb = r - b - sb;
		cal();

		if (bb > bmax) {
			bmax = bb;

		}

		if (bb > bmmax) {
			bmmax = bb;
			bminlock = true;
		}

		if (bmaxlock && (bb - bmmin) >= 5) {
			bmmax = bb;
			bmaxlock = false;

		}
		// for bb:
		if (rr < rmin) {
			rmin = rr;

		}

		if (rr < rmmin) {
			rmmin = rr;
			rmaxlock = true;
		}

		if (rminlock && (rmmax - rr) >= 5) {
			rmmin = rr;
			rminlock = false;

		}

		op();
		//fchart.setdata4(bb, t);
		//fchart.setdata(rr, t);
		bjchart.setdata(rr, t);
		bjchart.setdata4(bb, t);
		//avchart.setdata(getave(rr, 0), t);
		//avchart.setdata5(getsave(rr, 0), t);

	}

	private void half118op() {
		lh++;
		lu = lh - uh - sb;
		llen++;
		if (!lt) {
			lt = true;
			ut = false;
			ulen = 0;
		}

		cal();

		if (lhs > lhmax) {
			lhmax = lhs;

		}

		if (lhs > lhmmax) {
			lhmmax = lhs;
			lhminlock = true;
		}

		if (lhmaxlock && (lhs - lhmmin) >= 5) {
			lhmmax = lhs;
			lhmaxlock = false;

		}
		// for bb:
		if (uhs < uhmin) {
			uhmin = uhs;

		}

		if (uhs < uhmmin) {
			uhmmin = uhs;
			uhmaxlock = true;
		}

		if (uhminlock && (uhmmax - uhs) >= 5) {
			uhmmin = uhs;
			uhminlock = false;

		}
		//fchart.setdata6(lhs, t);
		//fchart.setdata3(uhs, t);
		bjchart.setdata3(uhs, t);
		bjchart.setdata6(lhs, t);
		//avchart.setdata3(getave(uhs, 2), t);
		//avchart.setdata6(getsave(uhs, 2), t);

	}

	private void half1936op() {
		uh++;

		lu = lh - uh - sb;
		ulen++;
		if (!ut) {
			ut = true;
			lt = false;
			llen = 0;
		}

		cal();

		if (uhs > uhmax) {
			uhmax = uhs;

		}

		if (uhs > uhmmax) {
			uhmmax = uhs;
			uhminlock = true;
		}

		if (uhmaxlock && (uhs - uhmmin) >= 5) {
			uhmmax = uhs;
			uhmaxlock = false;

		}
		// for bb:
		if (lhs < lhmin) {
			lhmin = lhs;

		}

		if (lhs < lhmmin) {
			lhmmin = lhs;
			lhmaxlock = true;
		}

		if (lhminlock && (lhmmax - lhs) >= 5) {
			lhmmin = lhs;
			lhminlock = false;

		}

		//fchart.setdata6(lhs, t);
		//fchart.setdata3(uhs, t);
		bjchart.setdata3(uhs, t);
		bjchart.setdata6(lhs, t);
		//avchart.setdata3(getave(uhs, 2), t);
		//avchart.setdata6(getsave(uhs, 2), t);

	}

	private void f12op() {

		f12 = f12 + 3;
		cal();
		// tchart.setdata(f12s,t);
		// tchart.setdata3(t12s,t);
		// tchart.setdata2(s12s,t);
		f12i_p = f12i;
		f12i = 0;
		s12i++;
		t12i++;
	}

	private void s12op() {
		s12 = s12 + 3;
		cal();
		// tchart.setdata(f12s,t);
		// tchart.setdata3(t12s,t);
		// tchart.setdata2(s12s,t);
		f12i++;
		s12i_p = s12i;
		s12i = 0;
		t12i++;
	}

	private void t12op() {
		t12 = t12 + 3;
		cal();
		// tchart.setdata(f12s,t);
		// tchart.setdata3(t12s,t);
		// tchart.setdata2(s12s,t);
		f12i++;
		s12i++;
		t12i_p = t12i;
		t12i = 0;
	}

	private void fgroupop() {
		fg = fg + 3;
		fgi_p = fgi;
		fgi = 0;
		sgi++;
		tgi++;
		cal();
		// frchart.setdata3(tgs,t);
		// frchart.setdata(fgs,t);
		// frchart.setdata2(sgs,t);
		genchart.setdata(getgendata(jComboBox1.getSelectedIndex()) - ymove, t);
		genchart.setID(genchart.getID() + ":" + (int) ymove);

	}

	private void sgroupop() {
		sg = sg + 3;
		fgi++;
		sgi_p = sgi;
		sgi = 0;
		tgi++;
		cal();
		// frchart.setdata3(tgs,t);
		// frchart.setdata(fgs,t);
		// frchart.setdata2(sgs,t);

		genchart.setdata(getgendata(jComboBox1.getSelectedIndex()) - ymove, t);
		genchart.setID(genchart.getID() + ":" + (int) ymove);

	}

	private void tgroupop() {
		tg = tg + 3;
		fgi++;
		sgi++;
		tgi_p = tgi;
		tgi = 0;
		cal();
		// frchart.setdata3(tgs,t);
		// frchart.setdata(fgs,t);
		// frchart.setdata2(sgs,t);
		genchart.setdata(getgendata(jComboBox1.getSelectedIndex()) - ymove, t);
		genchart.setID(genchart.getID() + ":" + (int) ymove);
	}

	private void cal() {
		tgs = tg - round - sb;

		sgs = sg - round - sb;

		fgs = fg - round - sb;

		t12s = t12 - round - sb;

		s12s = s12 - round - sb;

		f12s = f12 - round - sb;

		uhs = 2 * uh - round - sb;

		lhs = 2 * lh - round - sb;

		evens = 2 * even - round - sb;

		odds = 2 * odd - round - sb;

		bb = 2 * b - round - sb;

		rr = 2 * r - round - sb;

		// System.out.println("SB="+sb);

		monitor.jLabel1.setText("Even: " + (int) evens + "["
				+ (int) (evenmmax - evens) + "][" + (int) (evens - evenmmin)
				+ "][" + elen + "]");
		monitor.jLabel3.setText("Odd: " + (int) odds + "["
				+ (int) (oddmmax - odds) + "][" + (int) (odds - oddmmin) + "]["
				+ olen + "]");
		monitor.jLabel2.setText("Red: " + (int) rr + "[" + (int) (rmmax - rr)
				+ "][" + (int) (rr - rmmin) + "][" + rlen + "]");
		monitor.jLabel4.setText("Black: " + (int) bb + "[" + (int) (bmmax - bb)
				+ "][" + (int) (bb - bmmin) + "][" + blen + "]");
		monitor.jLabel5.setText("19_36: " + (int) uhs + "["
				+ (int) (uhmmax - uhs) + "][" + (int) (uhs - uhmmin) + "]["
				+ ulen + "]");
		monitor.jLabel7.setText("1-18: " + (int) lhs + "["
				+ (int) (lhmmax - lhs) + "][" + (int) (lhs - lhmmin) + "]["
				+ llen + "]");
		monitor.jLabel6.setText("12s: [" + f12i + "][" + s12i + "][" + t12i
				+ "]");
		monitor.jLabel8.setText("Gs: [" + fgi + "][" + sgi + "][" + tgi + "]");

	}

	private void op() {
		getMax();
		sort();
	}

	public static void main(String[] args) {
		Roulette rottele = new Roulette();
	}

	private void jbInit() throws Exception {
		this.setSize(new Dimension(704, 311));
		this.getContentPane().setLayout(null);
		jButton1.setText("1");
		jButton1.setBounds(new Rectangle(5, 75, 50, 30));
		jButton1.setFont(new Font("Arial", 1, 16));
		jButton1.setForeground(Color.white);
		jButton1.setBackground(Color.red);
		jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton1_actionPerformed(e);
			}
		});
		jButton2.setText("2");
		jButton2.setBounds(new Rectangle(5, 40, 50, 30));
		jButton2.setFont(new Font("Arial", 1, 16));
		jButton2.setForeground(Color.white);
		jButton2.setBackground(Color.black);
		jButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton2_actionPerformed(e);
			}
		});
		jButton3.setText("3");
		jButton3.setBounds(new Rectangle(5, 5, 50, 30));
		jButton3.setFont(new Font("Arial", 1, 16));
		jButton3.setForeground(Color.white);
		jButton3.setBackground(Color.red);
		jButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton3_actionPerformed(e);
			}
		});
		jButton4.setText("4");
		jButton4.setBounds(new Rectangle(60, 75, 50, 30));
		jButton4.setFont(new Font("Arial", 1, 16));
		jButton4.setForeground(Color.white);
		jButton4.setBackground(Color.black);
		jButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton4_actionPerformed(e);
			}
		});
		jButton5.setText("5");
		jButton5.setBounds(new Rectangle(60, 40, 50, 30));
		jButton5.setFont(new Font("Arial", 1, 16));
		jButton5.setForeground(Color.white);
		jButton5.setBackground(Color.red);
		jButton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton5_actionPerformed(e);
			}
		});
		jButton6.setText("6");
		jButton6.setBounds(new Rectangle(60, 5, 50, 30));
		jButton6.setFont(new Font("Arial", 1, 16));
		jButton6.setForeground(Color.white);
		jButton6.setBackground(Color.black);
		jButton6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton6_actionPerformed(e);
			}
		});
		jButton7.setText("7");
		jButton7.setBounds(new Rectangle(115, 75, 50, 30));
		jButton7.setFont(new Font("Arial", 1, 16));
		jButton7.setForeground(Color.white);
		jButton7.setBackground(Color.red);
		jButton7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton7_actionPerformed(e);
			}
		});
		jButton8.setText("8");
		jButton8.setBounds(new Rectangle(115, 40, 50, 30));
		jButton8.setFont(new Font("Arial", 1, 16));
		jButton8.setForeground(Color.white);
		jButton8.setBackground(Color.black);
		jButton8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton8_actionPerformed(e);
			}
		});
		jButton9.setText("9");
		jButton9.setBounds(new Rectangle(115, 5, 50, 30));
		jButton9.setFont(new Font("Arial", 1, 16));
		jButton9.setForeground(Color.white);
		jButton9.setBackground(Color.red);
		jButton9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton9_actionPerformed(e);
			}
		});
		jButton10.setText("10");
		jButton10.setBounds(new Rectangle(170, 75, 50, 30));
		jButton10.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton10.setForeground(Color.white);
		jButton10.setBackground(Color.black);
		jButton10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton10_actionPerformed(e);
			}
		});
		jButton11.setText("11");
		jButton11.setBounds(new Rectangle(170, 40, 50, 30));
		jButton11.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton11.setForeground(Color.white);
		jButton11.setBackground(Color.black);
		jButton11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton11_actionPerformed(e);
			}
		});
		jButton12.setText("12");
		jButton12.setBounds(new Rectangle(170, 5, 50, 30));
		jButton12.setToolTipText("ll");
		jButton12.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton12.setForeground(Color.white);
		jButton12.setBackground(Color.red);
		jButton12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton12_actionPerformed(e);
			}
		});
		jButton13.setText("13");
		jButton13.setBounds(new Rectangle(240, 75, 50, 30));
		jButton13.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton13.setForeground(Color.white);
		jButton13.setBackground(Color.black);
		jButton13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton13_actionPerformed(e);
			}
		});
		jButton14.setText("14");
		jButton14.setBounds(new Rectangle(240, 40, 50, 30));
		jButton14.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton14.setForeground(Color.white);
		jButton14.setBackground(Color.red);
		jButton14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton14_actionPerformed(e);
			}
		});
		jButton15.setText("15");
		jButton15.setBounds(new Rectangle(240, 5, 50, 30));
		jButton15.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton15.setForeground(Color.white);
		jButton15.setBackground(Color.black);
		jButton15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton15_actionPerformed(e);
			}
		});
		jButton16.setText("16");
		jButton16.setBounds(new Rectangle(295, 75, 50, 30));
		jButton16.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton16.setForeground(Color.white);
		jButton16.setBackground(Color.red);
		jButton16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton16_actionPerformed(e);
			}
		});
		jButton17.setText("17");
		jButton17.setBounds(new Rectangle(295, 40, 50, 30));
		jButton17.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton17.setForeground(Color.white);
		jButton17.setBackground(Color.black);
		jButton17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton17_actionPerformed(e);
			}
		});
		jButton18.setText("18");
		jButton18.setBounds(new Rectangle(295, 5, 50, 30));
		jButton18.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton18.setForeground(Color.white);
		jButton18.setBackground(Color.red);
		jButton18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton18_actionPerformed(e);
			}
		});
		jButton19.setText("19");
		jButton19.setBounds(new Rectangle(350, 75, 50, 30));
		jButton19.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton19.setForeground(Color.white);
		jButton19.setBackground(Color.red);
		jButton19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton19_actionPerformed(e);
			}
		});
		jButton20.setText("20");
		jButton20.setBounds(new Rectangle(350, 40, 50, 30));
		jButton20.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton20.setForeground(Color.white);
		jButton20.setBackground(Color.black);
		jButton20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton20_actionPerformed(e);
			}
		});
		jButton21.setText("21");
		jButton21.setBounds(new Rectangle(350, 5, 50, 30));
		jButton21.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton21.setForeground(Color.white);
		jButton21.setBackground(Color.red);
		jButton21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton21_actionPerformed(e);
			}
		});
		jButton22.setText("22");
		jButton22.setBounds(new Rectangle(405, 75, 50, 30));
		jButton22.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton22.setForeground(Color.white);
		jButton22.setBackground(Color.black);
		jButton22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton22_actionPerformed(e);
			}
		});
		jButton23.setText("23");
		jButton23.setBounds(new Rectangle(405, 40, 50, 30));
		jButton23.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton23.setForeground(Color.white);
		jButton23.setBackground(Color.red);
		jButton23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton23_actionPerformed(e);
			}
		});
		jButton24.setText("24");
		jButton24.setBounds(new Rectangle(405, 5, 50, 30));
		jButton24.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton24.setForeground(Color.white);
		jButton24.setBackground(Color.black);
		jButton24.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton24_actionPerformed(e);
			}
		});
		jButton25.setText("25");
		jButton25.setBounds(new Rectangle(475, 75, 50, 30));
		jButton25.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton25.setForeground(Color.white);
		jButton25.setBackground(Color.red);
		jButton25.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton25_actionPerformed(e);
			}
		});
		jButton26.setText("26");
		jButton26.setBounds(new Rectangle(475, 40, 50, 30));
		jButton26.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton26.setForeground(Color.white);
		jButton26.setBackground(Color.black);
		jButton26.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton26_actionPerformed(e);
			}
		});
		jButton27.setText("27");
		jButton27.setBounds(new Rectangle(475, 5, 50, 30));
		jButton27.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton27.setForeground(Color.white);
		jButton27.setBackground(Color.red);
		jButton27.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton27_actionPerformed(e);
			}
		});
		jButton28.setText("28");
		jButton28.setBounds(new Rectangle(530, 75, 50, 30));
		jButton28.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton28.setForeground(Color.white);
		jButton28.setBackground(Color.black);
		jButton28.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton28_actionPerformed(e);
			}
		});
		jButton29.setText("29");
		jButton29.setBounds(new Rectangle(530, 40, 50, 30));
		jButton29.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton29.setForeground(Color.white);
		jButton29.setBackground(Color.black);
		jButton29.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton29_actionPerformed(e);
			}
		});
		jButton30.setText("30");
		jButton30.setBounds(new Rectangle(530, 5, 50, 30));
		jButton30.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton30.setForeground(Color.white);
		jButton30.setBackground(Color.red);
		jButton30.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton30_actionPerformed(e);
			}
		});
		jButton31.setText("31");
		jButton31.setBounds(new Rectangle(585, 75, 50, 30));
		jButton31.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton31.setForeground(Color.white);
		jButton31.setBackground(Color.black);
		jButton31.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton31_actionPerformed(e);
			}
		});
		jButton32.setText("32");
		jButton32.setBounds(new Rectangle(585, 40, 50, 30));
		jButton32.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton32.setForeground(Color.white);
		jButton32.setBackground(Color.red);
		jButton32.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton32_actionPerformed(e);
			}
		});
		jButton33.setText("33");
		jButton33.setBounds(new Rectangle(585, 5, 50, 30));
		jButton33.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton33.setForeground(Color.white);
		jButton33.setBackground(Color.black);
		jButton33.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton33_actionPerformed(e);
			}
		});
		jButton34.setText("34");
		jButton34.setBounds(new Rectangle(640, 75, 50, 30));
		jButton34.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton34.setForeground(Color.white);
		jButton34.setBackground(Color.red);
		jButton34.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton34_actionPerformed(e);
			}
		});
		jButton35.setText("35");
		jButton35.setBounds(new Rectangle(640, 40, 50, 30));
		jButton35.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton35.setForeground(Color.white);
		jButton35.setBackground(Color.black);
		jButton35.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton35_actionPerformed(e);
			}
		});
		jButton36.setText("36");
		jButton36.setBounds(new Rectangle(640, 5, 50, 30));
		jButton36.setFont(new Font("WenQuanYi Zen Hei Sharp", 1, 12));
		jButton36.setForeground(Color.white);
		jButton36.setBackground(Color.red);
		jButton36.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton36_actionPerformed(e);
			}
		});
		jLabel11.setText("jLabel11");
		jButton37.setEnabled(false);
		jButton37.setText("0");
		jButton37.setBounds(new Rectangle(415, 110, 60, 35));
		jButton37.setFont(new Font("Arial", 0, 12));
		jButton37.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton37_actionPerformed(e);
			}
		});
		jLabel12.setText("0");
		jLabel12.setBounds(new Rectangle(60, 110, 50, 35));
		jLabel12.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel12.setToolTipText("round number");
		jLabel12.setFont(new Font("Arial", 0, 12));
		jButton38.setText("Reset Game");
		jButton38.setBounds(new Rectangle(500, 207, 130, 35));
		jButton38.setFont(new Font("Arial", 0, 12));
		jButton38.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton38_actionPerformed(e);
			}
		});
		jLabel13.setText("jLabel13");
		jLabel13.setBounds(new Rectangle(225, 5, 10, 100));
		jLabel13.setBackground(new Color(33, 33, 255));
		jLabel13.setFont(new Font("Arial", 0, 12));
		jLabel14.setText("jLabel13");
		jLabel14.setBounds(new Rectangle(225, 5, 5, 100));
		jLabel14.setBorder(BorderFactory
				.createEtchedBorder(EtchedBorder.RAISED));
		jLabel14.setBackground(new Color(33, 33, 255));
		jLabel14.setFont(new Font("Arial", 0, 12));
		jLabel15.setText("jLabel13");
		jLabel15.setBounds(new Rectangle(460, 5, 5, 100));
		jLabel15.setBorder(BorderFactory
				.createEtchedBorder(EtchedBorder.RAISED));
		jLabel15.setBackground(new Color(33, 33, 255));
		jLabel15.setFont(new Font("Arial", 0, 12));
		jLabel16.setBounds(new Rectangle(5, 110, 55, 50));
		jLabel16.setFont(new Font("Arial", 1, 38));
		jLabel16.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jTextField2.setToolTipText("Set the number of dice throwing time");
		jTextField2.setBounds(new Rectangle(415, 161, 75, 35));
		jTextField2.setText("500");
		jTextField2.setFont(new Font("Arial", 0, 12));
		jTextField2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jTextField2_actionPerformed(e);
			}
		});
		jButton39.setText("Test");
		jButton39.setBounds(new Rectangle(415, 207, 75, 35));
		jButton39.setFont(new Font("Arial", 0, 12));
		jButton39.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton39_actionPerformed(e);
			}
		});
		jButton40.setEnabled(false);
		jButton40.setText("S");
		jButton40.setBounds(new Rectangle(585, 110, 45, 35));
		jButton40.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton40_actionPerformed(e);
			}
		});
		jButton41.setEnabled(false);
		jButton41.setText("Rever");
		jButton41.setBounds(new Rectangle(480, 110, 95, 35));
		jButton41.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton41_actionPerformed(e);
			}
		});
		jComboBox1.setBounds(new Rectangle(211, 208, 65, 35));
		jComboBox1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jComboBox1_actionPerformed(e);
			}
		});
		jButton42.setText("Next");
		jButton42.setBounds(new Rectangle(305, 208, 70, 35));
		jButton42.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton42_actionPerformed(e);
			}
		});
		jButton43.setText("Prev");
		jButton43.setBounds(new Rectangle(115, 208, 65, 35));
		jButton43.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton43_actionPerformed(e);
			}
		});
		jButton44.setEnabled(false);
		jButton44.setText("0");
		jButton44.setBounds(new Rectangle(360, 110, 55, 35));
		jButton44.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton44_actionPerformed(e);
			}
		});
		jButton45.setEnabled(false);
		jButton45.setText("0");
		jButton45.setBounds(new Rectangle(305, 110, 55, 35));
		jButton45.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton45_actionPerformed(e);
			}
		});
		this.getContentPane().add(jButton45, null);
		this.getContentPane().add(jButton44, null);
		this.getContentPane().add(jButton43, null);
		this.getContentPane().add(jButton42, null);
		this.getContentPane().add(jComboBox1, null);
		this.getContentPane().add(jButton41, null);
		this.getContentPane().add(jButton40, null);
		this.getContentPane().add(jButton39, null);
		this.getContentPane().add(jTextField2, null);
		this.getContentPane().add(jLabel16, null);
		this.getContentPane().add(jLabel15, null);
		this.getContentPane().add(jLabel14, null);
		this.getContentPane().add(jLabel13, null);
		this.getContentPane().add(jButton38, null);
		this.getContentPane().add(jLabel12, null);
		this.getContentPane().add(jButton37, null);
		this.getContentPane().add(jButton36, null);
		this.getContentPane().add(jButton35, null);
		this.getContentPane().add(jButton34, null);
		this.getContentPane().add(jButton33, null);
		this.getContentPane().add(jButton32, null);
		this.getContentPane().add(jButton31, null);
		this.getContentPane().add(jButton30, null);
		this.getContentPane().add(jButton29, null);
		this.getContentPane().add(jButton28, null);
		this.getContentPane().add(jButton27, null);
		this.getContentPane().add(jButton26, null);
		this.getContentPane().add(jButton25, null);
		this.getContentPane().add(jButton24, null);
		this.getContentPane().add(jButton23, null);
		this.getContentPane().add(jButton22, null);
		this.getContentPane().add(jButton21, null);
		this.getContentPane().add(jButton20, null);
		this.getContentPane().add(jButton19, null);
		this.getContentPane().add(jButton18, null);
		this.getContentPane().add(jButton17, null);
		this.getContentPane().add(jButton16, null);
		this.getContentPane().add(jButton15, null);
		this.getContentPane().add(jButton14, null);
		this.getContentPane().add(jButton13, null);
		this.getContentPane().add(jButton12, null);
		this.getContentPane().add(jButton11, null);
		this.getContentPane().add(jButton10, null);
		this.getContentPane().add(jButton9, null);
		this.getContentPane().add(jButton8, null);
		this.getContentPane().add(jButton7, null);
		this.getContentPane().add(jButton6, null);
		this.getContentPane().add(jButton5, null);
		this.getContentPane().add(jButton4, null);
		this.getContentPane().add(jButton3, null);
		this.getContentPane().add(jButton2, null);
		this.getContentPane().add(jButton1, null);
	}

	private void jButton1_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[1] = 0;
		op1();
	}

	private void jButton2_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[2] = 0;
		op2();
	}

	private void jButton3_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[3] = 0;
		op3();
	}

	private void jButton4_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[4] = 0;
		op4();
	}

	private void jButton5_actionPerformed(ActionEvent e) {
		nos[5] = 0;
		op5();
		t++;
		addcount();

	}

	private void jButton6_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[6] = 0;
		op6();
	}

	private void jButton7_actionPerformed(ActionEvent e) {
		op7();
		t++;
		addcount();
		nos[7] = 0;
	}

	private void jButton8_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[8] = 0;
		op8();
	}

	private void jButton9_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[9] = 0;
		op9();
	}

	private void jButton10_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[10] = 0;
		op10();
	}

	private void jButton11_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[11] = 0;
		op11();
	}

	private void jButton12_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[12] = 0;
		op12();
	}

	private void jButton13_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[13] = 0;
		op13();
	}

	private void jButton14_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[14] = 0;
		op14();
	}

	private void jButton15_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[15] = 0;
		op15();
	}

	private void jButton16_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[16] = 0;
		op16();
	}

	private void jButton17_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[17] = 0;
		op17();
	}

	private void jButton18_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[18] = 0;
		op18();
	}

	private void jButton19_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[19] = 0;
		op19();
	}

	private void jButton20_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[20] = 0;
		op20();
	}

	private void jButton21_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[21] = 0;
		op21();
	}

	private void jButton22_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[22] = 0;
		op22();
	}

	private void jButton23_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[23] = 0;
		op23();
	}

	private void jButton24_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[24] = 0;
		op24();
	}

	private void jButton25_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[25] = 0;
		op25();
	}

	private void jButton26_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[26] = 0;
		op26();
	}

	private void jButton27_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[27] = 0;
		op27();
	}

	private void jButton28_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[28] = 0;
		op28();
	}

	private void jButton29_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[29] = 0;
		op29();
	}

	private void jButton30_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[30] = 0;
		op30();
	}

	private void jButton31_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[31] = 0;
		op31();
	}

	private void jButton32_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[32] = 0;
		op32();
	}

	private void jButton33_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[33] = 0;
		op33();
	}

	private void jButton34_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[34] = 0;
		op34();
	}

	private void jButton35_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[35] = 0;
		op35();
	}

	private void jButton36_actionPerformed(ActionEvent e) {

		t++;
		addcount();
		nos[36] = 0;
		op36();
	}

	private void op1() {
		redop();
		oddop();
		half118op();
		f12op();
		fgroupop();
		ids[0] = 3;
		ids[1] = 2;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 10;
		jLabel16.setText("1");
		nss[1]++;
		coolno();
	}

	private void op2() {
		blackop();
		evenop();
		half118op();
		f12op();
		sgroupop();
		ids[0] = 4;
		ids[1] = 1;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 11;
		jLabel16.setText("2");
		nss[2]++;
		coolno();
	}

	private void op3() {
		redop();
		oddop();
		half118op();
		f12op();
		tgroupop();
		ids[0] = 3;
		ids[1] = 2;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 12;
		jLabel16.setText("3");
		nss[3]++;
		coolno();
	}

	private void op4() {
		blackop();
		evenop();
		half118op();
		f12op();
		fgroupop();
		ids[0] = 4;
		ids[1] = 1;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 10;
		jLabel16.setText("4");
		nss[4]++;
		coolno();
	}

	private void op5() {
		redop();
		oddop();
		half118op();
		f12op();
		sgroupop();
		ids[0] = 3;
		ids[1] = 2;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 11;
		jLabel16.setText("5");
		nss[5]++;
		coolno();
	}

	private void op6() {
		blackop();
		evenop();
		half118op();
		f12op();
		tgroupop();
		ids[0] = 4;
		ids[1] = 1;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 12;
		jLabel16.setText("6");
		nss[6]++;
		coolno();
	}

	private void op7() {
		redop();
		oddop();
		half118op();
		f12op();
		fgroupop();
		ids[0] = 3;
		ids[1] = 2;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 10;
		jLabel16.setText("7");
		nss[7]++;
		coolno();
	}

	private void op8() {
		blackop();
		evenop();
		half118op();
		f12op();
		sgroupop();
		ids[0] = 8;
		ids[1] = 1;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 11;
		jLabel16.setText("8");
		nss[8]++;
		coolno();
	}

	private void op9() {
		redop();
		oddop();
		half118op();
		f12op();
		tgroupop();
		ids[0] = 3;
		ids[1] = 2;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 12;
		jLabel16.setText("9");
		nss[9]++;
		coolno();
	}

	private void op10() {
		blackop();
		evenop();
		half118op();
		f12op();
		fgroupop();
		ids[0] = 4;
		ids[1] = 1;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 10;
		jLabel16.setText("10");
		nss[10]++;
		coolno();
	}

	private void op11() {
		blackop();
		oddop();
		half118op();
		f12op();
		sgroupop();
		ids[0] = 4;
		ids[1] = 2;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 11;
		jLabel16.setText("11");
		nss[11]++;
		coolno();
	}

	private void op12() {
		redop();
		evenop();
		half118op();
		f12op();
		tgroupop();
		ids[0] = 3;
		ids[1] = 1;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 12;
		jLabel16.setText("12");
		nss[12]++;
		coolno();
	}

	private void op13() {
		blackop();
		oddop();
		half118op();
		s12op();
		fgroupop();
		ids[0] = 4;
		ids[1] = 2;
		ids[2] = 6;
		ids[3] = 8;
		ids[4] = 10;
		jLabel16.setText("13");
		nss[13]++;
		coolno();
	}

	private void op14() {
		redop();
		evenop();
		half118op();
		s12op();
		sgroupop();
		ids[0] = 3;
		ids[1] = 1;
		ids[2] = 6;
		ids[3] = 8;
		ids[4] = 11;
		jLabel16.setText("14");
		nss[14]++;
		coolno();
	}

	private void op15() {
		blackop();
		oddop();
		half118op();
		s12op();
		tgroupop();
		ids[0] = 4;
		ids[1] = 2;
		ids[2] = 6;
		ids[3] = 8;
		ids[4] = 12;
		jLabel16.setText("15");
		nss[15]++;
		coolno();
	}

	private void op16() {
		redop();
		evenop();
		half118op();
		s12op();
		fgroupop();
		ids[0] = 3;
		ids[1] = 1;
		ids[2] = 6;
		ids[3] = 8;
		ids[4] = 10;
		jLabel16.setText("16");
		nss[16]++;
		coolno();
	}

	private void op17() {
		blackop();
		oddop();
		half118op();
		s12op();
		sgroupop();
		ids[0] = 4;
		ids[1] = 2;
		ids[2] = 6;
		ids[3] = 7;
		ids[4] = 11;
		jLabel16.setText("17");
		nss[17]++;
		coolno();
	}

	private void op18() {
		redop();
		evenop();
		half118op();
		s12op();
		tgroupop();
		ids[0] = 3;
		ids[1] = 1;
		ids[2] = 6;
		ids[3] = 8;
		ids[4] = 12;
		jLabel16.setText("18");
		nss[18]++;
		coolno();
	}

	private void op19() {
		redop();
		oddop();
		half1936op();
		s12op();
		fgroupop();
		ids[0] = 3;
		ids[1] = 2;
		ids[2] = 5;
		ids[3] = 8;
		ids[4] = 10;
		jLabel16.setText("19");
		nss[19]++;
		coolno();
	}

	private void op20() {
		blackop();
		evenop();
		half1936op();
		s12op();
		sgroupop();
		ids[0] = 4;
		ids[1] = 1;
		ids[2] = 5;
		ids[3] = 8;
		ids[4] = 11;
		jLabel16.setText("20");
		nss[20]++;
		coolno();
	}

	private void op21() {
		redop();
		oddop();
		half1936op();
		s12op();
		tgroupop();
		ids[0] = 3;
		ids[1] = 2;
		ids[2] = 5;
		ids[3] = 8;
		ids[4] = 12;
		jLabel16.setText("21");
		nss[21]++;
		coolno();
	}

	private void op22() {
		blackop();
		evenop();
		half1936op();
		s12op();
		fgroupop();
		ids[0] = 4;
		ids[1] = 1;
		ids[2] = 5;
		ids[3] = 8;
		ids[4] = 10;
		jLabel16.setText("22");
		nss[22]++;
		coolno();
	}

	private void op23() {
		redop();
		oddop();
		half1936op();
		s12op();
		sgroupop();
		ids[0] = 3;
		ids[1] = 2;
		ids[2] = 5;
		ids[3] = 8;
		ids[4] = 11;
		jLabel16.setText("23");
		nss[23]++;
		coolno();
	}

	private void op24() {
		blackop();
		evenop();
		half1936op();
		s12op();
		tgroupop();
		ids[0] = 4;
		ids[1] = 1;
		ids[2] = 5;
		ids[3] = 8;
		ids[4] = 12;
		jLabel16.setText("24");
		nss[24]++;
		coolno();
	}

	private void op25() {
		redop();
		oddop();
		half1936op();
		t12op();
		fgroupop();
		ids[0] = 3;
		ids[1] = 2;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 10;
		jLabel16.setText("25");
		nss[25]++;
		coolno();
	}

	private void op26() {
		blackop();
		evenop();
		half1936op();
		t12op();
		sgroupop();
		ids[0] = 4;
		ids[1] = 1;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 11;
		jLabel16.setText("26");
		nss[26]++;
		coolno();
	}

	private void op27() {
		redop();
		oddop();
		half1936op();
		t12op();
		tgroupop();
		ids[0] = 3;
		ids[1] = 2;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 12;
		jLabel16.setText("27");
		nss[27]++;
		coolno();
	}

	private void op28() {
		blackop();
		evenop();
		half1936op();
		t12op();
		fgroupop();
		ids[0] = 4;
		ids[1] = 1;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 10;
		jLabel16.setText("28");
		nss[28]++;
		coolno();
	}

	private void op29() {
		blackop();
		oddop();
		half1936op();
		t12op();
		sgroupop();
		ids[0] = 4;
		ids[1] = 2;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 11;
		jLabel16.setText("29");
		nss[29]++;
		coolno();
	}

	private void op30() {
		redop();
		evenop();
		half1936op();
		t12op();
		tgroupop();
		ids[0] = 3;
		ids[1] = 1;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 12;
		jLabel16.setText("30");
		nss[30]++;
		coolno();
	}

	private void op31() {
		blackop();
		oddop();
		half1936op();
		t12op();
		fgroupop();
		ids[0] = 4;
		ids[1] = 2;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 10;
		jLabel16.setText("31");
		nss[31]++;
		coolno();
	}

	private void op32() {
		redop();
		evenop();
		half1936op();
		t12op();
		sgroupop();
		ids[0] = 3;
		ids[1] = 1;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 11;
		jLabel16.setText("32");
		nss[32]++;
		coolno();
	}

	private void op33() {
		blackop();
		oddop();
		half1936op();
		t12op();
		tgroupop();
		ids[0] = 4;
		ids[1] = 2;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 12;
		jLabel16.setText("33");
		nss[33]++;
		coolno();
	}

	private void op34() {
		redop();
		evenop();
		half1936op();
		t12op();
		fgroupop();
		ids[0] = 3;
		ids[1] = 1;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 10;
		jLabel16.setText("34");
		nss[34]++;
		coolno();
	}

	private void op35() {
		blackop();
		oddop();
		half1936op();
		t12op();
		sgroupop();
		ids[0] = 4;
		ids[1] = 2;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 11;
		jLabel16.setText("35");
		nss[35]++;
		coolno();
	}

	private void op36() {
		redop();
		evenop();
		half1936op();
		t12op();
		tgroupop();
		ids[0] = 3;
		ids[1] = 1;
		ids[2] = 5;
		ids[3] = 9;
		ids[4] = 12;
		jLabel16.setText("36");
		nss[36]++;
		coolno();
	}

	private double getave(double value, int group) {

		double[] tems = new double[100];
		double item = 0;
		for (int i = 0; i < 99; i++) {
			tems[i + 1] = aves[group][i];
			item = item + aves[group][i];
		}
		tems[0] = value;

		for (int i = 0; i < 100; i++) {
			aves[group][i] = tems[i];
		}
		item = item + value;
		item = item / 100;
		if (round <= 100) {
			item = 0;
			for (int i = 0; i < round; i++)
				item = item + aves[group][i];
			item = item / round;
		}

		return getSSWR(item);

	}

	private double getsave(double value, int group) {

		double[] tems = new double[10];
		double item = 0;
		for (int i = 0; i < 9; i++) {
			tems[i + 1] = saves[group][i];
			item = item + saves[group][i];
		}
		tems[0] = value;

		for (int i = 0; i < 10; i++) {
			saves[group][i] = tems[i];
		}
		item = item + value;
		item = item / 10;
		if (round <= 10) {
			item = 0;
			for (int i = 0; i < round; i++)
				item = item + saves[group][i];
			item = item / round;
		}

		return getSSWR(item);

	}

	private double getSSWR(double value) {

		double v = Math.round(10000 * value) / 10000.0;
		return v;
	}

	private void op0() {
		round++;
		sb = sb + 0.5;
		nos[0] = 0;
		cal();
		op();
		jButton37.setText("" + zero);
		jLabel16.setText("0");
		jLabel12.setText("" + round);
		nss[0]++;
		coolno();
	}

	private void jButton37_actionPerformed(ActionEvent e) {
		zero++;

		op0();

		//avchart.setdata2(getave(evens, 1), t);
		//avchart.setdata(getave(rr, 0), t);
		//avchart.setdata3(getave(uhs, 2), t);

		//avchart.setdata4(getsave(evens, 1), t);
		//avchart.setdata5(getsave(rr, 0), t);
		//avchart.setdata6(getsave(uhs, 2), t);
		// evens+"["+(evenmmax-evens)+"]["+(evens-evenmmin)+"]"+"  Even");

		// tchart.setdata(f12s, t);
		// tchart.setdata2(s12s, t);
		// tchart.setdata3(t12s, t);

		//fchart.setdata5(odds, t);
		//fchart.setdata4(bb, t);
		//fchart.setdata6(lhs, t);

		//fchart.setdata2(evens, t);
		//fchart.setdata(rr, t);
		//fchart.setdata3(uhs, t);
		// //fchart.setID("Red,Even,19-36");//evens+"["+(evenmmax-evens)+"]["+(evens-evenmmin)+"]"+"  Even");

		monitor.jLabel1.setText("Even: " + evens + "[" + (evenmmax - evens)
				+ "][" + (evens - evenmmin) + "][" + elen + "]");
		monitor.jLabel3.setText("Odd: " + odds + "[" + (oddmmax - odds) + "]["
				+ (odds - oddmmin) + "][" + olen + "]");
		monitor.jLabel2.setText("Red: " + rr + "[" + (rmmax - rr) + "]["
				+ (rr - rmmin) + "][" + rlen + "]");
		monitor.jLabel4.setText("Black: " + bb + "[" + (bmmax - bb) + "]["
				+ (bb - bmmin) + "][" + blen + "]");
		monitor.jLabel5.setText("19_36: " + uhs + "[" + (uhmmax - uhs) + "]["
				+ (uhs - uhmmin) + "][" + ulen + "]");
		monitor.jLabel7.setText("1-18: " + lhs + "[" + (lhmmax - lhs) + "]["
				+ (lhs - lhmmin) + "][" + llen + "]");
		monitor.jLabel6.setText("12s: [" + f12i + "][" + s12i + "][" + t12i
				+ "]");
		monitor.jLabel8.setText("Gs: [" + fgi + "][" + sgi + "][" + tgi + "]");

		t++;
	}

	private void reset() {

		jLabel16.setText("");
		sortmax = 0;
		beisum = 0;
		same = -1;
		samerepeat = 0;
		temsum = 0;
		rrep = 0;
		even = 0;
		odd = 0;
		r = 0;
		b = 0;
		rb = 0;
		lh = 0;
		uh = 0;
		lu = 0;
		f12 = 0;
		s12 = 0;
		t12 = 0;
		fg = 0;
		sg = 0;
		tg = 0;
		round = 0;
		evenodd = 0;
		evenodd_max = 0;
		evenodd_min = 0;
		evenodd_m_max = 0;
		evenodd_m_min = 0;
		evenodd_repeat = 0;
		zero = 0;
		rr = 0;
		bb = 0;
		evens = 0;
		odds = 0;
		lhs = 0;
		uhs = 0;
		fgs = 0;
		sgs = 0;
		tgs = 0;
		f12s = 0;
		s12s = 0;
		t12s = 0;

		rmax = 0;
		rmin = 0;
		rmmax = 0;
		rmmin = 0;
		bmax = 0;
		bmin = 0;
		bmmax = 0;
		bmmin = 0;

		uhmax = 0;
		uhmin = 0;
		uhmmax = 0;
		uhmmin = 0;
		lhmax = 0;
		lhmin = 0;
		lhmmax = 0;
		lhmmin = 0;

		oddmax = 0;
		oddmin = 0;
		oddmmax = 0;
		oddmmin = 0;
		evenmax = 0;
		evenmin = 0;
		evenmmax = 0;
		evenmmin = 0;

		jButton37.setText("0");
		// bjchart.setVisible(true);
		sb = 0;
		t = 0;
		//fchart.clearall();
		bjchart.clearall();
		// schart.clearall();
		genchart.clearall();
		//avchart.clearall();
		for (int i = 0; i < nos.length; i++)
			nos[i] = 0;

		for (int i = 0; i < maxdist.length; i++)
			maxdist[i] = 0;

	}

	private void jButton38_actionPerformed(ActionEvent e) {
		reset();
	}

	private void selectop(int no) {
		addcount();
		switch (no) {
		case 0:

			if (nos[0] >= 150)
				maxdist[selectgroup(nos[0])]++;
			nos[0] = 0;
			splitbet[0] = 0;
			splitbet[1] = 0;
			splitbet[2] = 0;
			fbox[0] = 0;
			op0();

			break;
		case 1:
			if (nos[1] >= 150)
				maxdist[selectgroup(nos[1])]++;
			nos[1] = 0;
			splitbet[0] = 0;
			splitbet[3] = 0;
			splitbet[27] = 0;
			trows[0] = 0;
			fbox[0] = 0;
			fbox[1] = 0;
			sboxs[0] = 0;
			op1();
			break;
		case 2:
			if (nos[2] >= 150)
				maxdist[selectgroup(nos[2])]++;

			nos[2] = 0;
			splitbet[1] = 0;
			splitbet[3] = 0;
			splitbet[4] = 0;
			splitbet[28] = 0;
			trows[0] = 0;
			fbox[0] = 0;
			fbox[1] = 0;
			fbox[2] = 0;
			sboxs[0] = 0;

			op2();
			break;
		case 3:
			if (nos[3] >= 150)
				maxdist[selectgroup(nos[3])]++;
			nos[3] = 0;

			splitbet[2] = 0;

			splitbet[4] = 0;
			splitbet[29] = 0;
			trows[0] = 0;
			fbox[0] = 0;

			fbox[2] = 0;
			sboxs[0] = 0;

			op3();
			break;
		case 4:
			if (nos[4] >= 150)
				maxdist[selectgroup(nos[4])]++;

			splitbet[5] = 0;
			splitbet[30] = 0;
			splitbet[27] = 0;

			trows[1] = 0;

			fbox[3] = 0;
			fbox[1] = 0;

			sboxs[0] = 0;
			sboxs[1] = 0;

			nos[4] = 0;
			op4();
			break;
		case 5:
			if (nos[5] >= 150)
				maxdist[selectgroup(nos[5])]++;
			nos[5] = 0;

			splitbet[31] = 0;
			splitbet[5] = 0;
			splitbet[6] = 0;
			splitbet[28] = 0;

			trows[1] = 0;

			fbox[3] = 0;
			fbox[4] = 0;
			fbox[1] = 0;
			fbox[2] = 0;

			sboxs[0] = 0;
			sboxs[1] = 0;

			op5();
			break;
		case 6:
			if (nos[6] >= 150)
				maxdist[selectgroup(nos[6])]++;

			splitbet[32] = 0;
			splitbet[6] = 0;
			splitbet[29] = 0;

			trows[1] = 0;

			fbox[4] = 0;
			fbox[2] = 0;

			sboxs[0] = 0;
			sboxs[1] = 0;

			nos[6] = 0;
			op6();
			break;
		case 7:
			if (nos[7] >= 150)
				maxdist[selectgroup(nos[7])]++;

			splitbet[33] = 0;
			splitbet[7] = 0;
			splitbet[30] = 0;

			trows[2] = 0;

			fbox[3] = 0;
			fbox[5] = 0;

			sboxs[1] = 0;
			sboxs[2] = 0;

			nos[7] = 0;
			op7();
			break;
		case 8:
			if (nos[8] >= 150)
				maxdist[selectgroup(nos[8])]++;

			splitbet[31] = 0;
			splitbet[7] = 0;
			splitbet[8] = 0;
			splitbet[34] = 0;

			trows[2] = 0;

			fbox[3] = 0;
			fbox[4] = 0;
			fbox[6] = 0;
			fbox[5] = 0;

			sboxs[1] = 0;
			sboxs[2] = 0;

			nos[8] = 0;
			op8();
			break;
		case 9:
			if (nos[9] >= 150)
				maxdist[selectgroup(nos[9])]++;

			splitbet[32] = 0;
			splitbet[8] = 0;
			splitbet[35] = 0;

			trows[2] = 0;

			fbox[6] = 0;
			fbox[4] = 0;

			sboxs[1] = 0;
			sboxs[2] = 0;

			nos[9] = 0;
			op9();
			break;

		case 10:
			if (nos[10] >= 150)
				maxdist[selectgroup(nos[10])]++;

			splitbet[33] = 0;
			splitbet[9] = 0;
			splitbet[36] = 0;

			trows[3] = 0;

			fbox[5] = 0;
			fbox[7] = 0;

			sboxs[3] = 0;
			sboxs[2] = 0;

			nos[10] = 0;
			op10();
			break;
		case 11:
			if (nos[11] >= 150)
				maxdist[selectgroup(nos[11])]++;

			splitbet[37] = 0;
			splitbet[9] = 0;
			splitbet[10] = 0;
			splitbet[34] = 0;

			trows[3] = 0;

			fbox[7] = 0;
			fbox[8] = 0;
			fbox[6] = 0;
			fbox[5] = 0;

			sboxs[3] = 0;
			sboxs[2] = 0;

			nos[11] = 0;
			op11();
			break;
		case 12:
			if (nos[12] >= 150)
				maxdist[selectgroup(nos[12])]++;

			splitbet[35] = 0;
			splitbet[10] = 0;
			splitbet[38] = 0;

			trows[3] = 0;

			fbox[6] = 0;
			fbox[8] = 0;

			sboxs[3] = 0;
			sboxs[2] = 0;

			nos[12] = 0;
			op12();
			break;
		case 13:
			if (nos[13] >= 150)
				maxdist[selectgroup(nos[13])]++;

			splitbet[39] = 0;
			splitbet[11] = 0;
			splitbet[36] = 0;

			fbox[9] = 0;
			fbox[7] = 0;

			trows[4] = 0;
			sboxs[3] = 0;
			sboxs[4] = 0;

			nos[13] = 0;
			op13();
			break;
		case 14:
			if (nos[14] >= 150)
				maxdist[selectgroup(nos[14])]++;

			splitbet[37] = 0;
			splitbet[11] = 0;
			splitbet[12] = 0;
			splitbet[40] = 0;

			fbox[7] = 0;
			fbox[8] = 0;
			fbox[9] = 0;
			fbox[10] = 0;

			trows[4] = 0;
			sboxs[3] = 0;
			sboxs[4] = 0;

			nos[14] = 0;
			op14();
			break;
		case 15:
			if (nos[15] >= 150)
				maxdist[selectgroup(nos[15])]++;

			splitbet[38] = 0;
			splitbet[12] = 0;
			splitbet[41] = 0;

			fbox[8] = 0;
			fbox[10] = 0;

			trows[4] = 0;
			sboxs[3] = 0;
			sboxs[4] = 0;

			nos[15] = 0;
			op15();
			break;
		case 16:
			if (nos[16] >= 150)
				maxdist[selectgroup(nos[16])]++;

			splitbet[39] = 0;
			splitbet[13] = 0;
			splitbet[42] = 0;

			fbox[9] = 0;
			fbox[11] = 0;

			trows[5] = 0;
			sboxs[5] = 0;
			sboxs[4] = 0;

			nos[16] = 0;
			op16();
			break;
		case 17:
			if (nos[17] >= 150)
				maxdist[selectgroup(nos[17])]++;

			splitbet[13] = 0;
			splitbet[14] = 0;
			splitbet[40] = 0;
			splitbet[43] = 0;

			fbox[9] = 0;
			fbox[10] = 0;
			fbox[11] = 0;
			fbox[12] = 0;

			trows[5] = 0;
			sboxs[5] = 0;
			sboxs[4] = 0;

			nos[17] = 0;
			op17();
			break;
		case 18:
			if (nos[18] >= 150)
				maxdist[selectgroup(nos[18])]++;

			splitbet[14] = 0;
			splitbet[41] = 0;
			splitbet[44] = 0;

			fbox[10] = 0;
			fbox[12] = 0;

			trows[5] = 0;
			sboxs[5] = 0;
			sboxs[4] = 0;

			nos[18] = 0;
			op18();
			break;
		case 19:
			if (nos[19] >= 150)
				maxdist[selectgroup(nos[19])]++;

			splitbet[15] = 0;
			splitbet[42] = 0;
			splitbet[45] = 0;

			fbox[11] = 0;
			fbox[13] = 0;

			trows[6] = 0;
			sboxs[5] = 0;
			sboxs[6] = 0;

			nos[19] = 0;
			op19();
			break;
		case 20:
			if (nos[20] >= 150)
				maxdist[selectgroup(nos[20])]++;

			splitbet[15] = 0;
			splitbet[16] = 0;
			splitbet[43] = 0;
			splitbet[46] = 0;

			fbox[11] = 0;
			fbox[12] = 0;
			fbox[13] = 0;
			fbox[14] = 0;

			trows[6] = 0;
			sboxs[5] = 0;
			sboxs[6] = 0;

			nos[20] = 0;
			op20();
			break;
		case 21:
			if (nos[21] >= 150)
				maxdist[selectgroup(nos[21])]++;

			splitbet[16] = 0;
			splitbet[44] = 0;
			splitbet[47] = 0;

			fbox[12] = 0;
			fbox[14] = 0;

			trows[6] = 0;
			sboxs[5] = 0;
			sboxs[6] = 0;

			nos[21] = 0;
			op21();
			break;
		case 22:
			if (nos[22] >= 150)
				maxdist[selectgroup(nos[22])]++;

			splitbet[17] = 0;
			splitbet[45] = 0;
			splitbet[48] = 0;

			fbox[13] = 0;
			fbox[15] = 0;

			trows[7] = 0;
			sboxs[7] = 0;
			sboxs[6] = 0;

			nos[22] = 0;
			op22();
			break;
		case 23:
			if (nos[23] >= 150)
				maxdist[selectgroup(nos[23])]++;
			splitbet[46] = 0;
			splitbet[17] = 0;
			splitbet[18] = 0;
			splitbet[49] = 0;

			fbox[13] = 0;
			fbox[14] = 0;
			fbox[16] = 0;
			fbox[15] = 0;

			trows[7] = 0;
			sboxs[7] = 0;
			sboxs[6] = 0;

			nos[23] = 0;
			op23();
			break;
		case 24:
			if (nos[24] >= 150)
				maxdist[selectgroup(nos[24])]++;

			splitbet[18] = 0;
			splitbet[47] = 0;
			splitbet[50] = 0;

			fbox[5] = 0;
			fbox[7] = 0;

			trows[7] = 0;
			sboxs[7] = 0;
			sboxs[6] = 0;

			nos[24] = 0;
			op24();
			break;
		case 25:
			if (nos[25] >= 150)
				maxdist[selectgroup(nos[25])]++;

			splitbet[19] = 0;
			splitbet[48] = 0;
			splitbet[51] = 0;

			fbox[15] = 0;
			fbox[17] = 0;

			trows[8] = 0;
			sboxs[7] = 0;
			sboxs[8] = 0;

			nos[25] = 0;
			op25();
			break;
		case 26:
			if (nos[26] >= 150)
				maxdist[selectgroup(nos[26])]++;
			splitbet[19] = 0;
			splitbet[20] = 0;
			splitbet[49] = 0;
			splitbet[52] = 0;

			fbox[17] = 0;
			fbox[18] = 0;
			fbox[16] = 0;
			fbox[15] = 0;

			trows[8] = 0;
			sboxs[7] = 0;
			sboxs[8] = 0;

			nos[26] = 0;
			op26();
			break;
		case 27:
			if (nos[27] >= 150)
				maxdist[selectgroup(nos[27])]++;

			splitbet[20] = 0;
			splitbet[50] = 0;
			splitbet[52] = 0;

			fbox[16] = 0;
			fbox[18] = 0;

			trows[8] = 0;
			sboxs[7] = 0;
			sboxs[8] = 0;

			nos[27] = 0;
			op27();
			break;
		case 28:
			if (nos[28] >= 150)
				maxdist[selectgroup(nos[28])]++;

			splitbet[21] = 0;
			splitbet[51] = 0;
			splitbet[54] = 0;

			fbox[19] = 0;
			fbox[17] = 0;

			trows[9] = 0;
			sboxs[9] = 0;
			sboxs[8] = 0;

			nos[28] = 0;
			op28();
			break;
		case 29:
			if (nos[29] >= 150)
				maxdist[selectgroup(nos[29])]++;

			splitbet[21] = 0;
			splitbet[22] = 0;
			splitbet[52] = 0;
			splitbet[55] = 0;

			fbox[17] = 0;
			fbox[18] = 0;
			fbox[19] = 0;
			fbox[20] = 0;

			trows[9] = 0;
			sboxs[9] = 0;
			sboxs[8] = 0;

			nos[29] = 0;
			op29();
			break;
		case 30:
			if (nos[30] >= 150)
				maxdist[selectgroup(nos[30])]++;

			splitbet[22] = 0;
			splitbet[53] = 0;
			splitbet[56] = 0;

			fbox[18] = 0;
			fbox[20] = 0;

			trows[9] = 0;
			sboxs[9] = 0;
			sboxs[8] = 0;

			nos[30] = 0;
			op30();
			break;
		case 31:
			if (nos[31] >= 150)
				maxdist[selectgroup(nos[31])]++;

			splitbet[23] = 0;
			splitbet[54] = 0;
			splitbet[57] = 0;

			fbox[19] = 0;
			fbox[21] = 0;

			trows[10] = 0;
			sboxs[9] = 0;
			sboxs[10] = 0;

			nos[31] = 0;
			op31();
			break;
		case 32:
			if (nos[32] >= 150)
				maxdist[selectgroup(nos[32])]++;

			splitbet[23] = 0;
			splitbet[24] = 0;
			splitbet[55] = 0;
			splitbet[58] = 0;

			fbox[19] = 0;
			fbox[20] = 0;
			fbox[21] = 0;
			fbox[22] = 0;

			trows[10] = 0;
			sboxs[9] = 0;
			sboxs[10] = 0;

			nos[32] = 0;
			op32();
			break;
		case 33:
			if (nos[33] >= 150)
				maxdist[selectgroup(nos[33])]++;
			splitbet[24] = 0;
			splitbet[56] = 0;
			splitbet[59] = 0;

			fbox[20] = 0;
			fbox[22] = 0;

			trows[10] = 0;
			sboxs[9] = 0;
			sboxs[10] = 0;

			nos[33] = 0;
			op33();
			break;
		case 34:
			if (nos[34] >= 150)
				maxdist[selectgroup(nos[34])]++;

			splitbet[25] = 0;
			splitbet[57] = 0;

			fbox[21] = 0;

			trows[11] = 0;
			sboxs[10] = 0;

			nos[34] = 0;
			op34();
			break;
		case 35:
			if (nos[35] >= 150)
				maxdist[selectgroup(nos[35])]++;

			splitbet[25] = 0;
			splitbet[26] = 0;
			splitbet[58] = 0;

			fbox[21] = 0;
			fbox[22] = 0;

			trows[11] = 0;

			sboxs[10] = 0;

			nos[35] = 0;
			op35();
			break;
		case 36:
			if (nos[36] >= 150)
				maxdist[selectgroup(nos[36])]++;

			splitbet[26] = 0;
			splitbet[59] = 0;

			fbox[22] = 0;

			trows[11] = 0;
			sboxs[10] = 0;

			nos[36] = 0;
			op36();
			break;
		}
	}

	private void test() {
		Random rd = new Random();
		int tem0 = 0;
		t = 0;
		sb = 0;
		round = 0;
		wl = 0;
		reset();
		// System.out.println(bjchart.getItemCount(1));
		while (t < Integer.parseInt(jTextField2.getText())) {

			tem0 = rd.nextInt(37);
			selectop(tem0);
			t++;
			for (int i = 0; i < bets.length; i++) {
				if (bets[i] == tem0) {
					// System.out.println(tem0+"=+35");
					wl = wl + 35;
					System.out
							.println("OO=" + wl + "  " + bets[i] + "," + tem0);
				} else {
					// System.out.println(tem0+"=-1");
					wl = wl - 1;
					System.out
							.println("WL=" + wl + "  " + bets[i] + "," + tem0);
				}

			}

		}
		// System.out.println(getSSWR(sb*1.0/round*100.0)+" ?");
		// for(int i=0;i<maxdist.length;i++){
		// System.out.println(i+" ="+maxdist[i]);
		// }
		jButton42.doClick();
		System.out.println("WL.End=" + wl);
	}

	private void jButton39_actionPerformed(ActionEvent e) {
		reset();

		test();
		bjchart.setVisibe();
	}

	private void jTextField2_actionPerformed(ActionEvent e) {
		Random r = new Random();
		int ti = r.nextInt(37);
		selectop(ti);

		t++;
	}

	private void jButton40_actionPerformed(ActionEvent e) {
		bjchart.setVisibe();
		//fchart.setVisibe();
		// schart.setVisibe();
		//avchart.setVisibe();
		monitor.setVisible(true);
	}

	private void getMax() {
		double maxs = Math.max((evenmmax - evens), (evens - evenmmin));
		maxs = Math.max(maxs, (odds - oddmmin));
		maxs = Math.max((oddmmax - odds), maxs);
		maxs = Math.max(maxs, (rr - rmmin));
		maxs = Math.max((rmmax - rr), maxs);
		maxs = Math.max(maxs, (bb - bmmin));
		maxs = Math.max((bmmax - bb), maxs);
		maxs = Math.max(maxs, (lhs - lhmmin));
		maxs = Math.max((lhmmax - lhs), maxs);
		maxs = Math.max(maxs, (uhs - uhmmin));
		maxs = Math.max((uhmmax - uhs), maxs);
		int n3s = Math.max(f12i, s12i);
		n3s = Math.max(n3s, t12i);
		n3s = Math.max(n3s, fgi);
		n3s = Math.max(n3s, sgi);
		n3s = Math.max(n3s, tgi);

		monitor.jLabel9.setText("1In2: " + maxs);
		monitor.jLabel10.setText("1In3: " + n3s);

	}

	private void sort() {
		int[] copy = new int[37];
		for (int i = 0; i < orders.length; i++)
			orders[i] = i;

		for (int i = 0; i < nos.length; i++) {
			copy[i] = nos[i];
		}
		for (int i = 0; i < copy.length; i++) {
			for (int j = 1; j < copy.length; j++) {
				if (copy[j] < copy[j - 1]) {
					int temp = copy[j];
					int temp2 = orders[j];
					copy[j] = copy[j - 1];
					copy[j - 1] = temp;

					orders[j] = orders[j - 1];
					orders[j - 1] = temp2;
				}
			}
		}

		if (nos[orders[36]] > sortmax) {
			sortmax = nos[orders[36]];
		}

		// if(nos[orders[36]]>100 && nos[orders[35]]>100){// &&
		// nos[orders[34]]>150 && nos[orders[33]]>150){
		// if(same==-1)
		// same=orders[36]+orders[35]*100;
		// if(orders[36]+orders[35]*100==same)
		// samerepeat++;
		// else{
		// System.out.println(orders[36]+" "+orders[35]+"  ="+samerepeat);//+" "+orders[34]+" "+orders[33]);
		// same=-1;
		// temsum=temsum+samerepeat;
		// rrep++;
		// samerepeat=0;
		// }
		// }

		monitor.jLabel11.setText("" + orders[36] + ":" + nos[orders[36]]);
		monitor.jLabel12.setText("" + orders[35] + ":" + nos[orders[35]]);
		monitor.jLabel13.setText("" + orders[34] + ":" + nos[orders[34]]);
		monitor.jLabel14.setText("" + orders[33] + ":" + nos[orders[33]]);
		monitor.jLabel15.setText("" + orders[32] + ":" + nos[orders[32]]);
		monitor.jLabel16.setText("" + orders[31] + ":" + nos[orders[31]]);
		// if(nos[orders[36]]>200)
		// System.out.println(nos[orders[36]]);
	}

	private int selectgroup(int e) {
		if (e < 279) {
			beisum = beisum + getpay(e - 150);
		} else if (e >= 279) {
			beisum = beisum - 2731;
		}

		if (e >= 100 && e < 110)
			return 0;
		else if (e >= 110 && e < 120)
			return 1;
		else if (e >= 120 && e < 130)
			return 2;
		else if (e >= 130 && e < 140)
			return 3;
		else if (e >= 140 && e < 150)
			return 4;
		else if (e >= 150 && e < 160)
			return 5;
		else if (e >= 160 && e < 170)
			return 6;
		else if (e >= 170 && e < 180)
			return 7;
		else if (e >= 180 && e < 190)
			return 8;
		else if (e >= 190 && e < 200)
			return 9;
		else if (e >= 200 && e < 210)
			return 10;
		else if (e >= 210 && e < 220)
			return 11;
		else if (e >= 220 && e < 230)
			return 12;
		else if (e >= 230 && e < 240)
			return 13;
		else if (e >= 240 && e < 250)
			return 14;
		else if (e >= 250 && e < 260)
			return 15;
		else if (e >= 260 && e < 270)
			return 16;
		else if (e >= 270 && e < 280)
			return 17;
		else if (e >= 280 && e < 290)
			return 18;
		else if (e >= 290 && e < 300)
			return 19;
		else if (e >= 300 && e < 310)
			return 20;
		else if (e >= 310)
			return 21;

		return -1;
	}

	private void jButton41_actionPerformed(ActionEvent e) {

		// System.out.println(even+","+odd+","+r+","+b+","+uh+","+lh);
		round--;
		for (int i = 0; i < ids.length; i++) {
			switch (ids[i]) {
			case 01:
				even--;
				break;
			case 2:
				odd--;
				break;
			case 3:
				r--;
				break;
			case 4:
				b--;
				break;
			case 5:
				uh--;
				;
				break;
			case 6:
				lh--;
				break;
			case 7:
				f12 = f12 - 3;

				s12i--;
				t12i--;
				f12i = f12i_p;
				break;
			case 8:
				s12 = s12 - 3;
				f12i--;

				t12i--;
				s12i = s12i_p;
				break;
			case 9:
				t12 = t12 - 3;
				f12i--;
				s12i--;

				t12i = t12i_p;
				break;
			case 10:
				fg = fg - 3;
				sgi--;
				tgi--;
				fgi = fgi_p;
				break;
			case 11:
				sg = sg - 3;
				fgi--;

				tgi--;
				sgi = sgi_p;
				break;
			case 12:
				tg = tg - 3;
				fgi--;
				sgi--;

				tgi = tgi_p;
				break;
			}
		}
		cal();

		// System.out.println(even+","+odd+","+r+","+b+","+uh+","+lh);
	}

	private double getgendata(int index) {
		switch (index) {
		case 0:
			genchart.setID("Red");
			genchart.setFrameTitle("Red");
			return rr;
		case 1:
			genchart.setID("Even");
			genchart.setFrameTitle("Even");
			return evens;
		case 2:
			genchart.setID("UHs");
			genchart.setFrameTitle("UHs");
			return uhs;
		case 3:
			genchart.setID("Black");
			genchart.setFrameTitle("Black");
			return bb;
		case 4:
			genchart.setID("Odd");
			genchart.setFrameTitle("Odd");
			return odds;
		case 5:
			genchart.setID("LHs");
			genchart.setFrameTitle("LHs");
			return lhs;

		}

		return 0;
	}

	private void jComboBox1_actionPerformed(ActionEvent e) {
		genchart.clear();
		genchart.setVisibe();

		int index = jComboBox1.getSelectedIndex();

		ymove = -10000;
		for (int i = (bjchart.getItemCount(1) - 100) < 0 ? 0 : (bjchart
				.getItemCount(1) - 100); i < bjchart.getItemCount(1); i++) {

			if (bjchart.getvalue(index + 1, i).getYValue() > ymove)
				ymove = bjchart.getvalue(index + 1, i).getYValue();

		}
		// System.out.println(bjchart.getItemCount(1)+"    "+//fchart.getItemCount(1));
		for (int i = (bjchart.getItemCount(1) - 100) < 0 ? 0 : (bjchart
				.getItemCount(1) - 100); i < bjchart.getItemCount(1); i++) {

			genchart.setData(i, bjchart.getvalue(index + 1, i).getYValue()
					- ymove);

		}
		genchart.setID(genchart.getID() + ":" + (int) ymove);

		switch (index) {
		case 0:
			genchart.setID("Red");
			genchart.setID("Red");
			break;
		case 1:
			genchart.setID("Even");
			genchart.setID("Even");
			break;
		case 2:
			genchart.setID("UHs");
			genchart.setID("UHs");
			break;
		case 3:
			genchart.setID("Black");
			genchart.setID("Black");
			break;
		case 4:
			genchart.setID("Odd");
			genchart.setID("Odd");
			break;
		case 5:
			genchart.setID("LHs");
			genchart.setID("LHs");
			break;

		}

	}

	private void jButton42_actionPerformed(ActionEvent e) {
		int index = jComboBox1.getSelectedIndex();
		if (index == jComboBox1.getItemCount() - 1)
			index = 0;
		else
			index++;
		jComboBox1.setSelectedIndex(index);
	}

	private void jButton43_actionPerformed(ActionEvent e) {
		int index = jComboBox1.getSelectedIndex();
		if (index == 0)
			index = jComboBox1.getItemCount() - 1;
		else
			index--;
		jComboBox1.setSelectedIndex(index);
	}

	private void jButton44_actionPerformed(ActionEvent e) {
		bet--;
		jButton44.setText("" + bet);
	}

	private void jButton45_actionPerformed(ActionEvent e) {
		bet++;
		jButton45.setText("" + bet);
	}

	private void addcount() {
		for (int i = 0; i < nos.length; i++) {
			nos[i]++;
		}

		for (int i = 0; i < trows.length; i++) {
			trows[i]++;
		}
		for (int i = 0; i < fbox.length; i++) {
			fbox[i]++;
		}
		for (int i = 0; i < sboxs.length; i++) {
			sboxs[i]++;
		}
		for (int i = 0; i < splitbet.length; i++) {
			splitbet[i]++;
		}
	}

	private double getpay(int in) {
		double tem = payout[in];
		double tem2 = 0;
		for (int i = 0; i < in + 1; i++)
			tem2 = tem2 + payout[i];
		tem = tem * 35 - tem2;
		return tem;
	}

	private void coolno() {

		int[] nsss = new int[37];

		for (int i = 0; i < nss.length; i++) {
			nsss[i] = nss[i];
		}

		Arrays.sort(nsss);
		int m = 0;
		for (int i = 0; i < nsss.length; i++) {
			if (nss[i] == nsss[0]) {
				m++;
			}
		}

		if (m < 10) {
			m = 9;
			bets = new int[m];
			for (int i = 0; i < nss.length; i++) {
				if (nss[i] == nsss[0]) {
					bets[m - 1] = i;
					m--;
					System.out.println(i + ",--0--," + nsss[0]);
				}
			}
			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 1)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--1--," + (nsss[0] + 1));
					}
				}

			}

			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 2)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--2--," + (nsss[0] + 2));
					}
				}

			}
			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 3)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--3--," + (nsss[0] + 3));
					}
				}

			}
			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 4)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--4--," + (nsss[0] + 4));
					}
				}

			}

			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 5)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--5--," + (nsss[0] + 5));
					}
				}

			}

			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 6)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--6--," + (nsss[0] + 6));
					}
				}

			}

			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 7)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--7--," + (nsss[0] + 7));
					}
				}

			}

			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 8)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--8--," + (nsss[0] + 8));
					}
				}

			}

			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 9)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--9--," + (nsss[0] + 9));
					}
				}

			}

			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 10)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--10--," + (nsss[0] + 10));
					}
				}

			}

			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 11)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--11--," + (nsss[0] + 1));
					}
				}

			}
			if (m >= 0) {
				for (int i = 0; i < nss.length && m >= 0; i++) {
					if (nss[i] == (nsss[0] + 12)) {
						bets[m] = i;
						m--;
						System.out.println(i + ",--12--," + (nsss[0] + 12));
					}
				}

			}
			// System.out.println("/");
			// for(int i=0;i<bets.length;i++){
			// System.out.print(bets[i]+",");

			// }
		} else {
			bets = new int[0];
		}

	}
}
