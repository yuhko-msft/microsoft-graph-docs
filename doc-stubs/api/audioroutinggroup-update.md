---
title: "Update audioRoutingGroup"
description: "Update the properties of an audioRoutingGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update audioRoutingGroup
Namespace: microsoft.graph



Update the properties of an [audioRoutingGroup](../resources/audioroutinggroup.md) object.

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
PATCH /app/calls/{callId}/audioRoutingGroups/{audioRoutingGroupId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [audioRoutingGroup](../resources/audioroutinggroup.md) object.

The following table shows the properties that are required when you update the [audioRoutingGroup](../resources/audioroutinggroup.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|receivers|String collection|**TODO: Add Description**|
|routingMode|routingMode|**TODO: Add Description**. Possible values are: `oneToOne`, `multicast`.|
|sources|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [audioRoutingGroup](../resources/audioroutinggroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_audioroutinggroup"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/app/calls/{callId}/audioRoutingGroups/{audioRoutingGroupId}
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
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

