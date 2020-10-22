---
title: "Get enrollmentTroubleshootingEvent"
description: "Read the properties and relationships of an enrollmentTroubleshootingEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get enrollmentTroubleshootingEvent
Namespace: microsoft.graph

Read the properties and relationships of an [enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /enrollmentTroubleshootingEvent
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

If successful, this method returns a `200 OK` response code and an [enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_enrollmenttroubleshootingevent"
}
-->
``` http
GET https://graph.microsoft.com/beta/enrollmentTroubleshootingEvent
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.enrollmentTroubleshootingEvent"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.enrollmentTroubleshootingEvent",
    "id": "643869f8-69f8-6438-f869-3864f8693864",
    "eventDateTime": "String (timestamp)",
    "correlationId": "String",
    "troubleshootingErrorDetails": {
      "@odata.type": "microsoft.graph.deviceManagementTroubleshootingErrorDetails"
    },
    "eventName": "String",
    "additionalInformation": [
      {
        "@odata.type": "microsoft.graph.keyValuePair"
      }
    ],
    "managedDeviceIdentifier": "String",
    "operatingSystem": "String",
    "osVersion": "String",
    "userId": "String",
    "deviceId": "String",
    "enrollmentType": "String",
    "failureCategory": "String",
    "failureReason": "String"
  }
}
```

