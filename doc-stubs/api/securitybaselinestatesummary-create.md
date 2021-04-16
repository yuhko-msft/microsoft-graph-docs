---
title: "Create securityBaselineStateSummary"
description: "Create a new securityBaselineStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create securityBaselineStateSummary
Namespace: microsoft.graph



Create a new [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object.

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
POST ** Collection URI for microsoft.graph.securityBaselineStateSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object.

The following table shows the properties that are required when you create the [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md).

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

If successful, this method returns a `201 Created` response code and a [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_securitybaselinestatesummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.securityBaselineStateSummary not found
Content-Type: application/json
Content-length: 256

{
  "@odata.type": "#microsoft.graph.securityBaselineStateSummary",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "notApplicableCount": "Integer",
  "notSecureCount": "Integer",
  "secureCount": "Integer",
  "unknownCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.securityBaselineStateSummary"
}
-->
``` http
HTTP/1.1 201 Created
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

