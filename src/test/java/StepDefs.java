import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {
    @Given("Uzytkownik z unikalnym adresem email")
    public void uzytkownikZUnikalnymAdresemEmail() {
        System.out.println("Tworzenie użytkownika z unikalnym adresem");
    }

    @When("Uzytkownik rejestruje sie w aplikacji")
    public void uzytkownikRejestrujeSieWAplikacji() {
        System.out.println("Rejestracja uzytkownika");
    }

    @Then("Uzytkownik powinien zostac przeniesiony na strone zalogowanego uzytkownika")
    public void uzytkownikPowinienZostacPrzeniesionyNaStroneZalogowanegoUzytkownika() {
        System.out.println("Asercka spr czy uzytkownik jest na odpowiedniej stronie");
    }

    @Given("Uzytkownik z istniejacym w aplikacji adresem email")
    public void uzytkownikZIstniejacymWAplikacjiAdresemEmail() {
        System.out.println("Tworzenie użytkownika z adresem istniejacym w aplikacji");
    }

    @Then("Zostaje wyswietlony komunikat {string} a uzytkownik pozostaje na stronie logowania")
    public void zostajeWyswietlonyKomunikatAUzytkownikPozostajeNaStronieLogowania(String arg0) {
        System.out.println("Sprawdzenie czy zostal wyswietlony blad");
    }

}
