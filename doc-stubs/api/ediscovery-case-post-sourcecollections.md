---
title: "Create sourceCollection"
description: "Create a new sourceCollection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sourceCollection
Namespace: microsoft.graph.ediscovery



Create a new sourceCollection object.

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
POST /compliance/ediscovery/cases/{caseId}/sourceCollections
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sourceCollection](../resources/ediscovery-sourcecollection.md) object.

The following table shows the properties that are required when you create the [sourceCollection](../resources/ediscovery-sourcecollection.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|contentQuery|String|**TODO: Add Description**|
|createdBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|dataSourceScopes|dataSourceScopes|**TODO: Add Description**. Possible values are: `none`, `allTenantMailboxes`, `allTenantSites`, `allCaseCustodians`, `allCaseNoncustodialDataSources`, `unknownFutureValue`.|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [sourceCollection](../resources/ediscovery-sourcecollection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sourcecollection_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/sourceCollections
Content-Type: application/json
Content-length: 261

{
  "@odata.type": "#microsoft.graph.ediscovery.sourceCollection",
  "contentQuery": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "dataSourceScopes": "String",
  "description": "String",
  "displayName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.sourceCollection"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.ediscovery.sourceCollection",
  "id": "a5863c82-3c82-a586-823c-86a5823c86a5",
  "contentQuery": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "dataSourceScopes": "String",
  "description": "String",
  "displayName": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)"
}
```

