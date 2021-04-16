---
title: "Create sensitiveType"
description: "Create a new sensitiveType object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sensitiveType
Namespace: microsoft.graph



Create a new [sensitiveType](../resources/sensitivetype.md) object.

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
POST /dataClassification/sensitiveTypes
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sensitiveType](../resources/sensitivetype.md) object.

The following table shows the properties that are required when you create the [sensitiveType](../resources/sensitivetype.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|classificationMethod|classificationMethod|**TODO: Add Description**. Possible values are: `patternMatch`, `exactDataMatch`, `fingerprint`, `machineLearning`.|
|description|String|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|publisherName|String|**TODO: Add Description**|
|rulePackageId|String|**TODO: Add Description**|
|rulePackageType|String|**TODO: Add Description**|
|scope|sensitiveTypeScope|**TODO: Add Description**. Possible values are: `fullDocument`, `partialDocument`.|
|sensitiveTypeSource|sensitiveTypeSource|**TODO: Add Description**. Possible values are: `outOfBox`, `tenant`.|
|state|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [sensitiveType](../resources/sensitivetype.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sensitivetype_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/dataClassification/sensitiveTypes
Content-Type: application/json
Content-length: 313

{
  "@odata.type": "#microsoft.graph.sensitiveType",
  "classificationMethod": "String",
  "description": "String",
  "name": "String",
  "publisherName": "String",
  "rulePackageId": "String",
  "rulePackageType": "String",
  "scope": "String",
  "sensitiveTypeSource": "String",
  "state": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.sensitiveType"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.sensitiveType",
  "id": "8f122e4a-2e4a-8f12-4a2e-128f4a2e128f",
  "classificationMethod": "String",
  "description": "String",
  "name": "String",
  "publisherName": "String",
  "rulePackageId": "String",
  "rulePackageType": "String",
  "scope": "String",
  "sensitiveTypeSource": "String",
  "state": "String"
}
```

