package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;

public class TreinamentoPage extends TreinamentoElementMap {
	WebDriver driver;

	public TreinamentoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void buscarProduto(String produto) {
		search_query_top.sendKeys(produto);
		botaoPesquisar.click();
		logPrint("Buscou pelo produto " + produto);
	}

	public void addProduto() {
		moveToElement(btnAdd);
		addProduto.click();
		logPrint("Encontrou o botão de adicionar produto ao carrinho");
	}

	public void localizaContactUs() {
		logPrint("Encontrou o menu de contactUs");
		contactUs.click();
	}

	public void preencheCampos() {
		logPrint("Preencheu os dados corretamente");
		id_contact.sendKeys("Webmaster");
		email.sendKeys("teste@teste.com");
		message.sendKeys("Teste mensagem de envio");
		
	}

	public void botaoSend() {
		logPrint("Localizou botao de envio");
		submitMessage.click();
	}

	public void validaEnvio() {
		logPrint("Mensagem enviada com sucesso");
		mensagemEnviada.getText().equals("Your message has been successfully sent to our team.");
		
	}
	
	public void sigIn() {
		logPrint("Encontrou o menu de sigIn");
		sigIn.click();
	}
	
	public void preencheEmail() {
		logPrint("Preenche o e-mail para cadastro");
		email_create.sendKeys("teste2810@teste.com");
	}
	
	public void botaocreateAccount() {
		logPrint("Localizou botao de criar cadastro");
		createAccount.click();
	}
	
	public void preencheCamposCadastro() {
		logPrint("Preencheu os campos corretamente");
		id_gender2.click();
		customer_firstname.sendKeys("FirstName teste");
		customer_lastname.sendKeys("Last Name");
		passwd.sendKeys("teste123");
		days.sendKeys("1");
		months.sendKeys("January");
		years.sendKeys("1992");
		firstname.sendKeys("Endereço teste");
		lastname.sendKeys("Last Name teste");
		company.sendKeys("Endereço teste");
		address1.sendKeys("Address teste");
		city.sendKeys("Sacramento");
		id_state.sendKeys("California");
		postcode.sendKeys("90001");
		phone_mobile.sendKeys("5598484894");
		alias.sendKeys("alias teste");
	}
	
	public void btnSendCadastro () {
		logPrint("Efetua o cadastro atraves do botao");
		submitAccount.click();
	}
	
	public void validaCadastro (String msg) {
		logPrint("Cadastro efetuado com sucesso");
		String teste = CadastroEfetuado.getText();
		String teste2 = CadastroEfetuado.getText().toString();
		CadastroEfetuado.getText().equals(msg);		
	}
	

}
