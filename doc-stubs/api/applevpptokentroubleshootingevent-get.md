---
title: "Get appleVppTokenTroubleshootingEvent"
description: "Read the properties and relationships of an appleVppTokenTroubleshootingEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get appleVppTokenTroubleshootingEvent
Namespace: microsoft.graph



Read the properties and relationships of an [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) object.

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
GET /appleVppTokenTroubleshootingEvent
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

If successful, this method returns a `200 OK` response code and an [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_applevpptokentroubleshootingevent"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/appleVppTokenTroubleshootingEvent
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.appleVppTokenTroubleshootingEvent"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.appleVppTokenTroubleshootingEvent",
    "id": "39a401f0-01f0-39a4-f001-a439f001a439",
    "additionalInformation": [
      {
        "@odata.type": "microsoft.graph.keyValuePair"
      }
    ],
    "correlationId": "String",
    "eventDateTime": "String (timestamp)",
    "eventName": "String",
    "troubleshootingErrorDetails": {
      "@odata.type": "microsoft.graph.deviceManagementTroubleshootingErrorDetails"
    },
    "tokenId": "String"
  }
}
```

