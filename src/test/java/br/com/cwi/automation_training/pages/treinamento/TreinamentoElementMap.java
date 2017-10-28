package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;

public class TreinamentoElementMap extends BasePage {

	protected WebElement search_query_top;
	protected WebElement id_contact;
	protected WebElement email;
	protected WebElement message;
	protected WebElement submitMessage;
	protected WebElement email_create;
	protected WebElement id_gender2;
	protected WebElement customer_firstname;
	protected WebElement customer_lastname;
	protected WebElement passwd;
	protected WebElement days;
	protected WebElement months;
	protected WebElement years;
	protected WebElement firstname;
	protected WebElement lastname;
	protected WebElement company;
	protected WebElement address1;
	protected WebElement city;
	protected WebElement id_state;
	protected WebElement postcode;
	protected WebElement phone_mobile;
	protected WebElement alias;
	protected WebElement submitAccount;
	
	
	@FindBy(css = ".button-search")
	protected WebElement botaoPesquisar;
	
/*	@FindBy(css = ".ajax_add_to_cart_button")
	protected WebElement addProduto;*/
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[3]/ul")
	protected WebElement btnAdd;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	protected WebElement addProduto;
	
	@FindBy(xpath = "//*[@id=\'contact-link\']/a")
	protected WebElement contactUs;
	
	@FindBy(xpath = "//*[@id=\'center_column\']/p")
	protected WebElement mensagemEnviada;
	
	@FindBy (xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	protected WebElement sigIn;
	
	@FindBy (xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	protected WebElement createAccount;
	
	@FindBy (xpath = "//*[@id=\'center_column\']/p")	
	protected WebElement CadastroEfetuado;
	
	
	
}