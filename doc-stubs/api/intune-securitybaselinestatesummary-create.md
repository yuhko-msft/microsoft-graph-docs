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

Create a new [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) object.

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
POST ** Collection URI for microsoft.graph.securityBaselineStateSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) object.

The following table shows the properties that are required when you create the [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|secureCount|Int32|**TODO: Add Description**|
|notSecureCount|Int32|**TODO: Add Description**|
|unknownCount|Int32|**TODO: Add Description**|
|errorCount|Int32|**TODO: Add Description**|
|conflictCount|Int32|**TODO: Add Description**|
|notApplicableCount|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [securityBaselineStateSummary](../resources/intune-securitybaselinestatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_securitybaselinestatesummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.securityBaselineStateSummary not found
Content-Type: application/json
Content-length: 256

{
  "@odata.type": "#microsoft.graph.securityBaselineStateSummary",
  "secureCount": "Integer",
  "notSecureCount": "Integer",
  "unknownCount": "Integer",
  "errorCount": "Integer",
  "conflictCount": "Integer",
  "notApplicableCount": "Integer"
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
  "secureCount": "Integer",
  "notSecureCount": "Integer",
  "unknownCount": "Integer",
  "errorCount": "Integer",
  "conflictCount": "Integer",
  "notApplicableCount": "Integer"
}
```

