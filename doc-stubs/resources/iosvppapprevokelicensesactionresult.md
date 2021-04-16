---
title: "iosVppAppRevokeLicensesActionResult resource type"
description: "Defines results for actions on iOS Vpp Apps, contains inherited properties for ActionResult."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVppAppRevokeLicensesActionResult resource type

Namespace: microsoft.graph



Defines results for actions on iOS Vpp Apps, contains inherited properties for ActionResult.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|actionFailureReason|vppTokenActionFailureReason|The reason for the revoke licenses action failure. Possible values are: `none`, `appleFailure`, `internalError`, `expiredVppToken`, `expiredApplePushNotificationCertificate`.|
|actionName|String|Action name|
|actionState|actionState|State of the action. Possible values are: `none`, `pending`, `canceled`, `active`, `done`, `failed`, `notSupported`.|
|failedLicensesCount|Int32|A count of the number of licenses for which revoke failed.|
|lastUpdatedDateTime|DateTimeOffset|Time the action state was last updated|
|managedDeviceId|String|DeviceId associated with the action.|
|startDateTime|DateTimeOffset|Time the action was initiated|
|totalLicensesCount|Int32|A count of the number of licenses for which revoke was attempted.|
|userId|String|UserId associated with the action.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosVppAppRevokeLicensesActionResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVppAppRevokeLicensesActionResult",
  "actionFailureReason": "String",
  "actionName": "String",
  "actionState": "String",
  "failedLicensesCount": "Integer",
  "lastUpdatedDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "startDateTime": "String (timestamp)",
  "totalLicensesCount": "Integer",
  "userId": "String"
}
```

