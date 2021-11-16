package kata3;


import java.util.HashMap;


public class Kata3 {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("alu.ulpgc.com");
        histogram.increment("alu.ulpgc.com");
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
