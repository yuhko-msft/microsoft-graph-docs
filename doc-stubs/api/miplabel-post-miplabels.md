---
title: "Create mipLabel"
description: "Create a new mipLabel object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mipLabel
Namespace: microsoft.graph

Create a new [mipLabel](../resources/miplabel.md) object.

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
POST /mipLabels
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mipLabel](../resources/miplabel.md) object.

The following table shows the properties that are required when you create the [mipLabel](../resources/miplabel.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|labelId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|protectGroupAction|[mipProtectGroupLabelAction](../resources/mipprotectgrouplabelaction.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [mipLabel](../resources/miplabel.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_miplabel_from_miplabels"
}
-->
``` http
POST https://graph.microsoft.com/beta/mipLabels
Content-Type: application/json
Content-length: 256

{
  "@odata.type": "#Microsoft.DirectoryServices.mipLabel",
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
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.mipLabel"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.DirectoryServices.mipLabel",
  "id": "c9e5b45b-b45b-c9e5-5bb4-e5c95bb4e5c9",
  "deletedDateTime": "String (timestamp)",
  "labelId": "String",
  "displayName": "String",
  "protectGroupAction": {
    "@odata.type": "microsoft.graph.mipProtectGroupLabelAction"
  }
}
```

