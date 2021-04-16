---
title: "Create audioRoutingGroup"
description: "Create a new audioRoutingGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create audioRoutingGroup
Namespace: microsoft.graph



Create a new audioRoutingGroup object.

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
POST /app/calls/{callId}/audioRoutingGroups
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [audioRoutingGroup](../resources/audioroutinggroup.md) object.

The following table shows the properties that are required when you create the [audioRoutingGroup](../resources/audioroutinggroup.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|receivers|String collection|**TODO: Add Description**|
|routingMode|routingMode|**TODO: Add Description**. Possible values are: `oneToOne`, `multicast`.|
|sources|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [audioRoutingGroup](../resources/audioroutinggroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_audioroutinggroup_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/app/calls/{callId}/audioRoutingGroups
Content-Type: application/json
Content-length: 161

{
  "@odata.type": "#microsoft.graph.audioRoutingGroup",
  "receivers": [
    "String"
  ],
  "routingMode": "String",
  "sources": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.audioRoutingGroup"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.audioRoutingGroup",
  "id": "0192f9c9-f9c9-0192-c9f9-9201c9f99201",
  "receivers": [
    "String"
  ],
  "routingMode": "String",
  "sources": [
    "String"
  ]
}
```

