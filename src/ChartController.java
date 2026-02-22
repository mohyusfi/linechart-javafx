import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class ChartController {
    @FXML
    private LineChart<Number, Number> lineChart;

    @FXML
    private void initialize() {
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Populasi Indonesia");

        series.getData().add(new XYChart.Data<>(2014, 255.1));
        series.getData().add(new XYChart.Data<>(2015, 258.4));
        series.getData().add(new XYChart.Data<>(2016, 261.6));
        series.getData().add(new XYChart.Data<>(2017, 264.7));
        series.getData().add(new XYChart.Data<>(2018, 267.7));
        series.getData().add(new XYChart.Data<>(2019, 270.6));
        series.getData().add(new XYChart.Data<>(2020, 273.5));
        series.getData().add(new XYChart.Data<>(2021, 276.4));
        series.getData().add(new XYChart.Data<>(2022, 279.1));
        series.getData().add(new XYChart.Data<>(2023, 281.9));

        lineChart.getData().add(series);
    }
}
