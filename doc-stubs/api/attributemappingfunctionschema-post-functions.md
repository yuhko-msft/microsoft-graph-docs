---
title: "Create attributeMappingFunctionSchema"
description: "Create a new attributeMappingFunctionSchema object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create attributeMappingFunctionSchema
Namespace: microsoft.graph



Create a new [attributeMappingFunctionSchema](../resources/attributemappingfunctionschema.md) object.

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
POST /functions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [attributeMappingFunctionSchema](../resources/attributemappingfunctionschema.md) object.

The following table shows the properties that are required when you create the [attributeMappingFunctionSchema](../resources/attributemappingfunctionschema.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|parameters|[attributeMappingParameterSchema](../resources/attributemappingparameterschema.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [attributeMappingFunctionSchema](../resources/attributemappingfunctionschema.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_attributemappingfunctionschema_from_functions"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/functions
Content-Type: application/json
Content-length: 183

{
  "@odata.type": "#microsoft.graph.attributeMappingFunctionSchema",
  "parameters": [
    {
      "@odata.type": "microsoft.graph.attributeMappingParameterSchema"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.attributeMappingFunctionSchema"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.attributeMappingFunctionSchema",
  "id": "c35d0344-0344-c35d-4403-5dc344035dc3",
  "parameters": [
    {
      "@odata.type": "microsoft.graph.attributeMappingParameterSchema"
    }
  ]
}
```

