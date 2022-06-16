Feature: verify ass place api

Scenario: verify addplace api adds address successfully

Given api payload  passed
When user calls AddplaceApi with POST method
Then receives success status code
And  received status response as ok



