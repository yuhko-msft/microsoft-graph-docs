---
title: "Create noncustodialDataSource"
description: "Create a new noncustodialDataSource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create noncustodialDataSource
Namespace: microsoft.graph.ediscovery



Create a new [noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md) object.

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
POST /compliance/ediscovery/cases/{caseId}/noncustodialDataSources
POST /compliance/ediscovery/cases/{caseId}/sourceCollections/{sourceCollectionId}/noncustodialSources
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md) object.

The following table shows the properties that are required when you create the [noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md)|
|displayName|String|**TODO: Add Description** Inherited from [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md)|
|releasedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md)|
|status|dataSourceContainerStatus|**TODO: Add Description** Inherited from [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md). Possible values are: `Active`, `Released`, `UnknownFutureValue`.|
|applyHoldToSource|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_noncustodialdatasource_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/noncustodialDataSources
Content-Type: application/json
Content-length: 206

{
  "@odata.type": "#microsoft.graph.ediscovery.noncustodialDataSource",
  "displayName": "String",
  "releasedDateTime": "String (timestamp)",
  "status": "String",
  "applyHoldToSource": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.noncustodialDataSource"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.ediscovery.noncustodialDataSource",
  "id": "fed23a5e-3a5e-fed2-5e3a-d2fe5e3ad2fe",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "releasedDateTime": "String (timestamp)",
  "status": "String",
  "applyHoldToSource": "Boolean"
}
```

