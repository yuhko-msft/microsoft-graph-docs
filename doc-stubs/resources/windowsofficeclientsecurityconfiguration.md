---
title: "windowsOfficeClientSecurityConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsOfficeClientSecurityConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [officeClientConfiguration](../resources/officeclientconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsOfficeClientSecurityConfigurations](../api/windowsofficeclientsecurityconfiguration-list.md)|[windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md) collection|Get a list of the [windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md) objects and their properties.|
|[Create windowsOfficeClientSecurityConfiguration](../api/windowsofficeclientsecurityconfiguration-create.md)|[windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md)|Create a new [windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md) object.|
|[Get windowsOfficeClientSecurityConfiguration](../api/windowsofficeclientsecurityconfiguration-get.md)|[windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md)|Read the properties and relationships of a [windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md) object.|
|[Update windowsOfficeClientSecurityConfiguration](../api/windowsofficeclientsecurityconfiguration-update.md)|[windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md)|Update the properties of a [windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md) object.|
|[Delete windowsOfficeClientSecurityConfiguration](../api/windowsofficeclientsecurityconfiguration-delete.md)|None|Deletes a [windowsOfficeClientSecurityConfiguration](../resources/windowsofficeclientsecurityconfiguration.md) object.|
|[assign](../api/windowsofficeclientsecurityconfiguration-assign.md)|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/windowsofficeclientsecurityconfiguration-list-assignments.md)|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md) collection|Get the officeClientConfigurationAssignment resources from the assignments navigation property.|
|[Create assignments](../api/windowsofficeclientsecurityconfiguration-post-assignments.md)|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md)|Create a new officeClientConfigurationAssignment object.|
|[Get assignments](../api/windowsofficeclientsecurityconfiguration-get-officeclientconfigurationassignment.md)|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md)|Read the properties and relationships of an [officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md) object.|
|[Update assignments](../api/windowsofficeclientsecurityconfiguration-update-assignments.md)|[officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/windowsofficeclientsecurityconfiguration-delete-assignments.md)|None|Delete an [officeClientConfigurationAssignment](../resources/intune-officeclientconfigurationassignment.md) object.|

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
  "@odata.type": "microsoft.graph.windowsOfficeClientSecurityConfiguration",
  "baseType": "microsoft.graph.officeClientConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsOfficeClientSecurityConfiguration",
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

