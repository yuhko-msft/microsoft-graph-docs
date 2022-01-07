---
title: "Update ipNamedLocation"
description: "Update the properties of an ipNamedLocation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update ipNamedLocation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [ipNamedLocation](../resources/ipnamedlocation.md) object.

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
PATCH /ipNamedLocation
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md). Required.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md). Optional.|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md). Optional.|
|ipRanges|[Microsoft.IdentityProtectionServices.ipRange](../resources/iprange.md) collection|**TODO: Add Description** Required.|
|isTrusted|Boolean|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [ipNamedLocation](../resources/ipnamedlocation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_ipnamedlocation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/ipNamedLocation
Content-Type: application/json
Content-length: 203

{
  "@odata.type": "#microsoft.graph.ipNamedLocation",
  "displayName": "String",
  "ipRanges": [
    {
      "@odata.type": "microsoft.graph.iPv4CidrRange"
    }
  ],
  "isTrusted": "Boolean"
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
  "@odata.type": "#microsoft.graph.ipNamedLocation",
  "id": "9e146b03-6b03-9e14-036b-149e036b149e",
  "displayName": "String",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "ipRanges": [
    {
      "@odata.type": "microsoft.graph.iPv4CidrRange"
    }
  ],
  "isTrusted": "Boolean"
}
```

