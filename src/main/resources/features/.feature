Feature: Main functionality of the website

Scenario Outline: Check that website open successfully
  Given User navigates to the '<website>'
  Then User checks try button visibility

Examples:
| website                                        |
| https://www.highcharts.com/demo/combo-timeline |

