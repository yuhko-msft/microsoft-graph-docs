---
title: "Create meetingRegistration"
description: "Create a new meetingRegistration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create meetingRegistration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [meetingRegistration](../resources/meetingregistration.md) object.

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
POST ** Collection URI for microsoft.graph.meetingRegistration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [meetingRegistration](../resources/meetingregistration.md) object.

You can specify the following properties when creating a **meetingRegistration**.

|Property|Type|Description|
|:---|:---|:---|
|registrationPageWebUrl|String|**TODO: Add Description** Optional.|
|allowedRegistrant|meetingAudience|**TODO: Add Description**. The possible values are: `everyone`, `organization`, `unknownFutureValue`. Optional.|
|subject|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|startDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|endDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|registrationPageViewCount|Int32|**TODO: Add Description** Optional.|
|speakers|[meetingSpeaker](../resources/meetingspeaker.md) collection|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [meetingRegistration](../resources/meetingregistration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_meetingregistration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.meetingRegistration not found
Content-Type: application/json
Content-length: 403

{
  "@odata.type": "#microsoft.graph.meetingRegistration",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

