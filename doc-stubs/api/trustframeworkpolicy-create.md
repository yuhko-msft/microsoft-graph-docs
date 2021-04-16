---
title: "Create trustFrameworkPolicy"
description: "Create a new trustFrameworkPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create trustFrameworkPolicy
Namespace: microsoft.graph



Create a new [trustFrameworkPolicy](../resources/trustframeworkpolicy.md) object.

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
POST /trustFramework/policies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [trustFrameworkPolicy](../resources/trustframeworkpolicy.md) object.

The following table shows the properties that are required when you create the [trustFrameworkPolicy](../resources/trustframeworkpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|



## Response

If successful, this method returns a `201 Created` response code and a [trustFrameworkPolicy](../resources/trustframeworkpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_trustframeworkpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/trustFramework/policies
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
  "truncated": true,
  "@odata.type": "microsoft.graph.trustFrameworkPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.trustFrameworkPolicy",
  "id": "97328a7e-8a7e-9732-7e8a-32977e8a3297"
}
```

