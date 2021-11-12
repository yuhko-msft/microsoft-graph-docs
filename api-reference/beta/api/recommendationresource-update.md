---
title: "Update recommendationResource"
description: "Update the properties of a recommendationResource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update recommendationResource
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [recommendationResource](../resources/recommendationresource.md) object.

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
PATCH /directory/impactedResources/{recommendationResourceId}
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
|recommendationId|String|**TODO: Add Description** Required.|
|addedDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|portalUrl|String|**TODO: Add Description** Optional.|
|apiUrl|String|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Required.|
|resourceType|String|**TODO: Add Description** Required.|
|owner|String|**TODO: Add Description** Optional.|
|rank|Int32|**TODO: Add Description** Optional.|
|status|recommendationStatus|**TODO: Add Description**. The possible values are: `active`, `completedBySystem`, `completedByUser`, `dismissed`, `postponed`, `unknownFutureValue`. Required.|
|additionalDetails|[keyValue](../resources/intune-keyvalue.md) collection|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [recommendationResource](../resources/recommendationresource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_recommendationresource"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/directory/impactedResources/{recommendationResourceId}
Content-Type: application/json
Content-length: 407

{
  "@odata.type": "#microsoft.graph.recommendationResource",
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
  "@odata.type": "#microsoft.graph.recommendationResource",
  "id": "4ce28e9b-3260-5d4e-0b4f-860d5ff18fa2",
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
```

