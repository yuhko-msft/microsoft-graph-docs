---
title: "Update dataSource"
description: "Update the properties of a dataSource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update dataSource
Namespace: microsoft.graph.ediscovery



Update the properties of a [dataSource](../resources/ediscovery-datasource.md) object.

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
PATCH /compliance/ediscovery/cases/{caseId}/noncustodialDataSources/{noncustodialDataSourceId}/dataSource
PATCH /compliance/ediscovery/cases/{caseId}/sourceCollections/{sourceCollectionId}/custodianSources/{dataSourceId}
PATCH /compliance/ediscovery/cases/{caseId}/sourceCollections/{sourceCollectionId}/additionalSources/{dataSourceId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [dataSource](../resources/ediscovery-datasource.md) object.

The following table shows the properties that are required when you update the [dataSource](../resources/ediscovery-datasource.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|createdBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [dataSource](../resources/ediscovery-datasource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_datasource"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/noncustodialDataSources/{noncustodialDataSourceId}/dataSource
Content-Type: application/json
Content-length: 165

{
  "@odata.type": "#microsoft.graph.ediscovery.dataSource",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "displayName": "String"
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
  "@odata.type": "#microsoft.graph.ediscovery.dataSource",
  "id": "3a2bab19-ab19-3a2b-19ab-2b3a19ab2b3a",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "displayName": "String"
}
```

