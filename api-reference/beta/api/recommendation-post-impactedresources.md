---
title: "Create recommendationResource"
description: "Create a new recommendationResource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create recommendationResource
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [recommendationResource](../resources/recommendationresource.md) object.

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
POST /directory/impactedResources
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [recommendationResource](../resources/recommendationresource.md) object.

You can specify the following properties when creating a **recommendationResource**.

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

If successful, this method returns a `201 Created` response code and a [recommendationResource](../resources/recommendationresource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_recommendationresource_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/directory/impactedResources
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
  "truncated": true,
  "@odata.type": "microsoft.graph.recommendationResource"
}
-->
``` http
HTTP/1.1 201 Created
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

