---
title: "Create programControl"
description: "Create a new programControl object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create programControl
Namespace: microsoft.graph



Create a new [programControl](../resources/programcontrol.md) object.

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
POST /programControls
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [programControl](../resources/programcontrol.md) object.

The following table shows the properties that are required when you create the [programControl](../resources/programcontrol.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|controlId|String|**TODO: Add Description**|
|controlTypeId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|owner|[userIdentity](../resources/useridentity.md)|**TODO: Add Description**|
|programId|String|**TODO: Add Description**|
|resource|[programResource](../resources/programresource.md)|**TODO: Add Description**|
|status|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [programControl](../resources/programcontrol.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_programcontrol_from_programcontrols"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/programControls
Content-Type: application/json
Content-length: 337

{
  "@odata.type": "#microsoft.graph.programControl",
  "controlId": "String",
  "controlTypeId": "String",
  "displayName": "String",
  "owner": {
    "@odata.type": "microsoft.graph.userIdentity"
  },
  "programId": "String",
  "resource": {
    "@odata.type": "microsoft.graph.programResource"
  },
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.programControl"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.programControl",
  "id": "08ca1c4e-1c4e-08ca-4e1c-ca084e1cca08",
  "controlId": "String",
  "controlTypeId": "String",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "owner": {
    "@odata.type": "microsoft.graph.userIdentity"
  },
  "programId": "String",
  "resource": {
    "@odata.type": "microsoft.graph.programResource"
  },
  "status": "String"
}
```

