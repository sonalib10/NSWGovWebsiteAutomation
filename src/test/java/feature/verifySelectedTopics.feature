Feature: Verify selected topics on nsw website
  This test case is to verify user can select topics from NSW website

  Scenario: To select topics and verify filter is applied

    Given User navigate to NSW page
    When Select Topic and sub topics
    Then Verify Topics are selected and filter is applied





  Scenario: : To verify reset filter functionality

    Given User navigate to NSW page
    When Select Topic and sub topics
    Then Verify reset filter button removes applied filter on topics

