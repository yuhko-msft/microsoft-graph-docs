---
title: "Create informationProtectionPolicy"
description: "Create a new informationProtectionPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create informationProtectionPolicy
Namespace: microsoft.graph



Create a new informationProtectionPolicy object.

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
POST /users/{usersId}/informationProtection/policy
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [informationProtectionPolicy](../resources/informationprotectionpolicy.md) object.

The following table shows the properties that are required when you create the [informationProtectionPolicy](../resources/informationprotectionpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|



## Response

If successful, this method returns a `201 Created` response code and an [informationProtectionPolicy](../resources/informationprotectionpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_informationprotectionpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/users/{usersId}/informationProtection/policy
Content-Type: application/json
Content-length: 69

{
  "@odata.type": "#microsoft.graph.informationProtectionPolicy"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.informationProtectionPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.informationProtectionPolicy",
  "id": "424f1c20-1c20-424f-201c-4f42201c4f42"
}
```

