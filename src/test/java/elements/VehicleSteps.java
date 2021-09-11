package elements;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VehicleSteps {
	
	@Given("acesso o sistema Sampleapp")
	public void acesso_o_sistema_sampleapp() {

	}

	@And("informo os dados do veiculo")
	public void informo_os_dados_do_veiculo() {
	    VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.informo_os_dados_do_veiculo();
	}

	@Then("clico no botao NextInsuranceData")
	public void clico_no_botao_next_insurance_data() {
	    VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.clico_no_botao_next_insurance_data();
	}

	@And("informo os dados do segurado")
	public void informo_os_dados_do_segurado() {
	    VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.informo_os_dados_do_segurado();
	}
	
	@Then("clico no botao NextProductData")
	public void clico_no_botao_next_product_data() {
		VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.clico_no_botao_next_product_data();
	}

	@And("informo os dados do produto")
	public void informo_as_informacoes_do_produto() {
	    VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.informo_as_informacoes_do_produto();
	}
	
	@Then("clico no botao NextSelectPriceOption")
	public void clico_no_botao_NextSelectPriceOption() {
		VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.clico_no_botao_NextSelectPriceOption();
	}
	
	@And("informo os dados do preco")
	public void informo_os_dados_do_preco() {
	    VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.informo_os_dados_do_preco();
	}
	

	@And("preencho as informacoes para serem enviadas")
	public void preencho_as_informacoes_para_serem_enviadas() {
	    VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.preencho_as_informacoes_para_serem_enviadas();
	}
	
	@Then("clico no botao NextSendEmail")
	public void clico_no_botao_NextSendEmail() {
		VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.clico_no_botao_NextSendEmail();
	}
	
	@Then("clico no botao NextSendQuote")
	public void clico_no_botao_next_send_quote() {
		VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.clico_no_botao_next_send_quote();
	}
	

	@Then("aparece a mensagem de sucesso")
	public void aparece_a_mensagem_de_sucesso() {
	    VehiclePage vehiclePage = new VehiclePage();
	    vehiclePage.aparece_a_mensagem_de_sucesso();
	}

}
