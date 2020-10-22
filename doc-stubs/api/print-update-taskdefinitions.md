---
title: "Update taskDefinitions"
description: "Update the properties of a taskDefinitions object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update taskDefinitions
Namespace: microsoft.graph

Update the properties of a taskDefinitions object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /print/taskDefinitions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [printTaskDefinition](../resources/printtaskdefinition.md) object.

The following table shows the properties that are required when you create the [printTaskDefinition](../resources/printtaskdefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|createdBy|[appIdentity](../resources/appidentity.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [printTaskDefinition](../resources/printtaskdefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_taskdefinitions"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/print/taskDefinitions
Content-Type: application/json
Content-length: 163

{
  "@odata.type": "#microsoft.graph.printTaskDefinition",
  "displayName": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.appIdentity"
  }
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
  "@odata.type": "#microsoft.graph.printTaskDefinition",
  "id": "d952961c-961c-d952-1c96-52d91c9652d9",
  "displayName": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.appIdentity"
  }
}
```

