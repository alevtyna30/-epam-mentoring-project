Feature: Main functionality of the website

Scenario: Check that website open successfully
  Given User navigates to the "https://www.highcharts.com/demo/combo-timeline"
  Then User checks try button visibility


  Scenario Outline: Check text in tooltips in the "Highsoft employees chart"
    Given User navigates to the "https://www.highcharts.com/demo/combo-timeline"
    And User should 'accept cookies'
    And User turns off 'google search' chart
    And User disables 'revenue' chart
    When User hover mouse on peak with <index> index
    Then User should see '<tooltip>' text



    Examples:
      | index | tooltip                                         |
      | 1     | November 20, 2010Grethe joined2 employees       |
      | 2     | April 1, 2011Erik joined3 employees             |
      | 3     | August 1, 2011Gert joined4 employees            |
      | 4     | August 15, 2011Hilde joined5 employees          |
      | 5     | June 1, 2012Guro joined6 employees              |
      | 6     | September 1, 2012Erik left5 employees           |
      | 7     | September 15, 2012Anne Jorunn joined6 employees |
      | 8     | January 1, 2013Hilde joined7 employees          |
      | 9     | August 1, 2013JonArild joined8 employees        |
      | 10    | August 20, 2013Oystein joined9 employees        |
      | 11    | October 1, 2013Stephane joined10 employees      |
      | 12    | October 1, 2014Anita joined11 employees         |
      | 13    | November 27, 201411 employees                   |