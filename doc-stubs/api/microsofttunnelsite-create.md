---
title: "Create microsoftTunnelSite"
description: "Create a new microsoftTunnelSite object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create microsoftTunnelSite
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.

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
POST /deviceManagement/microsoftTunnelSites
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.

The following table shows the properties that are required when you create the [microsoftTunnelSite](../resources/microsofttunnelsite.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|publicAddress|String|**TODO: Add Description**|
|upgradeWindowUtcOffsetInMinutes|Int32|**TODO: Add Description**|
|upgradeWindowStartTime|TimeOfDay|**TODO: Add Description**|
|upgradeWindowEndTime|TimeOfDay|**TODO: Add Description**|
|upgradeAutomatically|Boolean|**TODO: Add Description**|
|upgradeAvailable|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [microsoftTunnelSite](../resources/microsofttunnelsite.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_microsofttunnelsite_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/microsoftTunnelSites
Content-Type: application/json
Content-length: 416

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
  "roleScopeTagIds": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.microsoftTunnelSite"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.microsoftTunnelSite",
  "id": "c1647e88-7e88-c164-887e-64c1887e64c1",
  "displayName": "String",
  "description": "String",
  "publicAddress": "String",
  "upgradeWindowUtcOffsetInMinutes": "Integer",
  "upgradeWindowStartTime": "String (time of day)",
  "upgradeWindowEndTime": "String (time of day)",
  "upgradeAutomatically": "Boolean",
  "upgradeAvailable": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```

