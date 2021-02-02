---
title: "Create iosWifiProfile"
description: "Create a new iosWifiProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosWifiProfile
Namespace: microsoft.graph

Create a new [iosWifiProfile](../resources/ioswifiprofile.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST ** Collection URI for microsoft.graph.iosWifiProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosWifiProfile](../resources/ioswifiprofile.md) object.

The following table shows the properties that are required when you create the [iosWifiProfile](../resources/ioswifiprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|preSharedKey|String|**TODO: Add Description**|
|networkName|String|**TODO: Add Description**|
|ssid|String|**TODO: Add Description**|
|connectAutomatically|Boolean|**TODO: Add Description**|
|connectWhenNetworkNameIsHidden|Boolean|**TODO: Add Description**|
|wiFiSecurityType|iosWiFiSecurityType|**TODO: Add Description**. Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Enterprise`.|
|proxySettings|[iosProxySettings](../resources/intune-iosproxysettings.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [iosWifiProfile](../resources/ioswifiprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_ioswifiprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.iosWifiProfile not found
Content-Type: application/json
Content-length: 506

{
  "@odata.type": "#microsoft.graph.iosWifiProfile",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosWifiProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.iosWifiProfile",
  "id": "79d5e828-e828-79d5-28e8-d57928e8d579",
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

