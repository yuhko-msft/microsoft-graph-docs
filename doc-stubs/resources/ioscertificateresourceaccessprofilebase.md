---
title: "iosCertificateResourceAccessProfileBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosCertificateResourceAccessProfileBase resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosCertificateResourceAccessProfileBases](../api/ioscertificateresourceaccessprofilebase-list.md)|[iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md) collection|Get a list of the [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md) objects and their properties.|
|[Create iosCertificateResourceAccessProfileBase](../api/ioscertificateresourceaccessprofilebase-create.md)|[iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md)|Create a new [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md) object.|
|[Get iosCertificateResourceAccessProfileBase](../api/ioscertificateresourceaccessprofilebase-get.md)|[iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md)|Read the properties and relationships of an [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md) object.|
|[Update iosCertificateResourceAccessProfileBase](../api/ioscertificateresourceaccessprofilebase-update.md)|[iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md)|Update the properties of an [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md) object.|
|[Delete iosCertificateResourceAccessProfileBase](../api/ioscertificateresourceaccessprofilebase-delete.md)|None|Deletes an [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md) object.|
|[assign](../api/ioscertificateresourceaccessprofilebase-assign.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/ioscertificateresourceaccessprofilebase-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/ioscertificateresourceaccessprofilebase-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|renewalThresholdPercentage|Int32|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
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
  "@odata.type": "microsoft.graph.iosCertificateResourceAccessProfileBase",
  "baseType": "microsoft.graph.deviceManagementResourceAccessProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosCertificateResourceAccessProfileBase",
  "id": "String (identifier)",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "renewalThresholdPercentage": "Integer"
}
```

