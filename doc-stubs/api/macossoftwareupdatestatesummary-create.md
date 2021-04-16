---
title: "Create macOSSoftwareUpdateStateSummary"
description: "Create a new macOSSoftwareUpdateStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create macOSSoftwareUpdateStateSummary
Namespace: microsoft.graph



Create a new [macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) object.

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
POST /deviceManagement/macOSSoftwareUpdateAccountSummaries/{macOSSoftwareUpdateAccountSummaryId}/categorySummaries/{macOSSoftwareUpdateCategorySummaryId}/updateStateSummaries
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) object.

The following table shows the properties that are required when you create the [macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|Human readable name of the software update|
|lastUpdatedDateTime|DateTimeOffset|Last date time the report for this device and product key was updated.|
|productKey|String|Product key of the software update.|
|state|macOSSoftwareUpdateState|State of the software update. Possible values are: `success`, `downloading`, `downloaded`, `installing`, `idle`, `available`, `scheduled`, `downloadFailed`, `downloadInsufficientSpace`, `downloadInsufficientPower`, `downloadInsufficientNetwork`, `installInsufficientSpace`, `installInsufficientPower`, `installFailed`, `commandFailed`.|
|updateCategory|macOSSoftwareUpdateCategory|Software update category. Possible values are: `critical`, `configurationDataFile`, `firmware`, `other`.|
|updateVersion|String|Version of the software update|



## Response

If successful, this method returns a `201 Created` response code and a [macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_macossoftwareupdatestatesummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/macOSSoftwareUpdateAccountSummaries/{macOSSoftwareUpdateAccountSummaryId}/categorySummaries/{macOSSoftwareUpdateCategorySummaryId}/updateStateSummaries
Content-Type: application/json
Content-length: 259

{
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateStateSummary",
  "displayName": "String",
  "lastUpdatedDateTime": "String (timestamp)",
  "productKey": "String",
  "state": "String",
  "updateCategory": "String",
  "updateVersion": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macOSSoftwareUpdateStateSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateStateSummary",
  "id": "aafcb5a8-b5a8-aafc-a8b5-fcaaa8b5fcaa",
  "displayName": "String",
  "lastUpdatedDateTime": "String (timestamp)",
  "productKey": "String",
  "state": "String",
  "updateCategory": "String",
  "updateVersion": "String"
}
```

