---
title: "Create workbookFormatProtection"
description: "Create a new workbookFormatProtection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create workbookFormatProtection
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new workbookFormatProtection object.

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
POST /workbookRange/format/protection
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workbookFormatProtection](../resources/workbookformatprotection.md) object.

The following table shows the properties that are required when you create the [workbookFormatProtection](../resources/workbookformatprotection.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|formulaHidden|Boolean|**TODO: Add Description**|
|locked|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [workbookFormatProtection](../resources/workbookformatprotection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_workbookformatprotection_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/workbookRange/format/protection
Content-Type: application/json
Content-length: 121

{
  "@odata.type": "#microsoft.graph.workbookFormatProtection",
  "formulaHidden": "Boolean",
  "locked": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.workbookFormatProtection"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.workbookFormatProtection",
  "id": "471fcdad-cdad-471f-adcd-1f47adcd1f47",
  "formulaHidden": "Boolean",
  "locked": "Boolean"
}
```

