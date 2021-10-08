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

Create a new cloudPcServicePlan object.

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

The following table shows the properties that are required when you create the [cloudPcServicePlan](../resources/cloudpcserviceplan.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|type|cloudPcServicePlanType|**TODO: Add Description**. The possible values are: `enterprise`, `business`, `unknownFutureValue`.|
|vCpuCount|Int32|**TODO: Add Description**|
|ramInGB|Int32|**TODO: Add Description**|
|storageInGB|Int32|**TODO: Add Description**|
|userProfileInGB|Int32|**TODO: Add Description**|



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
Content-length: 223

{
  "@odata.type": "#microsoft.graph.cloudPcServicePlan",
  "displayName": "String",
  "type": "String",
  "vCpuCount": "Integer",
  "ramInGB": "Integer",
  "storageInGB": "Integer",
  "userProfileInGB": "Integer"
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
  "id": "dea1edd3-edd3-dea1-d3ed-a1ded3eda1de",
  "displayName": "String",
  "type": "String",
  "vCpuCount": "Integer",
  "ramInGB": "Integer",
  "storageInGB": "Integer",
  "userProfileInGB": "Integer"
}
```

