---
title: "iosTrustedRootCertificateProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosTrustedRootCertificateProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosTrustedRootCertificateProfiles](../api/iostrustedrootcertificateprofile-list.md)|[iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md) collection|Get a list of the [iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md) objects and their properties.|
|[Create iosTrustedRootCertificateProfile](../api/iostrustedrootcertificateprofile-create.md)|[iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md)|Create a new [iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md) object.|
|[Get iosTrustedRootCertificateProfile](../api/iostrustedrootcertificateprofile-get.md)|[iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md)|Read the properties and relationships of an [iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md) object.|
|[Update iosTrustedRootCertificateProfile](../api/iostrustedrootcertificateprofile-update.md)|[iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md)|Update the properties of an [iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md) object.|
|[Delete iosTrustedRootCertificateProfile](../api/iostrustedrootcertificateprofile-delete.md)|None|Deletes an [iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md) object.|
|[assign](../api/iostrustedrootcertificateprofile-assign.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/iostrustedrootcertificateprofile-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/iostrustedrootcertificateprofile-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certificateFileDisplayName|String|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|trustedRootCertificateContent|Binary|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosTrustedRootCertificateProfile",
  "baseType": "microsoft.graph.deviceManagementResourceAccessProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosTrustedRootCertificateProfile",
  "id": "String (identifier)",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "trustedRootCertificateContent": "Binary",
  "certificateFileDisplayName": "String"
}
```

