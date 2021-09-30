---
title: "Create microsoftTunnelHealthThreshold"
description: "Create a new microsoftTunnelHealthThreshold object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create microsoftTunnelHealthThreshold
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

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
In the request body, supply a JSON representation of the [microsoftTunnelHealthThreshold](../resources/intune-microsofttunnelhealththreshold.md) object.

The following table shows the properties that are required when you create the [microsoftTunnelHealthThreshold](../resources/intune-microsofttunnelhealththreshold.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The metric name|
|healthyThreshold|Int64|The threshold for being healthy|
|unhealthyThreshold|Int64|The threshold for being unhealthy|
|defaultHealthyThreshold|Int64|The default threshold for being healthy|
|defaultUnhealthyThreshold|Int64|The default threshold for being unhealthy|



## Response

If successful, this method returns a `201 Created` response code and a [microsoftTunnelHealthThreshold](../resources/intune-microsofttunnelhealththreshold.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_microsofttunnelhealththreshold_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/microsoftTunnelHealthThresholds
Content-Type: application/json
Content-length: 244

{
  "@odata.type": "#microsoft.management.services.api.microsoftTunnelHealthThreshold",
  "healthyThreshold": "Integer",
  "unhealthyThreshold": "Integer",
  "defaultHealthyThreshold": "Integer",
  "defaultUnhealthyThreshold": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.microsoftTunnelHealthThreshold"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.management.services.api.microsoftTunnelHealthThreshold",
  "id": "6691d375-d375-6691-75d3-916675d39166",
  "healthyThreshold": "Integer",
  "unhealthyThreshold": "Integer",
  "defaultHealthyThreshold": "Integer",
  "defaultUnhealthyThreshold": "Integer"
}
```

