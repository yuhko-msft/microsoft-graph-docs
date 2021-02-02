---
title: "resourceAccessIosPkcsCertificateProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# resourceAccessIosPkcsCertificateProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List resourceAccessIosPkcsCertificateProfiles](../api/resourceaccessiospkcscertificateprofile-list.md)|[resourceAccessIosPkcsCertificateProfile](../resources/resourceaccessiospkcscertificateprofile.md) collection|Get a list of the [resourceAccessIosPkcsCertificateProfile](../resources/resourceaccessiospkcscertificateprofile.md) objects and their properties.|
|[Create resourceAccessIosPkcsCertificateProfile](../api/resourceaccessiospkcscertificateprofile-create.md)|[resourceAccessIosPkcsCertificateProfile](../resources/resourceaccessiospkcscertificateprofile.md)|Create a new [resourceAccessIosPkcsCertificateProfile](../resources/resourceaccessiospkcscertificateprofile.md) object.|
|[Get resourceAccessIosPkcsCertificateProfile](../api/resourceaccessiospkcscertificateprofile-get.md)|[resourceAccessIosPkcsCertificateProfile](../resources/resourceaccessiospkcscertificateprofile.md)|Read the properties and relationships of a [resourceAccessIosPkcsCertificateProfile](../resources/resourceaccessiospkcscertificateprofile.md) object.|
|[Update resourceAccessIosPkcsCertificateProfile](../api/resourceaccessiospkcscertificateprofile-update.md)|[resourceAccessIosPkcsCertificateProfile](../resources/resourceaccessiospkcscertificateprofile.md)|Update the properties of a [resourceAccessIosPkcsCertificateProfile](../resources/resourceaccessiospkcscertificateprofile.md) object.|
|[Delete resourceAccessIosPkcsCertificateProfile](../api/resourceaccessiospkcscertificateprofile-delete.md)|None|Deletes a [resourceAccessIosPkcsCertificateProfile](../resources/resourceaccessiospkcscertificateprofile.md) object.|
|[List assignments](../api/resourceaccessiospkcscertificateprofile-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/resourceaccessiospkcscertificateprofile-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certificateScope|iosCertificateScope|**TODO: Add Description**. Possible values are: `user`, `machine`.|
|certificateTemplateName|String|**TODO: Add Description**|
|certificationAuthority|String|**TODO: Add Description**|
|certificationAuthorityName|String|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|renewalThresholdPercentage|Int32|**TODO: Add Description** Inherited from [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
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
  "@odata.type": "microsoft.graph.resourceAccessIosPkcsCertificateProfile",
  "baseType": "microsoft.graph.iosCertificateResourceAccessProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.resourceAccessIosPkcsCertificateProfile",
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
  "certificationAuthority": "String",
  "certificationAuthorityName": "String",
  "certificateTemplateName": "String",
  "certificateScope": "String",
  "subjectAlternativeNameFormats": [
    {
      "@odata.type": "microsoft.graph.iosCustomSubjectAlternativeName"
    }
  ],
  "subjectNameFormatString": "String"
}
```

