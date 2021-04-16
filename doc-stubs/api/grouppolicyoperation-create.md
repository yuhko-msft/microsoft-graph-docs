---
title: "Create groupPolicyOperation"
description: "Create a new groupPolicyOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create groupPolicyOperation
Namespace: microsoft.graph



Create a new [groupPolicyOperation](../resources/grouppolicyoperation.md) object.

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
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyOperation](../resources/grouppolicyoperation.md) object.

The following table shows the properties that are required when you create the [groupPolicyOperation](../resources/grouppolicyoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|
|operationStatus|groupPolicyOperationStatus|The group policy operation status. Possible values are: `unknown`, `inProgress`, `success`, `failed`.|
|operationType|groupPolicyOperationType|The type of group policy operation. Possible values are: `none`, `upload`, `uploadNewVersion`, `addLanguageFiles`, `removeLanguageFiles`, `updateLanguageFiles`, `remove`.|
|statusDetails|String|The group policy operation status detail.|



## Response

If successful, this method returns a `201 Created` response code and a [groupPolicyOperation](../resources/grouppolicyoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouppolicyoperation_from_"
}
-->
``` http

```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyOperation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.groupPolicyOperation",
  "id": "3aeb01de-01de-3aeb-de01-eb3ade01eb3a",
  "lastModifiedDateTime": "String (timestamp)",
  "operationStatus": "String",
  "operationType": "String",
  "statusDetails": "String"
}
```

