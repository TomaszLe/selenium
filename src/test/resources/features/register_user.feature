
Feature: Rejestracja uzytkownika
  Testy funkcjonalnosci dodawania nowego uzytkownika
  w aplikacji seleniumdemo. Linijki opisu są pomijane
  i nie mają wpływu na wykonanie testu

  Scenario: Tworzenie uzytkownika z unikalnym adresem email
    Given Uzytkownik z unikalnym adresem email
    When Uzytkownik rejestruje sie w aplikacji
    Then Uzytkownik powinien zostac przeniesiony na strone zalogowanego uzytkownika

  Scenario: Tworzenie uzytkownika z adresem email ktory juz istnieje w bazie danych

    Given Uzytkownik z istniejacym w aplikacji adresem email
    When Uzytkownik rejestruje sie w aplikacji
    Then Zostaje wyswietlony komunikat " An account is already registered with your email address" a uzytkownik pozostaje na stronie logowania