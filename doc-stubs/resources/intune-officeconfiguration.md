---
title: "officeConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# officeConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List officeConfigurations](../api/intune-officeconfiguration-list.md)|[officeConfiguration](../resources/intune-officeconfiguration.md) collection|Get a list of the [officeConfiguration](../resources/officeconfiguration.md) objects and their properties.|
|[Create officeConfiguration](../api/intune-officeconfiguration-create.md)|[officeConfiguration](../resources/intune-officeconfiguration.md)|Create a new [officeConfiguration](../resources/intune-officeconfiguration.md) object.|
|[Get officeConfiguration](../api/intune-officeconfiguration-get.md)|[officeConfiguration](../resources/intune-officeconfiguration.md)|Read the properties and relationships of an [officeConfiguration](../resources/intune-officeconfiguration.md) object.|
|[Update officeConfiguration](../api/intune-officeconfiguration-update.md)|[officeConfiguration](../resources/intune-officeconfiguration.md)|Update the properties of an [officeConfiguration](../resources/intune-officeconfiguration.md) object.|
|[Delete officeConfiguration](../api/intune-officeconfiguration-delete.md)|None|Deletes an [officeConfiguration](../resources/intune-officeconfiguration.md) object.|
|[List clientConfigurations](../api/intune-officeconfiguration-list-clientconfigurations.md)|[officeClientConfiguration](../resources/intune-officeclientconfiguration.md) collection|Get the officeClientConfiguration resources from the clientConfigurations navigation property.|
|[Create clientConfigurations](../api/intune-officeconfiguration-post-clientconfigurations.md)|[officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|Create a new officeClientConfiguration object.|
|[Get clientConfigurations](../api/intune-officeconfiguration-get-officeclientconfiguration.md)|[officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|Read the properties and relationships of an [officeClientConfiguration](../resources/intune-officeclientconfiguration.md) object.|
|[Update clientConfigurations](../api/intune-officeconfiguration-update-clientconfigurations.md)|[officeClientConfiguration](../resources/intune-officeclientconfiguration.md)|Update the properties of a clientConfigurations object.|
|[Delete clientConfigurations](../api/intune-officeconfiguration-delete-clientconfigurations.md)|None|Delete an [officeClientConfiguration](../resources/intune-officeclientconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|tenantCheckinStatuses|[officeClientCheckinStatus](../resources/intune-officeclientcheckinstatus.md) collection|**TODO: Add Description**|
|tenantUserCheckinSummary|[officeUserCheckinSummary](../resources/intune-officeusercheckinsummary.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|clientConfigurations|[officeClientConfiguration](../resources/intune-officeclientconfiguration.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.officeConfiguration",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.officeConfiguration",
  "tenantCheckinStatuses": [
    {
      "@odata.type": "microsoft.graph.officeClientCheckinStatus"
    }
  ],
  "tenantUserCheckinSummary": {
    "@odata.type": "microsoft.graph.officeUserCheckinSummary"
  }
}
```

