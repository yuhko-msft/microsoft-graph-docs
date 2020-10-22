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

Update the properties of a [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object.

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
PATCH /securityBaselineCategoryStateSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object.

The following table shows the properties that are required when you create the [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|secureCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|notSecureCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|unknownCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|errorCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|conflictCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|notApplicableCount|Int32|**TODO: Add Description** Inherited from [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md)|
|displayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_securitybaselinecategorystatesummary"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/securityBaselineCategoryStateSummary
Content-Type: application/json
Content-length: 292

{
  "@odata.type": "#microsoft.graph.securityBaselineCategoryStateSummary",
  "secureCount": "Integer",
  "notSecureCount": "Integer",
  "unknownCount": "Integer",
  "errorCount": "Integer",
  "conflictCount": "Integer",
  "notApplicableCount": "Integer",
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
  "secureCount": "Integer",
  "notSecureCount": "Integer",
  "unknownCount": "Integer",
  "errorCount": "Integer",
  "conflictCount": "Integer",
  "notApplicableCount": "Integer",
  "displayName": "String"
}
```

