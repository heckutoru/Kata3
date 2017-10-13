/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Container;
import java.awt.Dimension;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.ui.ApplicationFrame;


/**
 *
 * @author Entrar
 */
public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay(String title) {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private Container createPanel(){
        ChartPanel charpanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return charpanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("histograma JFreeChart", "Dominios email", "Nº de emails", 
                dataSet, PlotOrientation.VERTICAL, false, true, true);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15, "", "ulpgc.es");
        dataSet.addValue(7, "", "ull.es");
        dataSet.addValue(10, "", "google.com");
        dataSet.addValue(4, "", "hotmail.com");
        return dataSet;
    }
}
