---
title: "remoteActionAudit resource type"
description: "Report of remote actions initiated on the devices belonging to a certain tenant."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# remoteActionAudit resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Report of remote actions initiated on the devices belonging to a certain tenant.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List remoteActionAudits](../api/remoteactionaudit-list.md)|[remoteActionAudit](../resources/remoteactionaudit.md) collection|Get a list of the [remoteActionAudit](../resources/remoteactionaudit.md) objects and their properties.|
|[Create remoteActionAudit](../api/remoteactionaudit-create.md)|[remoteActionAudit](../resources/remoteactionaudit.md)|Create a new [remoteActionAudit](../resources/remoteactionaudit.md) object.|
|[Get remoteActionAudit](../api/remoteactionaudit-get.md)|[remoteActionAudit](../resources/remoteactionaudit.md)|Read the properties and relationships of a [remoteActionAudit](../resources/remoteactionaudit.md) object.|
|[Update remoteActionAudit](../api/remoteactionaudit-update.md)|[remoteActionAudit](../resources/remoteactionaudit.md)|Update the properties of a [remoteActionAudit](../resources/remoteactionaudit.md) object.|
|[Delete remoteActionAudit](../api/remoteactionaudit-delete.md)|None|Deletes a [remoteActionAudit](../resources/remoteactionaudit.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|remoteAction|The action name. Possible values are: `unknown`, `factoryReset`, `removeCompanyData`, `resetPasscode`, `remoteLock`, `enableLostMode`, `disableLostMode`, `locateDevice`, `rebootNow`, `recoverPasscode`, `cleanWindowsDevice`, `logoutSharedAppleDeviceActiveUser`, `quickScan`, `fullScan`, `windowsDefenderUpdateSignatures`, `factoryResetKeepEnrollmentData`, `updateDeviceAccount`, `automaticRedeployment`, `shutDown`, `rotateBitLockerKeys`, `rotateFileVaultKey`, `getFileVaultKey`, `setDeviceName`, `activateDeviceEsim`.|
|actionState|actionState|Action state. Possible values are: `none`, `pending`, `canceled`, `active`, `done`, `failed`, `notSupported`.|
|deviceDisplayName|String|Intune device name.|
|deviceIMEI|String|IMEI of the device.|
|deviceOwnerUserPrincipalName|String|Upn of the device owner.|
|id|String|Report Id.|
|initiatedByUserPrincipalName|String|User who initiated the device action, format is UPN.|
|managedDeviceId|String|Action target.|
|requestDateTime|DateTimeOffset|Time when the action was issued, given in UTC.|
|userName|String|\[deprecated\] Please use InitiatedByUserPrincipalName instead.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.remoteActionAudit",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.remoteActionAudit",
  "id": "String (identifier)",
  "deviceDisplayName": "String",
  "userName": "String",
  "initiatedByUserPrincipalName": "String",
  "action": "String",
  "requestDateTime": "String (timestamp)",
  "deviceOwnerUserPrincipalName": "String",
  "deviceIMEI": "String",
  "actionState": "String",
  "managedDeviceId": "String"
}
```

