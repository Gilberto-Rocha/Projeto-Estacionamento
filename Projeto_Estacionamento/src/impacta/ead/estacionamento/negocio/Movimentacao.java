package impacta.ead.estacionamento.negocio;

import java.time.LocalDateTime;

/**
 * Representa o fluxo do veiculo dentro do estacionamento, ou seja, ele contem as informaões
 * de entrada e saida do veiculo eo valor pago na entrada.
 * 
 * 
 * 
 */
public class Movimentacao {
	private Veiculo veiculo;
	private LocalDateTime dataHoraEntrada;
	private LocalDateTime dateHoraSaida;
	private double valor;
	
	public Movimentacao (Veiculo veiculo, LocalDateTime dataEntrada) {
		this.veiculo = veiculo;
		this.dataHoraEntrada = dataEntrada;
		
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public LocalDateTime getDataHoraEntrada() {
		return dataHoraEntrada;
	}
	public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
		this.dataHoraEntrada = dataHoraEntrada;
	}
	public LocalDateTime getDateHoraSaida() {
		return dateHoraSaida;
	}
	public void setDateHoraSaida(LocalDateTime dateHoraSaida) {
		this.dateHoraSaida = dateHoraSaida;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}


}
