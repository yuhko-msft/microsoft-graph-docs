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
|[List officeClientConfigurations](../api/officeclientconfiguration-list.md)|[officeClientConfiguration](../resources/officeclientconfiguration.md) collection|Get a list of the [officeClientConfiguration](../resources/officeclientconfiguration.md) objects and their properties.|
|[Create officeClientConfiguration](../api/officeclientconfiguration-create.md)|[officeClientConfiguration](../resources/officeclientconfiguration.md)|Create a new [officeClientConfiguration](../resources/officeclientconfiguration.md) object.|
|[Get officeClientConfiguration](../api/officeclientconfiguration-get.md)|[officeClientConfiguration](../resources/officeclientconfiguration.md)|Read the properties and relationships of an [officeClientConfiguration](../resources/officeclientconfiguration.md) object.|
|[Update officeClientConfiguration](../api/officeclientconfiguration-update.md)|[officeClientConfiguration](../resources/officeclientconfiguration.md)|Update the properties of an [officeClientConfiguration](../resources/officeclientconfiguration.md) object.|
|[Delete officeClientConfiguration](../api/officeclientconfiguration-delete.md)|None|Deletes an [officeClientConfiguration](../resources/officeclientconfiguration.md) object.|
|[assign](../api/officeclientconfiguration-assign.md)|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) collection|**TODO: Add Description**|
|[updatePriorities](../api/officeclientconfiguration-updatepriorities.md)|None|**TODO: Add Description**|
|[List assignments](../api/officeclientconfiguration-list-assignments.md)|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) collection|Get the officeClientConfigurationAssignment resources from the assignments navigation property.|
|[Create officeClientConfigurationAssignment](../api/officeclientconfiguration-post-assignments.md)|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md)|Create a new officeClientConfigurationAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|checkinStatuses|[officeClientCheckinStatus](../resources/officeclientcheckinstatus.md) collection|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|policyPayload|Stream|**TODO: Add Description**|
|priority|Int32|**TODO: Add Description**|
|userCheckinSummary|[officeUserCheckinSummary](../resources/officeusercheckinsummary.md)|**TODO: Add Description**|
|userPreferencePayload|Stream|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) collection|**TODO: Add Description**|

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
  "checkinStatuses": [
    {
      "@odata.type": "microsoft.graph.officeClientCheckinStatus"
    }
  ],
  "description": "String",
  "displayName": "String",
  "policyPayload": "Stream",
  "priority": "Integer",
  "userCheckinSummary": {
    "@odata.type": "microsoft.graph.officeUserCheckinSummary"
  },
  "userPreferencePayload": "Stream"
}
```

