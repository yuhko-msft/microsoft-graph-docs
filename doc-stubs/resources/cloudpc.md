---
title: "cloudPC resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPC resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPCs](../api/cloudpc-list.md)|[cloudPC](../resources/cloudpc.md) collection|Get a list of the [cloudPC](../resources/cloudpc.md) objects and their properties.|
|[Create cloudPC](../api/virtualendpoint-post-cloudpcs.md)|[cloudPC](../resources/cloudpc.md)|Create a new [cloudPC](../resources/cloudpc.md) object.|
|[Get cloudPC](../api/cloudpc-get.md)|[cloudPC](../resources/cloudpc.md)|Read the properties and relationships of a [cloudPC](../resources/cloudpc.md) object.|
|[Update cloudPC](../api/cloudpc-update.md)|[cloudPC](../resources/cloudpc.md)|Update the properties of a [cloudPC](../resources/cloudpc.md) object.|
|[Delete cloudPC](../api/cloudpc-delete.md)|None|Deletes a [cloudPC](../resources/cloudpc.md) object.|
|[reprovision](../api/cloudpc-reprovision.md)|None|**TODO: Add Description**|
|[changeUserAccountType](../api/cloudpc-changeuseraccounttype.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|aadDeviceId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|gracePeriodEndDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|imageDisplayName|String|**TODO: Add Description**|
|lastLoginResult|[cloudPcLoginResult](../resources/cloudpcloginresult.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|lastRemoteActionResult|[cloudPcRemoteActionResult](../resources/cloudpcremoteactionresult.md)|**TODO: Add Description**|
|managedDeviceId|String|**TODO: Add Description**|
|managedDeviceName|String|**TODO: Add Description**|
|onPremisesConnectionName|String|**TODO: Add Description**|
|osVersion|cloudPcOperatingSystem|**TODO: Add Description**. The possible values are: `windows10`, `windows11`, `unknownFutureValue`.|
|provisioningPolicyId|String|**TODO: Add Description**|
|provisioningPolicyName|String|**TODO: Add Description**|
|servicePlanId|String|**TODO: Add Description**|
|servicePlanName|String|**TODO: Add Description**|
|servicePlanType|cloudPcServicePlanType|**TODO: Add Description**. The possible values are: `enterprise`, `business`, `unknownFutureValue`.|
|status|cloudPcStatus|**TODO: Add Description**. The possible values are: `notProvisioned`, `provisioning`, `provisioned`, `inGracePeriod`, `deprovisioning`, `failed`, `provisionedWithWarnings`, `resizing`, `pendingProvision`, `unknownFutureValue`.|
|statusDetails|[cloudPcStatusDetails](../resources/cloudpcstatusdetails.md)|**TODO: Add Description**|
|userAccountType|cloudPcUserAccountType|**TODO: Add Description**. The possible values are: `standardUser`, `administrator`, `unknownFutureValue`.|
|userPrincipalName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPC",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPC",
  "id": "String (identifier)",
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

