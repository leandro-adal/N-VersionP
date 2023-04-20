package comos.excecao;

public class OperacaoNaoDisponivelException extends RuntimeException{
	
	private static final long serialVersionUID = -5487263090433708400L;

	public OperacaoNaoDisponivelException() {
		super ("Operação não Disponivel");
	}

}
