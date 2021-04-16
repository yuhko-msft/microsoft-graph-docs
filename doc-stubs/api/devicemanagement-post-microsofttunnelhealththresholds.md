---
title: "Create microsoftTunnelHealthThreshold"
description: "Create a new microsoftTunnelHealthThreshold object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create microsoftTunnelHealthThreshold
Namespace: microsoft.graph



Create a new microsoftTunnelHealthThreshold object.

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
POST /deviceManagement/microsoftTunnelHealthThresholds
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) object.

The following table shows the properties that are required when you create the [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|defaultHealthyThreshold|Int64|The default threshold for being healthy|
|defaultUnhealthyThreshold|Int64|The default threshold for being unhealthy|
|healthyThreshold|Int64|The threshold for being healthy|
|unhealthyThreshold|Int64|The threshold for being unhealthy|



## Response

If successful, this method returns a `201 Created` response code and a [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_microsofttunnelhealththreshold_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/microsoftTunnelHealthThresholds
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
  "truncated": true,
  "@odata.type": "microsoft.graph.microsoftTunnelHealthThreshold"
}
-->
``` http
HTTP/1.1 201 Created
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

