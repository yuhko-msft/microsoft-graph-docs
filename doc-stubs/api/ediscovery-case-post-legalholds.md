---
title: "Create legalHold"
description: "Create a new legalHold object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create legalHold
Namespace: microsoft.graph.ediscovery



Create a new legalHold object.

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
POST /compliance/ediscovery/cases/{caseId}/legalHolds
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [legalHold](../resources/ediscovery-legalhold.md) object.

The following table shows the properties that are required when you create the [legalHold](../resources/ediscovery-legalhold.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|contentQuery|String|**TODO: Add Description**|
|createdBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|errors|String collection|**TODO: Add Description**|
|isEnabled|Boolean|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|legalHoldStatus|**TODO: Add Description**. Possible values are: `Pending`, `Error`, `Success`, `UnknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and a [legalHold](../resources/ediscovery-legalhold.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_legalhold_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/legalHolds
Content-Type: application/json
Content-length: 306

{
  "@odata.type": "#microsoft.graph.ediscovery.legalHold",
  "contentQuery": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "description": "String",
  "displayName": "String",
  "errors": [
    "String"
  ],
  "isEnabled": "Boolean",
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.legalHold"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.ediscovery.legalHold",
  "id": "8780798d-798d-8780-8d79-80878d798087",
  "contentQuery": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "errors": [
    "String"
  ],
  "isEnabled": "Boolean",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "status": "String"
}
```

