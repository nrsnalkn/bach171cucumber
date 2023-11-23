package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasını sağlayan scenario çalıştırıcı notasyonu
@CucumberOptions(plugin = {"pretty",//pretty->konsolda scenariolar ile ilgili ayrıntılı bilgi verir
        "html:target/default-cucumber-reports1.html",
        "json:target/json-reports/cucumber1.json",
        "junit:target/xml-report/cucumber1.xml",
        "rerun:TestOutput/failed_scenario.txt"  },
        /*
        -rerun plugin'i ile fail olan scenarioları failed_scenario.txt dosyası içinde tutabiliriz.
        -Paralel çalıştırmalar sonucu detaylı rapor alabilmek için Runner classlarındaki rapor isimlerini
        yukarıdaki gibi değiştirmemiz gerekir. Böylece raporları üstüste yazmamış olur ve çalıştırdığımız
        her ruuner için ayrı ayrı tekbir html sayfasında raporu görebiliriz
         */
        features = "src/test/resources/features", //features package'ının yolu (content root)
        glue = "stepDefinitions", //stepDefinitions package ismi
        tags = "@a1", //Hangi scenarioları bu tag'ı belirtirsek o scenariolar çalışır
        dryRun = false, //true seçersek scenariolari kontrol eder browser'ı çalıştırmaz
        monochrome = true//-->true kullanırsak konsoldaki çıktıları tek renk(siyah) olarak verir
)


public class Runner {
}
/*
    Runner class'ı testNG deki xml file gibi istediğimiz scenario'lari tek seferde çalıştırmamıza yardımcı olur
    @CucumberOptions notasyonu ile scenarioların nasıl çalışacağı hangi raporu kullanacağı ile alakalı
    parametreler içeren notasyondur

    dryRun parametresi eğer true seçilirse scenariolari çalıştırmadan feature file daki steplerin
    stepDefinition class'ındaki methodlar ile uyuşuğ uyuşmadığını kontrol eder ve browser'ı çalıştırmaz
 */