Feature: Examples from the problem description https://www.hackerrank.com/challenges/sock-merchant/problem
  Scenario: Happy Scenarios
    Given A Sock Matching program
    When there are 7 socks with colors
    | 1 | 2 | 1 | 2 | 1 | 3 | 2 |
    Then we can sell 2 pairs of socks
