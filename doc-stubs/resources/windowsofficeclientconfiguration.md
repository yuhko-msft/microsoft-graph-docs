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
|[assign](../api/windowsofficeclientconfiguration-assign.md)|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/windowsofficeclientconfiguration-list-assignments.md)|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md) collection|Get the officeClientConfigurationAssignment resources from the assignments navigation property.|
|[Create assignments](../api/windowsofficeclientconfiguration-post-assignments.md)|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md)|Create a new officeClientConfigurationAssignment object.|
|[Get assignments](../api/windowsofficeclientconfiguration-get-officeclientconfigurationassignment.md)|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md)|Read the properties and relationships of an [officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md) object.|
|[Update assignments](../api/windowsofficeclientconfiguration-update-assignments.md)|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/windowsofficeclientconfiguration-delete-assignments.md)|None|Delete an [officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|checkinStatuses|[officeClientCheckinStatus](../resources/intune-officeclientcheckinstatus.md) collection|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|policyPayload|Stream|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|
|priority|Int32|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|
|userCheckinSummary|[officeUserCheckinSummary](../resources/intune-officeusercheckinsummary.md)|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|
|userPreferencePayload|Stream|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [officeClientConfiguration](../resources/officeclientconfiguration.md)|

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
  "userPreferencePayload": "Stream",
  "policyPayload": "Stream",
  "description": "String",
  "displayName": "String",
  "priority": "Integer",
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

