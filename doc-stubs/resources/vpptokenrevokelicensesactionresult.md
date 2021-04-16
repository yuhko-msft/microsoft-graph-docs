---
title: "vppTokenRevokeLicensesActionResult resource type"
description: "The status of the revoke licenses action performed on the Apple Volume Purchase Program token."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# vppTokenRevokeLicensesActionResult resource type

Namespace: microsoft.graph



The status of the revoke licenses action performed on the Apple Volume Purchase Program token.


Inherits from [vppTokenActionResult](../resources/vpptokenactionresult.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|actionFailureReason|vppTokenActionFailureReason|The reason for the revoke licenses action failure. Possible values are: `none`, `appleFailure`, `internalError`, `expiredVppToken`, `expiredApplePushNotificationCertificate`.|
|actionName|String|Action name Inherited from [vppTokenActionResult](../resources/vpptokenactionresult.md)|
|actionState|actionState|State of the action Inherited from [vppTokenActionResult](../resources/vpptokenactionresult.md). Possible values are: `none`, `pending`, `canceled`, `active`, `done`, `failed`, `notSupported`.|
|failedLicensesCount|Int32|A count of the number of licenses that failed to revoke.|
|lastUpdatedDateTime|DateTimeOffset|Time the action state was last updated Inherited from [vppTokenActionResult](../resources/vpptokenactionresult.md)|
|startDateTime|DateTimeOffset|Time the action was initiated Inherited from [vppTokenActionResult](../resources/vpptokenactionresult.md)|
|totalLicensesCount|Int32|A count of the number of licenses that were attempted to revoke.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.vppTokenRevokeLicensesActionResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.vppTokenRevokeLicensesActionResult",
  "actionName": "String",
  "actionState": "String",
  "lastUpdatedDateTime": "String (timestamp)",
  "startDateTime": "String (timestamp)",
  "actionFailureReason": "String",
  "failedLicensesCount": "Integer",
  "totalLicensesCount": "Integer"
}
```

