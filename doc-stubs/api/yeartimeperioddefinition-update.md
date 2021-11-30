---
title: "Update yearTimePeriodDefinition"
description: "Update the properties of a yearTimePeriodDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update yearTimePeriodDefinition
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) object.

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
PATCH /industryData/years/{yearTimePeriodDefinitionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|displayName|String|The name of the year. Required.|
|year|String|TBD - will be replaced with a reference nav property. Required.|
|year2|[microsoft.industryData.yearReferenceValue](../resources/yearreferencevalue.md)|Pointer to a year entry in the referenceDefinition collection.  Rename to year once the simple text year value is removed. Optional.|
|startDate|Date|The first day of the year. ISO 8601 date. Required.|
|endDate|Date|The last day of the year. ISO 8601 date. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_yeartimeperioddefinition"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/industryData/years/{yearTimePeriodDefinitionId}
Content-Type: application/json
Content-length: 259

{
  "@odata.type": "#microsoft.graph.yearTimePeriodDefinition",
  "eTag": "String",
  "displayName": "String",
  "year": "String",
  "year2": {
    "@odata.type": "microsoft.graph.yearReferenceValue"
  },
  "startDate": "Date",
  "endDate": "Date"
}
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
  "@odata.type": "#microsoft.graph.yearTimePeriodDefinition",
  "eTag": "String",
  "displayName": "String",
  "year": "String",
  "year2": {
    "@odata.type": "microsoft.graph.yearReferenceValue"
  },
  "startDate": "Date",
  "endDate": "Date"
}
```

