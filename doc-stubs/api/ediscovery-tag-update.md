---
title: "Update tag"
description: "Update the properties of a tag object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update tag
Namespace: microsoft.graph.ediscovery



Update the properties of a [tag](../resources/ediscovery-tag.md) object.

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
PATCH /compliance/ediscovery/cases/{caseId}/tags/{tagId}
PATCH /compliance/ediscovery/cases/{caseId}/tags/{tagId}/parent
PATCH /compliance/ediscovery/cases/{caseId}/tags/{tagId}/childTags/{tagId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [tag](../resources/ediscovery-tag.md) object.

The following table shows the properties that are required when you update the [tag](../resources/ediscovery-tag.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|childSelectability|childSelectability|**TODO: Add Description**. Possible values are: `One`, `Many`.|
|createdBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [tag](../resources/ediscovery-tag.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_tag"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/tags/{tagId}
Content-Type: application/json
Content-length: 221

{
  "@odata.type": "#microsoft.graph.ediscovery.tag",
  "childSelectability": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "description": "String",
  "displayName": "String"
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
  "@odata.type": "#microsoft.graph.ediscovery.tag",
  "id": "30dc3e08-3e08-30dc-083e-dc30083edc30",
  "childSelectability": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

