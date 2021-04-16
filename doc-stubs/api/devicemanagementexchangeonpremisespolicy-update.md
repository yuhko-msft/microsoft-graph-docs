---
title: "Update deviceManagementExchangeOnPremisesPolicy"
description: "Update the properties of a deviceManagementExchangeOnPremisesPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementExchangeOnPremisesPolicy
Namespace: microsoft.graph



Update the properties of a [deviceManagementExchangeOnPremisesPolicy](../resources/devicemanagementexchangeonpremisespolicy.md) object.

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
PATCH /deviceManagement/exchangeOnPremisesPolicy
PATCH /deviceManagement/exchangeOnPremisesPolicies/{deviceManagementExchangeOnPremisesPolicyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementExchangeOnPremisesPolicy](../resources/devicemanagementexchangeonpremisespolicy.md) object.

The following table shows the properties that are required when you update the [deviceManagementExchangeOnPremisesPolicy](../resources/devicemanagementexchangeonpremisespolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accessRules|[deviceManagementExchangeAccessRule](../resources/devicemanagementexchangeaccessrule.md) collection|The list of device access rules in Exchange. The access rules apply globally to the entire Exchange organization|
|defaultAccessLevel|deviceManagementExchangeAccessLevel|Default access state in Exchange. This rule applies globally to the entire Exchange organization. Possible values are: `none`, `allow`, `block`, `quarantine`.|
|knownDeviceClasses|[deviceManagementExchangeDeviceClass](../resources/devicemanagementexchangedeviceclass.md) collection|The list of device classes known to Exchange|
|notificationContent|Binary|Notification text that will be sent to users quarantined by this policy. This is UTF8 encoded byte array HTML.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementExchangeOnPremisesPolicy](../resources/devicemanagementexchangeonpremisespolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementexchangeonpremisespolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/exchangeOnPremisesPolicy
Content-Type: application/json
Content-length: 391

{
  "@odata.type": "#microsoft.graph.deviceManagementExchangeOnPremisesPolicy",
  "accessRules": [
    {
      "@odata.type": "microsoft.graph.deviceManagementExchangeAccessRule"
    }
  ],
  "defaultAccessLevel": "String",
  "knownDeviceClasses": [
    {
      "@odata.type": "microsoft.graph.deviceManagementExchangeDeviceClass"
    }
  ],
  "notificationContent": "Binary"
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
  "@odata.type": "#microsoft.graph.deviceManagementExchangeOnPremisesPolicy",
  "id": "ab08561c-561c-ab08-1c56-08ab1c5608ab",
  "accessRules": [
    {
      "@odata.type": "microsoft.graph.deviceManagementExchangeAccessRule"
    }
  ],
  "defaultAccessLevel": "String",
  "knownDeviceClasses": [
    {
      "@odata.type": "microsoft.graph.deviceManagementExchangeDeviceClass"
    }
  ],
  "notificationContent": "Binary"
}
```

