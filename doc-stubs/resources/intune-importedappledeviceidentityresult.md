---
title: "importedAppleDeviceIdentityResult resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# importedAppleDeviceIdentityResult resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List importedAppleDeviceIdentityResults](../api/intune-importedappledeviceidentityresult-list.md)|[importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md) collection|Get a list of the [importedAppleDeviceIdentityResult](../resources/importedappledeviceidentityresult.md) objects and their properties.|
|[Create importedAppleDeviceIdentityResult](../api/intune-importedappledeviceidentityresult-create.md)|[importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md)|Create a new [importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md) object.|
|[Get importedAppleDeviceIdentityResult](../api/intune-importedappledeviceidentityresult-get.md)|[importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md)|Read the properties and relationships of an [importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md) object.|
|[Update importedAppleDeviceIdentityResult](../api/intune-importedappledeviceidentityresult-update.md)|[importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md)|Update the properties of an [importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md) object.|
|[Delete importedAppleDeviceIdentityResult](../api/intune-importedappledeviceidentityresult-delete.md)|None|Deletes an [importedAppleDeviceIdentityResult](../resources/intune-importedappledeviceidentityresult.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|description|String|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|discoverySource|discoverySource|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md). Possible values are: `unknown`, `adminImport`, `deviceEnrollmentProgram`.|
|enrollmentState|enrollmentState|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md). Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDeleted|Boolean|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|isSupervised|Boolean|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|lastContactedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|platform|platform|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md). Possible values are: `unknown`, `ios`, `android`, `windows`, `windowsMobile`, `macOS`.|
|requestedEnrollmentProfileAssignmentDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|requestedEnrollmentProfileId|String|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|serialNumber|String|**TODO: Add Description** Inherited from [importedAppleDeviceIdentity](../resources/intune-importedappledeviceidentity.md)|
|status|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.importedAppleDeviceIdentityResult",
  "baseType": "microsoft.graph.importedAppleDeviceIdentity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.importedAppleDeviceIdentityResult",
  "id": "String (identifier)",
  "serialNumber": "String",
  "requestedEnrollmentProfileId": "String",
  "requestedEnrollmentProfileAssignmentDateTime": "String (timestamp)",
  "isSupervised": "Boolean",
  "discoverySource": "String",
  "isDeleted": "Boolean",
  "createdDateTime": "String (timestamp)",
  "lastContactedDateTime": "String (timestamp)",
  "description": "String",
  "enrollmentState": "String",
  "platform": "String",
  "status": "Boolean"
}
```

