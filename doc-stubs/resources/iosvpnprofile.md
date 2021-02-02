---
title: "iosVpnProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVpnProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosVpnProfiles](../api/iosvpnprofile-list.md)|[iosVpnProfile](../resources/iosvpnprofile.md) collection|Get a list of the [iosVpnProfile](../resources/iosvpnprofile.md) objects and their properties.|
|[Create iosVpnProfile](../api/iosvpnprofile-create.md)|[iosVpnProfile](../resources/iosvpnprofile.md)|Create a new [iosVpnProfile](../resources/iosvpnprofile.md) object.|
|[Get iosVpnProfile](../api/iosvpnprofile-get.md)|[iosVpnProfile](../resources/iosvpnprofile.md)|Read the properties and relationships of an [iosVpnProfile](../resources/iosvpnprofile.md) object.|
|[Update iosVpnProfile](../api/iosvpnprofile-update.md)|[iosVpnProfile](../resources/iosvpnprofile.md)|Update the properties of an [iosVpnProfile](../resources/iosvpnprofile.md) object.|
|[Delete iosVpnProfile](../api/iosvpnprofile-delete.md)|None|Deletes an [iosVpnProfile](../resources/iosvpnprofile.md) object.|
|[assign](../api/iosvpnprofile-assign.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/iosvpnprofile-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/iosvpnprofile-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appSettings|[iosVpnAppSettings](../resources/intune-iosvpnappsettings.md)|**TODO: Add Description**|
|connectionName|String|**TODO: Add Description**|
|connectionSettings|[iosVpnConnectionSettings](../resources/intune-iosvpnconnectionsettings.md)|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|proxySettings|[iosProxySettings](../resources/intune-iosproxysettings.md)|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.iosVpnProfile",
  "baseType": "microsoft.graph.deviceManagementResourceAccessProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVpnProfile",
  "id": "String (identifier)",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "connectionName": "String",
  "connectionSettings": {
    "@odata.type": "microsoft.graph.iosVpnConnectionSettings"
  },
  "appSettings": {
    "@odata.type": "microsoft.graph.iosVpnAppSettings"
  },
  "proxySettings": {
    "@odata.type": "microsoft.graph.iosProxySettings"
  }
}
```

