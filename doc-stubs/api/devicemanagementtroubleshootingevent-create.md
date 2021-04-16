---
title: "Create deviceManagementTroubleshootingEvent"
description: "Create a new deviceManagementTroubleshootingEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementTroubleshootingEvent
Namespace: microsoft.graph



Create a new [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) object.

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
POST /deviceManagement/troubleshootingEvents
POST /me/deviceManagementTroubleshootingEvents
POST /users/{usersId}/deviceManagementTroubleshootingEvents
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) object.

The following table shows the properties that are required when you create the [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|additionalInformation|[keyValuePair](../resources/keyvaluepair.md) collection|A set of string key and string value pairs which provides additional information on the Troubleshooting event|
|correlationId|String|Id used for tracing the failure in the service.|
|eventDateTime|DateTimeOffset|Time when the event occurred .|
|eventName|String|Event Name corresponding to the Troubleshooting Event. It is an Optional field|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/devicemanagementtroubleshootingerrordetails.md)|Object containing detailed information about the error and its remediation.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementtroubleshootingevent_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/troubleshootingEvents
Content-Type: application/json
Content-length: 403

{
  "@odata.type": "#microsoft.graph.deviceManagementTroubleshootingEvent",
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
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementTroubleshootingEvent"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementTroubleshootingEvent",
  "id": "df09594a-594a-df09-4a59-09df4a5909df",
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
  }
}
```

