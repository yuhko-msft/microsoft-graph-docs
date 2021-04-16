---
title: "Create command"
description: "Create a new command object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create command
Namespace: microsoft.graph



Create a new [command](../resources/command.md) object.

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
POST /commands
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [command](../resources/command.md) object.

The following table shows the properties that are required when you create the [command](../resources/command.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appServiceName|String|**TODO: Add Description**|
|error|String|**TODO: Add Description**|
|packageFamilyName|String|**TODO: Add Description**|
|payload|[payloadRequest](../resources/payloadrequest.md)|**TODO: Add Description**|
|permissionTicket|String|**TODO: Add Description**|
|postBackUri|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [command](../resources/command.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_command_from_commands"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/commands
Content-Type: application/json
Content-length: 316

{
  "@odata.type": "#microsoft.graph.command",
  "appServiceName": "String",
  "error": "String",
  "packageFamilyName": "String",
  "payload": {
    "@odata.type": "microsoft.graph.payloadRequest"
  },
  "permissionTicket": "String",
  "postBackUri": "String",
  "status": "String",
  "type": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.command"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.command",
  "id": "770e5f3e-5f3e-770e-3e5f-0e773e5f0e77",
  "appServiceName": "String",
  "error": "String",
  "packageFamilyName": "String",
  "payload": {
    "@odata.type": "microsoft.graph.payloadRequest"
  },
  "permissionTicket": "String",
  "postBackUri": "String",
  "status": "String",
  "type": "String"
}
```

