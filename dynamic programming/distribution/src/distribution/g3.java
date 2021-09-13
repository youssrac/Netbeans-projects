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

public class g3 extends ApplicationFrame {
 static double []x=new double[51];
 static double []y=new double[51];
 static Random random = new Random();
   public g3( String applicationTitle, String chartTitle ) {
       
      
      super(applicationTitle);
       for(int i=1;i<x.length;i++){
    x[i]=  random.nextFloat();
      }
          Arrays.sort(x);
       for(int i=1;i<x.length;i++){
    y[i]=  (1-Math.exp(x[i]*-3));
      }          
          
          
      
      JFreeChart xylineChart = ChartFactory.createXYLineChart(
         chartTitle ,
         "X" ,
         "F(X)" ,
         createDataset() ,
         PlotOrientation.VERTICAL ,
         true , true , false);
         
      ChartPanel chartPanel = new ChartPanel( xylineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      final XYPlot plot = xylineChart.getXYPlot( );
      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
      renderer.setSeriesPaint( 0 , Color.BLUE );
     renderer.setSeriesStroke( 0 , new BasicStroke( 3.0f ) );
     plot.setRenderer( renderer ); 
      setContentPane( chartPanel ); 
   }
   
   private XYDataset createDataset( ) {
      final XYSeries f = new XYSeries( "F(x)" );   
      for(int i=1;i<x.length;i++){
     f.add( x[i] ,y[i] ); 
      }         
   final XYSeriesCollection dataset = new XYSeriesCollection( );          
      dataset.addSeries( f );          
    
      return dataset;
   }

   public static void main( String[ ] args ) {
     g3 chart = new g3("graphe ",
         "Distribution exponentielle");
      chart.pack( );          
      RefineryUtilities.centerFrameOnScreen( chart );          
      chart.setVisible( true ); 
   }
}