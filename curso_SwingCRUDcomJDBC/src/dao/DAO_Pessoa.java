//Service
package dao;

import java.util.List;

import model.Dados;
import model.Pessoa;

public class DAO_Pessoa {
	
	//método 1
	public List<Pessoa> getLista(){
		return Dados.listaPessoas;
	}

	//método 2:
	public boolean salvar(Pessoa pessoaParaAdicionar) {
		if (pessoaParaAdicionar.getCodigo() == null) {
			Integer codigo = Dados.listaPessoas.size() + 1;
			pessoaParaAdicionar.setCodigo(codigo);
			Dados.listaPessoas.add(pessoaParaAdicionar);
		}
		return true;
	}
	
	//método 3:
	public boolean remover(Pessoa pessoaParaRemover) {
		Dados.listaPessoas.remove(pessoaParaRemover);
		return true;
	}
	
}
