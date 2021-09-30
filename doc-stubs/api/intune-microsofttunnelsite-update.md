---
title: "Update microsoftTunnelSite"
description: "Update the properties of a microsoftTunnelSite object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update microsoftTunnelSite
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) object.

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
PATCH /deviceManagement/microsoftTunnelSites/{microsoftTunnelSiteId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) object.

The following table shows the properties that are required when you update the [microsoftTunnelSite](../resources/intune-microsofttunnelsite.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The MicrosoftTunnelSite's Id|
|displayName|String|The MicrosoftTunnelSite's display name|
|description|String|The MicrosoftTunnelSite's description|
|publicAddress|String|The MicrosoftTunnelSite's public domain name or IP address|
|upgradeWindowUtcOffsetInMinutes|Int32|The site's timezone represented as a minute offset from UTC|
|upgradeWindowStartTime|TimeOfDay|The site's upgrade window start time of day|
|upgradeWindowEndTime|TimeOfDay|The site's upgrade window end time of day|
|upgradeAutomatically|Boolean|The site's automatic upgrade setting. True for automatic upgrades, false for manual control|
|upgradeAvailable|Boolean|True if an upgrade is available|
|internalNetworkProbeUrl|String|The MicrosoftTunnelSite's Internal Network Access Probe URL|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|



## Response

If successful, this method returns a `200 OK` response code and an updated [microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_microsofttunnelsite"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/microsoftTunnelSites/{microsoftTunnelSiteId}
Content-Type: application/json
Content-length: 456

{
  "@odata.type": "#microsoft.graph.microsoftTunnelSite",
  "displayName": "String",
  "description": "String",
  "publicAddress": "String",
  "upgradeWindowUtcOffsetInMinutes": "Integer",
  "upgradeWindowStartTime": "String (time of day)",
  "upgradeWindowEndTime": "String (time of day)",
  "upgradeAutomatically": "Boolean",
  "upgradeAvailable": "Boolean",
  "internalNetworkProbeUrl": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.microsoftTunnelSite",
  "id": "876cda13-da13-876c-13da-6c8713da6c87",
  "displayName": "String",
  "description": "String",
  "publicAddress": "String",
  "upgradeWindowUtcOffsetInMinutes": "Integer",
  "upgradeWindowStartTime": "String (time of day)",
  "upgradeWindowEndTime": "String (time of day)",
  "upgradeAutomatically": "Boolean",
  "upgradeAvailable": "Boolean",
  "internalNetworkProbeUrl": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```

