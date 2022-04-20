Feature: as a user I want to calculate my return on investment
  I as a user
  want to simulate investing in a CDT from Fallabella bank
  to see the results given.

@story
Scenario: simulate investing
  Given the user enters Falabella bank's web page
  When the user enters the simulation data
    |value  |investment_term|type_cdt      |periodicity|
    |500000 |90             |CDT tasa fija |Mensual    |
  Then verify that the results of the simulation were obtained
