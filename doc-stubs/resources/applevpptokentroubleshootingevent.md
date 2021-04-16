---
title: "appleVppTokenTroubleshootingEvent resource type"
description: "Event representing an Apple Vpp Token Troubleshooting Event."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# appleVppTokenTroubleshootingEvent resource type

Namespace: microsoft.graph



Event representing an Apple Vpp Token Troubleshooting Event.


Inherits from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List appleVppTokenTroubleshootingEvents](../api/applevpptokentroubleshootingevent-list.md)|[appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) collection|Get a list of the [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) objects and their properties.|
|[Create appleVppTokenTroubleshootingEvent](../api/applevpptokentroubleshootingevent-create.md)|[appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md)|Create a new [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) object.|
|[Get appleVppTokenTroubleshootingEvent](../api/applevpptokentroubleshootingevent-get.md)|[appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md)|Read the properties and relationships of an [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) object.|
|[Update appleVppTokenTroubleshootingEvent](../api/applevpptokentroubleshootingevent-update.md)|[appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md)|Update the properties of an [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) object.|
|[Delete appleVppTokenTroubleshootingEvent](../api/applevpptokentroubleshootingevent-delete.md)|None|Deletes an [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalInformation|[keyValuePair](../resources/keyvaluepair.md) collection|A set of string key and string value pairs which provides additional information on the Troubleshooting event Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|correlationId|String|Id used for tracing the failure in the service. Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|eventDateTime|DateTimeOffset|Time when the event occurred . Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|eventName|String|Event Name corresponding to the Troubleshooting Event. It is an Optional field Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|tokenId|String|Apple Volume Purchase Program Token Identifier.|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/devicemanagementtroubleshootingerrordetails.md)|Object containing detailed information about the error and its remediation. Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.appleVppTokenTroubleshootingEvent",
  "baseType": "microsoft.graph.deviceManagementTroubleshootingEvent",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.appleVppTokenTroubleshootingEvent",
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
  },
  "tokenId": "String"
}
```

