---
title: "deviceEnrollmentPlatformRestrictionsConfiguration resource type"
description: "Device Enrollment Configuration that restricts the types of devices a user can enroll"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceEnrollmentPlatformRestrictionsConfiguration resource type

Namespace: microsoft.graph



Device Enrollment Configuration that restricts the types of devices a user can enroll


Inherits from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceEnrollmentPlatformRestrictionsConfigurations](../api/deviceenrollmentplatformrestrictionsconfiguration-list.md)|[deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) collection|Get a list of the [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) objects and their properties.|
|[Create deviceEnrollmentPlatformRestrictionsConfiguration](../api/deviceenrollmentplatformrestrictionsconfiguration-create.md)|[deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md)|Create a new [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) object.|
|[Get deviceEnrollmentPlatformRestrictionsConfiguration](../api/deviceenrollmentplatformrestrictionsconfiguration-get.md)|[deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md)|Read the properties and relationships of a [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) object.|
|[Update deviceEnrollmentPlatformRestrictionsConfiguration](../api/deviceenrollmentplatformrestrictionsconfiguration-update.md)|[deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md)|Update the properties of a [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) object.|
|[Delete deviceEnrollmentPlatformRestrictionsConfiguration](../api/deviceenrollmentplatformrestrictionsconfiguration-delete.md)|None|Deletes a [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|androidForWorkRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Android for work restrictions based on platform, platform operating system version, and device ownership|
|androidRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Android restrictions based on platform, platform operating system version, and device ownership|
|aospRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|AOSP restrictions based on platform, platform operating system version, and device ownership|
|createdDateTime|DateTimeOffset|Created date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|description|String|The description of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|displayName|String|The display name of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|iosRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Ios restrictions based on platform, platform operating system version, and device ownership|
|lastModifiedDateTime|DateTimeOffset|Last modified date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|macOSRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Mac restrictions based on platform, platform operating system version, and device ownership|
|macRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Mac restrictions based on platform, platform operating system version, and device ownership|
|priority|Int32|Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|Optional role scope tags for the enrollment restrictions. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|version|Int32|The version of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|windowsHomeSkuRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Windows Home Sku restrictions based on platform, platform operating system version, and device ownership|
|windowsMobileRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Windows mobile restrictions based on platform, platform operating system version, and device ownership|
|windowsRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Windows restrictions based on platform, platform operating system version, and device ownership|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) collection|The list of group assignments for the device configuration profile Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration",
  "baseType": "microsoft.graph.deviceEnrollmentConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "androidForWorkRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "androidRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "aospRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "iosRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "macOSRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "macRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "windowsHomeSkuRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "windowsMobileRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "windowsRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  }
}
```

