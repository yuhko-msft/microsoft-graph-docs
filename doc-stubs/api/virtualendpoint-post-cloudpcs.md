---
title: "Create cloudPC"
description: "Create a new cloudPC object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
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

You can specify the following properties when creating a **cloudPC**.

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Optional.|
|imageDisplayName|String|**TODO: Add Description** Optional.|
|aadDeviceId|String|**TODO: Add Description** Optional.|
|managedDeviceId|String|**TODO: Add Description** Optional.|
|managedDeviceName|String|**TODO: Add Description** Optional.|
|provisioningPolicyId|String|**TODO: Add Description** Optional.|
|provisioningPolicyName|String|**TODO: Add Description** Optional.|
|onPremisesConnectionName|String|**TODO: Add Description** Optional.|
|servicePlanId|String|**TODO: Add Description** Optional.|
|servicePlanType|cloudPcServicePlanType|**TODO: Add Description**. The possible values are: `enterprise`, `business`, `unknownFutureValue`. Optional.|
|servicePlanName|String|**TODO: Add Description** Optional.|
|status|cloudPcStatus|**TODO: Add Description**. The possible values are: `notProvisioned`, `provisioning`, `provisioned`, `inGracePeriod`, `deprovisioning`, `failed`, `provisionedWithWarnings`, `resizing`, `pendingProvision`, `unknownFutureValue`. Required.|
|statusDetails|[cloudPcStatusDetails](../resources/cloudpcstatusdetails.md)|**TODO: Add Description** Optional.|
|userPrincipalName|String|**TODO: Add Description** Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|gracePeriodEndDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastRemoteActionResult|[cloudPcRemoteActionResult](../resources/cloudpcremoteactionresult.md)|**TODO: Add Description** Optional.|
|lastLoginResult|[cloudPcLoginResult](../resources/cloudpcloginresult.md)|**TODO: Add Description** Optional.|
|userAccountType|cloudPcUserAccountType|**TODO: Add Description**. The possible values are: `standardUser`, `administrator`, `unknownFutureValue`. Optional.|
|osVersion|cloudPcOperatingSystem|**TODO: Add Description**. The possible values are: `windows10`, `windows11`, `unknownFutureValue`. Optional.|



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
Content-length: 856

{
  "@odata.type": "#microsoft.graph.cloudPC",
  "displayName": "String",
  "imageDisplayName": "String",
  "aadDeviceId": "String",
  "managedDeviceId": "String",
  "managedDeviceName": "String",
  "provisioningPolicyId": "String",
  "provisioningPolicyName": "String",
  "onPremisesConnectionName": "String",
  "servicePlanId": "String",
  "servicePlanType": "String",
  "servicePlanName": "String",
  "status": "String",
  "statusDetails": {
    "@odata.type": "microsoft.graph.cloudPcStatusDetails"
  },
  "userPrincipalName": "String",
  "gracePeriodEndDateTime": "String (timestamp)",
  "lastRemoteActionResult": {
    "@odata.type": "microsoft.graph.cloudPcRemoteActionResult"
  },
  "lastLoginResult": {
    "@odata.type": "microsoft.graph.cloudPcLoginResult"
  },
  "userAccountType": "String",
  "osVersion": "String"
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
  "id": "77470fcf-0fcf-7747-cf0f-4777cf0f4777",
  "displayName": "String",
  "imageDisplayName": "String",
  "aadDeviceId": "String",
  "managedDeviceId": "String",
  "managedDeviceName": "String",
  "provisioningPolicyId": "String",
  "provisioningPolicyName": "String",
  "onPremisesConnectionName": "String",
  "servicePlanId": "String",
  "servicePlanType": "String",
  "servicePlanName": "String",
  "status": "String",
  "statusDetails": {
    "@odata.type": "microsoft.graph.cloudPcStatusDetails"
  },
  "userPrincipalName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "gracePeriodEndDateTime": "String (timestamp)",
  "lastRemoteActionResult": {
    "@odata.type": "microsoft.graph.cloudPcRemoteActionResult"
  },
  "lastLoginResult": {
    "@odata.type": "microsoft.graph.cloudPcLoginResult"
  },
  "userAccountType": "String",
  "osVersion": "String"
}
```

