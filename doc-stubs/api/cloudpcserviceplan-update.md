---
title: "Update cloudPcServicePlan"
description: "Update the properties of a cloudPcServicePlan object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update cloudPcServicePlan
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [cloudPcServicePlan](../resources/cloudpcserviceplan.md) object.

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
PATCH /deviceManagement/virtualEndpoint/servicePlans/{cloudPcServicePlanId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|category|cloudPcServicePlanCategory|**TODO: Add Description**. The possible values are: `test`, `internal`, `commercial`, `unknownFutureValue`. Optional.|
|displayName|String|**TODO: Add Description** Required.|
|ramInGB|Int32|**TODO: Add Description** Required.|
|storageInGB|Int32|**TODO: Add Description** Required.|
|type|cloudPcServicePlanType|**TODO: Add Description**. The possible values are: `enterprise`, `business`, `unknownFutureValue`. Optional.|
|userProfileInGB|Int32|**TODO: Add Description** Required.|
|vCpuCount|Int32|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [cloudPcServicePlan](../resources/cloudpcserviceplan.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_cloudpcserviceplan"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/servicePlans/{cloudPcServicePlanId}
Content-Type: application/json
Content-length: 248

{
  "@odata.type": "#microsoft.graph.cloudPcServicePlan",
  "category": "String",
  "displayName": "String",
  "ramInGB": "Integer",
  "storageInGB": "Integer",
  "type": "String",
  "userProfileInGB": "Integer",
  "vCpuCount": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.cloudPcServicePlan",
  "id": "bba97fcb-7fcb-bba9-cb7f-a9bbcb7fa9bb",
  "category": "String",
  "displayName": "String",
  "ramInGB": "Integer",
  "storageInGB": "Integer",
  "type": "String",
  "userProfileInGB": "Integer",
  "vCpuCount": "Integer"
}
```

