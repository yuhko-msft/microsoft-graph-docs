---
title: "Add connector"
description: "Add members by posting to the members collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add connector
Namespace: microsoft.graph



Add members by posting to the members collection.

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
POST /applications/{applicationsId}/connectorGroup/members/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [connector](../resources/connector.md) object.

The following table shows the properties that are required when you create the [connector](../resources/connector.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|externalIp|String|**TODO: Add Description**|
|machineName|String|**TODO: Add Description**|
|status|connectorStatus|**TODO: Add Description**. Possible values are: `active`, `inactive`.|



## Response

If successful, this method returns a `204 No Content` response code and a [connector](../resources/connector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_connector_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/applications/{applicationsId}/connectorGroup/members/$ref
Content-Type: application/json
Content-length: 129

{
  "@odata.type": "#microsoft.graph.connector",
  "externalIp": "String",
  "machineName": "String",
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.connector"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.connector",
  "id": "72bb7735-7735-72bb-3577-bb723577bb72",
  "externalIp": "String",
  "machineName": "String",
  "status": "String"
}
```

