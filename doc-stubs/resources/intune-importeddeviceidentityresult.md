---
title: "importedDeviceIdentityResult resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# importedDeviceIdentityResult resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [importedDeviceIdentity](../resources/importeddeviceidentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List importedDeviceIdentityResults](../api/intune-importeddeviceidentityresult-list.md)|[importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md) collection|Get a list of the [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) objects and their properties.|
|[Create importedDeviceIdentityResult](../api/intune-importeddeviceidentityresult-create.md)|[importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md)|Create a new [importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md) object.|
|[Get importedDeviceIdentityResult](../api/intune-importeddeviceidentityresult-get.md)|[importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md)|Read the properties and relationships of an [importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md) object.|
|[Update importedDeviceIdentityResult](../api/intune-importeddeviceidentityresult-update.md)|[importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md)|Update the properties of an [importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md) object.|
|[Delete importedDeviceIdentityResult](../api/intune-importeddeviceidentityresult-delete.md)|None|Deletes an [importedDeviceIdentityResult](../resources/intune-importeddeviceidentityresult.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md)|
|description|String|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md)|
|enrollmentState|enrollmentState|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md). Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|importedDeviceIdentifier|String|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md)|
|importedDeviceIdentityType|importedDeviceIdentityType|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md). Possible values are: `unknown`, `imei`, `serialNumber`.|
|lastContactedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md)|
|platform|platform|**TODO: Add Description** Inherited from [importedDeviceIdentity](../resources/intune-importeddeviceidentity.md). Possible values are: `unknown`, `ios`, `android`, `windows`, `windowsMobile`, `macOS`.|
|status|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.importedDeviceIdentityResult",
  "baseType": "microsoft.graph.importedDeviceIdentity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.importedDeviceIdentityResult",
  "id": "String (identifier)",
  "importedDeviceIdentifier": "String",
  "importedDeviceIdentityType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "lastContactedDateTime": "String (timestamp)",
  "description": "String",
  "enrollmentState": "String",
  "platform": "String",
  "status": "Boolean"
}
```

