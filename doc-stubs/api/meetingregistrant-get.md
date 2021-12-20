---
title: "Get meetingRegistrant"
description: "Read the properties and relationships of a meetingRegistrant object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get meetingRegistrant
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [meetingRegistrant](../resources/meetingregistrant.md) object.

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
GET /me/onlineMeetings/{onlineMeetingId}/registration/registrants/{meetingRegistrantId}
GET /users/{usersId}/onlineMeetings/{onlineMeetingId}/registration/registrants/{meetingRegistrantId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [meetingRegistrant](../resources/meetingregistrant.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_meetingregistrant"
}
-->
``` http
GET https://graph.microsoft.com/beta/me/onlineMeetings/{onlineMeetingId}/registration/registrants/{meetingRegistrantId}
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

