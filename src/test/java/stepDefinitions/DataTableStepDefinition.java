package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablePage;

public class DataTableStepDefinition {
    DataTablePage dataTablePage =new DataTablePage();

    @Then("kullanici sayfadaki tabloda new butonuna basar")
    public void kullaniciSayfadakiTablodaNewButonunaBasar() {
        dataTablePage.newButton.click();
    }

    @Then("kullanici verilen bilgileri girer {string},{string},{string},{string},{string},{string},{string}")
    public void kullaniciVerilenBilgileriGirer(String name, String lastName, String position, String office, String ext, String date, String salary) {
  dataTablePage.firstName.sendKeys(name,Keys.TAB,lastName,Keys.TAB,position,Keys.TAB,office,Keys.TAB,ext,Keys.TAB,date,Keys.TAB,salary);
    }

    @And("creat buttonuna basar")
    public void creatButtonunaBasar() {
        dataTablePage.createButton.click();
    }

    @Then("kullanici search bolumune {string} bilgisi girer")
    public void kullaniciSearchBolumuneBilgisiGirer(String name) {
        dataTablePage.searcBox.sendKeys(name);
    }

    @And("kullanici {string} ile basarili birsekilde kayit yapildigini dogrular")
    public void kullaniciIleBasariliBirsekildeKayitYapildiginiDogrular(String name) {
        Assert.assertTrue(dataTablePage.searchVerify.getText().contains(name));
    }
}
