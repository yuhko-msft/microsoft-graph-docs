---
title: "Create taxGroup"
description: "Create a new taxGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create taxGroup
Namespace: microsoft.graph



Create a new taxGroup object.

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
POST /financials/companies/{companyId}/taxGroups
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [taxGroup](../resources/taxgroup.md) object.

The following table shows the properties that are required when you create the [taxGroup](../resources/taxgroup.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|taxType|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [taxGroup](../resources/taxgroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_taxgroup_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/financials/companies/{companyId}/taxGroups
Content-Type: application/json
Content-length: 123

{
  "@odata.type": "#microsoft.graph.taxGroup",
  "code": "String",
  "displayName": "String",
  "taxType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.taxGroup"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.taxGroup",
  "id": "6a8dbaef-baef-6a8d-efba-8d6aefba8d6a",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "taxType": "String"
}
```

