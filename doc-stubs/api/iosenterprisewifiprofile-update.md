---
title: "Update iosEnterpriseWifiProfile"
description: "Update the properties of an iosEnterpriseWifiProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosEnterpriseWifiProfile
Namespace: microsoft.graph

Update the properties of an [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) object.

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
PATCH ** Entity URI for microsoft.graph.iosEnterpriseWifiProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) object.

The following table shows the properties that are required when you update the [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|preSharedKey|String|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|networkName|String|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|ssid|String|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|connectAutomatically|Boolean|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|connectWhenNetworkNameIsHidden|Boolean|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|wiFiSecurityType|iosWiFiSecurityType|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md). Possible values are: `open`, `wpaPersonal`, `wpaEnterprise`, `wep`, `wpa2Enterprise`.|
|proxySettings|[iosProxySettings](../resources/intune-iosproxysettings.md)|**TODO: Add Description** Inherited from [iosWifiProfile](../resources/ioswifiprofile.md)|
|eapSettings|[iosEapSettings](../resources/intune-ioseapsettings.md)|**TODO: Add Description**|
|trustedServerCertificateNames|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_iosenterprisewifiprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosEnterpriseWifiProfile not found
Content-Type: application/json
Content-length: 653

{
  "@odata.type": "#microsoft.graph.iosEnterpriseWifiProfile",
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
  },
  "eapSettings": {
    "@odata.type": "microsoft.graph.iosEapSettings"
  },
  "trustedServerCertificateNames": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.iosEnterpriseWifiProfile",
  "id": "cf4dc498-c498-cf4d-98c4-4dcf98c44dcf",
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

