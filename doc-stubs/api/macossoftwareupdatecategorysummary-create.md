---
title: "Create macOSSoftwareUpdateCategorySummary"
description: "Create a new macOSSoftwareUpdateCategorySummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create macOSSoftwareUpdateCategorySummary
Namespace: microsoft.graph



Create a new [macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) object.

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
POST /deviceManagement/macOSSoftwareUpdateAccountSummaries/{macOSSoftwareUpdateAccountSummaryId}/categorySummaries
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) object.

The following table shows the properties that are required when you create the [macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceId|String|The device ID.|
|displayName|String|The name of the report|
|failedUpdateCount|Int32|Number of failed updates on the device|
|lastUpdatedDateTime|DateTimeOffset|Last date time the report for this device was updated.|
|successfulUpdateCount|Int32|Number of successful updates on the device|
|totalUpdateCount|Int32|Number of total updates on the device|
|updateCategory|macOSSoftwareUpdateCategory|Software update type. Possible values are: `critical`, `configurationDataFile`, `firmware`, `other`.|
|userId|String|The user ID.|



## Response

If successful, this method returns a `201 Created` response code and a [macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_macossoftwareupdatecategorysummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/macOSSoftwareUpdateAccountSummaries/{macOSSoftwareUpdateAccountSummaryId}/categorySummaries
Content-Type: application/json
Content-length: 339

{
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateCategorySummary",
  "deviceId": "String",
  "displayName": "String",
  "failedUpdateCount": "Integer",
  "lastUpdatedDateTime": "String (timestamp)",
  "successfulUpdateCount": "Integer",
  "totalUpdateCount": "Integer",
  "updateCategory": "String",
  "userId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macOSSoftwareUpdateCategorySummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateCategorySummary",
  "id": "8b657e4f-7e4f-8b65-4f7e-658b4f7e658b",
  "deviceId": "String",
  "displayName": "String",
  "failedUpdateCount": "Integer",
  "lastUpdatedDateTime": "String (timestamp)",
  "successfulUpdateCount": "Integer",
  "totalUpdateCount": "Integer",
  "updateCategory": "String",
  "userId": "String"
}
```

