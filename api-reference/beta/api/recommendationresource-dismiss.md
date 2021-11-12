---
title: "Dismiss a recommendationResource"
description: "Update the status of a recommendationResource to dismissed"
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# Dismiss a recommendationResource
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Updates the status of a [recommendationResource](../resources/recommendationresource.md) to `dismissed`.

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
POST /directory/impactedResources/{recommendationResourceId}/dismiss
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|dismissReason|String|Audited reason for deeming a [recommendation](../resources/recommendation.md) inapplicable to you.|



## Response

If successful, this action returns a `200 OK` response code and a [recommendationResource](../resources/recommendationresource.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "recommendationresourcethis.dismiss"
}
-->
``` http
POST https://graph.microsoft.com/beta/directory/impactedResources/{recommendationResourceId}/dismiss
Content-Type: application/json
Content-length: 33

{
  "dismissReason": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.recommendationResource"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.recommendationResource",
    "id": "String (identifier)",
    "recommendationId": "String",
    "addedDateTime": "String (timestamp)",
    "portalUrl": "String",
    "apiUrl": "String",
    "displayName": "String",
    "resourceType": "String",
    "owner": "String",
    "rank": "Integer",
    "status": "String",
    "additionalDetails": [
      {
        "@odata.type": "microsoft.graph.keyValue"
      }
    ]
  }
}
```

