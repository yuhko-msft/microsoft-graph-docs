---
title: "Update remoteActionAudit"
description: "Update the properties of a remoteActionAudit object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update remoteActionAudit
Namespace: microsoft.graph



Update the properties of a [remoteActionAudit](../resources/remoteactionaudit.md) object.

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
PATCH /deviceManagement/remoteActionAudits/{remoteActionAuditId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [remoteActionAudit](../resources/remoteactionaudit.md) object.

The following table shows the properties that are required when you update the [remoteActionAudit](../resources/remoteactionaudit.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|action|remoteAction|The action name. Possible values are: `unknown`, `factoryReset`, `removeCompanyData`, `resetPasscode`, `remoteLock`, `enableLostMode`, `disableLostMode`, `locateDevice`, `rebootNow`, `recoverPasscode`, `cleanWindowsDevice`, `logoutSharedAppleDeviceActiveUser`, `quickScan`, `fullScan`, `windowsDefenderUpdateSignatures`, `factoryResetKeepEnrollmentData`, `updateDeviceAccount`, `automaticRedeployment`, `shutDown`, `rotateBitLockerKeys`, `rotateFileVaultKey`, `getFileVaultKey`, `setDeviceName`.|
|actionState|actionState|Action state. Possible values are: `none`, `pending`, `canceled`, `active`, `done`, `failed`, `notSupported`.|
|deviceDisplayName|String|Intune device name.|
|deviceIMEI|String|IMEI of the device.|
|deviceOwnerUserPrincipalName|String|Upn of the device owner.|
|initiatedByUserPrincipalName|String|User who initiated the device action, format is UPN.|
|managedDeviceId|String|Action target.|
|requestDateTime|DateTimeOffset|Time when the action was issued, given in UTC.|
|userName|String|\[deprecated\] Please use InitiatedByUserPrincipalName instead.|



## Response

If successful, this method returns a `200 OK` response code and an updated [remoteActionAudit](../resources/remoteactionaudit.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_remoteactionaudit"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/remoteActionAudits/{remoteActionAuditId}
Content-Type: application/json
Content-length: 362

{
  "@odata.type": "#microsoft.graph.remoteActionAudit",
  "action": "String",
  "actionState": "String",
  "deviceDisplayName": "String",
  "deviceIMEI": "String",
  "deviceOwnerUserPrincipalName": "String",
  "initiatedByUserPrincipalName": "String",
  "managedDeviceId": "String",
  "requestDateTime": "String (timestamp)",
  "userName": "String"
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
  "@odata.type": "#microsoft.graph.remoteActionAudit",
  "id": "edb08c97-8c97-edb0-978c-b0ed978cb0ed",
  "action": "String",
  "actionState": "String",
  "deviceDisplayName": "String",
  "deviceIMEI": "String",
  "deviceOwnerUserPrincipalName": "String",
  "initiatedByUserPrincipalName": "String",
  "managedDeviceId": "String",
  "requestDateTime": "String (timestamp)",
  "userName": "String"
}
```

