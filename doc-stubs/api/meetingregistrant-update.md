---
title: "Update meetingRegistrant"
description: "Update the properties of a meetingRegistrant object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update meetingRegistrant
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [meetingRegistrant](../resources/meetingregistrant.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /me/onlineMeetings/{onlineMeetingId}/registration/registrants/{meetingRegistrantId}
PATCH /users/{usersId}/onlineMeetings/{onlineMeetingId}/registration/registrants/{meetingRegistrantId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|registrationDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|joinWebUrl|String|**TODO: Add Description** Optional.|
|firstName|String|**TODO: Add Description** Optional.|
|lastName|String|**TODO: Add Description** Optional.|
|email|String|**TODO: Add Description** Optional.|
|status|meetingRegistrantStatus|**TODO: Add Description**. The possible values are: `registered`, `canceled`, `processing`, `unknownFutureValue`. Optional.|
|customQuestionAnswers|[customQuestionAnswer](../resources/customquestionanswer.md) collection|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [meetingRegistrant](../resources/meetingregistrant.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_meetingregistrant"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/onlineMeetings/{onlineMeetingId}/registration/registrants/{meetingRegistrantId}
Content-Type: application/json
Content-length: 342

{
  "@odata.type": "#microsoft.graph.meetingRegistrant",
  "registrationDateTime": "String (timestamp)",
  "joinWebUrl": "String",
  "firstName": "String",
  "lastName": "String",
  "email": "String",
  "status": "String",
  "customQuestionAnswers": [
    {
      "@odata.type": "microsoft.graph.customQuestionAnswer"
    }
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.meetingRegistrant",
  "id": "0877109d-109d-0877-9d10-77089d107708",
  "registrationDateTime": "String (timestamp)",
  "joinWebUrl": "String",
  "firstName": "String",
  "lastName": "String",
  "email": "String",
  "status": "String",
  "customQuestionAnswers": [
    {
      "@odata.type": "microsoft.graph.customQuestionAnswer"
    }
  ]
}
```

