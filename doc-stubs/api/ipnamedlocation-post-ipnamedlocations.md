---
title: "Create ipNamedLocation"
description: "Create a new ipNamedLocation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create ipNamedLocation
Namespace: microsoft.graph



Create a new [ipNamedLocation](../resources/ipnamedlocation.md) object.

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
POST /ipNamedLocations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [ipNamedLocation](../resources/ipnamedlocation.md) object.

The following table shows the properties that are required when you create the [ipNamedLocation](../resources/ipnamedlocation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md)|
|displayName|String|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md)|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [namedLocation](../resources/namedlocation.md)|
|ipRanges|[Microsoft.IdentityProtectionServices.ipRange](../resources/iprange.md) collection|**TODO: Add Description**|
|isTrusted|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [ipNamedLocation](../resources/ipnamedlocation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_ipnamedlocation_from_ipnamedlocations"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/ipNamedLocations
Content-Type: application/json
Content-length: 224

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.ipNamedLocation",
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
  "truncated": true,
  "@odata.type": "Microsoft.IdentityProtectionServices.ipNamedLocation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.ipNamedLocation",
  "id": "f0f8935a-935a-f0f8-5a93-f8f05a93f8f0",
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

