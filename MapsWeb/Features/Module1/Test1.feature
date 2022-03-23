Feature: test1

  Background: 
    Given LaunchApp
    When App is launched

  Scenario Outline: Verify Test1
    Given Step1
    When Step2
    Then Step3 with param <Param1>

    Examples: 
      | Param1  |
      | "Test1" |
