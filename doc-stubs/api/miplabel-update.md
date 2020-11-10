---
title: "Update mipLabel"
description: "Update the properties of a mipLabel object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mipLabel
Namespace: microsoft.graph

Update the properties of a [mipLabel](../resources/miplabel.md) object.

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
PATCH /mipLabels/{mipLabelsId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mipLabel](../resources/miplabel.md) object.

The following table shows the properties that are required when you update the [mipLabel](../resources/miplabel.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|labelId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|protectGroupAction|[mipProtectGroupLabelAction](../resources/mipprotectgrouplabelaction.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [mipLabel](../resources/miplabel.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_miplabel"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/mipLabels/{mipLabelsId}
Content-Type: application/json
Content-length: 244

{
  "@odata.type": "#microsoft.graph.mipLabel",
  "deletedDateTime": "String (timestamp)",
  "labelId": "String",
  "displayName": "String",
  "protectGroupAction": {
    "@odata.type": "microsoft.graph.mipProtectGroupLabelAction"
  }
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
  "@odata.type": "#microsoft.graph.mipLabel",
  "id": "db666840-6840-db66-4068-66db406866db",
  "deletedDateTime": "String (timestamp)",
  "labelId": "String",
  "displayName": "String",
  "protectGroupAction": {
    "@odata.type": "microsoft.graph.mipProtectGroupLabelAction"
  }
}
```

