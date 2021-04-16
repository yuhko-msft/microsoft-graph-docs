---
title: "Update custodian"
description: "Update the properties of a custodian object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update custodian
Namespace: microsoft.graph.ediscovery



Update the properties of a [custodian](../resources/ediscovery-custodian.md) object.

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
PATCH /compliance/ediscovery/cases/{caseId}/custodians/{custodianId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [custodian](../resources/ediscovery-custodian.md) object.

The following table shows the properties that are required when you update the [custodian](../resources/ediscovery-custodian.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md)|
|displayName|String|**TODO: Add Description** Inherited from [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md)|
|releasedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md)|
|status|dataSourceContainerStatus|**TODO: Add Description** Inherited from [dataSourceContainer](../resources/ediscovery-datasourcecontainer.md). Possible values are: `Active`, `Released`, `UnknownFutureValue`.|
|acknowledgedDateTime|DateTimeOffset|**TODO: Add Description**|
|applyHoldToSources|Boolean|**TODO: Add Description**|
|email|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [custodian](../resources/ediscovery-custodian.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_custodian"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/custodians/{custodianId}
Content-Type: application/json
Content-length: 265

{
  "@odata.type": "#microsoft.graph.ediscovery.custodian",
  "displayName": "String",
  "releasedDateTime": "String (timestamp)",
  "status": "String",
  "acknowledgedDateTime": "String (timestamp)",
  "applyHoldToSources": "Boolean",
  "email": "String"
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
  "@odata.type": "#microsoft.graph.ediscovery.custodian",
  "id": "ba9a1960-1960-ba9a-6019-9aba60199aba",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "releasedDateTime": "String (timestamp)",
  "status": "String",
  "acknowledgedDateTime": "String (timestamp)",
  "applyHoldToSources": "Boolean",
  "email": "String"
}
```

