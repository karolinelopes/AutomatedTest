#Author: karoline.silva7@fatec.sp.gov.br
Feature: Cadastrar veiculo

  Scenario: preencher os dados
    Given acesso o sistema Sampleapp
    And informo os dados do veiculo
    Then clico no botao NextInsuranceData
    And informo os dados do segurado
    Then clico no botao NextProductData
    And informo os dados do produto
    Then clico no botao NextSelectPriceOption
    And informo os dados do preco
    Then clico no botao NextSendQuote
    And preencho as informacoes para serem enviadas
    Then clico no botao NextSendEmail
    Then aparece a mensagem de sucesso
