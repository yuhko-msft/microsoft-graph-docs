---
title: "Update informationProtectionLabel"
description: "Update the properties of an informationProtectionLabel object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update informationProtectionLabel
Namespace: microsoft.graph



Update the properties of an [informationProtectionLabel](../resources/informationprotectionlabel.md) object.

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
PATCH /me/informationProtection/policy/labels/{informationProtectionLabelId}
PATCH /users/{usersId}/informationProtection/policy/labels/{informationProtectionLabelId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [informationProtectionLabel](../resources/informationprotectionlabel.md) object.

The following table shows the properties that are required when you update the [informationProtectionLabel](../resources/informationprotectionlabel.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|color|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|isActive|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|parent|[parentLabelDetails](../resources/parentlabeldetails.md)|**TODO: Add Description**|
|sensitivity|Int32|**TODO: Add Description**|
|tooltip|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [informationProtectionLabel](../resources/informationprotectionlabel.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_informationprotectionlabel"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/informationProtection/policy/labels/{informationProtectionLabelId}
Content-Type: application/json
Content-length: 296

{
  "@odata.type": "#microsoft.graph.informationProtectionLabel",
  "color": "String",
  "description": "String",
  "isActive": "Boolean",
  "name": "String",
  "parent": {
    "@odata.type": "microsoft.graph.parentLabelDetails"
  },
  "sensitivity": "Integer",
  "tooltip": "String"
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
  "@odata.type": "#microsoft.graph.informationProtectionLabel",
  "id": "0e1668ce-68ce-0e16-ce68-160ece68160e",
  "color": "String",
  "description": "String",
  "isActive": "Boolean",
  "name": "String",
  "parent": {
    "@odata.type": "microsoft.graph.parentLabelDetails"
  },
  "sensitivity": "Integer",
  "tooltip": "String"
}
```

