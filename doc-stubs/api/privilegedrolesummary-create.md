---
title: "Create privilegedRoleSummary"
description: "Create a new privilegedRoleSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create privilegedRoleSummary
Namespace: microsoft.graph



Create a new [privilegedRoleSummary](../resources/privilegedrolesummary.md) object.

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
POST ** Collection URI for microsoft.graph.privilegedRoleSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [privilegedRoleSummary](../resources/privilegedrolesummary.md) object.

The following table shows the properties that are required when you create the [privilegedRoleSummary](../resources/privilegedrolesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|elevatedCount|Int32|**TODO: Add Description**|
|managedCount|Int32|**TODO: Add Description**|
|mfaEnabled|Boolean|**TODO: Add Description**|
|status|roleSummaryStatus|**TODO: Add Description**. Possible values are: `ok`, `bad`.|
|usersCount|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [privilegedRoleSummary](../resources/privilegedrolesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_privilegedrolesummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.privilegedRoleSummary not found
Content-Type: application/json
Content-length: 203

{
  "@odata.type": "#microsoft.graph.privilegedRoleSummary",
  "elevatedCount": "Integer",
  "managedCount": "Integer",
  "mfaEnabled": "Boolean",
  "status": "String",
  "usersCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.privilegedRoleSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.privilegedRoleSummary",
  "id": "0b4906e9-06e9-0b49-e906-490be906490b",
  "elevatedCount": "Integer",
  "managedCount": "Integer",
  "mfaEnabled": "Boolean",
  "status": "String",
  "usersCount": "Integer"
}
```

