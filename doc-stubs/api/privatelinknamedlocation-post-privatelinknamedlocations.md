---
title: "Create privateLinkNamedLocation"
description: "Create a new privateLinkNamedLocation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create privateLinkNamedLocation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [privateLinkNamedLocation](../resources/privatelinknamedlocation.md) object.

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
POST /privateLinkNamedLocations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [privateLinkNamedLocation](../resources/privatelinknamedlocation.md) object.

The following table shows the properties that are required when you create the [privateLinkNamedLocation](../resources/privatelinknamedlocation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md)|
|displayName|String|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md)|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md)|
|privateLinkResourcePolicyIds|String collection|**TODO: Add Description**|
|isTrusted|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [privateLinkNamedLocation](../resources/privatelinknamedlocation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_privatelinknamedlocation_from_privatelinknamedlocations"
}
-->
``` http
POST https://graph.microsoft.com/beta/privateLinkNamedLocations
Content-Type: application/json
Content-length: 199

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.privateLinkNamedLocation",
  "displayName": "String",
  "privateLinkResourcePolicyIds": [
    "String"
  ],
  "isTrusted": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.IdentityProtectionServices.privateLinkNamedLocation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.privateLinkNamedLocation",
  "id": "9a43f380-f380-9a43-80f3-439a80f3439a",
  "displayName": "String",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "privateLinkResourcePolicyIds": [
    "String"
  ],
  "isTrusted": "Boolean"
}
```

