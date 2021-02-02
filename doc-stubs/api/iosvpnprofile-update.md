---
title: "Update iosVpnProfile"
description: "Update the properties of an iosVpnProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosVpnProfile
Namespace: microsoft.graph

Update the properties of an [iosVpnProfile](../resources/iosvpnprofile.md) object.

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
PATCH ** Entity URI for microsoft.graph.iosVpnProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosVpnProfile](../resources/iosvpnprofile.md) object.

The following table shows the properties that are required when you update the [iosVpnProfile](../resources/iosvpnprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|connectionName|String|**TODO: Add Description**|
|connectionSettings|[iosVpnConnectionSettings](../resources/intune-iosvpnconnectionsettings.md)|**TODO: Add Description**|
|appSettings|[iosVpnAppSettings](../resources/intune-iosvpnappsettings.md)|**TODO: Add Description**|
|proxySettings|[iosProxySettings](../resources/intune-iosproxysettings.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosVpnProfile](../resources/iosvpnprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_iosvpnprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosVpnProfile not found
Content-Type: application/json
Content-length: 517

{
  "@odata.type": "#microsoft.graph.iosVpnProfile",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
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
  "@odata.type": "#microsoft.graph.iosVpnProfile",
  "id": "98e20cc1-0cc1-98e2-c10c-e298c10ce298",
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

