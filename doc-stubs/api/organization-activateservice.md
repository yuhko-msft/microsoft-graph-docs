---
title: "organization: activateService"
description: "Activate a given service for a tenant"
author: "dkershaw10"
localization_priority: Normal
ms.prod: "organisation"
doc_type: apiPageType
---

# organization: activateService
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Activate a given service for a tenant

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|Directory.ReadWrite.All, Directory.ReadWriteAdvanced.All|
|Delegated (personal Microsoft account)|Not Supported|
|Application|Directory.ReadWrite.All, Directory.ReadWriteAdvanced.All|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /activateService
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|service|String|Name of the service to activate
|
|servicePlanId|Guid|PlanId of the ServicePlan to activate
|
|skuId|Guid|SkuId of SKU the service plan is on|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "organization_activateservice"
}
-->
``` http
POST https://graph.microsoft.com/beta/organization/activateService

Content-Type: application/json
Content-length: 75

{
  "service": "serviceName",
  "servicePlanId": "a23b959c-7ce8-4e57-9140-b90eb88a9e97",
  "skuId": "6fd2c87f-b296-42f0-b197-1e91e994b900"
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
HTTP/1.1 204 No Content
```

