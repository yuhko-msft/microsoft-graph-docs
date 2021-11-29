---
title: "Create cloudPcServicePlan"
description: "Create a new cloudPcServicePlan object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create cloudPcServicePlan
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [cloudPcServicePlan](../resources/cloudpcserviceplan.md) object.

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
POST /deviceManagement/virtualEndpoint/servicePlans
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [cloudPcServicePlan](../resources/cloudpcserviceplan.md) object.

You can specify the following properties when creating a **cloudPcServicePlan**.

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Required.|
|type|cloudPcServicePlanType|**TODO: Add Description**. The possible values are: `enterprise`, `business`, `unknownFutureValue`. Optional.|
|vCpuCount|Int32|**TODO: Add Description** Required.|
|ramInGB|Int32|**TODO: Add Description** Required.|
|storageInGB|Int32|**TODO: Add Description** Required.|
|userProfileInGB|Int32|**TODO: Add Description** Required.|
|category|cloudPcServicePlanCategory|**TODO: Add Description**. The possible values are: `test`, `internal`, `commercial`, `unknownFutureValue`. Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [cloudPcServicePlan](../resources/cloudpcserviceplan.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_cloudpcserviceplan_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/servicePlans
Content-Type: application/json
Content-length: 248

{
  "@odata.type": "#microsoft.graph.cloudPcServicePlan",
  "displayName": "String",
  "type": "String",
  "vCpuCount": "Integer",
  "ramInGB": "Integer",
  "storageInGB": "Integer",
  "userProfileInGB": "Integer",
  "category": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.cloudPcServicePlan"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.cloudPcServicePlan",
  "id": "604ab1c9-b1c9-604a-c9b1-4a60c9b14a60",
  "displayName": "String",
  "type": "String",
  "vCpuCount": "Integer",
  "ramInGB": "Integer",
  "storageInGB": "Integer",
  "userProfileInGB": "Integer",
  "category": "String"
}
```

