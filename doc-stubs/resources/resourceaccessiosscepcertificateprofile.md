---
title: "resourceAccessIosSCEPCertificateProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# resourceAccessIosSCEPCertificateProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List resourceAccessIosSCEPCertificateProfiles](../api/resourceaccessiosscepcertificateprofile-list.md)|[resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md) collection|Get a list of the [resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md) objects and their properties.|
|[Create resourceAccessIosSCEPCertificateProfile](../api/resourceaccessiosscepcertificateprofile-create.md)|[resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md)|Create a new [resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md) object.|
|[Get resourceAccessIosSCEPCertificateProfile](../api/resourceaccessiosscepcertificateprofile-get.md)|[resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md)|Read the properties and relationships of a [resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md) object.|
|[Update resourceAccessIosSCEPCertificateProfile](../api/resourceaccessiosscepcertificateprofile-update.md)|[resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md)|Update the properties of a [resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md) object.|
|[Delete resourceAccessIosSCEPCertificateProfile](../api/resourceaccessiosscepcertificateprofile-delete.md)|None|Deletes a [resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md) object.|
|[List assignments](../api/resourceaccessiosscepcertificateprofile-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/resourceaccessiosscepcertificateprofile-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certificateScope|iosCertificateScope|**TODO: Add Description**. Possible values are: `user`, `machine`.|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|keySize|iosKeySize|**TODO: Add Description**. Possible values are: `size1024Bits`, `size2048Bits`.|
|keyUsage|keyUsages|**TODO: Add Description**. Possible values are: `keyEncipherment`, `digitalSignature`.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|renewalThresholdPercentage|Int32|**TODO: Add Description** Inherited from [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|rootCertificateId|Guid|**TODO: Add Description**|
|scepServerUrls|String collection|**TODO: Add Description**|
|subjectAlternativeNameFormats|[iosCustomSubjectAlternativeName](../resources/intune-ioscustomsubjectalternativename.md) collection|**TODO: Add Description**|
|subjectNameFormatString|String|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.resourceAccessIosSCEPCertificateProfile",
  "baseType": "microsoft.graph.iosCertificateResourceAccessProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.resourceAccessIosSCEPCertificateProfile",
  "id": "String (identifier)",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "renewalThresholdPercentage": "Integer",
  "certificateScope": "String",
  "keySize": "String",
  "keyUsage": "String",
  "rootCertificateId": "Guid",
  "scepServerUrls": [
    "String"
  ],
  "subjectAlternativeNameFormats": [
    {
      "@odata.type": "microsoft.graph.iosCustomSubjectAlternativeName"
    }
  ],
  "subjectNameFormatString": "String"
}
```

