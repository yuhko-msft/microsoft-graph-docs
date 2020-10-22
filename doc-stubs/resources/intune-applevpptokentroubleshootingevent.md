---
title: "appleVppTokenTroubleshootingEvent resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# appleVppTokenTroubleshootingEvent resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List appleVppTokenTroubleshootingEvents](../api/intune-applevpptokentroubleshootingevent-list.md)|[appleVppTokenTroubleshootingEvent](../resources/intune-applevpptokentroubleshootingevent.md) collection|Get a list of the [appleVppTokenTroubleshootingEvent](../resources/applevpptokentroubleshootingevent.md) objects and their properties.|
|[Create appleVppTokenTroubleshootingEvent](../api/intune-applevpptokentroubleshootingevent-create.md)|[appleVppTokenTroubleshootingEvent](../resources/intune-applevpptokentroubleshootingevent.md)|Create a new [appleVppTokenTroubleshootingEvent](../resources/intune-applevpptokentroubleshootingevent.md) object.|
|[Get appleVppTokenTroubleshootingEvent](../api/intune-applevpptokentroubleshootingevent-get.md)|[appleVppTokenTroubleshootingEvent](../resources/intune-applevpptokentroubleshootingevent.md)|Read the properties and relationships of an [appleVppTokenTroubleshootingEvent](../resources/intune-applevpptokentroubleshootingevent.md) object.|
|[Update appleVppTokenTroubleshootingEvent](../api/intune-applevpptokentroubleshootingevent-update.md)|[appleVppTokenTroubleshootingEvent](../resources/intune-applevpptokentroubleshootingevent.md)|Update the properties of an [appleVppTokenTroubleshootingEvent](../resources/intune-applevpptokentroubleshootingevent.md) object.|
|[Delete appleVppTokenTroubleshootingEvent](../api/intune-applevpptokentroubleshootingevent-delete.md)|None|Deletes an [appleVppTokenTroubleshootingEvent](../resources/intune-applevpptokentroubleshootingevent.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalInformation|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|correlationId|String|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|eventDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|eventName|String|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|tokenId|String|**TODO: Add Description**|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/intune-devicemanagementtroubleshootingerrordetails.md)|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|

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
  "tokenId": "String"
}
```

