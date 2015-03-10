/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

package varieties;

/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;
//import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.*;

//import org.jfree.data.*;

public class Chart333 {

	XYSeries series, series2, series3, series4, series5, series6;
	ChartFrame frame1;
	JFreeChart chart;
	int maxcount = 100;

	// Vector vector=new Vector();
	public Chart333(String id) {
		series = new XYSeries("1");
		series2 = new XYSeries("2");
		series3 = new XYSeries("3");
		series4 = new XYSeries("4");
		series5 = new XYSeries("5");
		series6 = new XYSeries("6");
		XYSeriesCollection collection = new XYSeriesCollection();
		collection.addSeries(series);
		collection.addSeries(series2);
		collection.addSeries(series3);
		collection.addSeries(series4);
		collection.addSeries(series5);
		collection.addSeries(series6);
		XYDataset xyDataset = collection;
		// xyDataset.
		chart = ChartFactory.createXYLineChart(id, "Round", "Net Value",
				xyDataset, PlotOrientation.VERTICAL, true, true, false);
		frame1 = new ChartFrame("Information Chart", chart);
		frame1.setVisible(true);
		frame1.setSize(500, 300);

	}

	public XYDataItem getvalue(int seriesno, int x) {
		switch (seriesno) {
		case 1:
			return series.getDataItem(x);
		case 2:
			return series2.getDataItem(x);
		case 3:
			return series3.getDataItem(x);
		case 4:
			return series4.getDataItem(x);
		case 5:
			return series5.getDataItem(x);
		case 6:
			return series6.getDataItem(x);

		}

		return null;
	}

	public void setontop(boolean value) {
		frame1.setAlwaysOnTop(value);
	}

	public void setData(XYDataItem item) {
		series.add(item);
	}

	public void setData(double item, double x) {
		series.add(item, x);
	}

	public void setFrameTitle(String title) {
		frame1.setTitle(title);
	}

	public String getID() {
		return chart.getTitle().getText();
	}

	public int getItemCount(int seriesno) {
		switch (seriesno) {
		case 1:
			return series.getItemCount();

		case 2:
			return series2.getItemCount();
		case 3:
			return series3.getItemCount();
		case 4:
			return series4.getItemCount();
		case 5:
			return series5.getItemCount();
		case 6:
			return series6.getItemCount();

		}

		return 0;
	}

	public void clearall() {
		series.clear();
		series2.clear();
		series3.clear();
		series4.clear();
		series5.clear();
		series6.clear();
	}

	public static void main(String arg[]) {

	}

	public void setdata(double value, int s) {
		series.add(s, value);
		int no = series.getItemCount();
		if (no > maxcount)
			series.remove(0);
		// System.out.println(value);
	}

	public void setMaxItem(int count) {
		maxcount = count;
	}

	public void setdata2(double value, int s) {
		series2.add(s, value);
		int no = series2.getItemCount();
		if (no > maxcount)
			series2.remove(0);
	}

	public void setdata3(double value, int s) {
		series3.add(s, value);
		int no = series3.getItemCount();
		if (no > maxcount)
			series3.remove(0);
	}

	public void setdata4(double value, int s) {
		series4.add(s, value);
		int no = series4.getItemCount();
		if (no > maxcount)
			series4.remove(0);
	}

	public void setdata5(double value, int s) {
		series5.add(s, value);
		int no = series5.getItemCount();
		if (no > maxcount)
			series5.remove(0);
	}

	public void setdata6(double value, int s) {
		series6.add(s, value);
		int no = series6.getItemCount();
		if (no > maxcount)
			series6.remove(0);
	}

	public void clear() {
		series.clear();
	}

	public void setVisibe() {

		frame1.setVisible(true);
	}

	public void hide() {

		// this.pack();
		// RefineryUtilities.centerFrameOnScreen(this);
		frame1.setVisible(false);
	}

	public boolean isVisible() {
		return frame1.isVisible();
	}

	public void setID(String id) {
		chart.setTitle(id);
	}
}
