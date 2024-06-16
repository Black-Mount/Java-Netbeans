package jfreechart1;

import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class XYChartExample {
 public static void main(String[] args) {
 // Create a simple XY chart
 XYSeries series = new XYSeries("XYGraph");
 series.add(1,3);
 series.add(2, 3);
 series.add(3, 5);
 series.add(4, 5);
 // Add the series to your data set
 XYSeriesCollection dataset = new XYSeriesCollection();
 dataset.addSeries(series);
 // Generate the graph
 JFreeChart chart = ChartFactory.createXYLineChart(
 "Notas", // Title
 "cantidad de notas", // x-axis Label
 "valor", // y-axis Label
 dataset, // Dataset
 PlotOrientation.VERTICAL, // Plot Orientation
 true, // Show Legend
 true, // Use tooltips
 false // Configure chart to generate URLs?
 );
 try {
 ChartUtilities.saveChartAsJPEG(new File("C:\\chart.jpg"), chart, 500, 300);
 } catch (IOException e) {
 System.err.println("Problem occurred creating chart.");
 }
 }
}