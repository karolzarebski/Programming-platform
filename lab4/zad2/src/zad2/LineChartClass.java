/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

/**
 *
 * @author karol
 */

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;

public class LineChartClass {
    public static LineChart<Number, Number> createChart(String seriesName, ArrayList seriesContent) {
        final NumberAxis xAxis = new NumberAxis();
        xAxis.setSide(Side.TOP);
        final NumberAxis yAxis = new NumberAxis();
        yAxis.setSide(Side.RIGHT);
        final LineChart<Number,Number> sc = new LineChart<Number,Number>(xAxis,yAxis);
        
        xAxis.setLabel("X Axis");
        yAxis.setLabel("Y Axis");
        
        XYChart.Series<Number, Number> series = new XYChart.Series<Number, Number>();

        series.setName(seriesName);

        int iter = 0;        
        
        for (int i = -10 ; i <= 10; i++) 
        {
            series.getData().add(new XYChart.Data<Number, Number>(i, (Number) seriesContent.get(iter++)));
        }

        sc.getData().add(series);
            
        return sc;
    }
}
