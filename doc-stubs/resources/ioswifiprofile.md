---
title: "iosWifiProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosWifiProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosWifiProfiles](../api/ioswifiprofile-list.md)|[iosWifiProfile](../resources/ioswifiprofile.md) collection|Get a list of the [iosWifiProfile](../resources/ioswifiprofile.md) objects and their properties.|
|[Create iosWifiProfile](../api/ioswifiprofile-create.md)|[iosWifiProfile](../resources/ioswifiprofile.md)|Create a new [iosWifiProfile](../resources/ioswifiprofile.md) object.|
|[Get iosWifiProfile](../api/ioswifiprofile-get.md)|[iosWifiProfile](../resources/ioswifiprofile.md)|Read the properties and relationships of an [iosWifiProfile](../resources/ioswifiprofile.md) object.|
|[Update iosWifiProfile](../api/ioswifiprofile-update.md)|[iosWifiProfile](../resources/ioswifiprofile.md)|Update the properties of an [iosWifiProfile](../resources/ioswifiprofile.md) object.|
|[Delete iosWifiProfile](../api/ioswifiprofile-delete.md)|None|Deletes an [iosWifiProfile](../resources/ioswifiprofile.md) object.|
|[assign](../api/ioswifiprofile-assign.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/ioswifiprofile-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/ioswifiprofile-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|connectAutomatically|Boolean|**TODO: Add Description**|
|connectWhenNetworkNameIsHidden|Boolean|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|networkName|String|**TODO: Add Description**|
|preSharedKey|String|**TODO: Add Description**|
|proxySettings|[iosProxySettings](../resources/intune-iosproxysettings.md)|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|ssid|String|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|wiFiSecurityType|iosWiFiSecurityType|**TODO: Add Description**. Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Enterprise`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosWifiProfile",
  "baseType": "microsoft.graph.deviceManagementResourceAccessProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosWifiProfile",
  "id": "String (identifier)",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "preSharedKey": "String",
  "networkName": "String",
  "ssid": "String",
  "connectAutomatically": "Boolean",
  "connectWhenNetworkNameIsHidden": "Boolean",
  "wiFiSecurityType": "String",
  "proxySettings": {
    "@odata.type": "microsoft.graph.iosProxySettings"
  }
}
```

