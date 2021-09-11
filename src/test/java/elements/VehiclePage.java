package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VehiclePage extends VehicleElementMap {

	
	public VehiclePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void informo_os_dados_do_veiculo() {
		Select cmbMake = new Select(make);
		cmbMake.selectByVisibleText("Audi");
		Select cmbModel = new Select(model);
		cmbModel.selectByVisibleText("Scooter");
		cylindercapacity.sendKeys("1");
		engineperformance.sendKeys("100");
		dateofmanufacture.sendKeys("09/09/2021");
		Select cmbNumberSeats = new Select(numberofseats);
		cmbNumberSeats.selectByVisibleText("5");
		Select cmbNumberSeatsMotor = new Select(numberofseatsmotorcycle);
		cmbNumberSeatsMotor.selectByVisibleText("2");
		Select cmbFuel= new Select(fuel);
		cmbFuel.selectByVisibleText("Petrol");
		payload.sendKeys("1000");
		totalweight.sendKeys("1000");
		listprice.sendKeys("1000");
		licenseplatenumber.sendKeys("123");
		annualmileage.sendKeys("123");
		
	}

	public void clico_no_botao_next_insurance_data() {
		nextenterinsurantdata.click();
	}

	public void informo_os_dados_do_segurado() {
		firstname.sendKeys("Karoline");
		lastname.sendKeys("Silva");
		birthdate.sendKeys("03/16/1995");
		//female.click();
		streetaddress.sendKeys("Rua Mario Nieiri");
		Select cmbCountry= new Select(country);
		cmbCountry.selectByVisibleText("Brazil");
		zipcode.sendKeys("18112290");
		city.sendKeys("Votorantim");
		Select cmbOccupation= new Select(occupation);
		cmbOccupation.selectByVisibleText("Employee");
		website.sendKeys("github.com/karolinelopes");
	}
	
	public void clico_no_botao_next_product_data() {
		nextenterproductdata.click();
	}

	public void informo_as_informacoes_do_produto() {
		startdate.sendKeys("10/14/2021");
		Select cmbInsurancesum= new Select(insurancesum);
		cmbInsurancesum.selectByVisibleText("3000000");
		Select cmbMeritrating= new Select(meritrating);
		cmbMeritrating.selectByVisibleText("Super Bonus");
		Select cmbDamageinsurance= new Select(damageinsurance);
		cmbDamageinsurance.selectByVisibleText("No Coverage");
		EuroProtection.click();
		Select cmbCourtesycar= new Select(courtesycar);
		cmbCourtesycar.selectByVisibleText("Yes");
		
	}
	
	public void clico_no_botao_NextSelectPriceOption() {
		
	}

	public void informo_os_dados_do_preco() {
		selectsilver_price.click();	
	}
	
	public void clico_no_botao_next_send_quote() {
		nextsendquote.click();
	}

	public void preencho_as_informacoes_para_serem_enviadas() {
		email.sendKeys("karoline.silva7@fatec.sp.gov.br");
		phone.sendKeys("15998261665");
		username.sendKeys("karolinelopes");
		password.sendKeys("Senha123");
		confirmpassword.sendKeys("Senha123");
		Comments.sendKeys("Teste automatizado com Selenium, Java Cucumber, Junit e Gheking");
		
	}
	
	public void clico_no_botao_NextSendEmail() {
		sendemail.click();
	}

	public void aparece_a_mensagem_de_sucesso() {
		//protected WebElement senQuote;
		
	}

	

}
