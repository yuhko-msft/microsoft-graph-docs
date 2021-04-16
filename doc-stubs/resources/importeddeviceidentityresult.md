---
title: "importedDeviceIdentityResult resource type"
description: "The importedDeviceIdentityResult resource represents the result of attempting to import a device identity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# importedDeviceIdentityResult resource type

Namespace: microsoft.graph



The importedDeviceIdentityResult resource represents the result of attempting to import a device identity.


Inherits from [importedDeviceIdentity](../resources/importeddeviceidentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List importedDeviceIdentityResults](../api/importeddeviceidentityresult-list.md)|[importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) collection|Get a list of the [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) objects and their properties.|
|[Create importedDeviceIdentityResult](../api/importeddeviceidentityresult-create.md)|[importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md)|Create a new [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) object.|
|[Get importedDeviceIdentityResult](../api/importeddeviceidentityresult-get.md)|[importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md)|Read the properties and relationships of an [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) object.|
|[Update importedDeviceIdentityResult](../api/importeddeviceidentityresult-update.md)|[importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md)|Update the properties of an [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) object.|
|[Delete importedDeviceIdentityResult](../api/importeddeviceidentityresult-delete.md)|None|Deletes an [importedDeviceIdentityResult](../resources/importeddeviceidentityresult.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Created Date Time of the device Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md)|
|description|String|The description of the device Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md)|
|enrollmentState|enrollmentState|The state of the device in Intune Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md). Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|importedDeviceIdentifier|String|Imported Device Identifier Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md)|
|importedDeviceIdentityType|importedDeviceIdentityType|Type of Imported Device Identity Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md). Possible values are: `unknown`, `imei`, `serialNumber`.|
|lastContactedDateTime|DateTimeOffset|Last Contacted Date Time of the device Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md)|
|lastModifiedDateTime|DateTimeOffset|Last Modified DateTime of the description Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md)|
|platform|platform|The platform of the Device. Inherited from [importedDeviceIdentity](../resources/importeddeviceidentity.md). Possible values are: `unknown`, `ios`, `android`, `windows`, `windowsMobile`, `macOS`.|
|status|Boolean|Status of imported device identity|

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
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "enrollmentState": "String",
  "importedDeviceIdentifier": "String",
  "importedDeviceIdentityType": "String",
  "lastContactedDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "platform": "String",
  "status": "Boolean"
}
```

