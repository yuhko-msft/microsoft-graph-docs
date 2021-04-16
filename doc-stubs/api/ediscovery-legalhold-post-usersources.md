---
title: "Create userSource"
description: "Create a new userSource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userSource
Namespace: microsoft.graph.ediscovery



Create a new userSource object.

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
POST /compliance/ediscovery/cases/{caseId}/legalHolds/{legalHoldId}/userSources
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userSource](../resources/ediscovery-usersource.md) object.

The following table shows the properties that are required when you create the [userSource](../resources/ediscovery-usersource.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|createdBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description** Inherited from [dataSource](../resources/ediscovery-datasource.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [dataSource](../resources/ediscovery-datasource.md)|
|displayName|String|**TODO: Add Description** Inherited from [dataSource](../resources/ediscovery-datasource.md)|
|email|String|**TODO: Add Description**|
|includedSources|sourceType|**TODO: Add Description**. Possible values are: `mailbox`, `site`.|



## Response

If successful, this method returns a `201 Created` response code and a [userSource](../resources/ediscovery-usersource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_usersource_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/legalHolds/{legalHoldId}/userSources
Content-Type: application/json
Content-length: 219

{
  "@odata.type": "#microsoft.graph.ediscovery.userSource",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "displayName": "String",
  "email": "String",
  "includedSources": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.userSource"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.ediscovery.userSource",
  "id": "f7980153-0153-f798-5301-98f7530198f7",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "email": "String",
  "includedSources": "String"
}
```

