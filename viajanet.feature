@feature
Feature: Compra de Reserva 
  
  @tag1
  Scenario: Preecher os campos da tela Passagens Aéreas
    Given que eu acesse o site do viajanet
    And clico na opção Ida e volta
    And Informe sua origem 
    And Informe seu destino 
    And Data de ida 
    And Data de volta
    When clico no botão pesquisar
    Then obtenho o resultado da pesquisa 

  @tag2
  Scenario: Preecher os dados da compra da viagem
    Given que eu clico em Comprar 
    And Informo o email
    And Informo o Nome 
    And Informo o Sobrenome
    And Informo a Data de nasc 
    And Informo o Sexo
    And Informo a forma de pagamento
    And Informo o Cartão
    And Informo o Número do cartão 
    And Informo os campos do Válido até
    And Informo o Nome do Titular do cartão 
    And Informo o CPF do titular do cartão    
    And Informo o CEP 
    And Informo o Endereço 
    And Informo o Número
    And Informo o Bairro 
    And Informo a Cidade 
    And Informo o Estado 
    And Informo o E-mail para envio de informação da compra 
    And Informo o Confirme seu e-mail 
    And Informo o tipo do Telefone 
    And Informo o Número do telefone 
    And Clico na opção Li e aceito as condições de compra
    When clico no botão Finalizar compra 
    Then o sistema exibe a tela de Reserva em processamneto.

  