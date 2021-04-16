---
title: "windows10XVpnConfiguration resource type"
description: "Windows X VPN configuration profile"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10XVpnConfiguration resource type

Namespace: microsoft.graph



Windows X VPN configuration profile


Inherits from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10XVpnConfiguration](../api/windows10xvpnconfiguration-list.md)|[windows10XVpnConfiguration](../resources/windows10xvpnconfiguration.md) collection|Get a list of the [windows10XVpnConfiguration](../resources/windows10xvpnconfiguration.md) objects and their properties.|
|[Create windows10XVpnConfiguration](../api/windows10xvpnconfiguration-create.md)|[windows10XVpnConfiguration](../resources/windows10xvpnconfiguration.md)|Create a new [windows10XVpnConfiguration](../resources/windows10xvpnconfiguration.md) object.|
|[Get windows10XVpnConfiguration](../api/windows10xvpnconfiguration-get.md)|[windows10XVpnConfiguration](../resources/windows10xvpnconfiguration.md)|Read the properties and relationships of a [windows10XVpnConfiguration](../resources/windows10xvpnconfiguration.md) object.|
|[Update windows10XVpnConfiguration](../api/windows10xvpnconfiguration-update.md)|[windows10XVpnConfiguration](../resources/windows10xvpnconfiguration.md)|Update the properties of a [windows10XVpnConfiguration](../resources/windows10xvpnconfiguration.md) object.|
|[Delete windows10XVpnConfiguration](../api/windows10xvpnconfiguration-delete.md)|None|Deletes a [windows10XVpnConfiguration](../resources/windows10xvpnconfiguration.md) object.|
|[assign](../api/windows10xvpnconfiguration-assign.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/windows10xvpnconfiguration-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/windows10xvpnconfiguration-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationCertificateId|Guid|ID to the Authentication Certificate|
|creationDateTime|DateTimeOffset|DateTime profile was created Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|customXml|Binary|Custom XML commands that configures the VPN connection. (UTF8 byte encoding)|
|customXmlFileName|String|Custom Xml file name.|
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
  "@odata.type": "microsoft.graph.windows10XVpnConfiguration",
  "baseType": "microsoft.graph.deviceManagementResourceAccessProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10XVpnConfiguration",
  "id": "String (identifier)",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "authenticationCertificateId": "Guid",
  "customXml": "Binary",
  "customXmlFileName": "String"
}
```

