---
title: "windows10XWifiConfiguration resource type"
description: "Windows X WifiXml configuration profile"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10XWifiConfiguration resource type

Namespace: microsoft.graph



Windows X WifiXml configuration profile


Inherits from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10XWifiConfiguration](../api/windows10xwificonfiguration-list.md)|[windows10XWifiConfiguration](../resources/windows10xwificonfiguration.md) collection|Get a list of the [windows10XWifiConfiguration](../resources/windows10xwificonfiguration.md) objects and their properties.|
|[Create windows10XWifiConfiguration](../api/windows10xwificonfiguration-create.md)|[windows10XWifiConfiguration](../resources/windows10xwificonfiguration.md)|Create a new [windows10XWifiConfiguration](../resources/windows10xwificonfiguration.md) object.|
|[Get windows10XWifiConfiguration](../api/windows10xwificonfiguration-get.md)|[windows10XWifiConfiguration](../resources/windows10xwificonfiguration.md)|Read the properties and relationships of a [windows10XWifiConfiguration](../resources/windows10xwificonfiguration.md) object.|
|[Update windows10XWifiConfiguration](../api/windows10xwificonfiguration-update.md)|[windows10XWifiConfiguration](../resources/windows10xwificonfiguration.md)|Update the properties of a [windows10XWifiConfiguration](../resources/windows10xwificonfiguration.md) object.|
|[Delete windows10XWifiConfiguration](../api/windows10xwificonfiguration-delete.md)|None|Deletes a [windows10XWifiConfiguration](../resources/windows10xwificonfiguration.md) object.|
|[assign](../api/windows10xwificonfiguration-assign.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/windows10xwificonfiguration-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/windows10xwificonfiguration-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

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
  "@odata.type": "microsoft.graph.windows10XWifiConfiguration",
  "baseType": "microsoft.graph.deviceManagementResourceAccessProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10XWifiConfiguration",
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

