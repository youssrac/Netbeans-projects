/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribution;

/**
 *
 * @author PAVILION
 */
import static distribution.Distribution.x;
import java.awt.Color; 
import java.awt.BasicStroke; 
import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Random;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection; 
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class unigraph extends ApplicationFrame {
static double []x=new double[51];
   static Random random = new Random();
   public unigraph( String applicationTitle, String chartTitle ) {
       
      super(applicationTitle);
       for(int i=1;i<x.length;i++){
    x[i]=  random.nextFloat();
      }
         Arrays.sort(x);
      JFreeChart xylineChart = ChartFactory.createXYLineChart(
         chartTitle ,
         "nodes" ,
         "Packet Delivery Ratio" ,
         createDataset() ,
         PlotOrientation.VERTICAL ,
         true , true , false);
         
      ChartPanel chartPanel = new ChartPanel( xylineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      final XYPlot plot = xylineChart.getXYPlot( );
      
      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
      renderer.setSeriesPaint( 0 , Color.RED );
   
      renderer.setSeriesStroke( 0 , new BasicStroke( 4.0f ) );
    
      plot.setRenderer( renderer ); 
      setContentPane( chartPanel ); 
   }
   
   private XYDataset createDataset( ) {
      final XYSeries fonction = new XYSeries( "F(x)" ); 
        for(int i=1;i<x.length;i++){
     fonction.add( x[i] ,x[i] ); 
      }
             
   final XYSeriesCollection dataset = new XYSeriesCollection( );          
      dataset.addSeries( fonction );          

      return dataset;
   }

   public static void main( String[ ] args ) {
      unigraph chart = new unigraph("uniforme",
         "Distribution uniforme");
      chart.pack( );          
      RefineryUtilities.centerFrameOnScreen( chart );          
      chart.setVisible( true ); 
   }
}