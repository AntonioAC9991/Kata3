package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay(String title) {
        super("HISTOGRAMA");
    }

    HistogramDisplay() {
        super("HISTOGRAMA");
        this.setContentPane(createPanel());
        this.pack();

    }


    @Override
    public void setContentPane(Container x) {
        super.setContentPane(createPanel()); 
    }

    @Override
    public void pack() {
        super.pack(); 
    }

    public void execute(){
        this.setVisible(true);
    }

    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }

    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(30, "", "ulpgc.es");
        dataSet.addValue(10, "", "gmail.es");
        dataSet.addValue(20, "", "alu.ulpgc.es");
        return dataSet;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        return ChartFactory.createBarChart("Histograma JFreeChart", "Dominios email", 
                                            "Nº de emails", dataSet, 
                                            PlotOrientation.VERTICAL, false, false,
                                            rootPaneCheckingEnabled);
    }

}
