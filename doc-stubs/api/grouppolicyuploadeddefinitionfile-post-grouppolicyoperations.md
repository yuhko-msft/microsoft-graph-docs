---
title: "Add groupPolicyOperation"
description: "Add groupPolicyOperations by posting to the groupPolicyOperations collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add groupPolicyOperation
Namespace: microsoft.graph



Add groupPolicyOperations by posting to the groupPolicyOperations collection.

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
POST ** Collection URI for microsoft.graph.groupPolicyOperation not found/$ref
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

If successful, this method returns a `204 No Content` response code and a [groupPolicyOperation](../resources/grouppolicyoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouppolicyoperation_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.groupPolicyOperation not found/$ref
Content-Type: application/json
Content-length: 154

{
  "@odata.type": "#microsoft.graph.groupPolicyOperation",
  "operationStatus": "String",
  "operationType": "String",
  "statusDetails": "String"
}
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
HTTP/1.1 204 No Content
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

