---
title: "deviceManagementConnectorTroubleshootingEvent resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConnectorTroubleshootingEvent resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConnectorTroubleshootingEvents](../api/intune-devicemanagementconnectortroubleshootingevent-list.md)|[deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md) collection|Get a list of the [deviceManagementConnectorTroubleshootingEvent](../resources/devicemanagementconnectortroubleshootingevent.md) objects and their properties.|
|[Create deviceManagementConnectorTroubleshootingEvent](../api/intune-devicemanagementconnectortroubleshootingevent-create.md)|[deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md)|Create a new [deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md) object.|
|[Get deviceManagementConnectorTroubleshootingEvent](../api/intune-devicemanagementconnectortroubleshootingevent-get.md)|[deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md)|Read the properties and relationships of a [deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md) object.|
|[Update deviceManagementConnectorTroubleshootingEvent](../api/intune-devicemanagementconnectortroubleshootingevent-update.md)|[deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md)|Update the properties of a [deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md) object.|
|[Delete deviceManagementConnectorTroubleshootingEvent](../api/intune-devicemanagementconnectortroubleshootingevent-delete.md)|None|Deletes a [deviceManagementConnectorTroubleshootingEvent](../resources/intune-devicemanagementconnectortroubleshootingevent.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalInformation|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|correlationId|String|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|diagnosticCode|String|**TODO: Add Description**|
|diagnosticText|String|**TODO: Add Description**|
|eventDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|eventIdentifier|Int32|**TODO: Add Description**|
|eventName|String|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|level|logLevel|**TODO: Add Description**. Possible values are: `logAlways`, `critical`, `error`, `warning`, `information`, `verbose`.|
|rawData|Binary|**TODO: Add Description**|
|source|String|**TODO: Add Description**|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/intune-devicemanagementtroubleshootingerrordetails.md)|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConnectorTroubleshootingEvent",
  "baseType": "microsoft.graph.deviceManagementTroubleshootingEvent",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConnectorTroubleshootingEvent",
  "id": "String (identifier)",
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

