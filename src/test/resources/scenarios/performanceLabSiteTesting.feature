Feature: PerformanceLab Site Testing

  Background: PerformanceLab Site Opened
    Given open url "https://www.performance-lab.ru/"

  Scenario: go to website testing page
    And hover on "Услуги и продукты"
    And click "Автоматизация тестирования"
    Then check url is "https://www.performance-lab.ru/avtomatizacija-testirovanija"