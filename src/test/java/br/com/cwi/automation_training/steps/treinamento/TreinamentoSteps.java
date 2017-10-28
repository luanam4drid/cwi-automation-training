package br.com.cwi.automation_training.steps.treinamento;

import org.junit.Assert;

import br.com.cwi.automation_training.pages.selenium.FabricaDeTestesPage;
import br.com.cwi.automation_training.pages.treinamento.TreinamentoPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TreinamentoSteps {	
	
	@Dado("que estou na homepage do site \"(.*)\"")
	public void acessarHomePage(String url) {
		TestRule.openApplicationChrome(url);
	}
	
	@E("pesquiso pelo produto \"(.*)\"")
	public void pesquisarProduto(String nomeProduto) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.buscarProduto(nomeProduto);
	}
	@Quando ("clico no botao \".*\"")
	public void addProduto() {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.addProduto();
	}
	
	@E("clico no menu \"(.*)\"")
	public void localizabotao(String nomebotao) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.localizaContactUs();
	}
	
	@E("Preencho os dados obrigatorios do formmulario")
	public void preencheDados() {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.localizaContactUs();
		treinamentoPage.preencheCampos();
	}
	
	@E("Clico no botao send")
	public void botaoSend() {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.botaoSend();
	}
	
	@Entao("deve apresentar a mensagem")
	public void validaEnvio() {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.validaEnvio();
	}
	
	@E("clico no menu sigIn")
	public void sigIn() {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.sigIn();
	}
	
	@E("Preencho o campo de email")
	public void preencheEmail() {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.preencheEmail();
	}
	
	@E("Clico no botao Create an account")
	public void createAccount () {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.botaocreateAccount();
	}
	
	@E("Preencho os dados obrigatorios do formmulario")
	public void preencheCamposCadastro () {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.preencheCamposCadastro();
	}
	@Quando ("Clico no botao send")
	public void btnSendCadastro () {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.btnSendCadastro();
	}
	
	@Entao ("deve apresentar a mensagem de bem vindo\"(.*)\"")
	public void validaCadastro (String msg) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.validaCadastro(msg);
	}
	
	
}
