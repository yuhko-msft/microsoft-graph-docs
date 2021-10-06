---
title: "Update userReportRefreshProcess"
description: "Update the properties of a userReportRefreshProcess object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userReportRefreshProcess
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md) object.

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
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md) object.

The following table shows the properties that are required when you update the [userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md).

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/industrydata-mutableentity.md)|
|displayName|String|**TODO: Add Description** Inherited from [process](../resources/industrydata-process.md)|
|readinessStatus|readinessStatus|**TODO: Add Description** Inherited from [process](../resources/industrydata-process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userreportrefreshprocess"
}
-->
``` http

```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.industryData.userReportRefreshProcess",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

