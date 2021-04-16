---
title: "List presentations"
description: "Get the groupPolicyPresentation resources from the presentations navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List presentations
Namespace: microsoft.graph



Get the groupPolicyPresentation resources from the presentations navigation property.

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
GET /deviceManagement/groupPolicyCategories/{groupPolicyCategoryId}/definitionFile/definitions/{groupPolicyDefinitionId}/presentations
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [groupPolicyPresentation](../resources/grouppolicypresentation.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_grouppolicypresentation"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyCategories/{groupPolicyCategoryId}/definitionFile/definitions/{groupPolicyDefinitionId}/presentations
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.groupPolicyPresentation)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.groupPolicyPresentation",
      "id": "da32bd7b-bd7b-da32-7bbd-32da7bbd32da",
      "label": "String",
      "lastModifiedDateTime": "String (timestamp)"
    }
  ]
}
```

