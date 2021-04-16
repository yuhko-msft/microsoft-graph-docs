---
title: "windowsOfficeClientConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsOfficeClientConfiguration resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [officeClientConfiguration](../resources/officeclientconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsOfficeClientConfigurations](../api/windowsofficeclientconfiguration-list.md)|[windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md) collection|Get a list of the [windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md) objects and their properties.|
|[Create windowsOfficeClientConfiguration](../api/windowsofficeclientconfiguration-create.md)|[windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md)|Create a new [windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md) object.|
|[Get windowsOfficeClientConfiguration](../api/windowsofficeclientconfiguration-get.md)|[windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md)|Read the properties and relationships of a [windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md) object.|
|[Update windowsOfficeClientConfiguration](../api/windowsofficeclientconfiguration-update.md)|[windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md)|Update the properties of a [windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md) object.|
|[Delete windowsOfficeClientConfiguration](../api/windowsofficeclientconfiguration-delete.md)|None|Deletes a [windowsOfficeClientConfiguration](../resources/windowsofficeclientconfiguration.md) object.|
|[assign](../api/windowsofficeclientconfiguration-assign.md)|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/windowsofficeclientconfiguration-list-assignments.md)|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) collection|Get the officeClientConfigurationAssignment resources from the assignments navigation property.|
|[Create officeClientConfigurationAssignment](../api/windowsofficeclientconfiguration-post-assignments.md)|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md)|Create a new officeClientConfigurationAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|checkinStatuses|[officeClientCheckinStatus](../resources/officeclientcheckinstatus.md) collection|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|policyPayload|Stream|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|priority|Int32|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|userCheckinSummary|[officeUserCheckinSummary](../resources/officeusercheckinsummary.md)|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|
|userPreferencePayload|Stream|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsOfficeClientConfiguration",
  "baseType": "microsoft.graph.officeClientConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsOfficeClientConfiguration",
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

