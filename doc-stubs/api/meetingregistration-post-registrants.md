---
title: "Create meetingRegistrant"
description: "Create a new meetingRegistrant object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create meetingRegistrant
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [meetingRegistrant](../resources/meetingregistrant.md) object.

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
POST /me/onlineMeetings/{onlineMeetingId}/registration/registrants
POST /users/{usersId}/onlineMeetings/{onlineMeetingId}/registration/registrants
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [meetingRegistrant](../resources/meetingregistrant.md) object.

You can specify the following properties when creating a **meetingRegistrant**.

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

If successful, this method returns a `201 Created` response code and a [meetingRegistrant](../resources/meetingregistrant.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_meetingregistrant_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/me/onlineMeetings/{onlineMeetingId}/registration/registrants
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
  "truncated": true,
  "@odata.type": "microsoft.graph.meetingRegistrant"
}
-->
``` http
HTTP/1.1 201 Created
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

