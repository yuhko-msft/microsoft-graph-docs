---
title: "Create resourceOperation"
description: "Create a new resourceOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create resourceOperation
Namespace: microsoft.graph



Create a new [resourceOperation](../resources/resourceoperation.md) object.

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
POST /deviceManagement/resourceOperations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [resourceOperation](../resources/resourceoperation.md) object.

The following table shows the properties that are required when you create the [resourceOperation](../resources/resourceoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|actionName|String|Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible.|
|description|String|Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal.|
|enabledForScopeValidation|Boolean|Determines whether the Permission is validated for Scopes defined per Role Assignment.|
|resource|String|Resource category to which this Operation belongs.|
|resourceName|String|Name of the Resource this operation is performed on.|



## Response

If successful, this method returns a `201 Created` response code and a [resourceOperation](../resources/resourceoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_resourceoperation_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/resourceOperations
Content-Type: application/json
Content-length: 211

{
  "@odata.type": "#microsoft.graph.resourceOperation",
  "actionName": "String",
  "description": "String",
  "enabledForScopeValidation": "Boolean",
  "resource": "String",
  "resourceName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.resourceOperation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.resourceOperation",
  "id": "3ded4bd2-4bd2-3ded-d24b-ed3dd24bed3d",
  "actionName": "String",
  "description": "String",
  "enabledForScopeValidation": "Boolean",
  "resource": "String",
  "resourceName": "String"
}
```

