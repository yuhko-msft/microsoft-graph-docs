---
title: "Update trustFrameworkPolicy"
description: "Update the properties of a trustFrameworkPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update trustFrameworkPolicy
Namespace: microsoft.graph



Update the properties of a [trustFrameworkPolicy](../resources/trustframeworkpolicy.md) object.

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
PATCH /trustFramework/policies/{trustFrameworkPolicyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [trustFrameworkPolicy](../resources/trustframeworkpolicy.md) object.

The following table shows the properties that are required when you update the [trustFrameworkPolicy](../resources/trustframeworkpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [trustFrameworkPolicy](../resources/trustframeworkpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_trustframeworkpolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/trustFramework/policies/{trustFrameworkPolicyId}
Content-Type: application/json
Content-length: 62

{
  "@odata.type": "#microsoft.graph.trustFrameworkPolicy"
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
  "@odata.type": "#microsoft.graph.trustFrameworkPolicy",
  "id": "97328a7e-8a7e-9732-7e8a-32977e8a3297"
}
```

