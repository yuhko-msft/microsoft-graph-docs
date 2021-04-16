---
title: "Update exactMatchUploadAgent"
description: "Update the properties of an exactMatchUploadAgent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update exactMatchUploadAgent
Namespace: microsoft.graph



Update the properties of an [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) object.

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
PATCH /dataClassification/exactMatchUploadAgents/{exactMatchUploadAgentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) object.

The following table shows the properties that are required when you update the [exactMatchUploadAgent](../resources/exactmatchuploadagent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_exactmatchuploadagent"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/dataClassification/exactMatchUploadAgents/{exactMatchUploadAgentId}
Content-Type: application/json
Content-length: 136

{
  "@odata.type": "#microsoft.graph.exactMatchUploadAgent",
  "creationDateTime": "String (timestamp)",
  "description": "String"
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
  "@odata.type": "#microsoft.graph.exactMatchUploadAgent",
  "id": "4b8ae2a8-e2a8-4b8a-a8e2-8a4ba8e28a4b",
  "creationDateTime": "String (timestamp)",
  "description": "String"
}
```

