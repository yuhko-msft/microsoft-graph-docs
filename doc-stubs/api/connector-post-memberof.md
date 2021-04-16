---
title: "Add connectorGroup"
description: "Add memberOf by posting to the memberOf collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add connectorGroup
Namespace: microsoft.graph



Add memberOf by posting to the memberOf collection.

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
POST /applications/{applicationsId}/connectorGroup/members/{connectorId}/memberOf/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [connectorGroup](../resources/connectorgroup.md) object.

The following table shows the properties that are required when you create the [connectorGroup](../resources/connectorgroup.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|connectorGroupType|connectorGroupType|**TODO: Add Description**. Possible values are: `applicationProxy`.|
|isDefault|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|region|connectorGroupRegion|**TODO: Add Description**. Possible values are: `nam`, `eur`, `aus`, `asia`, `ind`, `unknownFutureValue`.|



## Response

If successful, this method returns a `204 No Content` response code and a [connectorGroup](../resources/connectorgroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_connectorgroup_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/applications/{applicationsId}/connectorGroup/members/{connectorId}/memberOf/$ref
Content-Type: application/json
Content-length: 162

{
  "@odata.type": "#microsoft.graph.connectorGroup",
  "connectorGroupType": "String",
  "isDefault": "Boolean",
  "name": "String",
  "region": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.connectorGroup"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.connectorGroup",
  "id": "e98f0710-0710-e98f-1007-8fe910078fe9",
  "connectorGroupType": "String",
  "isDefault": "Boolean",
  "name": "String",
  "region": "String"
}
```

