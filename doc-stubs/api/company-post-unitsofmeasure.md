---
title: "Create unitOfMeasure"
description: "Create a new unitOfMeasure object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unitOfMeasure
Namespace: microsoft.graph



Create a new unitOfMeasure object.

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
POST /financials/companies/{companyId}/unitsOfMeasure
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unitOfMeasure](../resources/unitofmeasure.md) object.

The following table shows the properties that are required when you create the [unitOfMeasure](../resources/unitofmeasure.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|internationalStandardCode|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [unitOfMeasure](../resources/unitofmeasure.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_unitofmeasure_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/financials/companies/{companyId}/unitsOfMeasure
Content-Type: application/json
Content-length: 146

{
  "@odata.type": "#microsoft.graph.unitOfMeasure",
  "code": "String",
  "displayName": "String",
  "internationalStandardCode": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unitOfMeasure"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unitOfMeasure",
  "id": "9f55f898-f898-9f55-98f8-559f98f8559f",
  "code": "String",
  "displayName": "String",
  "internationalStandardCode": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

