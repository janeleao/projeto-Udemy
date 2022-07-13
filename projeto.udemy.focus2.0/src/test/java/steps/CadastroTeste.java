package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class CadastroTeste {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
		
	@Before
public void iniciarTeste() {
		Executa.IniciarTeste();
	}
	//@After
	public void finalizarTeste() {
		Executa.finalizarTeste();
	}
	

	@Given("que esteja no formulario de cadastro")
	public void queEstejaNoFormularioDeCadastro() {
	 
	}
	@When("preenha dados validos")
	public void preenhaDadosValidos() {
		metodos.escrever(el.name, "Antonio Gonçalves");
	    metodos.escrever(el.email, "focussqaud2022@gmail.com");
		metodos.escrever(el.senha, "teste123456");
		metodos.pausa(3000);
		metodos.tirarFoto("CT01- dados ");
	}
	@When("clicar em cadastrar-se")
	public void clicarEmCadastrarSe() {
	    metodos.clicar(el.btnCadastre);
	   
	}
	@Then("valido cadastro com sucesso")
	public void validoCadastroComSucesso() {
		metodos.pausa(3000);
		metodos.tirarFoto("CT02- sistema aceita email que não existe");
	    
	}



	
	}

