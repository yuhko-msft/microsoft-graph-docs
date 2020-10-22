---
title: "Update windowsManagementAppHealthSummary"
description: "Update the properties of a windowsManagementAppHealthSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsManagementAppHealthSummary
Namespace: microsoft.graph

Update the properties of a [windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md) object.

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
PATCH /windowsManagementAppHealthSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md) object.

The following table shows the properties that are required when you create the [windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|healthyDeviceCount|Int32|**TODO: Add Description**|
|unhealthyDeviceCount|Int32|**TODO: Add Description**|
|unknownDeviceCount|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsmanagementapphealthsummary"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/windowsManagementAppHealthSummary
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.windowsManagementAppHealthSummary",
  "healthyDeviceCount": "Integer",
  "unhealthyDeviceCount": "Integer",
  "unknownDeviceCount": "Integer"
}
```

