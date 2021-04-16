---
title: "windows10XCertificateProfile resource type"
description: "Base Profile Type for Authentication Certificates (SCEP or PFX Create)"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10XCertificateProfile resource type

Namespace: microsoft.graph



Base Profile Type for Authentication Certificates (SCEP or PFX Create)


Inherits from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10XCertificateProfile](../api/windows10xcertificateprofile-list.md)|[windows10XCertificateProfile](../resources/windows10xcertificateprofile.md) collection|Get a list of the [windows10XCertificateProfile](../resources/windows10xcertificateprofile.md) objects and their properties.|
|[Create windows10XCertificateProfile](../api/windows10xcertificateprofile-create.md)|[windows10XCertificateProfile](../resources/windows10xcertificateprofile.md)|Create a new [windows10XCertificateProfile](../resources/windows10xcertificateprofile.md) object.|
|[Get windows10XCertificateProfile](../api/windows10xcertificateprofile-get.md)|[windows10XCertificateProfile](../resources/windows10xcertificateprofile.md)|Read the properties and relationships of a [windows10XCertificateProfile](../resources/windows10xcertificateprofile.md) object.|
|[Update windows10XCertificateProfile](../api/windows10xcertificateprofile-update.md)|[windows10XCertificateProfile](../resources/windows10xcertificateprofile.md)|Update the properties of a [windows10XCertificateProfile](../resources/windows10xcertificateprofile.md) object.|
|[Delete windows10XCertificateProfile](../api/windows10xcertificateprofile-delete.md)|None|Deletes a [windows10XCertificateProfile](../resources/windows10xcertificateprofile.md) object.|
|[assign](../api/windows10xcertificateprofile-assign.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/windows10xcertificateprofile-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/windows10xcertificateprofile-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|creationDateTime|DateTimeOffset|DateTime profile was created Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|description|String|Profile description Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|displayName|String|Profile display name Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime profile was last modified Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|Scope Tags Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
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
  "@odata.type": "microsoft.graph.windows10XCertificateProfile",
  "baseType": "microsoft.graph.deviceManagementResourceAccessProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10XCertificateProfile",
  "id": "String (identifier)",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
}
```

