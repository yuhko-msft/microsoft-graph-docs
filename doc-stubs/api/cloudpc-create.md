---
title: "Create cloudPC"
description: "Create a new cloudPC object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create cloudPC
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [cloudPC](../resources/cloudpc.md) object.

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
POST /deviceManagement/virtualEndpoint/cloudPCs
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [cloudPC](../resources/cloudpc.md) object.

The following table shows the properties that are required when you create the [cloudPC](../resources/cloudpc.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|gracePeriodEndDateTime|DateTimeOffset|**TODO: Add Description**|
|imageDisplayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|managedDeviceId|String|**TODO: Add Description**|
|managedDeviceName|String|**TODO: Add Description**|
|onPremisesConnectionName|String|**TODO: Add Description**|
|provisioningPolicyId|String|**TODO: Add Description**|
|provisioningPolicyName|String|**TODO: Add Description**|
|servicePlanId|String|**TODO: Add Description**|
|servicePlanName|String|**TODO: Add Description**|
|status|cloudPcStatus|**TODO: Add Description**. Possible values are: `notProvisioned`, `provisioning`, `provisioned`, `inGracePeriod`, `deprovisioning`, `failed`, `provisionedWithWarnings`, `resizing`, `unknownFutureValue`.|
|statusDetails|[cloudPcStatusDetails](../resources/cloudpcstatusdetails.md)|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [cloudPC](../resources/cloudpc.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_cloudpc_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/cloudPCs
Content-Type: application/json
Content-length: 550

{
  "@odata.type": "#microsoft.graph.cloudPC",
  "displayName": "String",
  "gracePeriodEndDateTime": "String (timestamp)",
  "imageDisplayName": "String",
  "managedDeviceId": "String",
  "managedDeviceName": "String",
  "onPremisesConnectionName": "String",
  "provisioningPolicyId": "String",
  "provisioningPolicyName": "String",
  "servicePlanId": "String",
  "servicePlanName": "String",
  "status": "String",
  "statusDetails": {
    "@odata.type": "microsoft.graph.cloudPcStatusDetails"
  },
  "userPrincipalName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.cloudPC"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.cloudPC",
  "id": "d6f4fb94-fb94-d6f4-94fb-f4d694fbf4d6",
  "displayName": "String",
  "gracePeriodEndDateTime": "String (timestamp)",
  "imageDisplayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "managedDeviceName": "String",
  "onPremisesConnectionName": "String",
  "provisioningPolicyId": "String",
  "provisioningPolicyName": "String",
  "servicePlanId": "String",
  "servicePlanName": "String",
  "status": "String",
  "statusDetails": {
    "@odata.type": "microsoft.graph.cloudPcStatusDetails"
  },
  "userPrincipalName": "String"
}
```

