---
title: "Create deviceManagementConnectorTroubleshootingEvent"
description: "Create a new deviceManagementConnectorTroubleshootingEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementConnectorTroubleshootingEvent
Namespace: microsoft.graph

Create a new [deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md) object.

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
POST /deviceManagement/connectorEvents
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md) object.

The following table shows the properties that are required when you create the [deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|eventDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|correlationId|String|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/intune-devicemanagementtroubleshootingerrordetails.md)|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|eventName|String|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|additionalInformation|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|source|String|**TODO: Add Description**|
|eventIdentifier|Int32|**TODO: Add Description**|
|level|logLevel|**TODO: Add Description**. Possible values are: `logAlways`, `critical`, `error`, `warning`, `information`, `verbose`.|
|diagnosticCode|String|**TODO: Add Description**|
|diagnosticText|String|**TODO: Add Description**|
|rawData|Binary|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementconnectortroubleshootingevent_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/connectorEvents
Content-Type: application/json
Content-length: 576

{
  "@odata.type": "#microsoft.graph.deviceManagementConnectorTroubleshootingEvent",
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
  "source": "String",
  "eventIdentifier": "Integer",
  "level": "String",
  "diagnosticCode": "String",
  "diagnosticText": "String",
  "rawData": "Binary"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementConnectorTroubleshootingEvent"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementConnectorTroubleshootingEvent",
  "id": "6f55be4e-be4e-6f55-4ebe-556f4ebe556f",
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
  "source": "String",
  "eventIdentifier": "Integer",
  "level": "String",
  "diagnosticCode": "String",
  "diagnosticText": "String",
  "rawData": "Binary"
}
```

