---
title: "Update apiDataConnector"
description: "Update the properties of an apiDataConnector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update apiDataConnector
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [apiDataConnector](../resources/industrydata-apidataconnector.md) object.

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
PATCH ** Entity URI for microsoft.graph.industryData.apiDataConnector not found
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
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md). Optional.|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/industrydata-dataconnector.md). Required.|
|systemContract|systemContract|API contracts for external systems the industryDataHub can connect to. The possible values are: `educationPowerSchool`, `educationGenericOneRoster1_1`, `educationGenericOneRoster1_2`, `unknownFutureValue`. Required.|
|credential|[microsoft.graph.industryData.credential](../resources/industrydata-credential.md)|A credential to use to connect to the API. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [apiDataConnector](../resources/industrydata-apidataconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_apidataconnector"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.industryData.apiDataConnector not found
Content-Type: application/json
Content-length: 238

{
  "@odata.type": "#microsoft.graph.industryData.apiDataConnector",
  "eTag": "String",
  "displayName": "String",
  "systemContract": "String",
  "credential": {
    "@odata.type": "microsoft.graph.industryData.credential"
  }
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
  "@odata.type": "#microsoft.graph.industryData.apiDataConnector",
  "eTag": "String",
  "displayName": "String",
  "systemContract": "String",
  "credential": {
    "@odata.type": "microsoft.graph.industryData.credential"
  }
}
```

