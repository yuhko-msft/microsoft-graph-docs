---
title: "Create dataSourceContainer"
description: "Create a new dataSourceContainer object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create dataSourceContainer
Namespace: microsoft.graph.ediscovery



Create a new [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md) object.

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
POST ** Collection URI for microsoft.graph.ediscovery.dataSourceContainer not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md) object.

The following table shows the properties that are required when you create the [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|releasedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|dataSourceContainerStatus|**TODO: Add Description**. Possible values are: `Active`, `Released`, `UnknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and a [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_datasourcecontainer_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.ediscovery.dataSourceContainer not found
Content-Type: application/json
Content-length: 168

{
  "@odata.type": "#microsoft.graph.ediscovery.dataSourceContainer",
  "displayName": "String",
  "releasedDateTime": "String (timestamp)",
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.dataSourceContainer"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.ediscovery.dataSourceContainer",
  "id": "1723a654-a654-1723-54a6-231754a62317",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "releasedDateTime": "String (timestamp)",
  "status": "String"
}
```

