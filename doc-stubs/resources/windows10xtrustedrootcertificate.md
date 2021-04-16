---
title: "windows10XTrustedRootCertificate resource type"
description: "Windows X Trusted Root Certificate configuration profile"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10XTrustedRootCertificate resource type

Namespace: microsoft.graph



Windows X Trusted Root Certificate configuration profile


Inherits from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10XTrustedRootCertificate](../api/windows10xtrustedrootcertificate-list.md)|[windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md) collection|Get a list of the [windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md) objects and their properties.|
|[Create windows10XTrustedRootCertificate](../api/windows10xtrustedrootcertificate-create.md)|[windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md)|Create a new [windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md) object.|
|[Get windows10XTrustedRootCertificate](../api/windows10xtrustedrootcertificate-get.md)|[windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md)|Read the properties and relationships of a [windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md) object.|
|[Update windows10XTrustedRootCertificate](../api/windows10xtrustedrootcertificate-update.md)|[windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md)|Update the properties of a [windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md) object.|
|[Delete windows10XTrustedRootCertificate](../api/windows10xtrustedrootcertificate-delete.md)|None|Deletes a [windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md) object.|
|[assign](../api/windows10xtrustedrootcertificate-assign.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/windows10xtrustedrootcertificate-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/windows10xtrustedrootcertificate-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certFileName|String|File name to display in UI.|
|creationDateTime|DateTimeOffset|DateTime profile was created Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|description|String|Profile description Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|destinationStore|certificateDestinationStore|Destination store location for the Trusted Root Certificate. Possible values are: `computerCertStoreRoot`, `computerCertStoreIntermediate`, `userCertStoreIntermediate`.|
|displayName|String|Profile display name Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime profile was last modified Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|Scope Tags Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|trustedRootCertificate|Binary|Trusted Root Certificate|
|version|Int32|Version of the profile Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windows10XTrustedRootCertificate",
  "baseType": "microsoft.graph.deviceManagementResourceAccessProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10XTrustedRootCertificate",
  "id": "String (identifier)",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "certFileName": "String",
  "destinationStore": "String",
  "trustedRootCertificate": "Binary"
}
```

