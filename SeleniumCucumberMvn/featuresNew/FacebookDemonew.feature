#Author: your.email@your.domain.com
Feature: Smoke test FB

  Scenario: Open Browser
    Given Launch chrome browser
    When Browser is opened
    Then Home page is visible

  Scenario Outline: Open Browser
    Given Launch chrome browser
    When Browser is opened
    Then Home page is visible <Data>

    Examples: 
      | Data    |
      | "Test1" |
      | "Test2" |
