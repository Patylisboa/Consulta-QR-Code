package br.com.javaparaweb.consulta.primefaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

@ManagedBean
@RequestScoped
public class VendaColunasBean {

	private BarChartModel consultaColunas;

	public VendaColunasBean() { 
		ChartSeries metro = new ChartSeries();
		ChartSeries onibus = new ChartSeries();
		ChartSeries restaurante = new ChartSeries();

		this.consultaColunas = new BarChartModel();

		metro.setLabel("Metrô");
		metro.set("2016", 120);
		metro.set("2017", 40);
		metro.set("2018", 79);

		onibus.setLabel("Ônibus");
		onibus.set("2016", 40);
		onibus.set("2017", 150);
		onibus.set("2018", 180);

		restaurante.setLabel("Restaurantes");
		restaurante.set("2016", 70);
		restaurante.set("2017", 80);
		restaurante.set("2018", 90);

		this.consultaColunas.addSeries(metro);
		this.consultaColunas.addSeries(onibus);
		this.consultaColunas.addSeries(restaurante);
		this.consultaColunas.setTitle("Gráfico de consultas por lugares");
		this.consultaColunas.setLegendPosition("ne");
		Axis xAxis = this.consultaColunas.getAxis(AxisType.X);
		xAxis.setLabel("Ano das consultas");

		Axis yAxis = this.consultaColunas.getAxis(AxisType.Y);
		yAxis.setLabel("Volume de consultas");
		yAxis.setMin(0);
		yAxis.setMax(200);
	}

	public BarChartModel getVendaColunas() {
		return this.consultaColunas;
	}
}
