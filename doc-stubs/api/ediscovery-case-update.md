---
title: "Update case"
description: "Update the properties of a case object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update case
Namespace: microsoft.graph.ediscovery



Update the properties of a [case](../resources/ediscovery-case.md) object.

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
PATCH /compliance/ediscovery/cases/{caseId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [case](../resources/ediscovery-case.md) object.

The following table shows the properties that are required when you update the [case](../resources/ediscovery-case.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|closedBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|closedDateTime|DateTimeOffset|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|caseStatus|**TODO: Add Description**. Possible values are: `unknown`, `active`, `pendingDelete`, `closing`, `closed`, `closedWithError`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [case](../resources/ediscovery-case.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_case"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}
Content-Type: application/json
Content-length: 279

{
  "@odata.type": "#microsoft.graph.ediscovery.case",
  "closedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "closedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "externalId": "String",
  "status": "String"
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
  "@odata.type": "#microsoft.graph.ediscovery.case",
  "id": "234c2395-2395-234c-9523-4c2395234c23",
  "closedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "closedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "externalId": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "status": "String"
}
```

