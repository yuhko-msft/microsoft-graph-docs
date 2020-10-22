---
title: "Get groupPolicyPresentationValueList"
description: "Read the properties and relationships of a groupPolicyPresentationValueList object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get groupPolicyPresentationValueList
Namespace: microsoft.graph

Read the properties and relationships of a [groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md) object.

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
GET ** Entity URI for microsoft.graph.groupPolicyPresentationValueList not found
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

If successful, this method returns a `200 OK` response code and a [groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_grouppolicypresentationvaluelist"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.groupPolicyPresentationValueList not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyPresentationValueList"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.groupPolicyPresentationValueList",
    "id": "77a4f4cd-f4cd-77a4-cdf4-a477cdf4a477",
    "lastModifiedDateTime": "String (timestamp)",
    "createdDateTime": "String (timestamp)",
    "values": [
      {
        "@odata.type": "microsoft.graph.keyValuePair"
      }
    ]
  }
}
```

