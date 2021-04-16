---
title: "Create windowsAutopilotDeviceIdentity"
description: "Create a new windowsAutopilotDeviceIdentity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsAutopilotDeviceIdentity
Namespace: microsoft.graph



Create a new [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) object.

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
POST /deviceManagement/windowsAutopilotDeviceIdentities
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) object.

The following table shows the properties that are required when you create the [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|addressableUserName|String|Addressable user name.|
|azureActiveDirectoryDeviceId|String|AAD Device ID - to be deprecated|
|azureAdDeviceId|String|AAD Device ID|
|deploymentProfileAssignedDateTime|DateTimeOffset|Profile set time of the Windows autopilot device.|
|deploymentProfileAssignmentDetailedStatus|windowsAutopilotProfileAssignmentDetailedStatus|Profile assignment detailed status of the Windows autopilot device. Possible values are: `none`, `hardwareRequirementsNotMet`, `surfaceHubProfileNotSupported`, `holoLensProfileNotSupported`, `windowsPcProfileNotSupported`.|
|deploymentProfileAssignmentStatus|windowsAutopilotProfileAssignmentStatus|Profile assignment status of the Windows autopilot device. Possible values are: `unknown`, `assignedInSync`, `assignedOutOfSync`, `assignedUnkownSyncState`, `notAssigned`, `pending`, `failed`.|
|displayName|String|Display Name|
|enrollmentState|enrollmentState|Intune enrollment state of the Windows autopilot device. Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|groupTag|String|Group Tag of the Windows autopilot device.|
|lastContactedDateTime|DateTimeOffset|Intune Last Contacted Date Time of the Windows autopilot device.|
|managedDeviceId|String|Managed Device ID|
|manufacturer|String|Oem manufacturer of the Windows autopilot device.|
|model|String|Model name of the Windows autopilot device.|
|productKey|String|Product Key of the Windows autopilot device.|
|purchaseOrderIdentifier|String|Purchase Order Identifier of the Windows autopilot device.|
|resourceName|String|Resource Name.|
|serialNumber|String|Serial number of the Windows autopilot device.|
|skuNumber|String|SKU Number|
|systemFamily|String|System Family|
|userPrincipalName|String|User Principal Name.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsautopilotdeviceidentity_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/windowsAutopilotDeviceIdentities
Content-Type: application/json
Content-length: 787

{
  "@odata.type": "#microsoft.graph.windowsAutopilotDeviceIdentity",
  "addressableUserName": "String",
  "azureActiveDirectoryDeviceId": "String",
  "azureAdDeviceId": "String",
  "deploymentProfileAssignedDateTime": "String (timestamp)",
  "deploymentProfileAssignmentDetailedStatus": "String",
  "deploymentProfileAssignmentStatus": "String",
  "displayName": "String",
  "enrollmentState": "String",
  "groupTag": "String",
  "lastContactedDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "manufacturer": "String",
  "model": "String",
  "productKey": "String",
  "purchaseOrderIdentifier": "String",
  "resourceName": "String",
  "serialNumber": "String",
  "skuNumber": "String",
  "systemFamily": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsAutopilotDeviceIdentity"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsAutopilotDeviceIdentity",
  "id": "ee607782-7782-ee60-8277-60ee827760ee",
  "addressableUserName": "String",
  "azureActiveDirectoryDeviceId": "String",
  "azureAdDeviceId": "String",
  "deploymentProfileAssignedDateTime": "String (timestamp)",
  "deploymentProfileAssignmentDetailedStatus": "String",
  "deploymentProfileAssignmentStatus": "String",
  "displayName": "String",
  "enrollmentState": "String",
  "groupTag": "String",
  "lastContactedDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "manufacturer": "String",
  "model": "String",
  "productKey": "String",
  "purchaseOrderIdentifier": "String",
  "resourceName": "String",
  "serialNumber": "String",
  "skuNumber": "String",
  "systemFamily": "String",
  "userPrincipalName": "String"
}
```

