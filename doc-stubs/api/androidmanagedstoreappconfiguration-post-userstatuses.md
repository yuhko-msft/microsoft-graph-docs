---
title: "Create managedDeviceMobileAppConfigurationUserStatus"
description: "Create a new managedDeviceMobileAppConfigurationUserStatus object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create managedDeviceMobileAppConfigurationUserStatus
Namespace: microsoft.graph



Create a new managedDeviceMobileAppConfigurationUserStatus object.

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
POST /deviceAppManagement/mobileAppConfigurations/{managedDeviceMobileAppConfigurationId}/userStatuses
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md) object.

The following table shows the properties that are required when you create the [managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|devicesCount|Int32|Devices count for that user.|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report.|
|status|complianceStatus|Compliance status of the policy report. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userDisplayName|String|User name of the DevicePolicyStatus.|
|userPrincipalName|String|UserPrincipalName.|



## Response

If successful, this method returns a `201 Created` response code and a [managedDeviceMobileAppConfigurationUserStatus](../resources/manageddevicemobileappconfigurationuserstatus.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_manageddevicemobileappconfigurationuserstatus_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/mobileAppConfigurations/{managedDeviceMobileAppConfigurationId}/userStatuses
Content-Type: application/json
Content-length: 255

{
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationUserStatus",
  "devicesCount": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "status": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationUserStatus"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationUserStatus",
  "id": "2fec8e02-8e02-2fec-028e-ec2f028eec2f",
  "devicesCount": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "status": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```

