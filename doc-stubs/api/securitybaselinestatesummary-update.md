---
title: "Update securityBaselineStateSummary"
description: "Update the properties of a securityBaselineStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update securityBaselineStateSummary
Namespace: microsoft.graph



Update the properties of a [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object.

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
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object.

The following table shows the properties that are required when you update the [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|conflictCount|Int32|Number of conflict devices|
|errorCount|Int32|Number of error devices|
|notApplicableCount|Int32|Number of not applicable devices|
|notSecureCount|Int32|Number of not secure devices|
|secureCount|Int32|Number of secure devices|
|unknownCount|Int32|Number of unknown devices|



## Response

If successful, this method returns a `200 OK` response code and an updated [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_securitybaselinestatesummary"
}
-->
``` http

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
  "@odata.type": "#microsoft.graph.securityBaselineStateSummary",
  "id": "d3dd5fd3-5fd3-d3dd-d35f-ddd3d35fddd3",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "notApplicableCount": "Integer",
  "notSecureCount": "Integer",
  "secureCount": "Integer",
  "unknownCount": "Integer"
}
```

