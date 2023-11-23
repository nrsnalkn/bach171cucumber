Feature: Us003 Amazon testi
  #Feature file de kullanacağımız scenario'larda ortak adımlar var ise Feature: anahtar kelimesinden
#sonra Background: anahtar kelimesi ile ortak adımları belirtebiliriz. Background yapısı
#@BeforeMethod mantığı ile çalışır.
#TASK: 3 tane Scenario: oluşturup Amazon sayfasında iphone, samsung ve nokia aratınız.
  Background: Amazon Sayfasina Gidilir
    Given kullanici amazon sayfasina gider
@iphone
  Scenario: TC01 arama kutusunda iphone aratilir
    Then arama kutusunda iphone aratir

@samsung
  Scenario: Tc02 arama kutusunda samsung aratilir
    Then arama kutusunda samsung aratir
    And sayfayi kapatir



  #Daha önce oluşturduğunuz steplerin methodlarını tekrar kullanmak istediğinizde,
  #Given,And,Then,When,But anahtar kelimeli yerine *(yıldız) kullanılabilir



