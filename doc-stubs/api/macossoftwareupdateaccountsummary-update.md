---
title: "Update macOSSoftwareUpdateAccountSummary"
description: "Update the properties of a macOSSoftwareUpdateAccountSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOSSoftwareUpdateAccountSummary
Namespace: microsoft.graph



Update the properties of a [macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) object.

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
PATCH /deviceManagement/macOSSoftwareUpdateAccountSummaries/{macOSSoftwareUpdateAccountSummaryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) object.

The following table shows the properties that are required when you update the [macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceId|String|The device ID.|
|deviceName|String|The device name.|
|displayName|String|The name of the report|
|failedUpdateCount|Int32|Number of failed updates on the device.|
|lastUpdatedDateTime|DateTimeOffset|Last date time the report for this device was updated.|
|osVersion|String|The OS version.|
|successfulUpdateCount|Int32|Number of successful updates on the device.|
|totalUpdateCount|Int32|Number of total updates on the device.|
|userId|String|The user ID.|
|userPrincipalName|String|The user principal name|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macossoftwareupdateaccountsummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/macOSSoftwareUpdateAccountSummaries/{macOSSoftwareUpdateAccountSummaryId}
Content-Type: application/json
Content-length: 394

{
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateAccountSummary",
  "deviceId": "String",
  "deviceName": "String",
  "displayName": "String",
  "failedUpdateCount": "Integer",
  "lastUpdatedDateTime": "String (timestamp)",
  "osVersion": "String",
  "successfulUpdateCount": "Integer",
  "totalUpdateCount": "Integer",
  "userId": "String",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateAccountSummary",
  "id": "41e71c21-1c21-41e7-211c-e741211ce741",
  "deviceId": "String",
  "deviceName": "String",
  "displayName": "String",
  "failedUpdateCount": "Integer",
  "lastUpdatedDateTime": "String (timestamp)",
  "osVersion": "String",
  "successfulUpdateCount": "Integer",
  "totalUpdateCount": "Integer",
  "userId": "String",
  "userPrincipalName": "String"
}
```

