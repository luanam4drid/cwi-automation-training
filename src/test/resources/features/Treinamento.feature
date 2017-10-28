#language: pt
#encoding: iso-8859-1
Funcionalidade: Compra

  @treinamento
  Cenario: Adicionar produto ao carrinho
    Dado que estou na homepage do site "http://automationpractice.com"
    E pesquiso pelo produto "Dress"
    Quando clico no botão "Add to cart"

  #Entao deve apresentar a mensagem "Product successfully added to your shopping cart"
  @treinamento1
  Cenario: Mensagem de Fale Conosco
    Dado que estou na homepage do site "http://automationpractice.com"
    E clico no menu "Contact Us"
    E Preencho os dados obrigatorios do formmulario
    Quando Clico no botao send
    Entao deve apresentar a mensagem "Your message has been successfully sent to our team"

  @treinamento2
  Cenario: Cadastro novo usario
    Dado que estou na homepage do site "http://automationpractice.com"
    E clico no menu sigIn
    E Preencho o campo de email
    E Clico no botao Create an account
    E Preencho os dados obrigatorios do formmulario
    Quando Clico no botao send
    Entao deve apresentar a mensagem de bem vindo"Welcome to your account. Here you can manage all of your personal information and orders."
