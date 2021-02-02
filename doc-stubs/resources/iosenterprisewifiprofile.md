---
title: "iosEnterpriseWifiProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosEnterpriseWifiProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosWifiProfile](../resources/ioswifiprofile.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosEnterpriseWifiProfiles](../api/iosenterprisewifiprofile-list.md)|[iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) collection|Get a list of the [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) objects and their properties.|
|[Create iosEnterpriseWifiProfile](../api/iosenterprisewifiprofile-create.md)|[iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md)|Create a new [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) object.|
|[Get iosEnterpriseWifiProfile](../api/iosenterprisewifiprofile-get.md)|[iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md)|Read the properties and relationships of an [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) object.|
|[Update iosEnterpriseWifiProfile](../api/iosenterprisewifiprofile-update.md)|[iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md)|Update the properties of an [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) object.|
|[Delete iosEnterpriseWifiProfile](../api/iosenterprisewifiprofile-delete.md)|None|Deletes an [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) object.|
|[List assignments](../api/iosenterprisewifiprofile-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/iosenterprisewifiprofile-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|connectAutomatically|Boolean|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|connectWhenNetworkNameIsHidden|Boolean|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|eapSettings|[iosEapSettings](../resources/intune-ioseapsettings.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|networkName|String|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|preSharedKey|String|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|proxySettings|[iosProxySettings](../resources/intune-iosproxysettings.md)|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|ssid|String|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|trustedServerCertificateNames|String collection|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|wiFiSecurityType|iosWiFiSecurityType|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md). Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Enterprise`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosEnterpriseWifiProfile",
  "baseType": "microsoft.graph.iosWifiProfile",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosEnterpriseWifiProfile",
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
  },
  "eapSettings": {
    "@odata.type": "microsoft.graph.iosEapSettings"
  },
  "trustedServerCertificateNames": [
    "String"
  ]
}
```

