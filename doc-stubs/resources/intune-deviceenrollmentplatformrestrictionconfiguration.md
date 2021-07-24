---
title: "deviceEnrollmentPlatformRestrictionConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceEnrollmentPlatformRestrictionConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceEnrollmentPlatformRestrictionConfigurations](../api/intune-deviceenrollmentplatformrestrictionconfiguration-list.md)|[deviceEnrollmentPlatformRestrictionConfiguration](../resources/intune-deviceenrollmentplatformrestrictionconfiguration.md) collection|Get a list of the [deviceEnrollmentPlatformRestrictionConfiguration](../resources/intune-deviceenrollmentplatformrestrictionconfiguration.md) objects and their properties.|
|[Create deviceEnrollmentPlatformRestrictionConfiguration](../api/intune-deviceenrollmentplatformrestrictionconfiguration-create.md)|[deviceEnrollmentPlatformRestrictionConfiguration](../resources/intune-deviceenrollmentplatformrestrictionconfiguration.md)|Create a new [deviceEnrollmentPlatformRestrictionConfiguration](../resources/intune-deviceenrollmentplatformrestrictionconfiguration.md) object.|
|[Get deviceEnrollmentPlatformRestrictionConfiguration](../api/intune-deviceenrollmentplatformrestrictionconfiguration-get.md)|[deviceEnrollmentPlatformRestrictionConfiguration](../resources/intune-deviceenrollmentplatformrestrictionconfiguration.md)|Read the properties and relationships of a [deviceEnrollmentPlatformRestrictionConfiguration](../resources/intune-deviceenrollmentplatformrestrictionconfiguration.md) object.|
|[Update deviceEnrollmentPlatformRestrictionConfiguration](../api/intune-deviceenrollmentplatformrestrictionconfiguration-update.md)|[deviceEnrollmentPlatformRestrictionConfiguration](../resources/intune-deviceenrollmentplatformrestrictionconfiguration.md)|Update the properties of a [deviceEnrollmentPlatformRestrictionConfiguration](../resources/intune-deviceenrollmentplatformrestrictionconfiguration.md) object.|
|[Delete deviceEnrollmentPlatformRestrictionConfiguration](../api/intune-deviceenrollmentplatformrestrictionconfiguration-delete.md)|None|Deletes a [deviceEnrollmentPlatformRestrictionConfiguration](../resources/intune-deviceenrollmentplatformrestrictionconfiguration.md) object.|
|[setPriority](../api/intune-deviceenrollmentplatformrestrictionconfiguration-setpriority.md)|None|**TODO: Add Description**|
|[assign](../api/intune-deviceenrollmentplatformrestrictionconfiguration-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/intune-deviceenrollmentplatformrestrictionconfiguration-list-assignments.md)|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) collection|Get the enrollmentConfigurationAssignment resources from the assignments navigation property.|
|[Create enrollmentConfigurationAssignment](../api/intune-deviceenrollmentplatformrestrictionconfiguration-post-assignments.md)|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md)|Create a new enrollmentConfigurationAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md).|
|description|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md).|
|displayName|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md).|
|platformRestriction|[deviceEnrollmentPlatformRestriction](../resources/intune-deviceenrollmentplatformrestriction.md)|**TODO: Add Description**|
|platformType|enrollmentRestrictionPlatformType|**TODO: Add Description**. Possible values are: `allPlatforms`, `ios`, `windows`, `windowsPhone`, `android`, `androidForWork`, `androidAosp`, `mac`.|
|priority|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md).|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md).|
|version|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestrictionConfiguration",
  "baseType": "microsoft.graph.deviceEnrollmentConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceEnrollmentPlatformRestrictionConfiguration",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "version": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "platformRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "platformType": "String"
}
```

