//Service
package dao;

import java.util.List;

import model.Cidade;
import model.Dados;

public class DAO_Cidade {

	public List<Cidade> getLista(){
		return Dados.listaCidades;
	}
	
	/*Futuramente:
	public boolean salvar(Cidade cidadeParaCadastrar) {
		if (cidadeParaCadastrar.getCodigo() == null) { //Significa que é uma nova cidade que será preciso gerar um novo código para cadastrá-la
			Integer codigo = (Dados.listaCidades.size()) +1;
			cidadeParaCadastrar.setCodigo(codigo);
			Dados.listaCidades.add(cidadeParaCadastrar);
			return true;
		}else {
			//código para UPDATE pois já existirá o objeto cidade
			return false;
		}
	}
	*/
	
	public boolean salvar(Cidade cidadeParaCadastrar) {
		if (cidadeParaCadastrar.getCodigo() == null) { //Significa que é uma nova cidade que será preciso gerar um novo código para cadastrá-la
			Integer codigo = (Dados.listaCidades.size()) +1;
			cidadeParaCadastrar.setCodigo(codigo);
			Dados.listaCidades.add(cidadeParaCadastrar);
		}
		return true;
	}
	
	public boolean remover(Cidade cidadeParaRemover) {
		Dados.listaCidades.remove(cidadeParaRemover);
		return true;
	}
	
}
