---
title: "Get meetingRegistration"
description: "Read the properties and relationships of a meetingRegistration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get meetingRegistration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [meetingRegistration](../resources/meetingregistration.md) object.

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
GET /me/onlineMeetings/{onlineMeetingId}/registration
GET /users/{usersId}/onlineMeetings/{onlineMeetingId}/registration
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

If successful, this method returns a `200 OK` response code and a [meetingRegistration](../resources/meetingregistration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_meetingregistration"
}
-->
``` http
GET https://graph.microsoft.com/beta/me/onlineMeetings/{onlineMeetingId}/registration
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.meetingRegistration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.meetingRegistration",
    "id": "c9b9c0c8-c0c8-c9b9-c8c0-b9c9c8c0b9c9",
    "registrationPageWebUrl": "String",
    "allowedRegistrant": "String",
    "subject": "String",
    "description": "String",
    "startDateTime": "String (timestamp)",
    "endDateTime": "String (timestamp)",
    "registrationPageViewCount": "Integer",
    "speakers": [
      {
        "@odata.type": "microsoft.graph.meetingSpeaker"
      }
    ]
  }
}
```

