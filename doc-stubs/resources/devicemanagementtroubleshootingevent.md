---
title: "deviceManagementTroubleshootingEvent resource type"
description: "Event representing an general failure."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementTroubleshootingEvent resource type

Namespace: microsoft.graph



Event representing an general failure.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementTroubleshootingEvents](../api/devicemanagementtroubleshootingevent-list.md)|[deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) collection|Get a list of the [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) objects and their properties.|
|[Create deviceManagementTroubleshootingEvent](../api/devicemanagementtroubleshootingevent-create.md)|[deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|Create a new [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) object.|
|[Get deviceManagementTroubleshootingEvent](../api/devicemanagementtroubleshootingevent-get.md)|[deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|Read the properties and relationships of a [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) object.|
|[Update deviceManagementTroubleshootingEvent](../api/devicemanagementtroubleshootingevent-update.md)|[deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|Update the properties of a [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) object.|
|[Delete deviceManagementTroubleshootingEvent](../api/devicemanagementtroubleshootingevent-delete.md)|None|Deletes a [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalInformation|[keyValuePair](../resources/keyvaluepair.md) collection|A set of string key and string value pairs which provides additional information on the Troubleshooting event|
|correlationId|String|Id used for tracing the failure in the service.|
|eventDateTime|DateTimeOffset|Time when the event occurred .|
|eventName|String|Event Name corresponding to the Troubleshooting Event. It is an Optional field|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/devicemanagementtroubleshootingerrordetails.md)|Object containing detailed information about the error and its remediation.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementTroubleshootingEvent",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementTroubleshootingEvent",
  "id": "String (identifier)",
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

