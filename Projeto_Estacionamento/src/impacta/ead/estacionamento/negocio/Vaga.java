package impacta.ead.estacionamento.negocio;

/**
 * Representa as informacães relativas à vagas do estacionamento ou
 * status de ocupado.
 * 
 * @author rocha
 */

public class Vaga {
	public static int TOTAL_VAGAS = 100;
	private static int vagasOcupadas = 0;
	
	
	private Vaga() {}
	
	/**
	 * Verificar a existencia de alguma vaga livre no estacionamento.
	 * @author rocha
	 * @return true se houver alguma vaga e false se estiver lotado.
	 */
	
	public static boolean temVagaLivre() {
		
		//TODO implementar este metodo.
		return false;
	}
	
	/**
	 * 
	 * Buscar o status atual das vagas do estacionamento.
	 * 
	 * @author rocha
	 * 
	 */
	public static void inicializarOcupadas() {
		//TOD implementar
	}
	
	/**
	 * 
	 * Retorna oi numero de vagas ocupadas 
	 * @author rocha
	 * @return numero total de vagas ocupadas num determinado instante
	 */
	public static int ocupadas() {
		return Vaga.vagasOcupadas;
	}
	
	/**
	 * 
	 * Retornar o numero de vagas livres
	 * @author rocha
	 * @return numero total de vagas livres num determinaddo instatante.
	 * 
	 */
	
	public static int livres() {
		return TOTAL_VAGAS - Vaga.vagasOcupadas;
	}
	
	/**
	 * 
	 * Atualiza o numero de vagas ocupadas após entrada do veiculo.
	 * 
	 */
	
	public static void entrou() {
		Vaga.vagasOcupadas ++;
	}
	
	
	
	
}
