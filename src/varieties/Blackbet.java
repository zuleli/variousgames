/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

package varieties;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Blackbet extends JFrame {
	private JButton jButton1 = new JButton();
	private JLabel jLabel1 = new JLabel();
	private JLabel jLabel2 = new JLabel();
	int round, maxwin, maxlose, tem, pp, dd, win, lose, ml, sl, ll, even, tw,
			tl, wl, maxwl, minwl, mmax, mmin, uplength, downlength, lcount,
			totall, maxupl, maxdownl, wno, lno;
	int[] d, p, to = new int[100], winno = new int[100], loseno = new int[100],
			wins = new int[100], loses = new int[100];
	boolean l, w, ace, dace, avlock = false, minlock = true, maxlock = true,
			teststatus = false;
	boolean[] locks = new boolean[10];
	Random r = new Random();
	private JLabel jLabel3 = new JLabel();
	private JTextField jTextField1 = new JTextField();
	private JButton jButton2 = new JButton();
	private JTextField jTextField2 = new JTextField();
	private JTextField jTextField3 = new JTextField();
	private JTextField jTextField4 = new JTextField();
	String ss = "", lstr = "";
	Chart333 chart = new Chart333("BJ");// chart2 = new Chart333("300 Counts"),
			//chart3 = new Chart333("WL");
	double winsum = 0, losesum, bet = 1, balance, maxb = 0, minb = 0, lbet = 0,
			av, mag, maxmag, minmag, tls, lls, wls;
	private JButton jButton3 = new JButton();
	int m = 0, dbj, pbj, evenbj, sb;
	private JButton jButton4 = new JButton();
	private JTextField jTextField5 = new JTextField();
	private JButton jButton5 = new JButton();
	// int rbet=1,bbet=1;
	double[][] saves = new double[5][6];
	private JButton jButton6 = new JButton();
	private JButton jButton7 = new JButton();
	private JRadioButton jRadioButton1 = new JRadioButton();
	int p1, p2, p3, b1, b2, b3, pvalue, bvalue;
	private JButton jButton8 = new JButton();
	private JRadioButton baccarat = new JRadioButton();
	Vector wldata = new Vector();
	boolean charttype = false;
	double ymove = 0, mav, lav, avd, av10, av10d;
	private JButton jButton9 = new JButton();
	private JButton jButton10 = new JButton();
	private JButton jButton11 = new JButton();
	private boolean print = false, netcal = false;
	int netsum = 0, netcount = 0;
	String str = "";
	double[] aves = new double[50], aves10 = new double[10],
			laves = new double[100], avds = new double[20],
			av10ds = new double[20];

	public Blackbet(String string, GraphicsConfiguration graphicsConfiguration) {
		super(string, graphicsConfiguration);
	}

	public Blackbet(String string) throws HeadlessException {
		super(string);
	}

	public Blackbet(GraphicsConfiguration graphicsConfiguration) {
		super(graphicsConfiguration);
	}

	public Blackbet() throws HeadlessException {
		super();
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		d = new int[10];
		p = new int[10];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//chart2.setMaxItem(1000);
		//chart3.setMaxItem(30000);
		setTitle("Baccarat");
		chart.setMaxItem(5000);

	}

	public static void main(String[] args) {
		Blackbet blackbet = new Blackbet();
	}

	private void jbInit() throws Exception {
		this.setSize(new Dimension(365, 135));
		this.getContentPane().setLayout(null);
		jButton1.setEnabled(false);
		jButton1.setText("Test");
		jButton1.setBounds(new Rectangle(380, 40, 85, 25));
		jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton1_actionPerformed(e);
			}
		});
		jLabel1.setText("Who is winner?");
		jLabel1.setBounds(new Rectangle(110, 5, 103, 30));
		jLabel1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel2.setEnabled(false);
		jLabel2.setText("0");
		jLabel2.setBounds(new Rectangle(153, 208, 85, 25));
		jLabel2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		jLabel3.setText("jLabel3");
		jLabel3.setBounds(new Rectangle(225, 260, 45, 35));
		jTextField1.setEnabled(false);
		jTextField1.setBounds(new Rectangle(385, 73, 80, 25));
		jTextField1.setText("10000");
		jTextField1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jTextField1_actionPerformed(e);
			}
		});
		jButton2.setText("Play");
		jButton2.setBounds(new Rectangle(110, 37, 103, 30));
		jButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton2_actionPerformed(e);
			}
		});
		jTextField2.setToolTipText("Number of plays");
		jTextField2.setBounds(new Rectangle(5, 8, 95, 25));
		jTextField2.setText("300");
		jTextField2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jTextField2_actionPerformed(e);
			}
		});
		jTextField3.setEnabled(false);
		jTextField3.setBounds(new Rectangle(25, 210, 95, 20));
		jTextField3.setText("3");
		jTextField4.setEnabled(false);
		jTextField4.setBounds(new Rectangle(315, 215, 110, 20));
		jButton3.setEnabled(false);
		jButton3.setText("Chart");
		jButton3.setBounds(new Rectangle(164, 156, 95, 30));
		jButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton3_actionPerformed(e);
			}
		});
		jButton4.setText("Reset");
		jButton4.setBounds(new Rectangle(223, 8, 85, 59));
		jButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton4_actionPerformed(e);
			}
		});
		jTextField5.setEnabled(false);
		jTextField5.setBounds(new Rectangle(20, 159, 100, 25));
		jTextField5.setText("1");
		jTextField5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jTextField5_actionPerformed(e);
			}
		});
		jButton5.setEnabled(false);
		jButton5.setText("T37");
		jButton5.setBounds(new Rectangle(385, 98, 85, 25));
		jButton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton5_actionPerformed(e);
			}
		});
		jButton6.setEnabled(false);
		jButton6.setText("PS-WL");
		jButton6.setBounds(new Rectangle(294, 169, 95, 30));
		jButton6.setToolTipText("Set to fluctuate bet");
		jButton6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton6_actionPerformed(e);
			}
		});
		jButton7.setEnabled(false);
		jButton7.setText("x");
		jButton7.setBounds(new Rectangle(269, 170, 50, 30));
		jButton7.setFont(new Font("Dialog", 0, 9));
		jButton7.setToolTipText("Flat Bet");
		jButton7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton7_actionPerformed(e);
			}
		});
		jRadioButton1.setText("Bets");
		jRadioButton1.setBounds(new Rectangle(304, 143, 95, 20));
		jButton8.setText("MultiPlay");
		jButton8.setBounds(new Rectangle(5, 37, 95, 30));
		jButton8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton8_actionPerformed(e);
			}
		});
		baccarat.setText("Baccarat");
		baccarat.setBounds(new Rectangle(175, 143, 95, 20));
		jButton9.setEnabled(false);
		jButton9.setText("BK");
		jButton9.setBounds(new Rectangle(425, 210, 50, 30));
		jButton9.setToolTipText("Banker Bet");
		jButton9.setFont(new Font("Dialog", 0, 10));
		jButton9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton9_actionPerformed(e);
			}
		});
		jButton10.setEnabled(false);
		jButton10.setText("BS");
		jButton10.setBounds(new Rectangle(415, 169, 50, 30));
		jButton10.setFont(new Font("Dialog", 0, 10));
		jButton10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton10_actionPerformed(e);
			}
		});
		jButton11.setEnabled(false);
		jButton11.setText("PS");
		jButton11.setBounds(new Rectangle(248, 210, 50, 30));
		jButton11.setFont(new Font("Dialog", 0, 10));
		jButton11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton11_actionPerformed(e);
			}
		});
		this.getContentPane().add(jButton11, null);
		this.getContentPane().add(jButton10, null);
		this.getContentPane().add(jButton9, null);
		this.getContentPane().add(baccarat, null);
		this.getContentPane().add(jButton8, null);
		this.getContentPane().add(jRadioButton1, null);
		this.getContentPane().add(jButton7, null);
		this.getContentPane().add(jButton6, null);
		this.getContentPane().add(jButton5, null);
		this.getContentPane().add(jTextField5, null);
		this.getContentPane().add(jButton4, null);
		this.getContentPane().add(jButton3, null);
		this.getContentPane().add(jTextField4, null);
		this.getContentPane().add(jTextField3, null);
		this.getContentPane().add(jTextField2, null);
		this.getContentPane().add(jButton2, null);
		this.getContentPane().add(jTextField1, null);
		this.getContentPane().add(jLabel3, null);
		this.getContentPane().add(jLabel2, null);
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(jButton1, null);
	}

	private int getRandom() {
		tem = r.nextInt(13) + 1;
		if (tem >= 10)
			return 10;
		else
			return tem;
	}

	private int getBacRandom() {
		tem = r.nextInt(13) + 1;
		if (tem >= 10)
			tem = 0;

		return tem;
	}

	private void baccarat() {
		p1 = getBacRandom();
		b1 = getBacRandom();
		p2 = getBacRandom();
		b2 = getBacRandom();
		p3 = -1;
		b3 = -1;
		pvalue = (p1 + p2) >= 10 ? (p1 + p2) - 10 : (p1 + p2);
		bvalue = (b1 + b2) >= 10 ? (b1 + b2) - 10 : (b1 + b2);

		if (!(pvalue >= 8 || bvalue >= 8)) {

			if (pvalue <= 5) {

				p3 = getBacRandom();
				pvalue = (pvalue + p3) >= 10 ? (pvalue + p3 - 10)
						: (pvalue + p3);

				if ((bvalue <= 3 && p3 <= 1)
						|| (bvalue <= 4 && p3 <= 3 && p3 >= 2)
						|| (bvalue <= 5 && p3 <= 5 && p3 >= 4)
						|| (bvalue <= 6 && p3 <= 7 && p3 >= 6)
						|| (bvalue <= 2 && p3 == 8) || (bvalue <= 3 && p3 == 9)) {
					b3 = getBacRandom();
					bvalue = (bvalue + b3) >= 10 ? (bvalue + b3 - 10)
							: (bvalue + b3);
				}

			} else if (pvalue > 5) {
				b3 = getBacRandom();
				bvalue = (bvalue + b3) >= 10 ? (bvalue + b3 - 10)
						: (bvalue + b3);

			}

		}

		

		if (pvalue > bvalue) {
			bj();
			jLabel1.setText("Player");
		} else if (pvalue < bvalue) {
			bust();
			jLabel1.setText("Banker");
		} else {
			even++;
			jLabel1.setText("Tie");
		}

	}

	private void dable() {
		pp = getRandom();
		stand();
	}

	private void bj() {
		round++;
		win++;
		tw++;
		wl = tw - tl;

		winsum = winsum + bet;
		losesum = losesum - lbet;

		if (jRadioButton1.isSelected()) {
			bet--;
			lbet++;
		}

		wldata.add(wl * 1.0);
		chart.setdata(wl - ymove, round);

		if (maxwin < win) {
			maxwin = win;
		}

		mav = getave(wl);
		lav = getlave(wl);
		av10 = getave10((wl));
		avd = mav - lav;
		av10d = av10 - lav;
		setavd(avd);
		setav10d(av10d);

		if (!w) {
			w = true;
			l = false;
			if (netcal && netcount == 2) {
				netcal = false;
				netcount = -1;
				loseno[netsum + 50]++;
				// System.out.println(netsum+"    "+getSSWR(avds[8])+"    "+getSSWR(av10ds[8]));
				netsum = 0;
				str = "";
			}

			if (netcal) {
				netsum = netsum - lose;
				str = str + "-" + lose;
			}
			if (lose >= 5) {// Integer.parseInt(jTextField5.getText())){
				print = true;
				netcal = true;
				netcount = 0;
			}

			to[lose]++;

			lose = 0;
		}

		// if(win>=2) {
		// lbet=-10;
		// bet=10;
		// }

		if (true)
			return;

		//
		if (wl > mmax) {
			mmax = wl;
			minlock = true;
			if ((mmax - mmin) > uplength)
				uplength++;
			else {
				totall = totall + uplength;
				lcount++;
				if (uplength > maxupl)
					maxupl = uplength;
				if (uplength <= 20)
					sl++;
				else if (uplength <= 40)
					ml++;
				else
					ll++;

				wins[downlength]++;
				uplength = mmax - mmin;
			}

		}

		if (maxlock && (wl - mmin) >= 5) {
			mmax = wl;
			maxlock = false;

		}

		av = this.getsave(wl, 0);
		mag = wl - av;

		if (mag > maxmag)
			maxmag = mag;
		else if (mag < minmag)
			minmag = mag;

		if (wl > maxwl)
			maxwl = wl;
		else if (wl < minwl)
			minwl = wl;

		/*
		 * 
		 * if(maxwin<win){ maxwin=win; }
		 * 
		 * 
		 * 
		 * if(!w){ w=true; l=false; lls=lose*lose+lls; tls=tls+lose*lose; lno++;
		 * 
		 * 
		 * loseno[lose]++; lstr=""; to[lose]++; lose=0; } //
		 */
		// System.out.println("w");

	}

	private void bust() {
		// System.out.println("l");
		round++;
		lose++;
		tl++;

		wl = tw - tl;

		if (baccarat.isSelected()) {
			if (lbet >= 0)
				losesum = losesum + lbet * 0.95;
			else
				losesum = losesum + lbet;

			if (bet < 0)
				winsum = winsum - bet * 0.95;
			else
				winsum = winsum - bet;
		} else {
			losesum = losesum + lbet;
			winsum = winsum - bet;
		}

		if (jRadioButton1.isSelected()) {
			bet++;
			lbet--;
		}

		wldata.add(wl * 1.0);
		chart.setdata(wl - ymove, round);

		if (!l) {
			w = false;
			l = true;
			if (print) {
				winno[win]++;
				print = false;
			}
			if (netcal) {
				netsum = netsum + win;
				netcount++;
				str = str + "+" + win;
			}

			win = 0;
		}

		mav = getave(wl);
		lav = getlave(wl);
		av10 = getave10((wl));
		avd = mav - lav;
		av10d = av10 - lav;

		setavd(avd);
		setav10d(av10d);

		// if(lose>=2) {
		// lbet=10;
		// bet=-10;
		// }

		if (true)
			return;

		//
		if (wl < mmin) {
			mmin = wl;
			maxlock = true;
			if ((mmax - mmin) > downlength)
				downlength++;
			else {
				totall = totall + downlength;
				lcount++;
				if (downlength > maxdownl)
					maxdownl = downlength;
				if (downlength <= 20)
					sl++;
				else if (uplength <= 40)
					ml++;
				else
					ll++;

				loses[downlength]++;

				downlength = mmax - mmin;
			}
		}

		if (minlock && (mmax - wl) >= 5) {
			mmin = wl;
			minlock = false;
		}

		av = this.getsave(wl, 0);
		mag = wl - av;
		if (mag > maxmag)
			maxmag = mag;
		else if (mag < minmag)
			minmag = mag;

		if (wl > maxwl)
			maxwl = wl;
		else if (wl < minwl)
			minwl = wl;

		// wldata.add(wl*1.0);
		// System.out.println(lbet+" l "+losesum+"      "+bet+" w "+winsum);

		tem = Integer.parseInt(jTextField2.getText());
		if (maxlose < lose) {
			maxlose = lose;
		}

		if (!l) {
			l = true;
			w = false;
			wls = win * win + wls;
			tls = tls + win * win;
			wno++;
			winno[win]++;
			win = 0;

		}
		ss = ss + "," + dd + "-" + pp;
		lstr = lstr + "\n" + ss;

	}

	private void bustop() {
		lose++;
		tl++;

		wl = tw - tl;
		// chart.setdata(wl);
		if (wl < mmin) {
			mmin = wl;
			maxlock = true;
			if ((mmax - mmin) > downlength)
				downlength++;
			else {
				totall = totall + downlength;
				lcount++;
				if (downlength > maxdownl)
					maxdownl = downlength;
				if (downlength <= 20)
					sl++;
				else if (uplength <= 40)
					ml++;
				else
					ll++;

				downlength = mmax - mmin;
			}
		}

		if (minlock && (mmax - wl) >= 5) {
			mmin = wl;
			minlock = false;
		}

		av = this.getsave(wl, 0);
		mag = wl - av;
		if (mag > maxmag)
			maxmag = mag;
		else if (mag < minmag)
			minmag = mag;

		if (wl > maxwl)
			maxwl = wl;
		else if (wl < minwl)
			minwl = wl;
		losesum = losesum + bet;
		tem = Integer.parseInt(jTextField2.getText());
		if (maxlose < lose) {
			maxlose = lose;
		}

		if (!l) {
			l = true;
			w = false;

			win = 0;

		}
		ss = ss + "," + dd + "-" + pp;
		lstr = lstr + "\n" + ss;
		// System.out.println(ss);
	}

	private void hit17() {

		if ((p[1] == 1 || p[0] == 1) && (p[0] + p[1]) == 11) {
			ace = true;
			stand();

			// bj already add 1 bet
		} else if ((p[1] == 1 || p[0] == 1) && pp <= 11 && (p[0] != p[1])) {
			ace = true;
			// if((pp>=3 && pp<=4 && d[0]>=5 && d[0]<=6) || (pp==5 && pp<=6 &&
			// d[0]>=4 && d[0]<=6)|| (pp==7 && d[0]>=3 && d[0]<=6))
			// hita();
			// else if((pp<=7) || (pp==8 && (d[0]==9 || d[0]==10 || d[0]==1)))
			// hita();
			if (pp == 9 || pp == 10 || pp == 11
					|| (pp == 8 && d[0] >= 2 && d[0] <= 8))
				stand();
			else
				hita();

		} else if (p[0] == p[1]) {

			if (p[0] == 10
					|| (p[0] == 9 && (d[0] == 7 || d[0] == 10 || d[0] == 1)))
				stand();
			else if (p[0] == 1) {
				ace = true;
				hita();

			} else
				hit();

		} else {
			if (pp <= 11
					|| (pp == 12 && ((d[0] >= 1 && d[0] <= 3) || (d[0] >= 7 && d[0] <= 10)))
					|| (pp >= 13 && pp <= 16 && ((d[0] >= 7 && d[0] <= 10) || d[0] == 1)))
				hit();
			else if ((pp >= 13 && pp <= 16 && d[0] >= 2 && d[0] <= 6)
					|| (pp >= 17 && pp <= 21)
					|| (pp == 12 && d[0] >= 4 && d[0] <= 6))
				stand();
			else if (pp > 21)
				bust();
		}
	}

	private void todoNextD() {
		if ((p[1] == 1 || p[0] == 1) && (p[0] != p[1])) {

			if ((pp >= 3 && pp <= 4 && d[0] >= 5 && d[0] <= 6)
					|| (pp == 5 && pp <= 6 && d[0] >= 4 && d[0] <= 6)
					|| (pp == 7 && pp <= 8 && d[0] >= 3 && d[0] <= 6))
				dable();
			else if ((pp <= 7)
					|| (pp == 8 && (d[0] == 9 || d[0] == 10 || d[0] == 1)))
				hit();
			else if (pp == 11)
				bj();
			else if (pp > 21)
				bust();
			else
				stand();

		} else if (p[0] == p[1]) {

			if (p[0] == 5 && d[0] >= 2 && d[0] <= 9)
				dable();
			else if (p[0] == 10
					|| (p[0] == 9 && (d[0] == 7 || d[0] == 10 || d[0] == 1)))
				stand();
			else
				hit();

		} else {
			if ((pp > 2 && pp <= 8)
					|| (pp == 9 && (d[0] <= 2 || (d[0] > 6 && d[0] < 11)))
					|| (pp == 10 && (d[0] == 10 || d[0] == 1))
					|| (pp == 11 && d[0] == 1)
					|| (pp == 12 && (d[0] == 2 || d[0] == 3))
					|| (pp >= 12 && pp <= 16 && ((d[0] >= 7 && d[0] <= 10) || d[0] == 1)))
				hit();
			else if ((pp >= 13 && pp <= 16 && d[0] >= 2 && d[0] <= 6)
					|| (pp >= 17 && pp <= 21))
				stand();
			else if ((pp == 9 && d[0] >= 2 && d[0] <= 6)
					|| (pp == 10 && d[0] >= 2 && d[0] <= 10)
					|| (pp == 11 && d[0] >= 2))
				dable();
			else if (pp > 21)
				bust();
		}
	}

	private void jButton1_actionPerformed(ActionEvent e) {

		round = 0;
		maxwin = 0;
		maxlose = 0;
		winsum = 0;
		losesum = 0;
		even = 0;
		balance = 0;
		minb = 0;
		maxb = 0;
		bet = Double.parseDouble(jTextField5.getText());
		maxwl = 0;
		minwl = 0;
		tw = 0;
		tl = 0;
		wl = 0;
		maxmag = 0;
		minmag = 0;
		av = 0;
		avlock = false;
		lno = 0;
		wno = 0;
		tls = 0;
		wls = 0;
		lls = 0;
		evenbj = 0;
		pbj = 0;
		dbj = 0;
		wldata.clear();
		// bbet=0;
		for (int i = 0; i < aves.length; i++) {
			aves[i] = 0;
		}

		for (int i = 1; i < 10; i++)
			locks[i] = false;

		for (int i = 0; i < to.length; i++) {
			to[i] = 0;
		}
		m = 0;
		int sb = 0;
		int n = Integer.parseInt(jTextField1.getText());
		chart.clearall();
		//chart2.clearall();
		while (m < n) {

			ss = "";
			dd = d[0] = getRandom();
			p[0] = getRandom();
			p[1] = getRandom();
			ss = dd + "," + p[0] + "-" + p[1];

			// jLabel1.setText(d[0]+"----"+p[0]+","+p[1]);
			pp = p[0] + p[1];
			ace = false;
			// bets();
			if (dd == 1)
				dace = true;
			else
				dace = false;
			hit17();
			if (balance > maxb)
				maxb = balance;
			else if (balance < minb)
				minb = balance;

			chart.setdata(wl, m);
			// chart.setdata2(av,m);
			// chart.setdata3(mag*2,m);
			// chart2.setdata((winsum-losesum),m);
			m++;

		}
		// chart.setID(""+getSSWR((tw+tl)*1.0/(1.0*(lno+wno))));//getSSWR(Math.sqrt(tls/(lno+wno))));
		double tp = (((losesum - winsum) * 100.0) / (m * 1.0));
		System.out.println(getSSWR(tp) + "," + pbj + " " + dbj + " " + evenbj);
		jLabel1.setText(maxwin + "w,l" + maxlose);
		jLabel2.setText("" + round);

	}

	private void jButton2_actionPerformed(ActionEvent e) {

		this.baccarat();  
		//double d1 = Double.parseDouble(jTextField2.getText());
		//double d2 = Double.parseDouble(jTextField3.getText());
		//jTextField4.setText("" + (d1 * Math.pow(2, d2)));

		//chart.setMaxItem((int) d1);
		// chart2.setMaxItem((int)d1);

	}

	private double getave(double value) {

		double[] tems = new double[50];
		double item = 0;
		for (int i = 0; i < 49; i++) {
			tems[i + 1] = aves[i];
		}
		tems[0] = value;
		aves = tems;

		for (int i = 0; i < 20; i++) {
			item = item + aves[i];
		}

		item = item / 20;

		if (round <= 20) {
			item = 0;
			for (int i = 0; i < round; i++)
				item = item + aves[i];
			item = item / round;
		}

		return getSSWR(item);

	}

	private void setav10d(double value) {

		double[] tems = new double[20];
		for (int i = 0; i < 19; i++) {
			tems[i + 1] = av10ds[i];
		}
		tems[0] = value;
		av10ds = tems;

	}

	private void setavd(double value) {

		double[] tems = new double[20];
		for (int i = 0; i < 19; i++) {
			tems[i + 1] = avds[i];
		}
		tems[0] = value;
		avds = tems;

	}

	private double getave10(double value) {

		double[] tems = new double[10];
		double item = 0;
		for (int i = 0; i < 9; i++) {
			tems[i + 1] = aves10[i];
		}
		tems[0] = value;
		aves10 = tems;

		for (int i = 0; i < 10; i++) {
			item = item + aves10[i];
		}

		item = item / 10;

		if (round <= 10) {
			item = 0;
			for (int i = 0; i < round; i++)
				item = item + aves10[i];
			item = item / round;
		}

		return getSSWR(item);

	}

	private double getlave(double value) {

		double[] tems = new double[100];
		double item = 0;
		for (int i = 0; i < 99; i++) {
			tems[i + 1] = laves[i];
		}
		tems[0] = value;
		laves = tems;

		for (int i = 0; i < 100; i++) {
			item = item + laves[i];
		}

		item = item / 100;

		if (round <= 100) {
			item = 0;
			for (int i = 0; i < round; i++)
				item = item + laves[i];
			item = item / round;
		}

		return getSSWR(item);

	}

	// private double getave(int backward){

	// double item=0;

	// for(int i=backward;i<backward+20;i++){
	// item=item+aves[i];
	// }

	// item=item/20;

	// return getSSWR(item);

	// }
	private void bets() {
		if (mag <= -10 && !locks[0]) {

			locks[0] = true;
			avlock = false;
			bet = 2;
			System.out.println(wl + " bet=" + bet);
		} else if (mag <= -20 && !locks[1]) {
			locks[1] = true;
			bet = 3;
			System.out.println(wl + " bet=" + bet);
		} else if (mag <= -30 && !locks[2]) {
			locks[2] = true;
			bet = 4;
			System.out.println(wl + " bet=" + bet);
		} else if (mag <= -40 && !locks[3]) {
			locks[3] = true;
			bet = 5;
			System.out.println(wl + " bet=" + bet);
		} else if (mag <= -50 && !locks[4]) {
			locks[4] = true;
			bet = 6;
			System.out.println(wl + " bet=" + bet);
		} else if (mag <= -60 && !locks[5]) {
			locks[5] = true;
			bet = 7;
			System.out.println(wl + " bet=" + bet);
		} else if (mag <= -70 && !locks[6]) {
			locks[6] = true;
			bet = 8;
		} else if (mag <= -80 && !locks[7]) {
			locks[7] = true;
			bet = 9;
		} else if (mag <= -90 && !locks[8]) {
			locks[8] = true;
			bet = 10;
		}

		if (av > ((maxmag + minmag) / 2) && !avlock) {
			System.out.println(round + " r-bet " + bet + " " + wl);
			avlock = true;
			bet = 1;

			for (int i = 1; i < 10; i++)
				locks[i] = false;

		}
	}

	private double getSSWR(double value) {

		double v = Math.round(10000 * value) / 10000.0;
		return v;
	}

	private void jButton3_actionPerformed(ActionEvent e) {
		chart.clearall();

		if (charttype) {
			ymove = Math.floor((Double) (wldata.get(wldata.size() - 100)));
			for (int i = wldata.size() - 100; i < wldata.size(); i++)
				chart.setdata(((Double) wldata.get(i)).doubleValue() - ymove, i);
			chart.setMaxItem(1000);
			charttype = false;
		} else {
			for (int i = 0; i < wldata.size(); i++)
				chart.setData(i, ((Double) wldata.get(i)).doubleValue());
			charttype = true;
			chart.setMaxItem(10000000);
		}
	}

	private void hit() {
		tem = getRandom();
		// System.out.println("ht:"+tem);
		if (tem == 1) {
			p[0] = 1;
			p[1] = pp;
			ace = true;
		} else
			p[1] = p[1] + tem;

		pp = pp + tem;
		ss = ss + ",h=" + tem;
		// System.out.println("h "+tem);
		hit17();

	}

	private void hita() {
		tem = getRandom();
		// System.out.println("ha:"+tem);
		p[0] = 1;
		p[1] = pp + tem - 1;
		pp = p[0] + p[1];
		if ((pp + 10) >= 17 && (pp + 10) <= 21)
			stand();
		else
			hit17();

	}

	private void adddataop() {
		ss = "";
		dd = d[0] = getRandom();
		// System.out.println("d:"+dd);
		p[0] = getRandom();
		p[1] = getRandom();
		ss = dd + "," + p[0] + "-" + p[1];
		// System.out.println(p[0]+" p "+p[1]);
		// jLabel1.setText(d[0]+"----"+p[0]+","+p[1]);
		pp = p[0] + p[1];
		ace = false;
		// bets();
		if (dd == 1)
			dace = true;
		else
			dace = false;
		hit17();
		if (balance > maxb)
			maxb = balance;
		else if (balance < minb)
			minb = balance;

		chart.setdata(wl, m);
		chart.setID("" + wl);
		chart.setdata2(av, m);
		chart.setdata3(mag * 2, m);
		//chart2.setdata(winsum, m);

		chart.setID(wl + "[" + (mmax - wl) + "][" + (wl - mmin) + "] [" + lose
				+ "][" + win + "] [" + getSSWR((tw + tl) * 1.0 / (lno + wno))
				+ "]");
		m++;
	}

	private void stand() {
		// int m=0;
		while (true) {
			// m++;
			// if(m>15)
			// break;
			tem = getRandom();
			if (tem == 1)
				dace = true;

			dd = dd + tem;
			// System.out.println("stand:"+tem+" dd:"+dd);

			ss = ss + ",s" + tem;
			if (dace && dd == 11 && ace && pp == 11) {
				even++;
				evenbj++;
				return;

			} else if (dace && dd == 11) {// dealer bj
				bust();
				dbj++;
				dace = false;
				return;
			} else if (dace && dd <= 11 & dd >= 7)
				dd = dd + 10;

			if (dd > 21) {

				bj();

				return;
			} else if (dd >= 17 && dd <= 21) {

				if (ace && pp <= 11)
					pp = pp + 10;
				// System.out.println("pp:"+pp+" dd:"+dd);
				if (dd > pp) {

					bust();
					return;
				} else if (dd == pp) {
					even++;
					return;

				} else {

					if (pp == 21) {// bj
						winsum = winsum + bet * 0.5;
						pbj++;
					}
					bj();
					return;
				}

				// break;

			}
		}

	}

	private void jButton4_actionPerformed(ActionEvent e) {

		round = 0;
		maxwin = 0;
		maxlose = 0;
		winsum = 0;
		losesum = 0;
		even = 0;
		balance = 0;
		minb = 0;
		maxb = 0;
		bet = 1;
		maxwl = 0;
		minwl = 0;
		tw = 0;
		tl = 0;
		wl = 0;
		maxmag = 0;
		minmag = 0;
		av = 0;
		avlock = false;
		wldata.clear();
		for (int i = 0; i < aves.length; i++) {
			aves[i] = 0;
		}

		for (int i = 1; i < 10; i++)
			locks[i] = false;

		for (int i = 0; i < to.length; i++) {
			to[i] = 0;
		}
		m = 0;
		int sb = 0;
		int n = Integer.parseInt(jTextField1.getText());
		chart.clearall();
		//chart2.clearall();
		//chart3.clearall();
		lno = 0;
		wno = 0;
		tls = 0;
		wls = 0;
		lls = 0;
		bet = 1;
		lbet = 0;
		ymove = 0;
	}

	private void jTextField1_actionPerformed(ActionEvent e) {
		bet = Integer.parseInt(jTextField5.getText());
		adddataop();
	}

	private void test() {
		// Random r=new Random();
		int tem0 = 0;

		tem0 = r.nextInt(37);
		if (tem0 == 0 || tem0 == 1 || tem0 == 3 || tem0 == 5 || tem0 == 7
				|| tem0 == 9 || tem0 == 11 || tem0 == 13 || tem0 == 15
				|| tem0 == 17 || tem0 == 19 || tem0 == 21 || tem0 == 23
				|| tem0 == 25 || tem0 == 27 || tem0 == 29 || tem0 == 31
				|| tem0 == 33 || tem0 == 35)
			bust();
		else if (tem0 == 2 || tem0 == 4 || tem0 == 6 || tem0 == 8 || tem0 == 10
				|| tem0 == 12 || tem0 == 14 || tem0 == 16 || tem0 == 18
				|| tem0 == 20 || tem0 == 22 || tem0 == 24 || tem0 == 26
				|| tem0 == 28 || tem0 == 30 || tem0 == 32 || tem0 == 34
				|| tem0 == 36)
			bj();

	}

	private void test2() {
		// Random r=new Random();
		int tem0 = 0;

		tem0 = r.nextInt(37);
		if (tem0 == 0) {
			winsum = winsum - bet / 2;
			losesum = losesum - bet / 2;
			sb++;
		} else if (tem0 == 1 || tem0 == 3 || tem0 == 5 || tem0 == 7
				|| tem0 == 9 || tem0 == 11 || tem0 == 13 || tem0 == 15
				|| tem0 == 17 || tem0 == 19 || tem0 == 21 || tem0 == 23
				|| tem0 == 25 || tem0 == 27 || tem0 == 29 || tem0 == 31
				|| tem0 == 33 || tem0 == 35)
			bust();
		else if (tem0 == 2 || tem0 == 4 || tem0 == 6 || tem0 == 8 || tem0 == 10
				|| tem0 == 12 || tem0 == 14 || tem0 == 16 || tem0 == 18
				|| tem0 == 20 || tem0 == 22 || tem0 == 24 || tem0 == 26
				|| tem0 == 28 || tem0 == 30 || tem0 == 32 || tem0 == 34
				|| tem0 == 36)
			bj();

	}

	private void jTextField5_actionPerformed(ActionEvent e) {
		ss = "";
		dd = d[0] = getRandom();
		p[0] = getRandom();
		p[1] = getRandom();
		ss = dd + "," + p[0] + "-" + p[1];

		// jLabel1.setText(d[0]+"----"+p[0]+","+p[1]);
		pp = p[0] + p[1];
		ace = false;
		// bets();
		if (dd == 1)
			dace = true;
		else
			dace = false;
		test();
		if (balance > maxb)
			maxb = balance;
		else if (balance < minb)
			minb = balance;

		chart.setdata(wl, m);

		chart.setID(wl + "[" + (mmax - wl) + "][" + (wl - mmin) + "] [" + lose
				+ "][" + win + "] [" + getSSWR((tw + tl) * 1.0 / (lno + wno))
				+ "]");

		m++;
	}

	private void jButton5_actionPerformed(ActionEvent e) {
		round = 0;
		maxwin = 0;
		maxlose = 0;
		winsum = 0;
		losesum = 0;
		even = 0;
		balance = 0;
		minb = 0;
		maxb = 0;
		bet = 1;
		maxwl = 0;
		minwl = 0;
		tw = 0;
		tl = 0;
		wl = 0;
		maxmag = 0;
		minmag = 0;
		av = 0;
		avlock = false;
		lno = 0;
		wno = 0;
		tls = 0;
		wls = 0;
		lls = 0;
		sb = 0;
		lbet = 0;
		wldata.clear();
		// evenbj=0;pbj=0;dbj=0;

		for (int i = 0; i < aves.length; i++) {
			aves[i] = 0;
		}

		for (int i = 1; i < 10; i++)
			locks[i] = false;

		for (int i = 0; i < to.length; i++) {
			to[i] = 0;
		}
		for (int i = 0; i < winno.length; i++) {
			winno[i] = 0;
			loseno[i] = 0;
		}
		for (int i = 0; i < wins.length; i++) {
			wins[i] = 0;
			loses[i] = 0;
		}
		m = 0;

		int n = Integer.parseInt(jTextField5.getText());
		chart.clearall();
		//chart2.clearall();
		teststatus = true;
		while (m < n) {

			test2();

			chart.setdata(wl, m);
			// chart.setdata2(winsum,m);
			//chart2.setdata((losesum), m);
			//chart2.setdata2((winsum), m);
			//chart2.setdata3((winsum + losesum), m);
			m++;
			// System.out.println(m+":   "+winsum+"     "+rbet+"        "+losesum+"     "+bbet+"    "+(winsum+losesum));
			// chart.setdata(wl,m);
		}
		teststatus = false;
		chart.setID("" + getSSWR((tw + tl) * 1.0 / (1.0 * (lno + wno))));// getSSWR(Math.sqrt(tls/(lno+wno))));
		// System.out.println(bet+" sb="+sb);
		double tp = (((tw - tl) * 100.0) / (m * 1.0));

		jLabel1.setText(maxwin + "w,l" + maxlose);
		jLabel2.setText("" + round);
	}

	private double getsave(double value, int group) {

		double[] tems = new double[6];
		double item = 0;
		for (int i = 0; i < 5; i++) {
			tems[i + 1] = saves[group][i];
			item = item + saves[group][i];
		}
		tems[0] = value;

		for (int i = 0; i < 6; i++) {
			saves[group][i] = tems[i];
		}
		item = item + value;
		item = item / 6;
		if (round <= 6) {
			item = 0;
			for (int i = 0; i < round; i++)
				item = item + saves[group][i];
			item = item / round;
		}

		return getSSWR(item);

	}

	private void jButton7_actionPerformed(ActionEvent e) {
		bet = 1;
		lbet = 0;
		jTextField5.setText(bet + "  " + lbet);
		jRadioButton1.setSelected(false);

	}

	private void jButton6_actionPerformed(ActionEvent e) {

		lbet = wl;
		bet = 1 - wl;
		jTextField5.setText(bet + "  " + lbet);
		jRadioButton1.setSelected(true);
	}

	private void jButton8_actionPerformed(ActionEvent e) {
		round = 0;
		maxwin = 0;
		maxlose = 0;
		winsum = 0;
		losesum = 0;
		even = 0;
		balance = 0;
		minb = 0;
		maxb = 0;
		bet = 1;
		maxwl = 0;
		minwl = 0;
		tw = 0;
		tl = 0;
		wl = 0;
		maxmag = 0;
		minmag = 0;
		av = 0;
		avlock = false;
		lno = 0;
		wno = 0;
		tls = 0;
		wls = 0;
		lls = 0;
		sb = 0;
		lbet = 0;
		m = 0;
		int n = Integer.parseInt(jTextField2.getText());
		chart.clearall();
		//chart2.clearall();
		teststatus = true;
		wldata.clear();
		for (int i = 0; i < winno.length; i++) {
			winno[i] = 0;
			loseno[i] = 0;
		}

		for (int i = 0; i < to.length; i++) {
			to[i] = 0;

		}
		while (m < n) {

			baccarat();

			
			m++;
		}

		for (int i = 0; i < to.length; i++) {
			if (to[i] != 0)
				System.out.println(i + " " + to[i]);

		}

		
	}

	private void jTextField2_actionPerformed(ActionEvent e) {
		baccarat();

		chart.setdata(wl, m);
		chart.setID("" + wl);
		// chart.setdata2(winsum,m);
		// chart2.setdata((losesum),m);
		//chart3.setdata2((winsum + losesum), round);
		//chart2.setdata2(wl, round);
		//chart3.setID("bet=" + bet + "   Balance=" + getSSWR(winsum + losesum));
		// System.out.println("lose="+lose+", lbet="+lbet+"      win="+win+"  bet="+bet);

	}

	private void jButton9_actionPerformed(ActionEvent e) {
		bet = -1;
		lbet = 0;
		jTextField5.setText(bet + "  " + lbet);
		jRadioButton1.setSelected(false);
	}

	private void jButton10_actionPerformed(ActionEvent e) {
		lbet = Double.parseDouble(jTextField2.getText());
		bet = 0 - lbet;
		jTextField5.setText(bet + "  " + lbet);
		// jRadioButton1.setSelected(true);
	}

	private void jButton11_actionPerformed(ActionEvent e) {
		bet = Double.parseDouble(jTextField2.getText());
		lbet = 0 - bet;
		jTextField5.setText(bet + "  " + lbet);
		// jRadioButton1.setSelected(true);
	}

}
