---
title: "Update deviceManagementIntentUserStateSummary"
description: "Update the properties of a deviceManagementIntentUserStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementIntentUserStateSummary
Namespace: microsoft.graph



Update the properties of a [deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md) object.

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
PATCH /deviceManagement/intents/{deviceManagementIntentId}/userStateSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md) object.

The following table shows the properties that are required when you update the [deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|conflictCount|Int32|Number of users in conflict|
|errorCount|Int32|Number of error users|
|failedCount|Int32|Number of failed users|
|notApplicableCount|Int32|Number of not applicable users|
|successCount|Int32|Number of succeeded users|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementintentuserstatesummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/intents/{deviceManagementIntentId}/userStateSummary
Content-Type: application/json
Content-length: 234

{
  "@odata.type": "#microsoft.graph.deviceManagementIntentUserStateSummary",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "notApplicableCount": "Integer",
  "successCount": "Integer"
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
  "@odata.type": "#microsoft.graph.deviceManagementIntentUserStateSummary",
  "id": "25512537-2537-2551-3725-512537255125",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "notApplicableCount": "Integer",
  "successCount": "Integer"
}
```

