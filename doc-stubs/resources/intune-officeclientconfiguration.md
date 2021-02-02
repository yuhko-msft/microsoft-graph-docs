---
title: "officeClientConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# officeClientConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List officeClientConfigurations](../api/intune-officeclientconfiguration-list.md)|[officeClientConfiguration](../resources/intune-officeclientconfiguration.md) collection|Get a list of the [officeClientConfiguration](../resources/officeclientconfiguration.md) objects and their properties.|
|[Create officeClientConfiguration](../api/intune-officeclientconfiguration-create.md)|[officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|Create a new [officeClientConfiguration](../resources/intune-officeclientconfiguration.md) object.|
|[Get officeClientConfiguration](../api/intune-officeclientconfiguration-get.md)|[officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|Read the properties and relationships of an [officeClientConfiguration](../resources/intune-officeclientconfiguration.md) object.|
|[Update officeClientConfiguration](../api/intune-officeclientconfiguration-update.md)|[officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|Update the properties of an [officeClientConfiguration](../resources/intune-officeclientconfiguration.md) object.|
|[Delete officeClientConfiguration](../api/intune-officeclientconfiguration-delete.md)|None|Deletes an [officeClientConfiguration](../resources/intune-officeclientconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|checkinStatuses|[officeClientCheckinStatus](../resources/intune-officeclientcheckinstatus.md) collection|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|policyPayload|Stream|**TODO: Add Description**|
|priority|Int32|**TODO: Add Description**|
|userCheckinSummary|[officeUserCheckinSummary](../resources/intune-officeusercheckinsummary.md)|**TODO: Add Description**|
|userPreferencePayload|Stream|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.officeClientConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.officeClientConfiguration",
  "id": "String (identifier)",
  "userPreferencePayload": "Stream",
  "policyPayload": "Stream",
  "description": "String",
  "displayName": "String",
  "priority": "Integer",
  "lastModifiedDateTime": "String (timestamp)",
  "userCheckinSummary": {
    "@odata.type": "microsoft.graph.officeUserCheckinSummary"
  },
  "checkinStatuses": [
    {
      "@odata.type": "microsoft.graph.officeClientCheckinStatus"
    }
  ]
}
```

