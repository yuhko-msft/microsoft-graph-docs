---
title: "List mobileAppTroubleshootingEvents"
description: "Get a list of the mobileAppTroubleshootingEvent objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List mobileAppTroubleshootingEvents
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) objects and their properties.

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
GET /me/mobileAppTroubleshootingEvents
GET /users/{usersId}/mobileAppTroubleshootingEvents
GET /deviceManagement/mobileAppTroubleshootingEvents
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

If successful, this method returns a `200 OK` response code and a collection of [mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_mobileapptroubleshootingevent"
}
-->
``` http
GET https://graph.microsoft.com/beta/me/mobileAppTroubleshootingEvents
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.mobileAppTroubleshootingEvent)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.mobileAppTroubleshootingEvent",
      "id": "b53d5ba8-5ba8-b53d-a85b-3db5a85b3db5",
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
      "applicationId": "String",
      "history": [
        {
          "@odata.type": "microsoft.graph.mobileAppTroubleshootingHistoryItem"
        }
      ],
      "managedDeviceIdentifier": "String",
      "userId": "String"
    }
  ]
}
```

