---
title: "Create securityBaselineCategoryStateSummary"
description: "Create a new securityBaselineCategoryStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create securityBaselineCategoryStateSummary
Namespace: microsoft.graph

Create a new [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object.

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

If successful, this method returns a `201 Created` response code and a [securityBaselineCategoryStateSummary](../resources/intune-securitybaselinecategorystatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_securitybaselinecategorystatesummary_from_"
}
-->
``` http

```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.securityBaselineCategoryStateSummary"
}
-->
``` http
HTTP/1.1 201 Created

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

