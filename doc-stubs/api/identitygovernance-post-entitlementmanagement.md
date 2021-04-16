---
title: "Create entitlementManagement"
description: "Create a new entitlementManagement object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create entitlementManagement
Namespace: microsoft.graph



Create a new entitlementManagement object.

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
POST /identityGovernance/entitlementManagement
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [entitlementManagement](../resources/entitlementmanagement.md) object.

The following table shows the properties that are required when you create the [entitlementManagement](../resources/entitlementmanagement.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|



## Response

If successful, this method returns a `201 Created` response code and an [entitlementManagement](../resources/entitlementmanagement.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_entitlementmanagement_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement
Content-Type: application/json
Content-length: 63

{
  "@odata.type": "#microsoft.graph.entitlementManagement"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.entitlementManagement"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.entitlementManagement",
  "id": "10725940-5940-1072-4059-721040597210"
}
```

