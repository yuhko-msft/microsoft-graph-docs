---
title: "Create exactMatchUploadAgent"
description: "Create a new exactMatchUploadAgent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create exactMatchUploadAgent
Namespace: microsoft.graph



Create a new [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) object.

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
POST /dataClassification/exactMatchUploadAgents
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) object.

The following table shows the properties that are required when you create the [exactMatchUploadAgent](../resources/exactmatchuploadagent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_exactmatchuploadagent_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/dataClassification/exactMatchUploadAgents
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
  "truncated": true,
  "@odata.type": "microsoft.graph.exactMatchUploadAgent"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.exactMatchUploadAgent",
  "id": "4b8ae2a8-e2a8-4b8a-a8e2-8a4ba8e28a4b",
  "creationDateTime": "String (timestamp)",
  "description": "String"
}
```

