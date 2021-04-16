---
title: "Update securityBaselineCategoryStateSummary"
description: "Update the properties of a securityBaselineCategoryStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update securityBaselineCategoryStateSummary
Namespace: microsoft.graph



Update the properties of a [securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) object.

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
PATCH /securityBaselineCategoryStateSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) object.

The following table shows the properties that are required when you update the [securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|conflictCount|Int32|Number of conflict devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|errorCount|Int32|Number of error devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|notApplicableCount|Int32|Number of not applicable devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|notSecureCount|Int32|Number of not secure devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|secureCount|Int32|Number of secure devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|unknownCount|Int32|Number of unknown devices Inherited from [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|
|displayName|String|The category name|



## Response

If successful, this method returns a `200 OK` response code and an updated [securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_securitybaselinecategorystatesummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/securityBaselineCategoryStateSummary
Content-Type: application/json
Content-length: 292

{
  "@odata.type": "#microsoft.graph.securityBaselineCategoryStateSummary",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "notApplicableCount": "Integer",
  "notSecureCount": "Integer",
  "secureCount": "Integer",
  "unknownCount": "Integer",
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
  "@odata.type": "#microsoft.graph.securityBaselineCategoryStateSummary",
  "id": "3644cbb8-cbb8-3644-b8cb-4436b8cb4436",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "notApplicableCount": "Integer",
  "notSecureCount": "Integer",
  "secureCount": "Integer",
  "unknownCount": "Integer",
  "displayName": "String"
}
```

