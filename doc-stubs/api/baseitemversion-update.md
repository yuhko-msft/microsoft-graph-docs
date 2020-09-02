---
title: "Update baseItemVersion"
description: "Update the properties of a baseItemVersion object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update baseItemVersion
Namespace: microsoft.graph

Update the properties of a [baseItemVersion](../resources/baseitemversion.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /baseItemVersion
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [baseItemVersion](../resources/baseitemversion.md) object.

The following table shows the properties that are required when you create the [baseItemVersion](../resources/baseitemversion.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|publication|[publicationFacet](../resources/publicationfacet.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [baseItemVersion](../resources/baseitemversion.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_baseitemversion"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/baseItemVersion
Content-Type: application/json
Content-length: 138

{
  "@odata.type": "#microsoft.graph.baseItemVersion",
  "publication": {
    "@odata.type": "microsoft.graph.publicationFacet"
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
  "@odata.type": "#microsoft.graph.baseItemVersion",
  "id": "07ebfa32-fa32-07eb-32fa-eb0732faeb07",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "publication": {
    "@odata.type": "microsoft.graph.publicationFacet"
  }
}
```

