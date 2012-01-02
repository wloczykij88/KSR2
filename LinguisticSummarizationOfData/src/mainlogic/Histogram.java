package mainlogic;

import java.io.*;
import org.jfree.chart.*;
import org.jfree.data.statistics.*;
import org.jfree.chart.plot.PlotOrientation;

 public class Histogram {
	 Histogram(String name, double[] values, int numberOfRanges){
		 
		 HistogramDataset dataset = new HistogramDataset();
		 dataset.setType(HistogramType.FREQUENCY);
		 dataset.addSeries(name,values,numberOfRanges);
		 
		 createHistogram(name,dataset);
   }
	 
	Histogram(String name, double[] values, int numberOfRanges, double min, double max){
		 
		 HistogramDataset dataset = new HistogramDataset();
		 dataset.setType(HistogramType.FREQUENCY);
		 dataset.addSeries(name,values,numberOfRanges,min,max);
		 
		 createHistogram(name,dataset);
	}
	
	private void createHistogram(String name, HistogramDataset dataset){
		 String plotTitle = name; 
		 String xaxis = null;	//"number";
		 String yaxis = null; 	//"value"; 
		 PlotOrientation orientation = PlotOrientation.VERTICAL; 
		 boolean legend = false; 
		 boolean toolTips = false;
		 boolean urls = false; 
		 
		 JFreeChart chart = ChartFactory.createHistogram( plotTitle, xaxis, yaxis, 
           dataset, orientation, legend, toolTips, urls);
		 chart.getXYPlot().setForegroundAlpha(0.75f);
		 
		 int width = 500;
		 int height = 300; 
		 
		 try {
			 ChartUtilities.saveChartAsPNG(new File(name+".PNG"), chart, width, height);
		 } catch (IOException e) {}
	}
 }
