---
title: "Create appleVppTokenTroubleshootingEvent"
description: "Create a new appleVppTokenTroubleshootingEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create appleVppTokenTroubleshootingEvent
Namespace: microsoft.graph



Create a new [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) object.

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
POST ** Collection URI for microsoft.graph.appleVppTokenTroubleshootingEvent not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) object.

The following table shows the properties that are required when you create the [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|additionalInformation|[keyValuePair](../resources/keyvaluepair.md) collection|A set of string key and string value pairs which provides additional information on the Troubleshooting event Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|correlationId|String|Id used for tracing the failure in the service. Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|eventDateTime|DateTimeOffset|Time when the event occurred . Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|eventName|String|Event Name corresponding to the Troubleshooting Event. It is an Optional field Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/devicemanagementtroubleshootingerrordetails.md)|Object containing detailed information about the error and its remediation. Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|tokenId|String|Apple Volume Purchase Program Token Identifier.|



## Response

If successful, this method returns a `201 Created` response code and an [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_applevpptokentroubleshootingevent_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.appleVppTokenTroubleshootingEvent not found
Content-Type: application/json
Content-length: 424

{
  "@odata.type": "#microsoft.graph.appleVppTokenTroubleshootingEvent",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

