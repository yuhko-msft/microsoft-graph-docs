---
title: "Create windowsManagementAppHealthSummary"
description: "Create a new windowsManagementAppHealthSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsManagementAppHealthSummary
Namespace: microsoft.graph



Create a new [windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md) object.

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
POST ** Collection URI for microsoft.graph.windowsManagementAppHealthSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md) object.

The following table shows the properties that are required when you create the [windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|healthyDeviceCount|Int32|Healthy device count.|
|unhealthyDeviceCount|Int32|Unhealthy device count.|
|unknownDeviceCount|Int32|Unknown device count.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsmanagementapphealthsummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsManagementAppHealthSummary not found
Content-Type: application/json
Content-length: 185

{
  "@odata.type": "#microsoft.graph.windowsManagementAppHealthSummary",
  "healthyDeviceCount": "Integer",
  "unhealthyDeviceCount": "Integer",
  "unknownDeviceCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsManagementAppHealthSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsManagementAppHealthSummary",
  "id": "a0dfb4dc-b4dc-a0df-dcb4-dfa0dcb4dfa0",
  "healthyDeviceCount": "Integer",
  "unhealthyDeviceCount": "Integer",
  "unknownDeviceCount": "Integer"
}
```

