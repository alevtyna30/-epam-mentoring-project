Feature: Main functionality of the website

Scenario: Check that website open successfully
  Given User navigates to the "https://www.highcharts.com/demo/combo-timeline"
  Then User checks try button visibility


  Scenario Outline: Check text in tooltips in the "Highsoft employees chart"
    Given User navigates to the <homePage>
    And User should 'accept cookies'
    And User turns off 'google search' chart
    And User disables 'revenue' chart
    When User hover mouse on 'first peak'
    Then User should see '<tooltip>' text



    Examples:
      | homePage                                         |tooltip                           |
      | "https://www.highcharts.com/demo/combo-timeline" |Grethe joined, 2 employees. Highsoft employees|



