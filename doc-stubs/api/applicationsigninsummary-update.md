---
title: "Update applicationSignInSummary"
description: "Update the properties of an applicationSignInSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update applicationSignInSummary
Namespace: microsoft.graph



Update the properties of an [applicationSignInSummary](../resources/applicationsigninsummary.md) object.

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
PATCH /applicationSignInSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [applicationSignInSummary](../resources/applicationsigninsummary.md) object.

The following table shows the properties that are required when you update the [applicationSignInSummary](../resources/applicationsigninsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appDisplayName|String|**TODO: Add Description**|
|failedSignInCount|Int64|**TODO: Add Description**|
|successfulSignInCount|Int64|**TODO: Add Description**|
|successPercentage|Double|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [applicationSignInSummary](../resources/applicationsigninsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_applicationsigninsummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/applicationSignInSummary
Content-Type: application/json
Content-length: 205

{
  "@odata.type": "#microsoft.graph.applicationSignInSummary",
  "appDisplayName": "String",
  "failedSignInCount": "Integer",
  "successfulSignInCount": "Integer",
  "successPercentage": "Double"
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
  "@odata.type": "#microsoft.graph.applicationSignInSummary",
  "id": "f40355b6-55b6-f403-b655-03f4b65503f4",
  "appDisplayName": "String",
  "failedSignInCount": "Integer",
  "successfulSignInCount": "Integer",
  "successPercentage": "Double"
}
```

