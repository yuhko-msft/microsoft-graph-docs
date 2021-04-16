---
title: "reviewSet: addToReviewSet"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# reviewSet: addToReviewSet
Namespace: microsoft.graph.ediscovery



**TODO: Add Description**

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
POST /caseExportOperation/reviewSet/addToReviewSet
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
|sourceCollection|[sourceCollection](../resources/ediscovery-sourcecollection.md)|**TODO: Add Description**|
|additionalData|additionalDataOptions|**TODO: Add Description**|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "reviewset_addtoreviewset"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/caseExportOperation/reviewSet/addToReviewSet

Content-Type: application/json
Content-length: 554

{
  "sourceCollection": {
    "@odata.type": "#microsoft.graph.ediscovery.sourceCollection",
    "id": "String (identifier)",
    "contentQuery": "String",
    "createdBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "createdDateTime": "String (timestamp)",
    "dataSourceScopes": "String",
    "description": "String",
    "displayName": "String",
    "lastModifiedBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "lastModifiedDateTime": "String (timestamp)"
  },
  "additionalData": "String"
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
HTTP/1.1 204 No Content
```

