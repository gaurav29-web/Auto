@Regression @Tag1
Feature: This feature tests API

  Scenario: Post - Insert Message Attachment
    Given user performs a mesaage attachment operation
    When user passes query params
      | key | value               |
      | app | MAPS_API            |
      | mod | FOUNDATION_SERVICES |
    And with request headers for message attachment
      | key    | value                   |
      | router | MessageAttachment       |
      | action | InsertMessageAttachment |
    And with MessageAttachment request body from file "AlertOps/POST_messageAttachment_Insert_body"
    When user gets a MessageAttachment "POST" API response for the "MessageAttachment" with status 200 and a serviceResponseCode of 200
    Then MessageAttachment response json element "status" is equal to "ApplicationMessage"
    And MessageAttachment response json element "message" begins with "messageResponse"
    And MessageAttachment response json element "count" is equal to 0
