---
title: "Update microsoftTunnelHealthThreshold"
description: "Update the properties of a microsoftTunnelHealthThreshold object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update microsoftTunnelHealthThreshold
Namespace: microsoft.graph



Update the properties of a [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) object.

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
PATCH /deviceManagement/microsoftTunnelHealthThresholds/{microsoftTunnelHealthThresholdId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) object.

The following table shows the properties that are required when you update the [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|defaultHealthyThreshold|Int64|The default threshold for being healthy|
|defaultUnhealthyThreshold|Int64|The default threshold for being unhealthy|
|healthyThreshold|Int64|The threshold for being healthy|
|unhealthyThreshold|Int64|The threshold for being unhealthy|



## Response

If successful, this method returns a `200 OK` response code and an updated [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_microsofttunnelhealththreshold"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/microsoftTunnelHealthThresholds/{microsoftTunnelHealthThresholdId}
Content-Type: application/json
Content-length: 226

{
  "@odata.type": "#microsoft.graph.microsoftTunnelHealthThreshold",
  "defaultHealthyThreshold": "Integer",
  "defaultUnhealthyThreshold": "Integer",
  "healthyThreshold": "Integer",
  "unhealthyThreshold": "Integer"
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
  "@odata.type": "#microsoft.graph.microsoftTunnelHealthThreshold",
  "id": "8202cd96-cd96-8202-96cd-028296cd0282",
  "defaultHealthyThreshold": "Integer",
  "defaultUnhealthyThreshold": "Integer",
  "healthyThreshold": "Integer",
  "unhealthyThreshold": "Integer"
}
```

