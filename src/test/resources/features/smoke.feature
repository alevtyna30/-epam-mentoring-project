Feature: Main functionality of the website

Scenario: Check that website open successfully
  Given User navigates to the "https://www.highcharts.com/demo/combo-timeline"
  Then User checks try button visibility


  Scenario: Check text in tooltips in the "Highsoft employees chart"
    Given User navigates to the "https://www.highcharts.com/demo/combo-timeline"
    And User should 'accept cookies'
    And User turns off 'google search' chart
    And User disables 'revenue' chart
    And User clicks on 'chart context menu'
    And User choose from dropdown menu 'view in full screen'
    When User hover mouse on each peak and get all tooltip
    Then User checks that the list of tooltip should be equal with following:

      |November 1, 2009Torstein worked alone1 employees |
      | November 20, 2010Grethe joined2 employees       |
      | April 1, 2011Erik joined3 employees             |
      | August 1, 2011Gert joined4 employees            |
      | August 15, 2011Hilde joined5 employees          |
      | June 1, 2012Guro joined6 employees              |
      | September 1, 2012Erik left5 employees           |
      | September 15, 2012Anne Jorunn joined6 employees |
      | January 1, 2013Hilde T. joined7 employees       |
      | August 1, 2013Jon Arild joined8 employees       |
      | August 20, 2013Øystein joined9 employees        |
      | October 1, 2013Stephane joined10 employees      |
      | October 1, 2014Anita joined11 employees         |
      | November 27, 201411 employees                   |