---
title: "Update microsoftTunnelSite"
description: "Update the properties of a microsoftTunnelSite object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update microsoftTunnelSite
Namespace: microsoft.graph



Update the properties of a [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.

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
In the request body, supply a JSON representation of the [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.

The following table shows the properties that are required when you update the [microsoftTunnelSite](../resources/microsofttunnelsite.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|The MicrosoftTunnelSite's description|
|displayName|String|The MicrosoftTunnelSite's display name|
|publicAddress|String|The MicrosoftTunnelSite's public domain name or IP address|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|



## Response

If successful, this method returns a `200 OK` response code and an updated [microsoftTunnelSite](../resources/microsofttunnelsite.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_microsofttunnelsite"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/microsoftTunnelSites/{microsoftTunnelSiteId}
Content-Type: application/json
Content-length: 191

{
  "@odata.type": "#microsoft.graph.microsoftTunnelSite",
  "description": "String",
  "displayName": "String",
  "publicAddress": "String",
  "roleScopeTagIds": [
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
  "@odata.type": "#microsoft.graph.microsoftTunnelSite",
  "id": "c1647e88-7e88-c164-887e-64c1887e64c1",
  "description": "String",
  "displayName": "String",
  "publicAddress": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```

