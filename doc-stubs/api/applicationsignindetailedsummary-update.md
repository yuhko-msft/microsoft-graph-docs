---
title: "Update applicationSignInDetailedSummary"
description: "Update the properties of an applicationSignInDetailedSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update applicationSignInDetailedSummary
Namespace: microsoft.graph



Update the properties of an [applicationSignInDetailedSummary](../resources/applicationsignindetailedsummary.md) object.

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
PATCH /print/reports/applicationSignInDetailedSummary/{applicationSignInDetailedSummaryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [applicationSignInDetailedSummary](../resources/applicationsignindetailedsummary.md) object.

The following table shows the properties that are required when you update the [applicationSignInDetailedSummary](../resources/applicationsignindetailedsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|aggregatedEventDateTime|DateTimeOffset|**TODO: Add Description**|
|appDisplayName|String|**TODO: Add Description**|
|appId|String|**TODO: Add Description**|
|signInCount|Int64|**TODO: Add Description**|
|status|[signInStatus](../resources/signinstatus.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [applicationSignInDetailedSummary](../resources/applicationsignindetailedsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_applicationsignindetailedsummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/print/reports/applicationSignInDetailedSummary/{applicationSignInDetailedSummaryId}
Content-Type: application/json
Content-length: 280

{
  "@odata.type": "#microsoft.graph.applicationSignInDetailedSummary",
  "aggregatedEventDateTime": "String (timestamp)",
  "appDisplayName": "String",
  "appId": "String",
  "signInCount": "Integer",
  "status": {
    "@odata.type": "microsoft.graph.signInStatus"
  }
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
  "@odata.type": "#microsoft.graph.applicationSignInDetailedSummary",
  "id": "b9215966-5966-b921-6659-21b9665921b9",
  "aggregatedEventDateTime": "String (timestamp)",
  "appDisplayName": "String",
  "appId": "String",
  "signInCount": "Integer",
  "status": {
    "@odata.type": "microsoft.graph.signInStatus"
  }
}
```

